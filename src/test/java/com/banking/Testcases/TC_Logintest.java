package com.banking.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.Pageobjects.Loginpage;

public class TC_Logintest extends BaseClass{
	
	
	
	@Test
	public void LoginTest() throws Exception {
		
		
		logger.info("URL is launched");
		
		Loginpage lp=new Loginpage(driver);
		
		lp.Username(usn);
		logger.info("usn is enetered");
		lp.Password(pasw);
		logger.info("pwd is enetered");
		lp.Click();
		logger.info("submit button clicked");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}else {
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
