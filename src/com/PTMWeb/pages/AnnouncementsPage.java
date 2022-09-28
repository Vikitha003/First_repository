package com.PTMWeb.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

import com.PTMWeb.utilities.Baseclass;

public class AnnouncementsPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public AnnouncementsPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	} 
	
	@FindBy(xpath = "//p[@class='viewall link-color']")
	WebElement ViewAll;
	
	@FindBy(xpath = "//input[@class='k-input-inner']")
	WebElement Search;
	
	@FindBy(xpath = "//span[@class='k-icon k-button-icon k-i-excel']")
	WebElement Excel;
	
	@FindBy(xpath="//span[@class='k-icon k-button-icon k-i-pdf']")
	WebElement pdf;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	WebElement close;
	
	public void clearSearch() throws InterruptedException {
		try {
				
				Search.clear();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Search+"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(Search+"Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+Search + e);
        }
		Thread.sleep(3000);
	}
	
	public void clickOnClose() throws InterruptedException {
		try {
				
				close.click();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + e);
	    }
		Thread.sleep(3000);
	}
	
	public void clickOnViewAll() throws InterruptedException {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-250)");
				ViewAll.click();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + e);
	    }
		Thread.sleep(3000);
	}
	
public void searchwithAnnouncementName() throws InterruptedException {
		
		try {
			Search.sendKeys(DoughNutsAnnouncementName);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+Search+ e);
        }
		Thread.sleep(3000);
	}

public void clickOnExporttoExcel() throws InterruptedException {
	try {
		Thread.sleep(2000);
		Excel.click();
		
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void clickOnExporttoPdf() throws InterruptedException {
	try {
		if(pdf.isDisplayed()) {
			pdf.click();
		}
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(3000);
}
public void waitForSikuliObject(String imagePath) {
    Screen screenRegion = new Screen();
    try {
        screenRegion.wait(imagePath, EXPLICIT_WAIT);
    } catch (FindFailed findFailed) {
    }
}

public void doubleClickOnSikuliObject(String imagePath) throws InterruptedException {
    try {
    	
        Screen screenRegion = new Screen();
        waitForSikuliObject(imagePath);
        screenRegion.doubleClick(imagePath);
    } catch (FindFailed findFailed) {
        findFailed.printStackTrace();
    }
    Thread.sleep(8000);
}

public void ClickOnSikuliObject(String imagePath) throws InterruptedException {
    try {
        Screen screenRegion = new Screen();
        waitForSikuliObject(imagePath);
        screenRegion.click(imagePath);
    } catch (FindFailed findFailed) {
        findFailed.printStackTrace();
    }
    Thread.sleep(8000);
}

public void returnMatchSikuliObject(String imagePath) throws InterruptedException {
    Screen screen = new Screen();
    Match isFound = null;
    try {
        waitForSikuliObject(imagePath);
        isFound = screen.find(imagePath);
    } catch (FindFailed findFailed) {
    }
    
}



public void SwitchtoLastWindowandBBackToParentwindow() {
	String winHandleBefore = driver.getWindowHandle();
    
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    driver.close();
    driver.switchTo().window(winHandleBefore);
    
    
}

public void ClosetheWindow() throws InterruptedException {
    
   driver.close();
   Thread.sleep(2000);
    	
    }
    
    
}


