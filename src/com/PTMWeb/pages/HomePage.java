package com.PTMWeb.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PTMWeb.utilities.Baseclass;

public class HomePage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public HomePage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//div[text()= 'Dashboard ']")
	WebElement Dashboard;
	
	@FindBy(xpath = "//div[text()= 'Tax Packages ']")
	WebElement TaxPackages;

	@FindBy(xpath = "//div[text()= 'Profile ']")
	WebElement Profile;
	
	public void clickOnDashboard(){
		try {
				
				Dashboard.click();
				Thread.sleep(3000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Dashboard + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to click on Dashboard");
        } catch (NoSuchElementException e) {
            System.out.println(Dashboard + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to click on Dashboard");
        } catch (Exception e) {
            System.out.println("unable to click.." + Dashboard + e);
            assertTrue(false, "Unable to click on Dashboard");
        }
		
	}
	
	public void clickOnTaxPackages(){
		try {
				
				TaxPackages.click();
				Thread.sleep(3000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(TaxPackages + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to click on Tax Packages");
        } catch (NoSuchElementException e) {
            System.out.println(TaxPackages + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to click on Tax Packages");
        } catch (Exception e) {
            System.out.println("unable to click.." + TaxPackages + e);
            assertTrue(false, "Unable to click on Tax Packages");
        }
		
	}
	
	public void clickOnProfile(){
		try {
				
				Profile.click();
				Thread.sleep(3000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Profile + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to click on Profile");
        } catch (NoSuchElementException e) {
            System.out.println(Profile + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to click on Profile");
        } catch (Exception e) {
            System.out.println("unable to click.." + Profile + e);
            assertTrue(false, "Unable to click on Profile");
        }
		
	}
}
