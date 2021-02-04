package com.atc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.atc.base.TestBase;

public class Homepage extends TestBase{
	
	@FindBy(xpath = "//a[@title='View my customer account']//span")

	WebElement loginuername;

	
	
	@FindBy(xpath = "//a[@href=\"http://automationpractice.com/index.php?controller=addresses\"]//span")

	WebElement myaddess;
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String loginuser () {
		
	return loginuername.getText();
	
	}
	public myaddresspage Clickonmyaddress() {
		myaddess.click();
		return new myaddresspage();
		
		
	}

}
