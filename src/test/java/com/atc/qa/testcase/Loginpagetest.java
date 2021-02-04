package com.atc.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atc.pages.loginpage;
import com.qa.atc.base.TestBase;

public class Loginpagetest extends TestBase {

	
	loginpage login;
	
	
	
	public Loginpagetest() {
		super();
	}
		@BeforeMethod
		public void setup() {
			initilization();
			login =new loginpage();
			
				
}
		
		@Test(priority = 1,enabled = true)
		public void verifyloginOpertation() {
			login.LogintoApplication();	
		}	
	
	
}
