package com.mq.testcases;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.mq.utilities.Config;

public class BaseClass {
	
	Config config = new Config();
	public String url=config.geturl();
	public String username=config.getusername();
	public String pwd=config.getpassword();
	public static WebDriver driver;
	public  Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		 logger= Logger.getLogger("MQ");;
		PropertyConfigurator.configure("Log4j.properties"); 
		
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", config.chromepath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", config.getfirefoxpath());
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
			
		}
		
		driver.get(url);
	}
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
//	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot )driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+ "/screenshots/" +tname+ ".png");
	FileUtils.copyFile(Source,target);
	System.out.println("screenshot taken");
	}

}
