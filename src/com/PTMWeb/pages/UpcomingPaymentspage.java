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

import javassist.runtime.Desc;

public class UpcomingPaymentspage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public UpcomingPaymentspage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	} 
	
	@FindBy(xpath = "(//input[@class='k-input-inner'])[2]")
	WebElement Search;
	
	@FindBy(xpath = "(//input[@class='k-input-inner'])[3]")
	WebElement Search1;
	
	@FindBy(xpath = "//span[text()='$969.83']")
	WebElement Amount96983;
	
	@FindBy(xpath = "(//span[@class='k-icon k-button-icon k-i-excel'])[2]")
	WebElement Excel;
	
	@FindBy(xpath="(//span[@class='k-icon k-button-icon k-i-pdf'])[2]")
	WebElement pdf;
	
	@FindBy(xpath = "(//span[@class='k-icon k-button-icon k-i-excel'])[3]")
	WebElement Excel1;
	
	@FindBy(xpath="(//span[@class='k-icon k-button-icon k-i-pdf'])[3]")
	WebElement pdf1;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	WebElement close;
	
	@FindBy(xpath = "//div[@class='payments-container']//div[2]//table/tbody/tr[1]/td[1]")
	WebElement duedate;
	
	@FindBy(xpath = "//div[@class='payments-container']//div[2]//table/tbody/tr[1]/td[2]")
	WebElement Amount;
	
	@FindBy(xpath = "//div[@class='payments-container']//div[2]//table/tbody/tr[1]/td[3]")
	WebElement count;
	
	@FindBy(xpath = "(//table/tbody/tr[1]/td)[9]")
	WebElement PayrollID;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[1]")
	WebElement AgencyId;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[2]")
	WebElement Description;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[3]")
	WebElement Duedate1;
	
	@FindBy(xpath = "//div[@id='ptmModal']//div[2]//table/tbody/tr[1]/td[4]")
	WebElement Amount1;
	
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
	
	public void clickOnClose() throws InterruptedException {
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
	
	public void clickOnAmount96983() throws InterruptedException {
		try {
				
				Amount96983.click();
			
		} catch (StaleElementReferenceException e) {
	        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
	    } catch (NoSuchElementException e) {
	        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
	    } catch (Exception e) {
	        System.out.println("unable to click.." + e);
	    }
		Thread.sleep(3000);
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
			if(pdf.isDisplayed()) {
				pdf.click();
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

	public void clickOnExporttoPdf1() throws InterruptedException {
		try {
			if(pdf1.isDisplayed()) {
				pdf1.click();
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

	public void returnMatchSikuliObject(String imagePath) throws InterruptedException {
	    Screen screen = new Screen();
	    Match isFound = null;
	    try {
	        waitForSikuliObject(imagePath);
	        isFound = screen.find(imagePath);
	    } catch (FindFailed findFailed) {
	    }
	    
	}
	
public void searchwithDuedate() throws InterruptedException {
		
		try {
			Search.sendKeys(UPDuedate);
			
		} catch (StaleElementReferenceException e) {
            System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.."+Search+ e);
        }
		Thread.sleep(3000);
	}

public void searchwithAmount() throws InterruptedException {
	
	try {
		Search.sendKeys(UPAmount);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+Search+ e);
    }
	Thread.sleep(3000);
}

public void searchwithCount() throws InterruptedException {
	
	try {
		Search.sendKeys(UPCount);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+Search+ e);
    }
	Thread.sleep(3000);
}

public void searchwithPayrollID() throws InterruptedException {
	
	try {
		Search1.sendKeys(payrollID);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+Search+ e);
    }
	Thread.sleep(3000);
}

public void searchwithAgencyID() throws InterruptedException {
	
	try {
		Search1.sendKeys(UPAgencyID);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+Search+ e);
    }
	Thread.sleep(3000);
}

public void searchwithDescription() throws InterruptedException {
	
	try {
		Search1.sendKeys(UPDescription);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+Search+ e);
    }
	Thread.sleep(3000);
}

public void searchwithDuedate1() throws InterruptedException {
	
	try {
		Search1.sendKeys(UPDuedate1);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+Search+ e);
    }
	Thread.sleep(3000);
}

public void searchwithAmount1() throws InterruptedException {
	
	try {
		Search1.sendKeys(UPAmount_1);
		
	} catch (StaleElementReferenceException e) {
        System.out.println(Search + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println(Search + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.."+Search+ e);
    }
	Thread.sleep(3000);
}

public void verifyDuedate() throws InterruptedException {
	try {
		String btext= duedate.getText();
		assertEquals(btext, UPDuedate);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyAmount() throws InterruptedException {
	try {
		String btext= Amount.getText();
		assertEquals(btext, UPAmount_specialchar);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyCount() throws InterruptedException {
	try {
		String btext= count.getText();
		assertEquals(btext, UPCount);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyPayrollID() throws InterruptedException {
	try {
		String btext= PayrollID.getText();
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

public void verifyDescription() throws InterruptedException {
	try {
		String btext= Description.getText();
		assertEquals(btext, UPDescription);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyAgencyID() throws InterruptedException {
	try {
		String btext= AgencyId.getText();
		assertEquals(btext, UPAgencyID);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyDuedate1() throws InterruptedException {
	try {
		String btext= Duedate1.getText();
		assertEquals(btext, UPDuedate1);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

public void verifyAmount1() throws InterruptedException {
	try {
		String btext= Amount1.getText();
		assertEquals(btext, UPAmount1_Specialchar);
	} catch (StaleElementReferenceException e) {
        System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
    } catch (NoSuchElementException e) {
        System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
    } catch (Exception e) {
        System.out.println("unable to click.." + e);
    }
	Thread.sleep(5000);
}

}
