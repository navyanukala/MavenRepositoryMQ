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
	
	@FindBy(id="dm0m0i3tdT")
	WebElement ordermgmtmenu;
	
	@FindBy(id="dm0m1i5tdT")
	WebElement CustRegmenu;
	
	@FindBy(name="ctl00$uxPgCPH$checkchkTerms")
	WebElement terms;
	
	@FindBy(name="ctl00$uxPgCPH$checkchkPrivacy")
	WebElement privacy;

	@FindBy(name="ctl00$uxPgCPH$firstname")
	WebElement Firstname;
	
	@FindBy(name="ctl00$uxPgCPH$btnsave")
	WebElement save;
	
	
	
	public void CustRegistration(String fname) throws InterruptedException
	{
		ordermgmtmenu.click();
		Thread.sleep(3000);
		CustRegmenu.click();
		Thread.sleep(3000);
		terms.click();
		privacy.click();
		Firstname.sendKeys(fname);
		save.click();
	}
	
	
	
}
