package com.PTMWeb.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PTMWeb.utilities.Baseclass;
import com.aventstack.extentreports.util.Assert;

public class TaxAgenciesPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public TaxAgenciesPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	

	@FindBy(xpath = "//input[@class='k-input-inner']")
	WebElement Search;
	
	@FindBy(xpath = "//span[@class='k-icon k-button-icon k-i-excel']")
	WebElement Excel;
	
	@FindBy(xpath="//span[@class='k-icon k-button-icon k-i-pdf']")
	WebElement pdf;
	
	@FindBy(xpath = "//span[text()='AZ Job Training Tax']")
	WebElement AZJobTrainingTax;
	
	@FindBy(xpath = "//span[text()='AZSUI']")
	WebElement AZSUI;
	
	@FindBy(xpath = "//span[text()='FUTA']")
	WebElement FUTA;
	
	@FindBy(xpath = "//span[text()='AZSW']")
	WebElement AZSW;
	
	@FindBy(xpath = "//span[text()='IRS - 941/944']")
	WebElement IRS941;
	
	@FindBy(xpath = "//span[text()='COWEEK3DAY']")
	WebElement COWEEK3DAY;
	
	@FindBy(xpath = "//span[text()='TXSUI']")
	WebElement TXSUI;
	
	@FindBy(xpath = "//span[text()='TXREPLEN']")
	WebElement TXREPLEN;
	
	@FindBy(xpath = "//span[text()='COSUI']")
	WebElement COSUI;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='FUTA']")
	WebElement DoughNutsAgencyID_FUTA;
	
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='IRS']")
	WebElement DoughNutsAgencyID_IRS;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='AZASSESS']")
	WebElement DoughNutsAgencyID_AZASSESS;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='COSW']")
	WebElement DoughNutsAgencyID_COSW;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='AZSW']")
	WebElement DoughNutsAgencyID_AZSW;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='TXSUI']")
	WebElement DoughNutsAgencyID_TXSUI;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='TXREPLEN']")
	WebElement BHBAKERYAgencyID_TXREPLEN;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='COSUI']")
	WebElement TIBERIUMSYSTEMSAgencyID_COSUI;
	
	@FindBy(xpath = "(//div[@class='w-60'])[2]")
	WebElement DoughNutsDescription_FUTA;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='IRS - 941/944']")
	WebElement DoughNutsDescription_IRS;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='AZ Job Training Tax']")
	WebElement DoughNutsDescription_AZJobTrainingTax;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='CO STATE WITHHOLDING']")
	WebElement DoughNutsDescription_COSTATEWITHHOLDING;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='AZ STATE WITHHOLDING']")
	WebElement DoughNutsDescription_AZSTATEWITHHOLDING;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='TX REPLENISHMENT TAX']")
	WebElement BHBAKERY_TXREPLENISHMENTTAX;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='AZ SUI']")
	WebElement BHBAKERY_AZSUI;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='TX SUI']")
	WebElement DoughNutsDescription_TXSUI;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='CO SUI']")
	WebElement TIBERIUMSYSTEMSDescription_COSUI;
	
	@FindBy(xpath = "(//div[@class='w-60'])[3]")
	WebElement DoughNutsMainAgencyID_FUTA;
	
	@FindBy(xpath = "(//div[@class='w-60'])[2]")
	WebElement DoughNutsMainAgencyID_IRS;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='AZSUI']")
	WebElement DoughNutsMainAgencyID_AZSUI;
	
	@FindBy(xpath = "(//div[@class='w-60'])[3]")
	WebElement DoughNutsMainAgencyID_COSW;
	
	@FindBy(xpath = "(//div[@class='w-60'])[3]")
	WebElement DoughNutsMainAgencyID_AZSW;
	
	@FindBy(xpath = "(//div[@class='w-60'])[3]")
	WebElement DoughNutsMainAgencyID_TXSUI;
	
	@FindBy(xpath = "(//div[@class='w-60'])[3]")
	WebElement TIBERIUMSYSTEMSMainAgencyID_COSUI;
	
	@FindBy(xpath = "(//div[@class='w-60'])[4]")
	WebElement DoughNutsPayee_FUTA;
	
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='INTERNAL REVENUE SERVICE']")
	WebElement DoughNutsPayee_IRS;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='AZ SUI ASSESMENT']")
	WebElement DoughNutsPayee_AZSUIASSESMENT;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Colorado Department of Revenue']")
	WebElement DoughNutsPayee_ColoradoDepartmentofRevenue;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='ARIZONA DEPARTMENT OF REVENUE']")
	WebElement DoughNutsPayee_ARIZONADEPARTMENTOFREVENUE;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='ARIZONA DEPT. OF ECONOMIC SECURITY']")
	WebElement BHBAKERY_ARIZONADEPARTMENTOFECONOMICSECURITY;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='TX WORKFORCE COMMISSION']")
	WebElement DoughNutsPayee_TXWORKFORCECOMMISSION;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='COLORADO DEPT. OF LABOR AND EMPLOYMENT']")
	WebElement TIBERIUMSYSTEMSPayee_COLORADODEPTOFLABORANDEMPLOYMENT;
	
	@FindBy(xpath = "(//div[@class='w-60'])[4]")
	WebElement BHBAKERYPayee_TXREPLENISHMENTTAX;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='12-2121212']")
	WebElement DoughNutsClientTaxID_122121212;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='12-212121-1']")
	WebElement BHBAKERYClientTaxID_122121211;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='1212121 1']")
	WebElement DoughNutsClientTaxID_12121211;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='12121212']")
	WebElement DoughNutsClientTaxID_12121212;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='121212121']")
	WebElement DoughNutsClientTaxID_121212121;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='121212.21-1']")
	WebElement TIBERIUMSYSTEMSClientTaxID_121212211;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Applied']")
	WebElement DoughNutsClientTaxID_Applied;
	
	@FindBy(xpath = "//p[text()='3717752271']")
	WebElement DoughNutsPinN0_3717752271;	
	
	@FindBy(xpath = "//p[text()='3714345313']")
	WebElement TIBERIUMSYSTEMSPinN0_3714345313;	
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Active']")
	WebElement DoughNutsStatus_Active;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Federal']")
	WebElement DoughNutsAuthority_Federal;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='State']")
	WebElement DoughNutsAuthority_State;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='FEDQTR']")
	WebElement DoughNutsFrequencyType_FEDQTR;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='FEDSWQREC']")
	WebElement DoughNutsFrequencyType_FEDSWQREC;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='COWEEK3DAY']")
	WebElement DoughNutsFrequencyType_COWEEK3DAY;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Weekly']")
	WebElement DoughNutsFrequency_Weekly;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Quarterly']")
	WebElement DoughNutsFrequency_Quarterly;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Semi-Weekly']")
	WebElement DoughNutsFrequency_SemiWeekly;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='0.6']")
	WebElement DoughNutsTaxRate_06;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='0']")
	WebElement DoughNutsTaxRate_0;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='0.08']")
	WebElement BHBAKERYTaxRate_008;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='1.18']")
	WebElement TIBERIUMSYSTEMSTaxRate_118;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='0.2']")
	WebElement BHBAKERYTaxRate_02;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='2.91']")
	WebElement DoughNutsTaxRate_291;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Efile']")
	WebElement DoughNutsQEFiling_Efile;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Paper']")
	WebElement DoughNutsQEFiling_Paper;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='Yes']")
	WebElement DoughNutsAcceptAppliedFor_Yes;
	
	@FindBy(xpath = "//div[contains(@class, 'w-60') and text()='No ']")
	WebElement DoughNutsAcceptAppliedFor_No;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	WebElement close;
	
	public void clearSearch() throws InterruptedException {
		try {
				
				Search.clear();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+Search + e);
        }
		Thread.sleep(3000);
	}
	
	
	public void searchwithAgencyID() throws InterruptedException {
		
		try {
				
				Search.sendKeys(TAAgencyID);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(TAAgencyID +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(TAAgencyID +"Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println(TAAgencyID +"unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void clickOnAgencyID_FUTA() throws InterruptedException {
		
		try {
				
			FUTA.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(FUTA + "Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(FUTA +"Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+ FUTA + e);
        }
		Thread.sleep(3000);
	}
	
public void clickOnAgencyID_IRS() throws InterruptedException {
		
		try {
				
			IRS941.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(IRS941 +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(IRS941 +"Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+ IRS941 + e);
        }
		Thread.sleep(3000);
	}
	
	public void clickOnAgencyID_AZSUI() throws InterruptedException {
		
		try {
				
			AZJobTrainingTax.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(AZJobTrainingTax + "Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(AZJobTrainingTax + "Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+ AZJobTrainingTax + e);
        }
		Thread.sleep(3000);
	}
	
public void clickOnAgencyID_AZSUI1() throws InterruptedException {
		
		try {
				
			AZSUI.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(AZJobTrainingTax + "Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(AZJobTrainingTax + "Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+ AZJobTrainingTax + e);
        }
		Thread.sleep(3000);
	}
	
	public void clickOnAgencyID_AZSW() throws InterruptedException {
		
		try {
				
			AZSW.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(AZSW +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(AZSW +"Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + AZSW + e);
        }
		Thread.sleep(3000);
	}
	
public void clickOnAgencyID_TXSUI() throws InterruptedException {
		
		try {
				
			TXSUI.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(TXSUI+ "Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(TXSUI+ "Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." +TXSUI + e);
        }
		Thread.sleep(3000);
	}

	public void clickOnAgencyID_TXREPLEN() throws InterruptedException {
	
	try {
			
		TXREPLEN.click();
		
	} catch (StaleElementReferenceException e) {
        System.out.println(TXREPLEN +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(TXREPLEN +"Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+ TXREPLEN + e);
    }
	Thread.sleep(3000);
	}
	
	public void clickOnAgencyID_COSUI() throws InterruptedException {
		
		try {
				
			COSUI.click();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(COSUI + "Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println(COSUI +"Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.."+ COSUI + e);
	    }
		Thread.sleep(3000);
	}
	
	public void clickOnFrequencyType_COWEEK3DAY() throws InterruptedException {
		
		try {
				
			COWEEK3DAY.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(COWEEK3DAY +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(COWEEK3DAY +"Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+ COWEEK3DAY + e);
        }
		Thread.sleep(3000);
	}
	
	
	public void searchwithDescription() throws InterruptedException {
		
		try {
				
				Search.sendKeys(TADescription);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+ Search + e);
        }
		Thread.sleep(3000);
	}

	public void searchwithMainAgencyID() throws InterruptedException {
	
	try {
			
			Search.sendKeys(TAMAinagencyID);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+Search + e);
    }
	Thread.sleep(3000);
}
	
	public void searchwithMainAgencyID_TIBERIUMSYSTEMS() throws InterruptedException {
		
		try {
				
				Search.sendKeys(TAMainAgencyID_TIBERIUMSYSTEMS);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.."+ Search + e);
	    }
		Thread.sleep(3000);
	}

	public void searchwithClientTaxID() throws InterruptedException {
	
	try {
			
			Search.sendKeys(TAClientTaxID);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println(Search +"unable to click.." + e);
    }
	Thread.sleep(3000);
}

	public void searchwithFrequencyType() throws InterruptedException {
	
	try {
			
			Search.sendKeys(TAFrequencyType);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search + "Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
    }
	Thread.sleep(3000);
}
	
	public void searchwithFrequencyType_FEDSWQREC() throws InterruptedException {
		
		try {
				
				Search.sendKeys(TAFrequencyTypeFEDSWQREC);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.."+ Search + e);
	    }
		Thread.sleep(3000);
	}

	public void searchwithFrequency() throws InterruptedException {
	
	try {
			
			Search.sendKeys(TAFrequency);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+ Search + e);
    }
	Thread.sleep(3000);
}

	public void searchwithTaxRate() throws InterruptedException {
	
	try {
			
			Search.sendKeys(TATaxRate);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + Search+ e);
    }
	Thread.sleep(3000);
}
	public void searchwithTaxRate02() throws InterruptedException {
		
		try {
				
				Search.sendKeys(TATaxRate02);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Search+ e);
	    }
		Thread.sleep(3000);
	}
	
public void searchwithTaxRate118() throws InterruptedException {
		
		try {
				
				Search.sendKeys(TATaxRate_TIBERIUMSYSTEMS);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Search+ e);
	    }
		Thread.sleep(3000);
	}
	
	public void searchwithStatus() throws InterruptedException {
		
		try {
				
				Search.sendKeys(TAStatus);
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Search + e);
	    }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsAgencyID_FUTA() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAgencyID_FUTA);
			if(DoughNutsAgencyID_FUTA.isDisplayed()) {
				assertTrue(true);
			}
				
		} catch (StaleElementReferenceException e) {
            System.out.println(DoughNutsAgencyID_FUTA +"Element" + " is not visble " + "- StaleElementReferenceException");
            assertTrue(false);
        } catch (NoSuchElementException e) {
        	   System.out.println(Search +"Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(3000);
	}
	
	public void ValidateDoughNutsAgencyID_IRS() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAgencyID_IRS);
			if(DoughNutsAgencyID_IRS.isDisplayed()) {
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
	
	public void ValidateDoughNutsAgencyID_AZASSESS() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAgencyID_AZASSESS);
			if(DoughNutsAgencyID_AZASSESS.isDisplayed()) {
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
	
	public void ValidateDoughNutsAgencyID_COSW() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAgencyID_COSW);
			if(DoughNutsAgencyID_COSW.isDisplayed()) {
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
	
	public void ValidateTIBERIUMSYSTEMSAgencyID_COSUI() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSAgencyID_COSUI);
			if(TIBERIUMSYSTEMSAgencyID_COSUI.isDisplayed()) {
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
	
	public void ValidateDoughNutsAgencyID_AZSW() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAgencyID_AZSW);
			if(DoughNutsAgencyID_AZSW.isDisplayed()) {
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
	
	public void ValidateDoughNutsAgencyID_TXSUI() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAgencyID_TXSUI);
			if(DoughNutsAgencyID_TXSUI.isDisplayed()) {
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
	
	public void ValidateBHBAKERYAgencyID_TXREPLEN() throws InterruptedException {
		try {
			SetHighlight(BHBAKERYAgencyID_TXREPLEN);
			if(BHBAKERYAgencyID_TXREPLEN.isDisplayed()) {
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
	
	public void ValidateDoughNutsDescription_FUTA() throws InterruptedException {
		try {
			SetHighlight(DoughNutsDescription_FUTA);
			if(DoughNutsDescription_FUTA.isDisplayed()) {
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
	
	public void ValidateDoughNutsDescription_IRS() throws InterruptedException {
		try {
			SetHighlight(DoughNutsDescription_IRS);
			if(DoughNutsDescription_IRS.isDisplayed()) {
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
	
	public void ValidateDoughNutsDescription_AZJobTrainingTax() throws InterruptedException {
		try {
			SetHighlight(DoughNutsDescription_AZJobTrainingTax);
			if(DoughNutsDescription_AZJobTrainingTax.isDisplayed()) {
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
	
	public void ValidateBHBAKERYDescription_AZSUI() throws InterruptedException {
		try {
			SetHighlight(BHBAKERY_AZSUI);
			if(BHBAKERY_AZSUI.isDisplayed()) {
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
	
	public void ValidateTIBERIUMSYSTEMDescription_COSUI() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSDescription_COSUI);
			if(TIBERIUMSYSTEMSDescription_COSUI.isDisplayed()) {
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
	
	public void ValidateDoughNutsDescription_COSTATEWITHHOLDING() throws InterruptedException {
		try {
			SetHighlight(DoughNutsDescription_COSTATEWITHHOLDING);
			if(DoughNutsDescription_COSTATEWITHHOLDING.isDisplayed()) {
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
	
	public void ValidateDoughNutsDescription_AZSTATEWITHHOLDING() throws InterruptedException {
		try {
			SetHighlight(DoughNutsDescription_AZSTATEWITHHOLDING);
			if(DoughNutsDescription_AZSTATEWITHHOLDING.isDisplayed()) {
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
	
	public void ValidateDoughNutsDescription_TXSUI() throws InterruptedException {
		try {
			SetHighlight(DoughNutsDescription_TXSUI);
			if(DoughNutsDescription_TXSUI.isDisplayed()) {
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
	
	public void ValidateBHBAKERYDescription_TXREPLENISHMENTTAX() throws InterruptedException {
		try {
			SetHighlight(BHBAKERY_TXREPLENISHMENTTAX);
			if(BHBAKERY_TXREPLENISHMENTTAX.isDisplayed()) {
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
	
	public void ValidateDoughNutsMainAgencyID_FUTA() throws InterruptedException {
		try {
			SetHighlight(DoughNutsMainAgencyID_FUTA);
			if(DoughNutsMainAgencyID_FUTA.isDisplayed()) {
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
	
	public void ValidateDoughNutsMainAgencyID_IRS() throws InterruptedException {
		try {
			SetHighlight(DoughNutsMainAgencyID_IRS);
			if(DoughNutsMainAgencyID_IRS.isDisplayed()) {
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
	
	public void ValidateDoughNutsMainAgencyID_AZSUI() throws InterruptedException {
		try {
			SetHighlight(DoughNutsMainAgencyID_FUTA);
			if(DoughNutsMainAgencyID_AZSUI.isDisplayed()) {
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
	
	public void ValidateDoughNutsMainAgencyID_COSW() throws InterruptedException {
		try {
			SetHighlight(DoughNutsMainAgencyID_COSW);
			if(DoughNutsMainAgencyID_COSW.isDisplayed()) {
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
	
	public void ValidateDoughNutsMainAgencyID_AZSW() throws InterruptedException {
		try {
			SetHighlight(DoughNutsMainAgencyID_AZSW);
			if(DoughNutsMainAgencyID_AZSW.isDisplayed()) {
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
	
	public void ValidateDoughNutsMainAgencyID_TXSUI() throws InterruptedException {
		try {
			SetHighlight(DoughNutsMainAgencyID_TXSUI);
			if(DoughNutsMainAgencyID_TXSUI.isDisplayed()) {
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
	
	public void ValidateTIBERIUMSYSTEMSMainAgencyID_COSUI() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSMainAgencyID_COSUI);
			if(TIBERIUMSYSTEMSMainAgencyID_COSUI.isDisplayed()) {
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
	
	public void ValidateDoughNutsPayee_FUTA() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPayee_FUTA);
			if(DoughNutsPayee_FUTA.isDisplayed()) {
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
	
	public void ValidateDoughNutsPayee_IRS() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPayee_IRS);
			if(DoughNutsPayee_IRS.isDisplayed()) {
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
	
	public void ValidateDoughNutsPayee_AZSUIASSESMENT() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPayee_AZSUIASSESMENT);
			if(DoughNutsPayee_AZSUIASSESMENT.isDisplayed()) {
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
	
	public void ValidateDoughNutsPayee_ColoradoDepartmentofRevenue() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPayee_ColoradoDepartmentofRevenue);
			if(DoughNutsPayee_ColoradoDepartmentofRevenue.isDisplayed()) {
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
	
	public void ValidateBHBAKERY_ARIZONADEPARTMENTOFECONOMICSECURITY() throws InterruptedException {
		try {
			SetHighlight(BHBAKERY_ARIZONADEPARTMENTOFECONOMICSECURITY);
			if(BHBAKERY_ARIZONADEPARTMENTOFECONOMICSECURITY.isDisplayed()) {
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
	
	public void ValidateBHBAKERYPayee_TXREPLENISHMENTTAX() throws InterruptedException {
		try {
			SetHighlight(BHBAKERYPayee_TXREPLENISHMENTTAX);
			if(BHBAKERYPayee_TXREPLENISHMENTTAX.isDisplayed()) {
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
	
	public void ValidateTIBERIUMSYSTEMSPayee_COSUI() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSPayee_COLORADODEPTOFLABORANDEMPLOYMENT);
			if(TIBERIUMSYSTEMSPayee_COLORADODEPTOFLABORANDEMPLOYMENT.isDisplayed()) {
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
	
	public void ValidateDoughNutsPayee_ARIZONADEPARTMENTOFREVENUE() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPayee_ARIZONADEPARTMENTOFREVENUE);
			if(DoughNutsPayee_ARIZONADEPARTMENTOFREVENUE.isDisplayed()) {
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
	
	public void ValidateDoughNutsPayee_TXWORKFORCECOMMISSION() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPayee_TXWORKFORCECOMMISSION);
			if(DoughNutsPayee_TXWORKFORCECOMMISSION.isDisplayed()) {
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
	
	public void ValidateDoughNutsClientTaxID_122121212() throws InterruptedException {
		try {
			SetHighlight(DoughNutsClientTaxID_122121212);
			if(DoughNutsClientTaxID_122121212.isDisplayed()) {
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
	
	public void ValidateTIBERIUMSYSTEMSClientTaxID_121212211() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSClientTaxID_121212211);
			if(TIBERIUMSYSTEMSClientTaxID_121212211.isDisplayed()) {
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
	
	public void ValidateBHBAKERYClientTaxID_122121211() throws InterruptedException {
		try {
			SetHighlight(BHBAKERYClientTaxID_122121211);
			if(BHBAKERYClientTaxID_122121211.isDisplayed()) {
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
	
	public void ValidateDoughNutsClientTaxID_12121211() throws InterruptedException {
		try {
			SetHighlight(DoughNutsClientTaxID_12121211);
			if(DoughNutsClientTaxID_12121211.isDisplayed()) {
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
	
	public void ValidateDoughNutsClientTaxID_12121212() throws InterruptedException {
		try {
			SetHighlight(DoughNutsClientTaxID_12121212);
			if(DoughNutsClientTaxID_12121212.isDisplayed()) {
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
	
	public void ValidateDoughNutsClientTaxID_121212121() throws InterruptedException {
		try {
			SetHighlight(DoughNutsClientTaxID_121212121);
			if(DoughNutsClientTaxID_121212121.isDisplayed()) {
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
	
	public void ValidateDoughNutsClientTaxID_Applied() throws InterruptedException {
		try {
			SetHighlight(DoughNutsClientTaxID_Applied);
			if(DoughNutsClientTaxID_Applied.isDisplayed()) {
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
	
	public void ValidateDoughNutsPiNo_3717752271() throws InterruptedException {
		try {
			SetHighlight(DoughNutsPinN0_3717752271);
			if(DoughNutsPinN0_3717752271.isDisplayed()) {
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
	
	public void ValidateTIBERIUMSYSTEMSPiNo_3714345313() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSPinN0_3714345313);
			if(TIBERIUMSYSTEMSPinN0_3714345313.isDisplayed()) {
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
	
	public void ValidateDoughNutsStatus_Active() throws InterruptedException {
		try {
			SetHighlight(DoughNutsStatus_Active);
			if(DoughNutsStatus_Active.isDisplayed()) {
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
	
	public void ValidateDoughNutsAuthority_Federal() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAuthority_Federal);
			if(DoughNutsAuthority_Federal.isDisplayed()) {
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
	
	public void ValidateDoughNutsAuthority_State() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAuthority_State);
			if(DoughNutsAuthority_State.isDisplayed()) {
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
	
	public void ValidateDoughNutsFrequencyType_FEDQTR() throws InterruptedException {
		try {
			SetHighlight(DoughNutsFrequencyType_FEDQTR);
			if(DoughNutsFrequencyType_FEDQTR.isDisplayed()) {
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
	
	public void ValidateDoughNutsFrequencyType_FEDSWQREC() throws InterruptedException {
		try {
			SetHighlight(DoughNutsFrequencyType_FEDSWQREC);
			if(DoughNutsFrequencyType_FEDSWQREC.isDisplayed()) {
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
	
	public void ValidateDoughNutsFrequencyType_COWEEK3DAY() throws InterruptedException {
		try {
			SetHighlight(DoughNutsFrequencyType_COWEEK3DAY);
			if(DoughNutsFrequencyType_COWEEK3DAY.isDisplayed()) {
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
	
	public void ValidateDoughNutsFrequency_Weekly() throws InterruptedException {
		try {
			SetHighlight(DoughNutsFrequency_Weekly);
			if(DoughNutsFrequency_Weekly.isDisplayed()) {
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
	
	public void ValidateDoughNutsFrequency_Quarterly() throws InterruptedException {
		try {
			SetHighlight(DoughNutsFrequency_Quarterly);
			if(DoughNutsFrequency_Quarterly.isDisplayed()) {
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
	
	public void ValidateDoughNutsFrequency_SemiWeekly() throws InterruptedException {
		try {
			SetHighlight(DoughNutsFrequency_SemiWeekly);
			if(DoughNutsFrequency_SemiWeekly.isDisplayed()) {
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
	
	public void ValidateDoughNutsTaxRate_06() throws InterruptedException {
		try {
			SetHighlight(DoughNutsTaxRate_06);
			if(DoughNutsTaxRate_06.isDisplayed()) {
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
	
	public void ValidateDoughNutsTaxRate_0() throws InterruptedException {
		try {
			SetHighlight(DoughNutsTaxRate_0);
			if(DoughNutsTaxRate_0.isDisplayed()) {
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
	
	public void ValidateTIBERIUMSYSTEMSTaxRate_118() throws InterruptedException {
		try {
			SetHighlight(TIBERIUMSYSTEMSTaxRate_118);
			if(TIBERIUMSYSTEMSTaxRate_118.isDisplayed()) {
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
	
	public void ValidateDoughNutsTaxRate_291() throws InterruptedException {
		try {
			SetHighlight(DoughNutsTaxRate_291);
			if(DoughNutsTaxRate_291.isDisplayed()) {
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
	
	public void ValidateBHBAKERYTaxRate_008() throws InterruptedException {
		try {
			SetHighlight(BHBAKERYTaxRate_008);
			if(BHBAKERYTaxRate_008.isDisplayed()) {
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
	
	public void ValidateBHBAKERYTaxRate_02() throws InterruptedException {
		try {
			SetHighlight(BHBAKERYTaxRate_02);
			if(BHBAKERYTaxRate_02.isDisplayed()) {
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
	
	public void ValidateDoughNutsQEFiling_EFile() throws InterruptedException {
		try {
			SetHighlight(DoughNutsQEFiling_Efile);
			if(DoughNutsQEFiling_Efile.isDisplayed()) {
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
	
	public void ValidateDoughNutsQEFiling_Paper() throws InterruptedException {
		try {
			SetHighlight(DoughNutsQEFiling_Paper);
			if(DoughNutsQEFiling_Paper.isDisplayed()) {
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
	
	public void ValidateDoughNutsAcceptAppliedFor_Yes() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAcceptAppliedFor_Yes);
			if(DoughNutsAcceptAppliedFor_Yes.isDisplayed()) {
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
	
	public void ValidateDoughNutsAcceptAppliedFor_No() throws InterruptedException {
		try {
			SetHighlight(DoughNutsAcceptAppliedFor_No);
			if(DoughNutsAcceptAppliedFor_No.isDisplayed()) {
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
	
	public void CloseAgency() throws InterruptedException {
		try {
			SetHighlight(close);
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
	
	

}
