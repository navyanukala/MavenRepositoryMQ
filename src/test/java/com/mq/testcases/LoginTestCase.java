package com.mq.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mq.pageobjects.LoginPage;

public class LoginTestCase extends BaseClass {
	
	@Test
	public void loginTest()
	{
		
		LoginPage lp= new LoginPage(driver);
		lp.setusername(username);
		lp.setpassword(pwd);
		lp.setlogin();
		
		if(driver.getTitle().equals("Single View"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
