package com.PTMWeb.pages;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.PTMWeb.utilities.Baseclass;

;

public class loginPage extends Baseclass{
public static WebDriver driver;


	
	public loginPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@id='usernameUserInput']")
	WebElement txtUsername;
	
	@FindBy(id = "password")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@class='ui primary large button']")
	WebElement buttonLogin;
	
	public void setUsername(String uname) {
		try {
			SetHighlight(txtUsername);
			txtUsername.sendKeys(uname);
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false, "Unable to Enter the Username");
			
		}
	}
	
	public void setPassword(String pwd) throws InterruptedException  {
		try {
			SetHighlight(txtPassword);
			txtPassword.sendKeys(pwd);
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false, "Unable to Enter the Password");
		}
		
	
	}
	
	public void clickOnLogin() throws InterruptedException {
		try {
			SetHighlight(buttonLogin);
			buttonLogin.click();
			Thread.sleep(6000);
			
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false, "Unable to click o Login button");
		}
		
	}
	
	
}
