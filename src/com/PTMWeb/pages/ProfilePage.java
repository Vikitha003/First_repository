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
            System.out.println(DoughNutsLegalName + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Legal Name 'Dough Nuts Inc'");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsLegalName + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Legal Name 'Dough Nuts Inc'");
        } catch (Exception e) {
            System.out.println("unable to click.."+ DoughNutsLegalName + e);
            assertTrue(false, "Unable to Validate Legal Name 'Dough Nuts Inc'");
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
            System.out.println(BHBakeryLegalName + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Legal Name 'BH Bakery Inc.'");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryLegalName + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Legal Name 'BH Bakery Inc.'");
        } catch (Exception e) {
            System.out.println("unable to click.." + BHBakeryLegalName + e);
            assertTrue(false, "Unable to Validate Legal Name 'BH Bakery Inc.'");
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
            System.out.println(TiBERIUMSYSTEMSLegalName + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Legal Name 'Tiberium Systems LLC'");
        } catch (NoSuchElementException e) {
            System.out.println(TiBERIUMSYSTEMSLegalName + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Legal Name 'Tiberium Systems LLC'");
        } catch (Exception e) {
            System.out.println("unable to click.." + TiBERIUMSYSTEMSLegalName + e);
            assertTrue(false, "Unable to Validate Legal Name 'Tiberium Systems LLC'");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsDBA() throws InterruptedException {
		try {
			SetHighlight(DoughNutsDBA);
			if(DoughNutsDBA.isDisplayed()) {
				assertTrue(true);
			}

				
		} catch (StaleElementReferenceException e) {
            System.out.println(DoughNutsDBA + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate DBA 'Dough Nuts Inc.'");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsDBA + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate DBA 'Dough Nuts Inc.'");
        } catch (Exception e) {
            System.out.println("unable to click.."+ DoughNutsDBA + e);
            assertTrue(false, "Unable to Validate DBA 'Dough Nuts Inc.'");
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
            System.out.println(BHBakeryDBA + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate DBA 'Bh Bakery Inc.'");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryDBA + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate DBA 'Bh Bakery Inc.'");
        } catch (Exception e) {
            System.out.println("unable to click.." + BHBakeryDBA + e);
            assertTrue(false, "Unable to Validate DBA 'Bh Bakery Inc.'");
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
            System.out.println(TIBERIUMSYSTEMSDBA + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate DBA  'Tiberium Systems Llc'");
        } catch (NoSuchElementException e) {
            System.out.println(TIBERIUMSYSTEMSDBA + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate DBA  'Tiberium Systems Llc'");
        } catch (Exception e) {
            System.out.println("unable to click.." + TIBERIUMSYSTEMSDBA + e);
            assertTrue(false, "Unable to Validate DBA  'Tiberium Systems Llc'");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsAddress() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAddress);
			if(DoughNutsAddress.isDisplayed()) {
				assertTrue(true);
			}
				
		} catch (StaleElementReferenceException e) {
            System.out.println(DoughNutsAddress + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Address '123 City Drive Irvine, CA 92602' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsAddress + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Address '123 City Drive Irvine, CA 92602' ");
        } catch (Exception e) {
            System.out.println("unable to click.."+ DoughNutsAddress + e);
            assertTrue(false, "Unable to Validate Address '123 City Drive Irvine, CA 92602' ");
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
            System.out.println(BHBakeryAddress + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Address '321 City Drive Irvine, CA 92614' ");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryAddress + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Address '321 City Drive Irvine, CA 92614' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + BHBakeryAddress + e);
            assertTrue(false, "Unable to Validate Address '321 City Drive Irvine, CA 92614' ");
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
            System.out.println(TIBERIUMSYSTEMSAddress + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Address '321 Town Circle Irvine, CA 92620' ");
        } catch (NoSuchElementException e) {
            System.out.println(TIBERIUMSYSTEMSAddress + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Address '321 Town Circle Irvine, CA 92620' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + TIBERIUMSYSTEMSAddress + e);
            assertTrue(false, "Unable to Validate Address '321 Town Circle Irvine, CA 92620' ");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsFEIN() throws InterruptedException {
		try {
			
			SetHighlight(DoughNutsFEIN);
			if(DoughNutsFEIN.isDisplayed()) {
				assertTrue(true);
			}
				
		} catch (StaleElementReferenceException e) {
            System.out.println(DoughNutsFEIN + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate FEIN '12-3456789' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsFEIN + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate FEIN '12-3456789' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + DoughNutsFEIN + e);
            assertTrue(false, "Unable to Validate FEIN '12-3456789' ");
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
            System.out.println(BHBakeryFEIN + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate FEIN '12-3456789' ");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryFEIN + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate FEIN '12-3456789' ");
        } catch (Exception e) {
            System.out.println("unable to click.."+ BHBakeryFEIN + e);
            assertTrue(false, "Unable to Validate FEIN '12-3456789' ");
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
            System.out.println(TIBERIUMSYSTEMSFEIN + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate FEIN '12-3456789' ");
        } catch (NoSuchElementException e) {
            System.out.println(TIBERIUMSYSTEMSFEIN + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate FEIN '12-3456789' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + TIBERIUMSYSTEMSFEIN + e);
            assertTrue(false, "Unable to Validate FEIN '12-3456789' ");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsClientID() throws InterruptedException {
		try {
			SetHighlight(DoughNutsClientID);
			if(DoughNutsClientID.isDisplayed()) {
				assertTrue(true);
			}
				
		} catch (StaleElementReferenceException e) {
            System.out.println(DoughNutsClientID + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate client id 'APTM0001' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsClientID + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate client id 'APTM0001' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + DoughNutsClientID + e);
            assertTrue(false, "Unable to Validate client id 'APTM0001' ");
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
            System.out.println(BHBakeryClientID + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate client id 'APTM0002' ");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryClientID + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate client id 'APTM0002' ");
        } catch (Exception e) {
            System.out.println("unable to click.."+ BHBakeryClientID + e);
            assertTrue(false, "Unable to Validate client id 'APTM0002' ");
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
            System.out.println(TIBERIUMSYSTEMSClientID + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate client id 'APTM0003' ");
        } catch (NoSuchElementException e) {
            System.out.println(TIBERIUMSYSTEMSClientID + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate client id 'APTM0003' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + TIBERIUMSYSTEMSClientID + e);
            assertTrue(false, "Unable to Validate client id 'APTM0003' ");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsPayrollID() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPayrollID);
			if(DoughNutsPayrollID.isDisplayed()) {
				assertTrue(true);
			}

				
		} catch (StaleElementReferenceException e) {
            System.out.println(DoughNutsPayrollID + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Payroll id '04150' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsPayrollID + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Payroll id '04150' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + DoughNutsPayrollID + e);
            assertTrue(false, "Unable to Validate Payroll id '04150' ");
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
            System.out.println(BHBakeryPayrollID + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Payroll id '06500' ");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryPayrollID + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Payroll id '06500' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + BHBakeryPayrollID + e);
            assertTrue(false, "Unable to Validate Payroll id '06500' ");
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
            System.out.println(TIBERIUMSYSTEMSPayrollID + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Payroll id '05830' ");
        } catch (NoSuchElementException e) {
            System.out.println(TIBERIUMSYSTEMSPayrollID + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Payroll id '05830' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + TIBERIUMSYSTEMSPayrollID + e);
            assertTrue(false, "Unable to Validate Payroll id '05830' ");
        }
		Thread.sleep(3000);
	}
	
	
	public void ValidateBHBAKERYNSFHold() throws InterruptedException {
		try {
			SetHighlight(BHBAKERYNSFHold);
			String btext= BHBAKERYNSFHold.getText();
			assertEquals(btext,NSFHoldStatus_BHBAKERY);
				
		} catch (StaleElementReferenceException e) {
            System.out.println(BHBAKERYNSFHold + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate NSF Hold 'No' ");
        } catch (NoSuchElementException e) {
            System.out.println(BHBAKERYNSFHold + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate NSF Hold 'No' ");
        } catch (Exception e) {
            System.out.println("unable to click.."+ BHBAKERYNSFHold + e);
            assertTrue(false, "Unable to Validate NSF Hold 'No' ");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsNSFHold() throws InterruptedException {
		try {
			SetHighlight(DoughNutsNSFHold);
			String btext= DoughNutsNSFHold.getText();
			assertEquals(btext,NSFHoldStatus);
				
		} catch (StaleElementReferenceException e) {
            System.out.println(DoughNutsNSFHold + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate NSF Hold 'Yes' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsNSFHold + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate NSF Hold 'Yes' ");
        } catch (Exception e) {
            System.out.println("unable to click.."+ DoughNutsNSFHold + e);
            assertTrue(false, "Unable to Validate NSF Hold 'Yes' ");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateTIBERIUMSYSTEMSNSFHold() throws InterruptedException {
		try {
			SetHighlight(DoughNutsNSFHold);
			String btext= DoughNutsNSFHold.getText();
			assertEquals(btext,NSFHoldStatus);
				
		} catch (StaleElementReferenceException e) {
            System.out.println(DoughNutsNSFHold + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate NSF Hold 'Yes' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsNSFHold + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate NSF Hold 'Yes' ");
        } catch (Exception e) {
            System.out.println("unable to click.."+ DoughNutsNSFHold + e);
            assertTrue(false, "Unable to Validate NSF Hold 'Yes' ");
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
            System.out.println(DoughNutsContactName + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Contact 'Tom Edison' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsContactName + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Contact 'Tom Edison' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + DoughNutsContactName + e);
            assertTrue(false, "Unable to Validate Contact 'Tom Edison' ");
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
            System.out.println(BHBakeryContactName + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Contact 'Michael' ");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryContactName + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Contact 'Michael' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + BHBakeryContactName + e);
            assertTrue(false, "Unable to Validate Contact 'Michael' ");
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
            System.out.println(TIBERIUMSYSTEMSContactName + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Contact 'David' ");
        } catch (NoSuchElementException e) {
            System.out.println(TIBERIUMSYSTEMSContactName + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Contact 'David' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + TIBERIUMSYSTEMSContactName + e);
            assertTrue(false, "Unable to Validate Contact 'David' ");
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
            System.out.println(DoughNutsPhonenumber + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Phone '(714) 555-1234' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsPhonenumber + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Phone '(714) 555-1234' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + DoughNutsPhonenumber + e);
            assertTrue(false, "Unable to Validate Phone '(714) 555-1234' ");
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
            System.out.println(BHBakeryPhonenumber + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Phone '(714) 555-7123' ");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryPhonenumber + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Phone '(714) 555-7123' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + BHBakeryPhonenumber + e);
            assertTrue(false, "Unable to Validate Phone '(714) 555-7123' ");
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
            System.out.println(TIBERIUMSYSTEMSPhonenumber + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Phone '(949) 555-5100' ");
        } catch (NoSuchElementException e) {
            System.out.println(TIBERIUMSYSTEMSPhonenumber + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Phone '(949) 555-5100' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + TIBERIUMSYSTEMSPhonenumber + e);
            assertTrue(false, "Unable to Validate Phone '(949) 555-5100' ");
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
            System.out.println(DoughNutsFax + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Fax '(714) 555-4321' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsFax + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Fax '(714) 555-4321' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + DoughNutsFax + e);
            assertTrue(false, "Unable to Validate Fax '(714) 555-4321' ");
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
            System.out.println(BHBakeryFax + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Fax '(714) 555-7321' ");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryFax + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Fax '(714) 555-7321' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + BHBakeryFax + e);
            assertTrue(false, "Unable to Validate Fax '(714) 555-7321' ");
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
            System.out.println(TIBERIUMSYSTEMSFax + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Fax '(949) 555-5101' ");
        } catch (NoSuchElementException e) {
            System.out.println(TIBERIUMSYSTEMSFax + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Fax '(949) 555-5101' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + TIBERIUMSYSTEMSFax + e);
            assertTrue(false, "Unable to Validate Fax '(949) 555-5101' ");
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
            System.out.println(DoughNutsEmail + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Email 'tom.edison@doughnuts.com' ");
        } catch (NoSuchElementException e) {
            System.out.println(DoughNutsEmail + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Email 'tom.edison@doughnuts.com' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + DoughNutsEmail + e);
            assertTrue(false, "Unable to Validate Email 'tom.edison@doughnuts.com' ");
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
            System.out.println(BHBakeryEmail + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Email 'michael@Yuhoo.com' ");
        } catch (NoSuchElementException e) {
            System.out.println(BHBakeryEmail + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Email 'michael@Yuhoo.com' ");
        } catch (Exception e) {
            System.out.println("unable to click.." + BHBakeryEmail + e);
            assertTrue(false, "Unable to Validate Email 'michael@Yuhoo.com' ");
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
            System.out.println(TIBERIUMSYSTEMSEmail + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Validate Email 'david@noemail.com' ");
        } catch (NoSuchElementException e) {
            System.out.println(TIBERIUMSYSTEMSEmail + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Validate Email 'david@noemail.com' ");
        } catch (Exception e) {
            System.out.println("unable to click.."+ TIBERIUMSYSTEMSEmail + e);
            assertTrue(false, "Unable to Validate Email 'david@noemail.com' ");
        }
		Thread.sleep(3000);
	}
	
	


}
