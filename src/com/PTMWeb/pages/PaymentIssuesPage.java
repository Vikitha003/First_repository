package com.PTMWeb.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

import com.PTMWeb.utilities.Baseclass;

public class PaymentIssuesPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public PaymentIssuesPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@class='k-input-inner']")
	WebElement Search;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td")
	WebElement payrollId;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td")
	WebElement AgencyID;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[2]")
	WebElement Description;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[3]")
	WebElement Duedate;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[4]")
	WebElement Amount;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[5]")
	WebElement ReasonCode;
	
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td")
	WebElement ReasonCode_NoRecordsavailable;
	
	@FindBy(xpath = "//span[@class='k-icon k-button-icon k-i-excel']")
	WebElement Excel;
	
	@FindBy(xpath="//span[@class='k-icon k-button-icon k-i-pdf']")
	WebElement pdf;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	WebElement close;
	
	public void clearSearch() throws InterruptedException {
		try {
			if(Search.isDisplayed()) {
				Search.clear();
			}
		} catch (StaleElementReferenceException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to search with PayrollID in Payments Issues");
        } catch (NoSuchElementException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to search with PayrollID in Payments Issues");
        } catch (Exception e) {
            System.out.println("unable to click.." + Search+ e);
            assertTrue(false, "Unable to search with PayrollID in Payments Issues");
        }
		Thread.sleep(3000);
	}
	
public void searchwithPayrollID() throws InterruptedException {
		
		try {
			Search.sendKeys(payrollID);
			
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to search with PayrollID in Payments Issues");
        } catch (NoSuchElementException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to search with PayrollID in Payments Issues");
        } catch (Exception e) {
            System.out.println("unable to click.." + Search+ e);
            assertTrue(false, "Unable to search with PayrollID in Payments Issues");
        }
		Thread.sleep(3000);
	}

public void searchwithPayrollID_BHBAKERY() throws InterruptedException {
	
	try {
		Search.sendKeys(PayrollID_BHBAKERY);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with PayrollID in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with PayrollID in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with PayrollID in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithPayrollID_TIBERIUM() throws InterruptedException {
	
	try {
		Search.sendKeys(PayrollID_TIBERIUM);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with PayrollID in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with PayrollID in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with PayrollID in Payments Issues");
    }
	Thread.sleep(3000);
}


public void searchwithAgencyID() throws InterruptedException {
	
	try {
		Search.sendKeys(PIAgencyID);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with AgencyID in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with AgencyID in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with AgencyID in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithAgencyID_BHBAKERY() throws InterruptedException {
	
	try {
		Search.sendKeys(PIAgencyID_BHBAKERY);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with AgencyID in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with AgencyID in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with AgencyID in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithAgencyID_TIBERIUM() throws InterruptedException {
	
	try {
		Search.sendKeys(PIAgencyID_TIBERIUM);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with AgencyID in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with AgencyID in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with AgencyID in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithDescription() throws InterruptedException {
	
	try {
		Search.sendKeys(PIDescription);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Description in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Description in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Description in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithDescription_BHBAKERY() throws InterruptedException {
	
	try {
		Search.sendKeys(PIDescription_BHBAKERY);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Description in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Description in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Description in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithDescription_TIBERIUM() throws InterruptedException {
	
	try {
		Search.sendKeys(PIDescription_TIBERIUM);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Description in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Description in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Description in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithDuedate() throws InterruptedException {
	
	try {
		Search.sendKeys(PIDueDate);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Duedate in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Duedate in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Duedate in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithDuedate_BHBAKERY() throws InterruptedException {
	
	try {
		Search.sendKeys(PIDuedate_BHBAKERY);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Duedate in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Duedate in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Duedate in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithDuedate_TIBERIUM() throws InterruptedException {
	
	try {
		Search.sendKeys(PIDuedate_TIBERIUM);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Duedate in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Duedate in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Duedate in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithAmount() throws InterruptedException {
	
	try {
		Search.sendKeys(PIAmount);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Amount in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Amount in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Amount in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithAmount_BHBAKERY() throws InterruptedException {
	
	try {
		Search.sendKeys(PIAmount_BHBAKERY);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Amount in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Amount in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Amount in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithAmount_TIBERIUM() throws InterruptedException {
	
	try {
		Search.sendKeys(PIAmount_TIBERIUM);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Amount in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Amount in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Amount in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithReasoncode() throws InterruptedException {
	
	try {
		Search.sendKeys(PIReasonCode);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Reasoncode in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Reasoncode in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Reasoncode in Payments Issues");
    }
	Thread.sleep(3000);
}

public void searchwithReasoncode_BHBAKERY() throws InterruptedException {
	
	try {
		Search.sendKeys(PIReasoncode_BHBAKERY);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to search with Reasoncode in Payments Issues");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to search with Reasoncode in Payments Issues");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
        assertTrue(false, "Unable to search with Reasoncode in Payments Issues");
    }
	Thread.sleep(3000);
}

public void clickOnExporttoExcel() throws InterruptedException {
	try {
		Thread.sleep(2000);
		Excel.click();
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Excel +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to Click on Export to Excel button");
    } catch (NoSuchElementException e) {
        System.out.println(Excel +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to Click on Export to Excel button");
    } catch (Exception e) {
        System.out.println(Excel +"unable to click.." + e);
        assertTrue(false, "Unable to Click on Export to Excel button");
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
        assertTrue(false, "Unable to Click on Export to Pdf button");
    } catch (NoSuchElementException e) {
        System.out.println(pdf +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to Click on Export to Pdf button");
    } catch (Exception e) {
        System.out.println(pdf +"unable to click.." + e);
        assertTrue(false, "Unable to Click on Export to Pdf button");
    }
	Thread.sleep(3000);
}

public void clickOnPIClose() throws InterruptedException {
	try {
		if(close.isDisplayed()) {
			close.click();
		}
	} catch (StaleElementReferenceException e) {
        System.out.println(close +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(close +"Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println(close +"unable to click.." + e);
    }
	Thread.sleep(4000);
}

public void verifyPayrollID() throws InterruptedException {
	try {
		String btext= payrollId.getText();
		assertEquals(btext, payrollID);
	} catch (StaleElementReferenceException e) {
        System.out.println(payrollId +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Payroll ID is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(payrollId +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Payroll ID is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ payrollId + e);
        assertTrue(false, "Payroll ID is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyPayrollID_BHBAKERY() throws InterruptedException {
	try {
		String btext= payrollId.getText();
		assertEquals(btext, PayrollID_BHBAKERY);
	} catch (StaleElementReferenceException e) {
        System.out.println(payrollId +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Payroll ID is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(payrollId +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Payroll ID is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + payrollId + e);
        assertTrue(false, "Payroll ID is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyPayrollID_TIBERIUM() throws InterruptedException {
	try {
		String btext= payrollId.getText();
		assertEquals(btext, PayrollID_TIBERIUM);
	} catch (StaleElementReferenceException e) {
        System.out.println(payrollId +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Payroll ID is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(payrollId +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Payroll ID is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + payrollId + e);
        assertTrue(false, "Payroll ID is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyAgencyID() throws InterruptedException {
	try {
		String btext= AgencyID.getText();
		assertEquals(btext, PIAgencyID);
	} catch (StaleElementReferenceException e) {
        System.out.println(AgencyID +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Agency ID is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(AgencyID +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Agency ID is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ AgencyID + e);
        assertTrue(false, "Agency ID is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyAgencyID_BHBAKERY() throws InterruptedException {
	try {
		String btext= AgencyID.getText();
		assertEquals(btext, PIAgencyID_BHBAKERY);
	} catch (StaleElementReferenceException e) {
        System.out.println(AgencyID +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Agency ID is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(AgencyID +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Agency ID is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ AgencyID + e);
        assertTrue(false, "Agency ID is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyAgencyID_TIBERIUM() throws InterruptedException {
	try {
		String btext= AgencyID.getText();
		assertEquals(btext, PIAgencyID_TIBERIUM);
	} catch (StaleElementReferenceException e) {
        System.out.println(AgencyID +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Agency ID is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(AgencyID +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Agency ID is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ AgencyID + e);
        assertTrue(false, "Agency ID is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyDecription() throws InterruptedException {
	try {
		String btext= Description.getText();
		assertEquals(btext, PIDescription);
	} catch (StaleElementReferenceException e) {
        System.out.println(Description +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Description is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(Description +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Description is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + Description+ e);
        assertTrue(false, "Description is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyDecription_BHBAKERY() throws InterruptedException {
	try {
		String btext= Description.getText();
		assertEquals(btext, PIDescription_BHBAKERY);
	} catch (StaleElementReferenceException e) {
        System.out.println(Description +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Description is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(Description +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Description is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + Description+ e);
        assertTrue(false, "Description is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyDecription_TIBERIUM() throws InterruptedException {
	try {
		String btext= Description.getText();
		assertEquals(btext, PIDescription_TIBERIUM);
	} catch (StaleElementReferenceException e) {
        System.out.println(Description +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Description is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(Description +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Description is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + Description+ e);
        assertTrue(false, "Description is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyDueDate() throws InterruptedException {
	try {
		String btext= Duedate.getText();
		assertEquals(btext, PIDueDate);
	} catch (StaleElementReferenceException e) {
        System.out.println(Duedate +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Duedate is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(Duedate +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Duedate is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + Duedate+ e);
        assertTrue(false, "Duedate is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyDueDate_BHBAKERY() throws InterruptedException {
	try {
		String btext= Duedate.getText();
		assertEquals(btext, PIDuedate_BHBAKERY);
	} catch (StaleElementReferenceException e) {
        System.out.println(Duedate +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Duedate is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(Duedate +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Duedate is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + Duedate+ e);
        assertTrue(false, "Duedate is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyDueDate_TIBERIUM() throws InterruptedException {
	try {
		String btext= Duedate.getText();
		assertEquals(btext, PIDuedate_TIBERIUM);
	} catch (StaleElementReferenceException e) {
        System.out.println(Duedate +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Duedate is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(Duedate +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Duedate is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + Duedate+ e);
        assertTrue(false, "Duedate is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyAmount() throws InterruptedException {
	try {
		String btext= Amount.getText();
		assertEquals(btext, PIAmount_specialchar);
	} catch (StaleElementReferenceException e) {
        System.out.println(Amount +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Amount is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(Amount +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Amount is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ Amount + e);
        assertTrue(false, "Amount is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyAmount_BHBAKERY() throws InterruptedException {
	try {
		String btext= Amount.getText();
		assertEquals(btext, PIAmount_specialchar_BHBAKERY);
	} catch (StaleElementReferenceException e) {
        System.out.println(Amount +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Amount is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(Amount +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Amount is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ Amount + e);
        assertTrue(false, "Amount is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyAmount_TIBERIUM() throws InterruptedException {
	try {
		String btext= Amount.getText();
		assertEquals(btext, PIAmount_specialchar_TIBERIUM);
	} catch (StaleElementReferenceException e) {
        System.out.println(Amount +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Amount is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(Amount +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Amount is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.."+ Amount + e);
        assertTrue(false, "Amount is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyReasoncode() throws InterruptedException {
	try {
		String btext= ReasonCode.getText();
		assertEquals(btext, PIReasonCode);
	} catch (StaleElementReferenceException e) {
        System.out.println(ReasonCode +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Reasoncode is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(ReasonCode +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Reasoncode is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + ReasonCode+ e);
        assertTrue(false, "Reasoncode is not verified in Payment Issues Page");
    }
	Thread.sleep(5000);
}

public void verifyReasoncode_BHBAKERY() throws InterruptedException {
	try {
		String btext= ReasonCode_NoRecordsavailable.getText();
		assertEquals(btext, PIReasoncode_BHBAKERY);
	} catch (StaleElementReferenceException e) {
        System.out.println(ReasonCode +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Reasoncode is not verified in Payment Issues Page");
    } catch (NoSuchElementException e) {
        System.out.println(ReasonCode +"Element" + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Reasoncode is not verified in Payment Issues Page");
    } catch (Exception e) {
        System.out.println("unable to click.." + ReasonCode+ e);
        assertTrue(false, "Reasoncode is not verified in Payment Issues Page");
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
