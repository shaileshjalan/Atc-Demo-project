package com.atc.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atc.pages.Homepage;
import com.atc.pages.loginpage;
import com.atc.pages.myaddresspage;
import com.qa.atc.base.TestBase;

public class myaddresspagetest extends TestBase{

		
Homepage homepage;
loginpage loginpage;
myaddresspage myaddress;
public myaddresspagetest() {
	super();
}
	@BeforeMethod
	public void setup() {
		initilization();
		 loginpage=new loginpage();
		 homepage=new Homepage();
		 myaddress=new myaddresspage();
		 loginpage.LogintoApplication();
		
}
		
		@Test(priority = 1,enabled = true)
		public void AddNewAddressAndSave() 
		{
			homepage.Clickonmyaddress();
			myaddress.NavigatenewaddresssectionAndFilldata(); 
		}	
}
