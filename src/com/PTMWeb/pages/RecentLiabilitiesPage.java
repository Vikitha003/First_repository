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

public class RecentLiabilitiesPage extends Baseclass{
		
		public static final long EXPLICIT_WAIT = 20;
		public static WebDriver driver;
		
		public RecentLiabilitiesPage(WebDriver rdriver) {
			driver=rdriver;
			PageFactory.initElements(driver, this);	
		}
		
		@FindBy(xpath = "//input[@class='k-input-inner']")
		WebElement Search;
		
		@FindBy(xpath = "(//input[@class='k-input-inner'])[2]")
		WebElement Search1;
		
		@FindBy(xpath = "//table/tbody/tr[1]/td")
		WebElement payrollId;
		
		@FindBy(xpath = "//div[@class='liabilities-container']//div[2]//table/tbody/tr[1]/td[1]")
		WebElement checkDate;
		
		@FindBy(xpath = "//div[@class='liabilities-container']//div[2]//table/tbody/tr[1]/td[2]")
		WebElement EntryDate;
		
		@FindBy(xpath = "//div[@class='liabilities-container']//div[2]//table/tbody/tr[1]/td[3]")
		WebElement Amount;
		
		@FindBy(xpath = "//div[@class='liabilities-container']//div[2]//table/tbody/tr[1]/td[4]")
		WebElement Status;
		
		@FindBy(xpath = "//span[@class='k-icon k-button-icon k-i-excel']")
		WebElement Excel;
		
		@FindBy(xpath = "(//span[@class='k-icon k-button-icon k-i-excel'])[2]")
		WebElement Excel1;
		
		@FindBy(xpath="(//span[@class='k-icon k-button-icon k-i-pdf'])[2]")
		WebElement pdf;
		
		@FindBy(xpath = "//i[@class='fa fa-times']")
		WebElement close;
		
		@FindBy(xpath = "//span[text()='Description']")
		WebElement Descriptions;
		
		@FindBy(xpath = "//span[text()='Federal Wh Tax']")
		WebElement DescriptionsName;
		
		@FindBy(xpath = "//span[text()='$1,581.22']")
		WebElement DescriptionAmount;
		
		
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
	            System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to search with Payroll ID");
	        } catch (NoSuchElementException e) {
	            System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to search with Payroll ID");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + Search + e);
	            assertTrue(false, "Unable to search with Payroll ID");
	        }
			Thread.sleep(3000);
		}
		
		public void searchwithCheckDate(String date) throws InterruptedException {
			try {
					
					Search.sendKeys(date);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to search with Check Date");
	        } catch (NoSuchElementException e) {
	            System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to search with Check Date");
	        } catch (Exception e) {
	            System.out.println("unable to click.."+ Search + e);
	            assertTrue(false, "Unable to search with Check Date");
	        }
		}
		
		public void searchwithEntryDate(String date) throws InterruptedException {
			try {
					
					Search.sendKeys(date);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to search with Entry Date");
	        } catch (NoSuchElementException e) {
	            System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to search with Entry Date");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + Search + e);
	            assertTrue(false, "Unable to search with Entry Date");
	        }
		}
		
		public void searchwithAmount(String date) throws InterruptedException {
			try {
					
					Search.sendKeys(date);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to search with Amount");
	        } catch (NoSuchElementException e) {
	            System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to search with Amount");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + Search + e);
	            assertTrue(false, "Unable to search with Amount");
	        }
		}
		
		public void searchwithStatus(String date) throws InterruptedException {
			try {
					
					Search.sendKeys(date);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to search with Status");
	        } catch (NoSuchElementException e) {
	            System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to search with Status");
	        } catch (Exception e) {
	            System.out.println("unable to click.."+ Search + e);
	            assertTrue(false, "Unable to search with Status");
	        }
		}
		
		public void searchwithDescription() throws InterruptedException {
			
			try {
					
					Search1.sendKeys(RLDescName);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(Search1 + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to search with Description");
	        } catch (NoSuchElementException e) {
	            System.out.println(Search1 + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to search with Dscription");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + Search1 + e);
	            assertTrue(false, "Unable to search with Description");
	        }
			Thread.sleep(3000);
		}
		
		public void searchwithAmount1() throws InterruptedException {
			
			try {
					
					Search1.sendKeys(RLDescAmount);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(Search1 + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to search with Amount");
	        } catch (NoSuchElementException e) {
	            System.out.println(Search1 + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to search with Amount");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + Search1 + e);
	            assertTrue(false, "Unable to search with Amount");
	        }
			Thread.sleep(3000);
		}
		
		public void clickOnRecentLiabilities() throws InterruptedException {
			try {
					
				checkDate.click();
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(checkDate + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to click on CheckDate");
	        } catch (NoSuchElementException e) {
	            System.out.println(checkDate + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to click on CheckDate");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + checkDate + e);
	            assertTrue(false, "Unable to click on CheckDate");
	        }
			
			Thread.sleep(2000);
		}
		
		public void verifyPayrollID() throws InterruptedException {
			try {
				
				String btext= payrollId.getText();
				assertEquals(btext, payrollID_DoughNuts);
			} catch (StaleElementReferenceException e) {
	            System.out.println(payrollId + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to verify Payroll ID");
	        } catch (NoSuchElementException e) {
	            System.out.println(payrollId + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to verify Payroll ID");
	        } catch (Exception e) {
	            System.out.println("unable to click.."+ payrollId + e);
	            assertTrue(false, "Unable to verify Payroll ID");
	        }
			Thread.sleep(5000);
		}
		
		public void verifycheckDate() throws InterruptedException {
			try {
				
				String btext= checkDate.getText();
				assertEquals(btext, RecentLiabilities_checkDate);
			} catch (StaleElementReferenceException e) {
	            System.out.println(checkDate + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to verify Check Date");
	        } catch (NoSuchElementException e) {
	            System.out.println(checkDate + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to verify Check Date");
	        } catch (Exception e) {
	            System.out.println("unable to click.."+ checkDate + e);
	            assertTrue(false, "Unable to verify Check Date");
	        }
			Thread.sleep(4000);
		}
		
		public void verifyEntryDate() throws InterruptedException {
			try {
				
				String btext= EntryDate.getText();
				assertEquals(btext, RecentLiabilities_EntryDate);
			} catch (StaleElementReferenceException e) {
	            System.out.println(EntryDate + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to verify Entry Date");
	        } catch (NoSuchElementException e) {
	            System.out.println(EntryDate + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to verify Entry Date");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + EntryDate + e);
	            assertTrue(false, "Unable to verify Entry Date");
	        }
			Thread.sleep(4000);
		}
		
		public void verifyAmount() throws InterruptedException {
			try {
				String btext= Amount.getText();
				assertEquals(btext, RecentLiabilities_Amount_Specialchar);
			} catch (StaleElementReferenceException e) {
		        System.out.println(Amount + " is not visble to click.." + "- StaleElementReferenceException");
		        assertTrue(false, "Unable to verify Amount");
		    } catch (NoSuchElementException e) {
		        System.out.println(Amount + " is not visble to click.." + "-NosuchElementException");
		        assertTrue(false, "Unable to verify Amount");
		    } catch (Exception e) {
		        System.out.println("unable to click.." + Amount + e);
		        assertTrue(false, "Unable to verify Amount");
		    }
			Thread.sleep(5000);
		}
		
		public void verifyStatus() throws InterruptedException {
			try {
				
				String btext= Status.getText();
				assertEquals(btext, RecentLiabilities_Status);
			} catch (StaleElementReferenceException e) {
	            System.out.println(Status + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to verify Status");
	        } catch (NoSuchElementException e) {
	            System.out.println(Status + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to verify Status");
	        } catch (Exception e) {
	            System.out.println("unable to click.."+ Status + e);
	            assertTrue(false, "Unable to verify Status");
	        }
			Thread.sleep(4000);
		}
		
		public void verifyDescription() throws InterruptedException {
			try {
				
				String btext= DescriptionsName.getText();
				assertEquals(btext, RLDescName);
			} catch (StaleElementReferenceException e) {
	            System.out.println(DescriptionsName + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to verify Description");
	        } catch (NoSuchElementException e) {
	            System.out.println(DescriptionsName + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to verify Description");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + DescriptionsName + e);
	            assertTrue(false, "Unable to verify Description");
	        }
			Thread.sleep(4000);
		}
		
		public void verifyAmount1() throws InterruptedException {
			try {
				
				String btext= DescriptionAmount.getText();
				assertEquals(btext, RLDescAmount_specialchar);
			} catch (StaleElementReferenceException e) {
	            System.out.println(DescriptionAmount + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to verify Amount");
	        } catch (NoSuchElementException e) {
	            System.out.println(DescriptionAmount + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to verify Amount");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + DescriptionAmount+ e);
	            assertTrue(false, "Unable to verify Amount");
	        }
			Thread.sleep(4000);
		}
		
		public void clickOnExporttoExcel() throws InterruptedException {
			try {
				Thread.sleep(2000);
				
				Excel.click();
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(Excel + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to click on Export to Excel button");
	        } catch (NoSuchElementException e) {
	            System.out.println(Excel + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to click on Export to Excel button");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + Excel + e);
	            assertTrue(false, "Unable to click on Export to Excel button");
	        }
			Thread.sleep(5000);
		}
		
		public void clickOnExporttoExcel1() throws InterruptedException {
			try {
				Thread.sleep(2000);
				
				Excel1.click();
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(Excel1 + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to click on Export to Excel button");
	        } catch (NoSuchElementException e) {
	            System.out.println(Excel1 + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to click on Export to Excel button");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + Excel1 + e);
	            assertTrue(false, "Unable to click on Export to Excel button");
	        }
			Thread.sleep(5000);
		}
		
		public void clickOnExporttoPdf() throws InterruptedException {
			try {
					
					pdf.click();
				
			} catch (StaleElementReferenceException e) {
	            System.out.println(pdf + " is not visble to click.." + "- StaleElementReferenceException");
	            assertTrue(false, "Unable to click on Export to Pdf button");
	        } catch (NoSuchElementException e) {
	            System.out.println(pdf + " is not visble to click.." + "-NosuchElementException");
	            assertTrue(false, "Unable to click on Export to Pdf button");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + pdf + e);
	            assertTrue(false, "Unable to click on Export to Pdf button");
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
		
		public void ValidateDescrptioninRL() throws InterruptedException {
			try {
				
				Descriptions.isDisplayed();
//				String btext= Descriptions.getText();
//				assertEquals(btext,RLVerifyDescriptionTitle);
					
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
			Thread.sleep(3000);
		}
		public void clickOnRLClose() throws InterruptedException {
			try {
					
					close.click();
				
			} catch (StaleElementReferenceException e) {
		        System.out.println(close + " is not visble to click.." + "- StaleElementReferenceException");
		        assertTrue(false, "Unable to click on close button");
		    } catch (NoSuchElementException e) {
		        System.out.println(close + " is not visble to click.." + "-NosuchElementException");
		        assertTrue(false, "Unable to click on close button");
		    } catch (Exception e) {
		        System.out.println("unable to click.." + close + e);
		        assertTrue(false, "Unable to click on close button");
		    }
			Thread.sleep(3000);
		}
}
