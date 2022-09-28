package com.PTMWeb.pages;

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
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(4000);
	}
	
	public void selectDoughNutsInc(){
		try {
				
			SetHighlight(selectClientDough);	
			selectClientDough.click();
				Thread.sleep(3000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		
	}
	
	public void selectBHBakryInc(){
		try {
			
				SetHighlight(selectClientBHBakeryInc);
				selectClientBHBakeryInc.click();
				Thread.sleep(4000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
	}
	
	public void selectTiberiumSystemsLLC(){
		try {
			
				
				selectClientTiberiumSystemsLLC.click();
				Thread.sleep(5000);
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
	}
	
	public void clickOnLiabilitiesIssues() throws InterruptedException {
		try {
				
				LiabilitiesIssues.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(6000);
	}
	
	public void clickOnFundingIssues() throws InterruptedException {
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-250)");
				fundingIssues.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(6000);
	}
	
	public void clickOnPaymentsIssues() throws InterruptedException{
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-250)");
				PaymentIssues.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(6000);
	}
	
	public void clickOnNSFhold() throws InterruptedException{
		try {
				
			NSFHold.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(6000);
	}
	
	public void clickOnAppliedFor() throws InterruptedException{
		try {
			
				AppliedFor.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(6000);
	}

	public void clickOnAlerts() throws InterruptedException{
		try {
				
				Alerts.click();
			
		} catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
		Thread.sleep(6000);
	}
	
	public void searchByRecentLiabilities() throws InterruptedException {
		try {
				
				searchRecentLiablities.sendKeys(payrollID);
			
	}catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
		Thread.sleep(6000);
 }
	
	public void clickOnPayrollID() {
		try {
			
			payrollid.click();
		} catch (StaleElementReferenceException e) {
	        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + e);
	    }
	}
	
	public void searchByUpcomingPayments() throws InterruptedException {
		try {
				
				SearchUpcomingPayments.click();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + e);
	    }
		Thread.sleep(6000);
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

	public void clickOnExporttoPdf() throws InterruptedException {
		try {
			Thread.sleep(2000);
			
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
	
	public void ValidateNSFCardcolour() throws InterruptedException {
		try {
			Thread.sleep(2000);
			
			NSFCardcolourRed.isDisplayed();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + e);
	    }
		Thread.sleep(3000);
	}
	
	public void ValidateNSFCardcolour_BHBAKERY() throws InterruptedException {
		try {
			Thread.sleep(2000);
			
			NSFCardcolourGreen.isDisplayed();
			
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
