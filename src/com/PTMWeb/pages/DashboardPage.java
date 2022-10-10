package com.PTMWeb.pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PTMWeb.utilities.Baseclass;



public class DashboardPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public DashboardPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//span[@class='k-icon k-button-icon k-i-arrow-s']")
	WebElement clientdetails;
	
	@FindBy(xpath = "//span[text()='DOUGH NUTS INC.']")
	WebElement selectClientDough;
	
	@FindBy(xpath = "//span[text()='BH BAKERY INC.']")
	WebElement selectClientBHBakeryInc;
	
	@FindBy(xpath = "//span[text()='TIBERIUM SYSTEMS LLC']")
	WebElement selectClientTiberiumSystemsLLC;
	
	@FindBy(xpath = "//h1[text()= 'Liabilities Issues']")
	WebElement LiabilitiesIssues;
	
	@FindBy(xpath = "//h1[text()='Funding Issues']")
	WebElement fundingIssues;
	
	@FindBy(xpath = "//h1[text()= 'Payments Issues']")
	WebElement PaymentIssues;
	
	@FindBy(xpath = "//h1[text()='NSF Hold']")
	WebElement NSFHold;
	
	@FindBy(xpath = "//h1[text()= 'Applied For']")
	WebElement AppliedFor;
	
	@FindBy(xpath = "//h1[text()= 'Alerts']")
	WebElement Alerts;
	
	@FindBy(xpath="//input[@class='k-input-inner']")
	WebElement searchRecentLiablities;
	
	@FindBy(xpath = "//td[text()='04150 ']")
	WebElement payrollid;
	
	@FindBy(xpath = "//input[@id='97397a51-1b3b-4c75-bae1-ac7f08f73c91']")
	WebElement SearchUpcomingPayments;
	
	@FindBy(xpath = "//span[@class='k-icon k-button-icon k-i-excel']")
	WebElement Excel;
	
	@FindBy(xpath="//span[@class='k-icon k-button-icon k-i-pdf']")
	WebElement pdf;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	WebElement close;
	
	@FindBy(xpath = "//div[@class='border-danger card']//*[text() = 'NSF Hold']")
	WebElement NSFCardcolourRed;
	
	@FindBy(xpath = "//div[@class='border-success card']//*[text() = 'NSF Hold']")
	WebElement NSFCardcolourGreen;
	

	public static void webdriverWait(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void selectClientList() throws InterruptedException {
		try {
			Thread.sleep(4000);
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				 WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(clientdetails));
				 SetHighlight(clientdetails);
				 clientdetails.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(clientdetails  + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to select client List");
        } catch (NoSuchElementException e) {
            System.out.println(clientdetails  + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to select client List");
        } catch (Exception e) {
            System.out.println("unable to click.." + clientdetails + e);
            assertTrue(false, "Unable to select client List");
        }
		Thread.sleep(4000);
	}
	
	public void selectDoughNutsInc(){
		try {
				
			SetHighlight(selectClientDough);	
			selectClientDough.click();
				Thread.sleep(3000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(selectClientDough  + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to select DoughNuts INC client from the list");
        } catch (NoSuchElementException e) {
            System.out.println(selectClientDough  + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to select DoughNuts INC client from the list");
        } catch (Exception e) {
            System.out.println("unable to click.."+ selectClientDough + e);
            assertTrue(false, "Unable to select DoughNuts INC client from the list");
        }
		
	}
	
	public void selectBHBakryInc(){
		try {
			
				SetHighlight(selectClientBHBakeryInc);
				selectClientBHBakeryInc.click();
				Thread.sleep(4000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(selectClientBHBakeryInc  + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to select BH BAKERY INC client from the list");
        } catch (NoSuchElementException e) {
            System.out.println(selectClientBHBakeryInc  + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to select BH BAKERY INC client from the list");
        } catch (Exception e) {
            System.out.println("unable to click.." + selectClientBHBakeryInc+ e);
            assertTrue(false, "Unable to select BH BAKERY INC client from the list");
        }
	}
	
	public void selectTiberiumSystemsLLC(){
		try {
			
				
				selectClientTiberiumSystemsLLC.click();
				Thread.sleep(5000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(selectClientTiberiumSystemsLLC + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to select TIBERIUM SYSTEMS LLC client from the list");
        } catch (NoSuchElementException e) {
            System.out.println(selectClientTiberiumSystemsLLC + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to select TIBERIUM SYSTEMS LLC client from the list");
        } catch (Exception e) {
            System.out.println("unable to click.." +selectClientTiberiumSystemsLLC+ e);
            assertTrue(false, "Unable to select TIBERIUM SYSTEMS LLC client from the list");
        }
	}
	
	public void clickOnLiabilitiesIssues() throws InterruptedException {
		try {
				
				LiabilitiesIssues.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(LiabilitiesIssues + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Click Liabilities Issues Summary Card");
        } catch (NoSuchElementException e) {
            System.out.println(LiabilitiesIssues + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Click Liabilities Issues Summary Card");
        } catch (Exception e) {
            System.out.println("unable to click.."+ LiabilitiesIssues + e);
            assertTrue(false, "Unable to Click Liabilities Issues Summary Card");
        }
		Thread.sleep(6000);
	}
	
	public void clickOnFundingIssues() throws InterruptedException {
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-250)");
				fundingIssues.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(fundingIssues + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Click Funding Issues Summary Card");
        } catch (NoSuchElementException e) {
            System.out.println(fundingIssues + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Click Funding Issues Summary Card");
        } catch (Exception e) {
            System.out.println("unable to click.." + fundingIssues+ e);
            assertTrue(false, "Unable to Click Funding Issues Summary Card");
        }
		Thread.sleep(6000);
	}
	
	public void clickOnPaymentsIssues() throws InterruptedException{
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-250)");
				PaymentIssues.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(PaymentIssues + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Click Payments Issues Summary Card");
        } catch (NoSuchElementException e) {
            System.out.println(PaymentIssues + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Click Payments Issues Summary Card");
        } catch (Exception e) {
            System.out.println("unable to click.." + PaymentIssues + e);
            assertTrue(false, "Unable to Click Payments Issues Summary Card");
        }
		Thread.sleep(6000);
	}
	
	public void clickOnNSFhold() throws InterruptedException{
		try {
				
			NSFHold.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(NSFHold + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Click NSF Hold Summary Card");
        } catch (NoSuchElementException e) {
            System.out.println(NSFHold + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Click NSF Hold Summary Card");
        } catch (Exception e) {
            System.out.println("unable to click.."+ NSFHold + e);
            assertTrue(false, "Unable to Click NSF Hold Summary Card");
        }
		Thread.sleep(6000);
	}
	
	public void clickOnAppliedFor() throws InterruptedException{
		try {
			
				AppliedFor.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(AppliedFor + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Click Applied For Summary Card");
        } catch (NoSuchElementException e) {
            System.out.println(AppliedFor + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Click Applied For Summary Card");
        } catch (Exception e) {
            System.out.println("unable to click.." + AppliedFor + e);
            assertTrue(false, "Unable to Click Applied For Summary Card");
        }
		Thread.sleep(6000);
	}

	public void clickOnAlerts() throws InterruptedException{
		try {
				
				Alerts.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Alerts + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Click Alerts Summary Card");
        } catch (NoSuchElementException e) {
            System.out.println(Alerts + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Click Alerts Summary Card");
        } catch (Exception e) {
            System.out.println("unable to click.."+ Alerts + e);
            assertTrue(false, "Unable to Click Alerts Summary Card");
        }
		Thread.sleep(6000);
	}
	
	public void searchByRecentLiabilities() throws InterruptedException {
		try {
				
				searchRecentLiablities.sendKeys(payrollID_DoughNuts);
			
	}catch (StaleElementReferenceException e) {
        System.out.println(searchRecentLiablities + " is not visble to click.." + "- StaleElementReferenceException");
        assertTrue(false, "Unable to Search in Recent Liabilities");
    } catch (NoSuchElementException e) {
        System.out.println(searchRecentLiablities + " is not visble to click.." + "-NosuchElementException");
        assertTrue(false, "Unable to Search in Recent Liabilities");
    } catch (Exception e) {
        System.out.println("unable to click.." + searchRecentLiablities + e);
        assertTrue(false, "Unable to Search in Recent Liabilities");
    }
		Thread.sleep(6000);
 }
	
	public void clickOnPayrollID() {
		try {
			
			payrollid.click();
		} catch (StaleElementReferenceException e) {
	        System.out.println(payrollid  + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to click on Payroll ID");
	    } catch (NoSuchElementException e) {
	        System.out.println(payrollid + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to click on Payroll ID");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + payrollid + e);
	        assertTrue(false, "Unable to click on Payroll ID");
	    }
	}
	
	public void searchByUpcomingPayments() throws InterruptedException {
		try {
				
				SearchUpcomingPayments.click();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(SearchUpcomingPayments + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to search in Upcoming Payments");
	    } catch (NoSuchElementException e) {
	        System.out.println(SearchUpcomingPayments + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to search in Upcoming Payments");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + SearchUpcomingPayments + e);
	        assertTrue(false, "Unable to search in Upcoming Payments");
	    }
		Thread.sleep(6000);
	}
	
	public void clickOnExporttoExcel() throws InterruptedException {
		try {
			Thread.sleep(2000);
			
			Excel.click();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(Excel + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to to click on Export to Excel button");
	    } catch (NoSuchElementException e) {
	        System.out.println(Excel + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to to click on Export to Excel button");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + Excel + e);
	        assertTrue(false, "Unable to to click on Export to Excel button");
	    }
		Thread.sleep(5000);
	}

	public void clickOnExporttoPdf() throws InterruptedException {
		try {
			Thread.sleep(2000);
			
			pdf.click();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(pdf + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "Unable to to click on Export to Pdf button");
	    } catch (NoSuchElementException e) {
	        System.out.println(pdf + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "Unable to to click on Export to Pdf button");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + pdf + e);
	        assertTrue(false, "Unable to to click on Export to Pdf button");
	    }
		Thread.sleep(3000);
	}
	
	public void ValidateNSFCardcolour() throws InterruptedException {
		try {
			Thread.sleep(2000);
			
			NSFCardcolourRed.isDisplayed();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(NSFCardcolourRed + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "NSF Hold Card color is not in Red");
	    } catch (NoSuchElementException e) {
	        System.out.println(NSFCardcolourRed + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "NSF Hold Card color is not in Red");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + NSFCardcolourRed + e);
	        assertTrue(false, "NSF Hold Card color is not in Red");
	    }
		Thread.sleep(3000);
	}
	
	public void ValidateNSFCardcolour_BHBAKERY() throws InterruptedException {
		try {
			Thread.sleep(2000);
			
			NSFCardcolourGreen.isDisplayed();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println(NSFCardcolourGreen + " is not visble to click.." + "- StaleElementReferenceException");
	        assertTrue(false, "NSF Hold Card color is not in Green");
	    } catch (NoSuchElementException e) {
	        System.out.println(NSFCardcolourGreen + " is not visble to click.." + "-NosuchElementException");
	        assertTrue(false, "NSF Hold Card color is not in Green");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + NSFCardcolourGreen + e);
	        assertTrue(false, "NSF Hold Card color is not in Green");
	    }
		Thread.sleep(3000);
	}
	
	
}
