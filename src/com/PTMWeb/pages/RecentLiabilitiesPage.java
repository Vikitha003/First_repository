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
		
		@FindBy(xpath = "//div[@class='liabilities-container']//div[2]//table/tbody/tr[1]/td21]")
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
	        } catch (NoSuchElementException e) {
	            System.out.println(Search+"Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.."+Search + e);
	        }
			Thread.sleep(3000);
		}
		
		public void clearSearch1() throws InterruptedException {
			try {
					
					Search1.clear();
				
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
		
		public void searchwithCheckDate(String date) throws InterruptedException {
			try {
					
					Search.sendKeys(date);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
		}
		
		public void searchwithEntryDate(String date) throws InterruptedException {
			try {
					
					Search.sendKeys(date);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
		}
		
		public void searchwithAmount(String date) throws InterruptedException {
			try {
					
					Search.sendKeys(date);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
		}
		
		public void searchwithStatus(String date) throws InterruptedException {
			try {
					
					Search.sendKeys(date);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
		}
		
		public void searchwithDescription() throws InterruptedException {
			
			try {
					
					Search1.sendKeys(RLDescName);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
			Thread.sleep(3000);
		}
		
		public void searchwithAmount1() throws InterruptedException {
			
			try {
					
					Search1.sendKeys(RLDescAmount);
				
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
			Thread.sleep(3000);
		}
		
		public void clickOnRecentLiabilities() throws InterruptedException {
			try {
					
				checkDate.click();
				
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
			
			Thread.sleep(2000);
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
		
		public void verifycheckDate() throws InterruptedException {
			try {
				
				String btext= checkDate.getText();
				assertEquals(btext, RLcheckDate);
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
			Thread.sleep(4000);
		}
		
		public void verifyEntryDate() throws InterruptedException {
			try {
				
				String btext= EntryDate.getText();
				assertEquals(btext, RLEntryDate);
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
			Thread.sleep(4000);
		}
		
		public void verifyAmount() throws InterruptedException {
			try {
				String btext= Amount.getText();
				assertEquals(btext, RLAmount_Specialchar);
			} catch (StaleElementReferenceException e) {
		        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
		    } catch (NoSuchElementException e) {
		        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
		    } catch (Exception e) {
		        System.out.println("unable to click.." + e);
		    }
			Thread.sleep(5000);
		}
		
		public void verifyStatus() throws InterruptedException {
			try {
				
				String btext= Status.getText();
				assertEquals(btext, RLStatus);
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
			Thread.sleep(4000);
		}
		
		public void verifyDescription() throws InterruptedException {
			try {
				
				String btext= DescriptionsName.getText();
				assertEquals(btext, RLDescName);
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
			Thread.sleep(4000);
		}
		
		public void verifyAmount1() throws InterruptedException {
			try {
				
				String btext= DescriptionAmount.getText();
				assertEquals(btext, RLDescAmount_specialchar);
			} catch (StaleElementReferenceException e) {
	            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	        } catch (NoSuchElementException e) {
	            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	        } catch (Exception e) {
	            System.out.println("unable to click.." + e);
	        }
			Thread.sleep(4000);
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
		
		public void clickOnExporttoExcel1() throws InterruptedException {
			try {
				Thread.sleep(2000);
				
				Excel1.click();
				
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
		        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
		    } catch (NoSuchElementException e) {
		        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
		    } catch (Exception e) {
		        System.out.println("unable to click.." + e);
		    }
			Thread.sleep(3000);
		}
}
