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

public class AppliedForPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public AppliedForPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@class='k-input-inner']")
	WebElement Search;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td")
	WebElement payrollId;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[1]")
	WebElement AgencyID;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[2]")
	WebElement Description;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[3]")
	WebElement checkDate;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[4]")
	WebElement Amount;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[5]")
	WebElement Duedate;
	
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
            assertTrue(false, "Unable to clear the search");
        } catch (NoSuchElementException e) {
            System.out.println(Search+"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to clear the search");
        } catch (Exception e) {
            System.out.println("unable to click.."+Search + e);
            assertTrue(false, "Unable to clear the search");
        }
		Thread.sleep(3000);
	}
	
public void searchwithPayrollID() throws InterruptedException {
		
		try {
			Search.sendKeys(payrollID_DoughNuts);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to search with Payroll ID");
        } catch (NoSuchElementException e) {
            System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to search with Payroll ID");
        } catch (Exception e) {
            System.out.println("unable to click.."+Search+ e);
            assertTrue(false, "Unable to search with Payroll ID");
        }
		Thread.sleep(3000);
	}

public void searchwithAgencyID() throws InterruptedException {
	
	try {
		Search.sendKeys(AppliedFor_AgencyID);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with AgencyID in Applied For");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with AgencyID in Applied For");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with AgencyID in Applied For");
    }
	Thread.sleep(3000);
}

public void searchwithDescription() throws InterruptedException {
	
	try {
		Search.sendKeys(AppliedFor_Description);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Description in Applied For");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Description in Applied For");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Description in Applied For");
    }
	Thread.sleep(3000);
}

public void searchwithDuedate() throws InterruptedException {
	
	try {
		Search.sendKeys(AppliedFor_Duedate);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Duedate in Applied For");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Duedate in Applied For");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Duedate in Applied For");
    }
	Thread.sleep(3000);
}
public void searchwithAmount() throws InterruptedException {
	
	try {
		Search.sendKeys(AppliedFor_Amount);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Amount in Applied For");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Amount in Applied For");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Amount in Applied For");
    }
	Thread.sleep(3000);
}

public void searchwithCheckdate() throws InterruptedException {
	
	try {
		Search.sendKeys(AppliedFor_CheckDate);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Check Date in Applied For");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Check Date in Applied For");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Check Date in Applied For");
    }
	Thread.sleep(3000);
}

public void clickOnExporttoExcel() throws InterruptedException {
	try {
		Thread.sleep(2000);
		Excel.click();
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Excel +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to click on Export to Excel");
    } catch (NoSuchElementException e) {
        System.out.println(Excel +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to click on Export to Excel");
    } catch (Exception e) {
        System.out.println("unable to click.." + Excel+ e);
        assertTrue(false, "Unable to click on Export to Excel");
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
        assertTrue(false, "Unable to click on Export to Pdf");
    } catch (NoSuchElementException e) {
        System.out.println(pdf +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to click on Export to Pdf");
    } catch (Exception e) {
        System.out.println("unable to click.." + pdf+ e);
        assertTrue(false, "Unable to click on Export to Pdf");
    }
	Thread.sleep(3000);
}

public void verifyPayrollID() throws InterruptedException {
	try {
		String btext= payrollId.getText();
		assertEquals(btext, payrollID_DoughNuts);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyAgencyID() throws InterruptedException {
	try {
		String btext= AgencyID.getText();
		assertEquals(btext, AppliedFor_AgencyID);
	} catch (StaleElementReferenceException e) {
        System.out.println(AgencyID +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "AgencyID is not verified in Applied For Page");
    } catch (NoSuchElementException e) {
        System.out.println(AgencyID +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "AgencyID is not verified in Applied For Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ AgencyID + e);
        assertTrue(false, "AgencyID is not verified in Applied For Page");
    }
	Thread.sleep(5000);
}

public void verifyDecription() throws InterruptedException {
	try {
		String btext= Description.getText();
		assertEquals(btext, AppliedFor_Description);
	} catch (StaleElementReferenceException e) {
        System.out.println(Description +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Description is not verified in Applied For Page");
    } catch (NoSuchElementException e) {
        System.out.println(Description +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Description is not verified in Applied For Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ Description + e);
        assertTrue(false, "Description is not verified in Applied For Page");
    }
	Thread.sleep(5000);
}

public void verifyCheckDate() throws InterruptedException {
	try {
		String btext= checkDate.getText();
		assertEquals(btext, AppliedFor_CheckDate);
	} catch (StaleElementReferenceException e) {
        System.out.println(checkDate +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "checkDate is not verified in Applied For Page");
    } catch (NoSuchElementException e) {
        System.out.println(checkDate +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "checkDate is not verified in Applied For Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ checkDate + e);
        assertTrue(false, "checkDate is not verified in Applied For Page");
    }
	Thread.sleep(5000);
}

public void verifyDueDate() throws InterruptedException {
	try {
		String btext= Duedate.getText();
		assertEquals(btext, AppliedFor_Duedate);
	} catch (StaleElementReferenceException e) {
        System.out.println(Duedate +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Duedate is not verified in Applied For Page");
    } catch (NoSuchElementException e) {
        System.out.println(Duedate +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Duedate is not verified in Applied For Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ Duedate + e);
        assertTrue(false, "Duedate is not verified in Applied For Page");
    }
	Thread.sleep(5000);
}

public void verifyAmount() throws InterruptedException {
	try {
		String btext= Amount.getText();
		assertEquals(btext, AppliedFor_Amount_specialchar);
	} catch (StaleElementReferenceException e) {
        System.out.println(Amount +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Amount is not verified in Applied For Page");
    } catch (NoSuchElementException e) {
        System.out.println(Amount +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Amount is not verified in Applied For Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ Amount + e);
        assertTrue(false, "Amount is not verified in Applied For Page");
    }
	Thread.sleep(5000);
}

public void clickOnAFClose() throws InterruptedException {
	try {
			
			close.click();
		
	} catch (StaleElementReferenceException e) {
        System.out.println(close +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to click on close button");
    } catch (NoSuchElementException e) {
        System.out.println(close +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to click on close button");
    } catch (Exception e) {
        System.out.println("unable to click.." + close+ e);
        assertTrue(false, "Unable to click on close button");
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

public void returnMatchSikuliObject(String imagePath) {
    Screen screen = new Screen();
    Match isFound = null;
    try {
        waitForSikuliObject(imagePath);
        isFound = screen.find(imagePath);
    } catch (FindFailed findFailed) {
    }
    
}


	
}
