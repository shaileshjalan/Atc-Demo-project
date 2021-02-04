package com.atc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.atc.base.TestBase;

public class womendresspage extends TestBase{
	
	
	@FindBy(xpath = "//a[@title='Women']")
	WebElement womenMnu;
	
	
	@FindBy(xpath = "(//a[@title='Summer Dresses'])[1]")
	WebElement summerdress;
	
	
	@FindBy(xpath = "//span[contains(@class,'cat-name')]")
	WebElement summerdresslabel;
	
	@FindBy(xpath = "//li[@id='grid']")
	WebElement Gridview;
	

	@FindBy(xpath = "//li[@id='list']")
	WebElement listview;
	
	
	@FindBy(xpath = "(//a[@title='Printed Summer Dress'])[3]")
	WebElement Firstitem;
	
	@FindBy(xpath = "//input[@id='quantity_wanted']")
	WebElement quantity;
	
	@FindBy(xpath = "//input[@id='quantity_wanted']//following::span[2]//i")
	WebElement pulseicon;
	
	@FindBy(xpath = "//select[@id='group_1']")
	WebElement selectSize;
	
	@FindBy(xpath = "//a[@id='color_13']")
	WebElement orangecolour;
	
	
	@FindBy(xpath = "//button[@name='Submit']")
	WebElement Addtocardt;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	WebElement checkout;
	
	public womendresspage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void NavigateTOWomensAndSummerdress() {
		Actions action=new Actions(driver);
		action.moveToElement(womenMnu).build().perform();
		summerdress.click();
		
		
	}
	
	public String summarlabel() {
		
		return summerdress.getText();
		
	}
	
public String GridView() {
		
		return Gridview.getAttribute("class");
	
}
	public void listview(){
		listview.click();
	
	}
	
	public void Firstiteam(){
		Firstitem.click();
	
	}
	
	public String quentitycheck(){
		return	quantity.getAttribute("value");
	
	}
	
	public void clickonpulseicon(){
		pulseicon.click();
		pulseicon.click();
		pulseicon.click();
		pulseicon.click();
		
	}
	
	public void Dropdwonsize(){
	Select select =new Select(selectSize);
		select.selectByVisibleText("L");
	}

	public void selectcolour(){
		orangecolour.click();		
		}
	
	public void addtocart(){
		Addtocardt.click();		
		}
	
	public void proceddtocheckout(){
		checkout.click();		
		}
	
	
	
	
	
}
