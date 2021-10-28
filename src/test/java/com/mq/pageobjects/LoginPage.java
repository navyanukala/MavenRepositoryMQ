package com.mq.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(ldriver, this);
	}
	public @FindBy(name="ctl00$uxPgCPH$username")
	WebElement username;
	
	@FindBy(name="ctl00$uxPgCPH$password")
	WebElement password;
	
	@FindBy(name="ctl00$uxPgCPH$submitButton")
	WebElement login;
	
	public void login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	}
	
	

}
