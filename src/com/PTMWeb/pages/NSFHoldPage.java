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

public class NSFHoldPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public NSFHoldPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@class='k-input-inner']")
	WebElement Search;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td")
	WebElement payrollId;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td")
	WebElement AgencyID;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[2]")
	WebElement Description;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[3]")
	WebElement Amount;
	
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
            assertTrue(false, "Unable to search with Payroll ID in NSF Hold");
        } catch (NoSuchElementException e) {
            System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to search with Payroll ID in NSF Hold");
        } catch (Exception e) {
            System.out.println("unable to click.."+Search+ e);
            assertTrue(false, "Unable to search with Payroll ID in NSF Hold");
        }
		Thread.sleep(3000);
	}
	
	public void searchwithAgencyID() throws InterruptedException {
		
		try {
			Search.sendKeys(NSFHold_AgentID);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to search with AgencyID in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to search with AgencyID in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Search+ e);
	        assertTrue(false, "Unable to search with AgencyID in NSF Hold");
	    }
		Thread.sleep(3000);
	}

	public void searchwithDescription() throws InterruptedException {
		
		try {
			Search.sendKeys(NSFHold_Description);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to search with Description in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to search with Description in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Search+ e);
	        assertTrue(false, "Unable to search with Description in NSF Hold");
	    }
		Thread.sleep(3000);
	}
	
	public void searchwithAmount() throws InterruptedException {
		
		try {
			Search.sendKeys(NSFHold_Amount);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to search with Amount in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to search with Amount in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Search+ e);
	        assertTrue(false, "Unable to search with Amount in NSF Hold");
	    }
		Thread.sleep(3000);
	}
	
	public void verifyPayrollID() throws InterruptedException {
		try {
			String btext= payrollId.getText();
			assertEquals(btext, payrollID_DoughNuts);
		} catch (StaleElementReferenceException e) {
	        System.out.println(payrollId +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to verify PayrollID in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(payrollId +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to verify PayrollID in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + payrollId+ e);
	        assertTrue(false, "Unable to verify PayrollID in NSF Hold");
	    }
		Thread.sleep(5000);
	}
	
	public void verifyPayrollID_TIBERIUM_SYSTEMS() throws InterruptedException {
		try {
			String btext= payrollId.getText();
			assertEquals(btext, PayrollID_TIBERIUM);
		} catch (StaleElementReferenceException e) {
	        System.out.println(payrollId +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to verify PayrollID in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(payrollId +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to verify PayrollID in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + payrollId+ e);
	        assertTrue(false, "Unable to verify PayrollID in NSF Hold");
	    }
		Thread.sleep(5000);
	}
	
	

	public void verifyAgencyID() throws InterruptedException {
		try {
			String btext= AgencyID.getText();
			assertEquals(btext, NSFHold_AgentID);
		} catch (StaleElementReferenceException e) {
	        System.out.println(AgencyID +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to verify AgencyID in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(AgencyID +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to verify AgencyID in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + AgencyID+ e);
	        assertTrue(false, "Unable to verify AgencyID in NSF Hold");
	    }
		Thread.sleep(5000);
	}
	
	public void verifyNSFHoldrecords() throws InterruptedException {
		try {
			AgencyID.isDisplayed();
		} catch (StaleElementReferenceException e) {
	        System.out.println(AgencyID +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to verify AgencyID in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(AgencyID +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to verify AgencyID in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + AgencyID+ e);
	        assertTrue(false, "Unable to verify AgencyID in NSF Hold");
	    }
		Thread.sleep(5000);
	}

	public void verifyDescription() throws InterruptedException {
		try {
			String btext= Description.getText();
			assertEquals(btext, NSFHold_Description);
		} catch (StaleElementReferenceException e) {
	        System.out.println(Description +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to verify Description in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(Description +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to verify Description in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Description+ e);
	        assertTrue(false, "Unable to verify Description in NSF Hold");
	    }
		Thread.sleep(5000);
	}
	
	public void verifyAmount() throws InterruptedException {
		try {
			String btext= Amount.getText();
			assertEquals(btext, NSFHold_Amount_specialchar);
		} catch (StaleElementReferenceException e) {
	        System.out.println(Amount +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to verify Amount in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(Amount +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to verify Amount in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Amount+ e);
	        assertTrue(false, "Unable to verify Amount in NSF Hold");
	    }
		Thread.sleep(5000);
	}
	
	public void verifyAmount_0() throws InterruptedException {
		try {
			Amount.isDisplayed();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Amount +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to verify Amount in NSF Hold");
	    } catch (NoSuchElementException e) {
	        System.out.println(Amount +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to verify Amount in NSF Hold");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Amount+ e);
	        assertTrue(false, "Unable to verify Amount in NSF Hold");
	    }
		Thread.sleep(5000);
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
				
				pdf.click();
			
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
	
	public void clickOnNSFClose() throws InterruptedException {
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

}
