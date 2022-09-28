package com.PTMWeb.pages;

import static org.testng.Assert.assertEquals;

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

public class FundingIssuesPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public FundingIssuesPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@class='k-input-inner']")
	WebElement Search;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td")
	WebElement payrollId;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[2]")
	WebElement Amount;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[1]")
	WebElement FundingDate;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[3]")
	WebElement Reason;
	
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
	
	public void searchwithPayrollID() throws InterruptedException {
		
		try {
				
				Search.sendKeys(payrollID);
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
public void searchwithAmount() throws InterruptedException {
		
		try {
				
				Search.sendKeys(FIAmount);
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}

public void searchwithFundingDate() throws InterruptedException {
	
	try {
			
			Search.sendKeys(FIDuedate);
		
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(3000);
}

public void searchwithReason() throws InterruptedException {
	
	try {
			
			Search.sendKeys(FIReason);
		
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(3000);
}

public void verifyPayrollID() throws InterruptedException {
	try {
		
		String btext= payrollId.getText();
		assertEquals(btext, payrollID);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyAmount() throws InterruptedException {
	try {
		
		String btext= Amount.getText();
		assertEquals(btext, FIAmount_specialchar);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyFundingDueDate() throws InterruptedException {
	try {
		
		String btext= FundingDate.getText();
		assertEquals(btext, FIDuedate);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyReason() throws InterruptedException {
	try {
		
		String btext= Reason.getText();
		assertEquals(btext, FIReason);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
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

public void returnMatchSikuliObject(String imagePath) {
    Screen screen = new Screen();
    Match isFound = null;
    try {
        waitForSikuliObject(imagePath);
        isFound = screen.find(imagePath);
    } catch (FindFailed findFailed) {
    }
    
}

public void clickOnFIClose() throws InterruptedException {
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
			
			pdf.click();
		
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(3000);
}

}
