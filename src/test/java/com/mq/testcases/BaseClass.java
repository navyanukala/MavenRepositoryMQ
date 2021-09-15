package com.mq.testcases;

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
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
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

}
