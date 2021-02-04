package com.atc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.atc.base.TestBase;

public class myaddresspage extends TestBase{
	
	@FindBy(xpath = "//a[@title='Add an address']")

	WebElement newAddressButton;
	
	@FindBy(xpath = "//input[@id='firstname']")

	WebElement Firstname;
	
	@FindBy(xpath = "//input[@id='lastname']")

	WebElement lastname; 
	
	@FindBy(xpath = "//input[@id='company']")

	WebElement company;
	
	@FindBy(xpath = "//input[@id='address1']")

	WebElement Address1;
	
	@FindBy(xpath = "//input[@id='city']")

	WebElement City;
	
	@FindBy(xpath = "//select[@id='id_state']")

	WebElement State;
	
	
	@FindBy(xpath = "//input[@id='postcode']")

	WebElement postcode;
	
	@FindBy(xpath = "//input[@id='phone']")

	WebElement phone;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")

	WebElement mobilenumber;
	
	@FindBy(xpath = "//textarea[@id='other']")

	WebElement othername;
	
	
	@FindBy(xpath = "//input[@id='alias']")

	WebElement alis;
	
	@FindBy(xpath = "//button[@id='submitAddress']")

	WebElement savebutton;
	
	
	public myaddresspage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public myaddresspage NavigatenewaddresssectionAndFilldata() {
		newAddressButton.click();
		Firstname.clear();
		Firstname.sendKeys("shailesh");
		lastname.clear();
		lastname.sendKeys("jalan");
		company.clear();
		company.sendKeys("abcd");
		Address1.clear();
		Address1.sendKeys("fashion street");
		City.clear();
		City.sendKeys("Clive");
		Select state=new Select(State);
		state.selectByVisibleText("Iowa");
		postcode.clear();
		postcode.sendKeys("50325");
		phone.clear();
		phone.sendKeys("9999999999");
		mobilenumber.clear();
		mobilenumber.sendKeys("9999999999");
		othername.clear();
		othername.sendKeys("demo Test");
		alis.clear();
		alis.sendKeys("atc info");
		savebutton.click();
		
	return new myaddresspage();
	
	
	
}
}


