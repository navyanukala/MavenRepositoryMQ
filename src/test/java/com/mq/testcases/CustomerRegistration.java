package com.mq.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mq.pageobjects.CustRegPage;
import com.mq.pageobjects.LoginPage;

public class CustomerRegistration extends BaseClass {
	
	@Test
	public void CustReg() throws InterruptedException
	{
		LoginPage lg= new LoginPage(driver);
		lg.login(username,pwd);
		logger.info("loggedin successfully from custreg");
		
		CustRegPage custreg = new CustRegPage(driver);
		custreg.CustRegistration("navya");//CustRegistration
		logger.info("navigated to custreg");
	}
}


