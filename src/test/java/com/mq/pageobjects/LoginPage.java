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
	@FindBy(name="ctl00$uxPgCPH$username")
	WebElement username;
	
	@FindBy(name="ctl00$uxPgCPH$password")
	WebElement password;
	
	@FindBy(name="ctl00$uxPgCPH$submitButton")
	WebElement login;
	
	public void setusername(String uname)
	{
		username.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void setlogin()
	{
		login.click();
	}
	

}
