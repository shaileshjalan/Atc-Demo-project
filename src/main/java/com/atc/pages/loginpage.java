package com.atc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.atc.base.TestBase;

public class loginpage extends TestBase{

	@FindBy(xpath = "//input[@id='email']")

	WebElement Username;
	
	
	@FindBy(xpath = "//input[@id='passwd']")

	WebElement password;
	
	
	@FindBy(xpath = "//button[contains(@id,'SubmitLogin')]")
	
	
	WebElement LogiButton;
	
	
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public Homepage LogintoApplication() {
		Username.sendKeys("shaileshjalan19@gmail.com");
		password.sendKeys("Save@water119");
		LogiButton.click();
	return new Homepage();
	
	}
	
}
