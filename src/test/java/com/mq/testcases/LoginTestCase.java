package com.mq.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mq.pageobjects.LoginPage;

public class LoginTestCase extends BaseClass {
	
	@Test
	public void loginTest() throws IOException
	{
		
		LoginPage lp= new LoginPage(driver);
		
		lp.login(username,pwd);
		logger.info("loggedin successfully");
		
		
		if(driver.getTitle().equals("Single View1"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("loggin failed");
		}
	}

}
