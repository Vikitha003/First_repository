package com.PTMWeb.pages;

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
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		
	}
	
	public void clickOnTaxPackages(){
		try {
				
				TaxPackages.click();
				Thread.sleep(3000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		
	}
	
	public void clickOnProfile(){
		try {
				
				Profile.click();
				Thread.sleep(3000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		
	}
}
