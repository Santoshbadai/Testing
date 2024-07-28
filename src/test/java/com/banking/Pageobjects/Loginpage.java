package com.banking.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Loginbtn;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement lnkLogout;
	
	public void Username(String name) {
		username.sendKeys(name);
	}
	
	public void Password(String pass) {
		password.sendKeys(pass);
	}
	
	public void Click() {
		Loginbtn.click();
	}
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
