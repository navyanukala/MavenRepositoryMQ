package com.mq.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CustRegPage {
	 WebDriver ldriver;
	
	public CustRegPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="dm0m0i4tdT")
	WebElement ordermgmtmenu;
	
	@FindBy(id="dm0m1i5tdT")
	WebElement CustRegmenu;
	
//	@FindBy(name="ctl00$uxPgCPH$checkchkTerms")
//	WebElement terms;
//	
//	@FindBy(name="ctl00$uxPgCPH$checkchkPrivacy")
//	WebElement privacy;

	@FindBy(id="ctl00_uxPgCPH_firstname")
	WebElement Firstname;
	
	
	
	@FindBy(name="ctl00$uxPgCPH$btnsave")
	WebElement save;
	
	
	
	public void CustRegistration(String fname) throws InterruptedException
	{
		System.out.println("entered to customer registartion");
		ordermgmtmenu.click();
		//logger.info("ordermanagement clicked");
		System.out.println("ordermanagement clicked");
		Thread.sleep(3000);
		CustRegmenu.click();
		System.out.println("customerregistration clicked");
		//Thread.sleep(50000);
		//terms.click();
		//privacy.click();
		Firstname.sendKeys(fname);
		System.out.println("send firstname");
		
		save.click();
	}
	
	
	
}
