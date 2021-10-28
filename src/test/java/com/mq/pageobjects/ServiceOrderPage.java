package com.mq.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceOrderPage {
	
	 WebDriver ldriver;
		
		public ServiceOrderPage(WebDriver rdriver)
		{
			ldriver= rdriver;
			PageFactory.initElements(rdriver, this);
		}
		@FindBy(id="dm0m0i3tdT")
		WebElement ordermgmtmenu;
		
		@FindBy(id="dm0m1i30tdT")
		WebElement serviceordermenu;
		
		@FindBy(id="ctl00_uxPgCPH_uxSearchCtrl_searchtxt")
		WebElement custnbr;
		
		@FindBy(id="ctl00_uxPgCPH_chknewcontract")
		WebElement Createnew;
		
		@FindBy(id="ctl00_uxPgCPH_btnbasicplan")
		WebElement basetab;
		
		@FindBy(id="ctl00_uxPgCPH_btnaddonplan")
		WebElement addontab;
		@FindBy(id="ctl00_uxPgCPH_txtplnsrch")
		WebElement plnsearch;
		
		@FindBy(id="ctl00_uxPgCPH_bundlesvcgrid_ctl2_imgbtnseladd")
		WebElement addCartButton;
		
		@FindBy (id="ctl00_uxPgCPH_btnsave")
		WebElement savebtn;//ctl00_uxPgCPH_btnsave
		
//		@FindBy(id="ctl00$uxPgCPH$btnsavecnfm")
//		WebElement btncfrmyes;
		@FindBy (id="ctl00_uxPgCPH_btnsavecnfm")
		WebElement yesbtn;//yesbtn
		
		@FindBy(xpath="//*[@id=\"ctl00__infoSpan\"]")
		public
				WebElement succssmsg;
		
		
		
	
		
		public void OEM1(String custname,String planname) throws InterruptedException
		{
			ordermgmtmenu.click();
			Thread.sleep(3000);
			serviceordermenu.click();
			Thread.sleep(3000);
			custnbr.clear();
			custnbr.sendKeys(custname+Keys.TAB);
			Createnew.click();
			Thread.sleep(50000);
		System.out.println("create new is done");
//			basetab.click();
//			System.out.println("basetab is done");
			//Thread.sleep(5000);
		
			
			plnsearch.sendKeys(planname+Keys.TAB);
			System.out.println("plansearch is done");
			Thread.sleep(50000);
			addCartButton.click();
			System.out.println("planadded to cart is done");
			Thread.sleep(50000);
			savebtn.click();
			System.out.println("clicked on save");
			
			
			Thread.sleep(3000);
			yesbtn.click();
			Thread.sleep(10000);
			System.out.println("clicked on yes");
			Thread.sleep(50000);
			System.out.println(succssmsg.getText());
			//System.out.println(ordpage.succssmsg.getText());
			
			if(succssmsg.getText().equals("Service order has been saved successfully"))
			{
				System.out.println("order saved successfully");
			}
			else
			{
				System.out.println(succssmsg.getText());
			}
		}
			
//			public void OEM2(String custname,String planname) throws InterruptedException
//			{
//				ordermgmtmenu.click();
//				Thread.sleep(3000);
//				serviceordermenu.click();
//				Thread.sleep(3000);
//				custnbr.sendKeys(custname+Keys.TAB);
//				Createnew.click();
//				Thread.sleep(50000);
//			System.out.println("create new is done");
////				basetab.click();
////				System.out.println("basetab is done");
//				//Thread.sleep(5000);
//			addontab.click();
//			Thread.sleep(5000);
//			System.out.println("addonplantab is done");
//				
//				plnsearch.sendKeys(planname+Keys.TAB);
//				System.out.println("plansearch is done");
//				Thread.sleep(50000);
//				addCartButton.click();
//				System.out.println("planadded to cart is done");
//				Thread.sleep(50000);
//				savebtn.click();
//				System.out.println("clicked on save");
//				
//				
//				Thread.sleep(3000);
//				yesbtn.click();
//				Thread.sleep(10000);
//				System.out.println("clicked on yes");
//				Thread.sleep(50000);
//				System.out.println(succssmsg.getText());
//				//System.out.println(ordpage.succssmsg.getText());
//				
//				if(succssmsg.getText().equals("Service order has been saved successfully"))
//				{
//					System.out.println("order saved successfully");
//				}
//				else
//				{
//					System.out.println(succssmsg.getText());
//				}
//		}


			
		
		

}
