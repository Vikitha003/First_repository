package com.PTMWeb.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

public class AlertsPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public AlertsPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	} 
	
	@FindBy(xpath = "//input[@class='k-input-inner']")
	WebElement Search;
	
	@FindBy(xpath="//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[1]")
	WebElement ActivateFromdate;
	
	@FindBy(xpath="//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[2]")
	WebElement AlertName;
	
	@FindBy(xpath="//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[3]")
	WebElement AlertText;
	
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
	
	public void clickOnAPClose() throws InterruptedException {
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
	
public void searchwithActivateFromdate() throws InterruptedException {
		
		try {
			Search.sendKeys(ALActiveFromDate);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to search with Active From Date in Alerts");
	    } catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to search with Active From Date in Alerts");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Search+ e);
	        assertTrue(false, "Unable to search with Active From Date in Alerts");
	    }
		Thread.sleep(3000);
	}

public void searchwithAlertName() throws InterruptedException {
	
	try {
		Search.sendKeys(ALAlertName);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Alert Name in Alerts");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Alert Name in Alerts");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Alert Name in Alerts");
    }
	Thread.sleep(3000);
}

public void searchwithAlertText() throws InterruptedException {
	
	try {
		Search.sendKeys(ALAlertText);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Alert Text in Alerts");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Alert Text in Alerts");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Alert Text in Alerts");
    }
	Thread.sleep(3000);
}

public void clickOnExporttoExcel() throws InterruptedException {
	try {
		Thread.sleep(2000);
		Excel.click();
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Excel +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to click on Export to Excel button");
    } catch (NoSuchElementException e) {
        System.out.println(Excel +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to click on Export to Excel button");
    } catch (Exception e) {
        System.out.println("unable to click.." + Excel+ e);
        assertTrue(false, "Unable to click on Export to Excel button");
    }
	Thread.sleep(5000);
}

public void clickOnExporttoPdf() throws InterruptedException {
	try {
		if(pdf.isDisplayed()) {
			pdf.click();
		}
	} catch (StaleElementReferenceException e) {
        System.out.println(pdf +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to click on Export to Pdf button");
    } catch (NoSuchElementException e) {
        System.out.println(pdf +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to click on Export to Pdf button");
    } catch (Exception e) {
        System.out.println("unable to click.." + pdf+ e);
        assertTrue(false, "Unable to click on Export to Pdf button");
    }
	Thread.sleep(3000);
}

public void verifyActiveFromDate() throws InterruptedException {
	try {
		String btext= ActivateFromdate.getText();
		assertEquals(btext, ALActiveFromDate);
	} catch (StaleElementReferenceException e) {
        System.out.println(ActivateFromdate +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Activate From date is not verified in Alerts Page");
    } catch (NoSuchElementException e) {
        System.out.println(ActivateFromdate +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Activate From date is not verified in Alerts Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ ActivateFromdate + e);
        assertTrue(false, "Activate From date is not verified in Alerts Page");
    }
	Thread.sleep(5000);
}

public void verifyAlertName() throws InterruptedException {
	try {
		String btext= AlertName.getText();
		assertEquals(btext, ALAlertName);
	} catch (StaleElementReferenceException e) {
        System.out.println(AlertName +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Alert Name is not verified in Alerts Page");
    } catch (NoSuchElementException e) {
        System.out.println(AlertName +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Alert Name is not verified in Alerts Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ AlertName + e);
        assertTrue(false, "Alert Name is not verified in Alerts Page");
    }
	Thread.sleep(5000);
}

public void verifyAlertText() throws InterruptedException {
	try {
		String btext= AlertText.getText();
		assertEquals(btext, ALAlertText);
	} catch (StaleElementReferenceException e) {
        System.out.println(AlertText +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Alert Text is not verified in Alerts Page");
    } catch (NoSuchElementException e) {
        System.out.println(AlertText +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Alert Text is not verified in Alerts Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ AlertText + e);
        assertTrue(false, "Alert Text is not verified in Alerts Page");
    }
	Thread.sleep(5000);
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



}
