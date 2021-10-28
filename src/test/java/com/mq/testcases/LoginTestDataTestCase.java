package com.mq.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mq.pageobjects.LoginPage;
import com.mq.utilities.XLUtils;

public class LoginTestDataTestCase extends BaseClass {
	@Test(dataProvider="logintestdata")
	public void loginDDTest(String username, String pwd) throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.login(username,pwd);//clicking on submit
		logger.info("clicked on login");
		
		WebElement errmsg=driver.findElement(By.id("ctl00_uxPgCPH_logininfoSpan"));
	
		String s=errmsg.getText();
		System.out.println(s);
		
		if(s.equals("! Invalid User ID or Password"))
		{
			lp.username.clear();
			//driver.navigate().refresh();
			Thread.sleep(5000);
			
		}
		else if (driver.getTitle().equals("Single View"))
		{
			logger.info("Login successfully");
		}
	
	}
	
		
	@DataProvider(name="logintestdata")
	String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/mq/testdata/login.xlsx";
				
			int rowcount=XLUtils.getRowCount(path, "sheet1");
			int cellcount=XLUtils.getCellCount(path, "sheet1", 1);
			String logindata[][]=new String[rowcount][cellcount];
			for(int i=1;i<=rowcount;i++)
			{
				for(int j=0;j<cellcount;j++)
				{
					logindata[i-1][j]=XLUtils.getCellData(path,"sheet1", i, j);
				}
			}
			return logindata;
	}
}
