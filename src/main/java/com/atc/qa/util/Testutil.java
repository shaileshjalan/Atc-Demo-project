package com.atc.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.qa.atc.base.TestBase;

public class Testutil extends TestBase {
	
public static void takescreenshotAtEnd() { 
		
		TakesScreenshot tk= ((TakesScreenshot)driver);
		
		 File src =tk.getScreenshotAs(OutputType.FILE);
		 
		String dest=System.getProperty("user.dir");
		 
		 try {
		FileUtils.copyFile(src, new File(dest +"/Screenshot/"+System.currentTimeMillis() +".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
