package com.atc.qa.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atc.pages.Homepage;
import com.atc.pages.loginpage;
import com.atc.pages.myaddresspage;
import com.atc.pages.womendresspage;
import com.qa.atc.base.TestBase;

public class womendresspagetest extends TestBase {

	Homepage homepage;
	loginpage loginpage;
	myaddresspage myaddress;
	womendresspage wdress;
	
	public womendresspagetest() {
		super();
	}
		@BeforeMethod
		public void setup() {
		initilization();
		loginpage=new loginpage();
		homepage=new Homepage();
		myaddress=new myaddresspage();
		wdress=new womendresspage();
		loginpage.LogintoApplication();
		homepage.Clickonmyaddress();
		myaddress.NavigatenewaddresssectionAndFilldata(); 
}
		@Test(priority = 1,enabled = true)
		public void verifyWoemendressAndaddIntoCart() 
		{
			wdress.NavigateTOWomensAndSummerdress();
			String status =wdress.GridView();
			Assert.assertEquals(status,"selected");
			wdress.listview();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			wdress.Firstiteam();
			String checkquntity =wdress.quentitycheck();
			Assert.assertEquals(checkquntity,"1");
			wdress.clickonpulseicon();
			String checkquntity1 =wdress.quentitycheck();
			Assert.assertEquals(checkquntity1,"5");
			wdress.Dropdwonsize();
			wdress.selectcolour();
			wdress.addtocart();
			wdress.proceddtocheckout();
		}	
}
		
		

