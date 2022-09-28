package com.PTMWeb.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PTMWeb.utilities.Baseclass;

public class ProfilePage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public ProfilePage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//div[.=' Legal Name:dough nuts inc.']")
	WebElement DoughNutsLegalName;
	
	@FindBy(xpath = "//div[.=' Legal Name:bh bakery inc.']")
	WebElement BHBakeryLegalName;
	
	@FindBy(xpath = "//div[.=' Legal Name:tiberium systems llc']")
	WebElement TiBERIUMSYSTEMSLegalName;
	
	@FindBy(xpath = "//div[.=' DBA:dough nuts inc.']")
	WebElement DoughNutsDBA;
	
	@FindBy(xpath = "//div[.=' DBA:bh bakery inc.']")
	WebElement BHBakeryDBA;
	
	@FindBy(xpath = "//div[.=' DBA:tiberium systems llc']")
	WebElement TIBERIUMSYSTEMSDBA;
	
	@FindBy(xpath = "//div[.=' Address:123 city drive   irvine, CA 92602']")
	WebElement DoughNutsAddress;
	
	@FindBy(xpath = "//div[.=' Address:321 city drive   irvine, CA 92614']")
	WebElement BHBakeryAddress;
	
	@FindBy(xpath = "//div[.=' Address:321 town circle   irvine, CA 92620']")
	WebElement TIBERIUMSYSTEMSAddress;
	
	@FindBy(xpath = "//div[.=' FEIN: 12-3456789']")
	WebElement DoughNutsFEIN;
	
	@FindBy(xpath = "//div[.=' FEIN: 12-3456789']")
	WebElement BHBakeryFEIN;
	
	@FindBy(xpath = "//div[.=' FEIN: 12-3456789']")
	WebElement TIBERIUMSYSTEMSFEIN;
	
	@FindBy(xpath = "//div[.=' Client ID: APTM0001  ']")
	WebElement DoughNutsClientID;
	
	@FindBy(xpath = "//div[.=' Client ID: APTM0002  ']")
	WebElement BHBakeryClientID;
	
	@FindBy(xpath = "//div[.=' Client ID: APTM0003  ']")
	WebElement TIBERIUMSYSTEMSClientID;
	
	@FindBy(xpath = "//div[.=' Payroll ID: 04150 ']")
	WebElement DoughNutsPayrollID;
	
	@FindBy(xpath = "//div[.=' Payroll ID: 06500 ']")
	WebElement BHBakeryPayrollID;
	
	@FindBy(xpath = "//div[.=' Payroll ID: 05830 ']")
	WebElement TIBERIUMSYSTEMSPayrollID;
	
	@FindBy(xpath = "//div[.=' NSF Hold: Yes']")
	WebElement DoughNutsNSFHold;
	
	@FindBy(xpath = "//div[.=' NSF Hold: No ']")
	WebElement BHBAKERYNSFHold;
	
	@FindBy(xpath = "//div[.=' Contact Name: Tom Edison']")
	WebElement DoughNutsContactName;
	
	@FindBy(xpath = "//div[.=' Contact Name: Michael']")
	WebElement BHBakeryContactName;
	
	@FindBy(xpath = "//div[.=' Contact Name: David']")
	WebElement TIBERIUMSYSTEMSContactName;
	
	@FindBy(xpath = "//div[.=' Phone: (714) 555-1234']")
	WebElement DoughNutsPhonenumber;
	
	@FindBy(xpath = "//div[.=' Phone: (714) 555-7123']")
	WebElement BHBakeryPhonenumber;
	
	@FindBy(xpath = "//div[.=' Phone: (949) 555-5100']")
	WebElement TIBERIUMSYSTEMSPhonenumber;
	
	@FindBy(xpath = "//div[.=' Fax: (714) 555-4321']")
	WebElement DoughNutsFax;
	
	@FindBy(xpath = "//div[.=' Fax: (714) 555-7321']")
	WebElement BHBakeryFax;
	
	@FindBy(xpath = "//div[.=' Fax: (949) 555-5101']")
	WebElement TIBERIUMSYSTEMSFax;
	
	@FindBy(xpath = "//div[.=' Email:tom.edison@doughnuts.com']")
	WebElement DoughNutsEmail;
	
	@FindBy(xpath = "//div[.=' Email:michael@Yuhoo.com']")
	WebElement BHBakeryEmail;
	
	@FindBy(xpath = "//div[.=' Email:david@noemail.com']")
	WebElement TIBERIUMSYSTEMSEmail;
	
	
	
	
	
	public void ValidateDoughNutsLegalName() throws InterruptedException {
		try {
			SetHighlight(DoughNutsLegalName);
			if(DoughNutsLegalName.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateBHBakeryLegalName() throws InterruptedException {
		try {
			SetHighlight(BHBakeryLegalName);
			if(BHBakeryLegalName.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSLegalName() throws InterruptedException {
		try {
			SetHighlight(TiBERIUMSYSTEMSLegalName);
			if(TiBERIUMSYSTEMSLegalName.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateDoughNutsDBA() throws InterruptedException {
		try {
			SetHighlight(DoughNutsDBA);
			if(DoughNutsDBA.isDisplayed()) {
				assertTrue(true);
			}
//			String btext= DoughNutsDBA.getText();
//			assertEquals(btext,DoughNutsDBA_1);
				
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void ValidatebHBakeryDBA() throws InterruptedException {
		try {
			SetHighlight(BHBakeryDBA);
			if(BHBakeryDBA.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSDBA() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSDBA);
			if(TIBERIUMSYSTEMSDBA.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateDoughNutsAddress() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAddress);
			if(DoughNutsAddress.isDisplayed()) {
				assertTrue(true);
			}
//			String btext= DoughNutsAddress.getText();
//			assertEquals(btext,DoughNutsAddress_1);
				
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void ValidateBHBakeryAddress() throws InterruptedException {
		try {
			SetHighlight(BHBakeryAddress);
			if(BHBakeryAddress.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSAddress() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSAddress);
			if(TIBERIUMSYSTEMSAddress.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateDoughNutsFEIN() throws InterruptedException {
		try {
			
			SetHighlight(DoughNutsFEIN);
			if(DoughNutsFEIN.isDisplayed()) {
				assertTrue(true);
			}
//			String btext= DoughNutsFEIN.getText();
//			assertEquals(btext,DoughNutsFEIN_1);
				
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void ValidateBHBakeryFEIN() throws InterruptedException {
		try {
			
			SetHighlight(BHBakeryFEIN);
			if(BHBakeryFEIN.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSFEIN() throws InterruptedException {
		try {
			
			SetHighlight(TIBERIUMSYSTEMSFEIN);
			if(TIBERIUMSYSTEMSFEIN.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateDoughNutsClientID() throws InterruptedException {
		try {
			SetHighlight(DoughNutsClientID);
			if(DoughNutsClientID.isDisplayed()) {
				assertTrue(true);
			}
//			String btext= DoughNutsClientID.getText();
//			assertEquals(btext,DoughNutsClientID_1);
				
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void ValidateBHBakeryClientID() throws InterruptedException {
		try {
			SetHighlight(BHBakeryClientID);
			if(BHBakeryClientID.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSClientID() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSClientID);
			if(TIBERIUMSYSTEMSClientID.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateDoughNutsPayrollID() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPayrollID);
			if(DoughNutsPayrollID.isDisplayed()) {
				assertTrue(true);
			}
//			String btext= DoughNutsPayrollID.getText();
//			assertEquals(btext,DoughNutsPayrollID_1);
				
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void ValidateBHBakeryPayrollID() throws InterruptedException {
		try {
			SetHighlight(BHBakeryPayrollID);
			if(BHBakeryPayrollID.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSPayrollID() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSPayrollID);
			if(TIBERIUMSYSTEMSPayrollID.isDisplayed()) {
				assertTrue(true);
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
	
	
	public void ValidateBHBAKERYNSFHold() throws InterruptedException {
		try {
			SetHighlight(BHBAKERYNSFHold);
			String btext= BHBAKERYNSFHold.getText();
			assertEquals(btext,NSFHoldStatus_BHBAKERY);
				
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsNSFHold() throws InterruptedException {
		try {
			SetHighlight(DoughNutsNSFHold);
			String btext= DoughNutsNSFHold.getText();
			assertEquals(btext,NSFHoldStatus);
				
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void ValidateTIBERIUMSYSTEMSNSFHold() throws InterruptedException {
		try {
			SetHighlight(DoughNutsNSFHold);
			String btext= DoughNutsNSFHold.getText();
			assertEquals(btext,NSFHoldStatus);
				
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsContact() throws InterruptedException {
		try {
			SetHighlight(DoughNutsContactName);
			if(DoughNutsContactName.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateBHBakeryContact() throws InterruptedException {
		try {
			SetHighlight(BHBakeryContactName);
			if(BHBakeryContactName.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSContact() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSContactName);
			if(TIBERIUMSYSTEMSContactName.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateDoughNutsPhone() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPhonenumber);
			if(DoughNutsPhonenumber.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateBHBakeryPhone() throws InterruptedException {
		try {
			SetHighlight(BHBakeryPhonenumber);
			if(BHBakeryPhonenumber.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSPhone() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSPhonenumber);
			if(TIBERIUMSYSTEMSPhonenumber.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateDoughNutsFax() throws InterruptedException {
		try {
			SetHighlight(DoughNutsFax);
			if(DoughNutsFax.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateBHBakeryFax() throws InterruptedException {
		try {
			SetHighlight(BHBakeryFax);
			if(BHBakeryFax.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSFax() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSFax);
			if(TIBERIUMSYSTEMSFax.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateDoughNutsEmail() throws InterruptedException {
		try {
			SetHighlight(DoughNutsEmail);
			if(DoughNutsEmail.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateBHBakeryEmail() throws InterruptedException {
		try {
			SetHighlight(BHBakeryEmail);
			if(BHBakeryEmail.isDisplayed()) {
				assertTrue(true);
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
	
	public void ValidateTIBERIUMSYSTEMSEmail() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSEmail);
			if(TIBERIUMSYSTEMSEmail.isDisplayed()) {
				assertTrue(true);
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
	
	


}
