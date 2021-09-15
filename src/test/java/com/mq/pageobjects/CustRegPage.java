package com.mq.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustRegPage {
	
	@FindBy(name="ctl00$uxPgCPH$checkchkTerms")
	WebElement terms;
	
	@FindBy(name="ctl00$uxPgCPH$checkchkPrivacy")
	WebElement privacy;

	@FindBy(name="ctl00$uxPgCPH$firstname")
	WebElement Firstname;
	
	@FindBy(name="ctl00$uxPgCPH$btnsave")
	WebElement save;
	
	public void checkterms()
	{
		terms.click();
	}
	public void privacy()
	{
		terms.click();
	}
	public void Firstname(String fname)
	{
		terms.sendKeys("NAVYA");
	}
	public void save()
	{
		terms.click();
	}

}
