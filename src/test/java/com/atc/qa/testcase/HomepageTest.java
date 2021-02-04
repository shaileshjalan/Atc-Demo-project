package com.atc.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atc.pages.Homepage;
import com.atc.pages.loginpage;
import com.qa.atc.base.TestBase;


public class HomepageTest extends TestBase{
	
	Homepage homepage;
	loginpage loginpage;
	
	public HomepageTest() {
		super();
	}
		@BeforeMethod
		public void setup() {
			initilization();
			 loginpage=new loginpage();
			 homepage=new Homepage();
			 loginpage.LogintoApplication();
			
}
		
		@Test(priority = 1,enabled = true)
		public void VerifyuserloginAndNaigatetomyaddress(){
			String name=homepage.loginuser();
			Assert.assertEquals(name, "shailesh jalan");
			
			
		}	
}