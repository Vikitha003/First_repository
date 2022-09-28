package com.PTMWeb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.PTMWeb.utilities.Baseclass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

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
		}
	}
	
	public void setPassword(String pwd) throws InterruptedException {
		SetHighlight(txtPassword);
		txtPassword.sendKeys(pwd);
		Thread.sleep(2000);
	}
	
	public void clickOnLogin() throws InterruptedException {
		SetHighlight(buttonLogin);
		buttonLogin.click();
		Thread.sleep(6000);
	}
	
	
}
