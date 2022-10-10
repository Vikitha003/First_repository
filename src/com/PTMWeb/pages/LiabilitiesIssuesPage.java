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
import org.testng.Assert;

import com.PTMWeb.utilities.Baseclass;

public class LiabilitiesIssuesPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public LiabilitiesIssuesPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@class='k-input-inner']")
	WebElement Search;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td")
	WebElement payrollId;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td")
	WebElement checkDate;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[2]")
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
            assertTrue(false, "Unable to clear the Search");
        } catch (NoSuchElementException e) {
            System.out.println(Search+"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to clear the Search");
        } catch (Exception e) {
            System.out.println("unable to click.."+Search + e);
            assertTrue(false, "Unable to clear the Search");
            
        }
		Thread.sleep(3000);
	}
	
	public void searchwithPayrollID() throws InterruptedException {
		
		try {
				
				Search.sendKeys(payrollID_DoughNuts);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to search with PayrollID in Liabilities Issues");
        } catch (NoSuchElementException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to search with PayrollID in Liabilities Issues");
        } catch (Exception e) {
            System.out.println("unable to click.." + Search+ e);
            assertTrue(false, "Unable to search with PayrollID in Liabilities Issues");
        }
		Thread.sleep(3000);
	}
	
	public void searchwithPayrollID_BHBAKERY() throws InterruptedException {
		
		try {
			
			Search.sendKeys(PayrollID_BHBAKERY);
		
		} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with PayrollID in Liabilities Issues");
		} catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with PayrollID in Liabilities Issues");
		} catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with PayrollID in Liabilities Issues");
		}
		Thread.sleep(3000);
	
	}
	

public void searchwithPayrollID_TIBERIUM() throws InterruptedException {
	
	try {
			
			Search.sendKeys(PayrollID_TIBERIUM);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with PayrollID in Liabilities Issues");
		} catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with PayrollID in Liabilities Issues");
		} catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with PayrollID in Liabilities Issues");
		}
	Thread.sleep(3000);
}
	
	public void searchwithCheckDate(String date) throws InterruptedException {
		try {
				
				Search.sendKeys(date);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to search with CheckDate in Liabilities Issues");
		} catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to search with CheckDate in Liabilities Issues");
		} catch (Exception e) {
	        System.out.println("unable to click.." + Search+ e);
	        assertTrue(false, "Unable to search with CheckDate in Liabilities Issues");
		}
		Thread.sleep(3000);
	}
	
	public void searchwithReason(String reason) throws InterruptedException {
		try {
				
				Search.sendKeys(reason);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to search with Reason in Liabilities Issues");
		} catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to search with Reason in Liabilities Issues");
		} catch (Exception e) {
	        System.out.println("unable to click.." + Search+ e);
	        assertTrue(false, "Unable to search with Reason in Liabilities Issues");
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
            System.out.println("unable to click.."+ Excel + e);
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
            System.out.println("unable to click.."+ pdf + e);
            assertTrue(false, "Unable to click on Export to Pdf button");
        }
		Thread.sleep(3000);
	}
	
	public void clickOnLIClose() throws InterruptedException {
		try {
				
				close.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(close +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to click on close button in Liabilities issues");
        } catch (NoSuchElementException e) {
            System.out.println(close +"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to click on close button in Liabilities issues");
        } catch (Exception e) {
            System.out.println("unable to click.."+ close + e);
            assertTrue(false, "Unable to click on close button in Liabilities issues");
        }
		Thread.sleep(3000);
	}
	
	public void verifyPayrollID() throws InterruptedException {
		try {
			
			String btext= payrollId.getText();
			assertEquals(btext, payrollID_DoughNuts);
			assertTrue(true, "Payroll ID is Verified in Liabilities Issues");
		} catch (StaleElementReferenceException e) {
            System.out.println(payrollId +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Payroll ID is not Verified in Liabilities Issues");
        } catch (NoSuchElementException e) {
            System.out.println(payrollId +"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Payroll ID is not Verified in Liabilities Issues");
        } catch (Exception e) {
            System.out.println("unable to click.." + payrollId+ e);
            assertTrue(false, "Payroll ID is not Verified in Liabilities Issues");
        }
		Thread.sleep(5000);
	}
	
	public void verifyPayrollID_BHBAKERY() throws InterruptedException {
		try {
			
			String btext= payrollId.getText();
			assertEquals(btext, PayrollID_BHBAKERY);
			assertTrue(true, "Payroll ID is Verified in Liabilities Issues");
		} catch (StaleElementReferenceException e) {
            System.out.println(payrollId +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Payroll ID is not Verified in Liabilities Issues");
        } catch (NoSuchElementException e) {
            System.out.println(payrollId +"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Payroll ID is not Verified in Liabilities Issues");
        } catch (Exception e) {
            System.out.println(payrollId +"unable to click.." + e);
            assertTrue(false, "Payroll ID is not Verified in Liabilities Issues");
        }
		Thread.sleep(5000);
	}
	
	public void verifyPayrollID_TIBERIUM() throws InterruptedException {
		try {
			
			String btext= payrollId.getText();
			assertEquals(btext, PayrollID_TIBERIUM);
			assertTrue(true, "Payroll ID is Verified in Liabilities Issues");
		} catch (StaleElementReferenceException e) {
            System.out.println(payrollId +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Payroll ID is not Verified in Liabilities Issues");
        } catch (NoSuchElementException e) {
            System.out.println(payrollId +"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Payroll ID is not Verified in Liabilities Issues");
        } catch (Exception e) {
            System.out.println("unable to click.." + payrollId+ e);
            assertTrue(false, "Payroll ID is not Verified in Liabilities Issues");
        }
		Thread.sleep(5000);
	}
	
	public void verifycheckDate() throws InterruptedException {
		try {
			
			String btext= checkDate.getText();
			Assert.assertEquals(btext, LiabilitiesIssues_checkDate);
			
			assertTrue(true, "Check Date is Verified in Liabilities Issues");
		} catch (StaleElementReferenceException e) {
            System.out.println(checkDate +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
     
            Assert.fail("Check Date is not Verified in Liabilities Issues");
        } catch (NoSuchElementException e) {
            System.out.println(checkDate +"Element" + " is not visble to click.." + "-NosuchElementException");

            Assert.fail("Check Date is not Verified in Liabilities Issues");
            
        } catch (Exception e) {
            System.out.println("unable to click.." + checkDate+ e);
           
            Assert.fail("Check Date is not Verified in Liabilities Issues");
        }
		Thread.sleep(4000);
	}
	
	public void verifyReason() throws InterruptedException {
		try {
			
			String btext= Reason.getText();
			assertEquals(btext, LiabilitiesIssues_Reason);
			assertTrue(true, "Reason is Verified in Liabilities Issues");
		} catch (StaleElementReferenceException e) {
            System.out.println(Reason +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Reason is not Verified in Liabilities Issues");
        } catch (NoSuchElementException e) {
            System.out.println(Reason +"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Reason is not Verified in Liabilities Issues");
        } catch (Exception e) {
            System.out.println("unable to click.." + Reason+ e);
            assertTrue(false, "Reason is not Verified in Liabilities Issues");
        }
		Thread.sleep(4000);
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

