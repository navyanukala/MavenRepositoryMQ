package com.mq.testcases;

import org.testng.annotations.Test;

import com.mq.pageobjects.CustRegPage;
import com.mq.pageobjects.LoginPage;
import com.mq.pageobjects.ServiceOrderPage;

public class ServiceOrderTC extends BaseClass{
	
	@Test
	public void order() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(username,pwd);
		logger.info("loggedin successfully");
		
		Thread.sleep(3000);
		
//		CustRegPage custreg=new CustRegPage(driver);
//		custreg.CustRegistration("navya");
//		Thread.sleep(3000);
		logger.info("customer created successfully");
		ServiceOrderPage ordpage= new ServiceOrderPage(driver);
		ordpage.BasicServiceOrder("42497","DCCR");
		
	}

}
