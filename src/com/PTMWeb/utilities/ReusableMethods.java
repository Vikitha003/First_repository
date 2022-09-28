package com.PTMWeb.utilities;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class ReusableMethods extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
    public static final long IMPLICIT_WAIT = 45;
    
    

    
    public void isElementPresent(By locator,Duration waitTime) {
        
        try {
        	 WebDriverWait wait= new WebDriverWait(driver, waitTime);
             wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()){
            	System.out.println(locator+" is displayed");
                } 
            }
        catch (NoSuchElementException e) {
                    System.out.println("Element." + locator + " was not not found in time " + waitTime + "seconds" + "-NosuchElementException");

                } catch (TimeoutException e) {
                    System.out.println("Element." + locator + " was not not found in time " + waitTime + "seconds" + "-TimeoutException");

                } catch (Exception e) {
                    System.out.println("Element." + locator + " was not not found in time" + e);

                }
    }
        
    public void isEnabled(By locator, Duration waitTime) {
      
        try {
        	 WebDriverWait wait= new WebDriverWait(driver, waitTime);
             wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isEnabled()) {
                System.out.println(locator+" is enabled");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element." + locator + " was not not found in time " + waitTime + "seconds" + "-NosuchElementException");

        } catch (TimeoutException e) {
            System.out.println("Element." + locator + " was not not found in time " + waitTime + "seconds" + "-TimeoutException");

        } catch (Exception e) {
            System.out.println("Element." + locator + " was not not found in time" + e);

        }
        
    }
    
    public void isElementVisible(By locator, Duration waitTime) {
        
        try {
            WebDriverWait wait= new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()) ;
            {
               System.out.println(locator+"is visible");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element." + locator + "was not not found in time " + waitTime + "seconds" + "-NosuchElementException");

        } catch (TimeoutException e) {
            System.out.println("Element." + locator + "was not not found in time " + waitTime + "seconds" + "-TimeoutException");
        } catch (Exception e) {
            System.out.println("Element." + locator + "was not not found in time" + e);
        }
       
    }
    
    public void click(By locator,Duration waitTime) {
        try {
        	 WebDriverWait wait= new WebDriverWait(driver, waitTime);
             wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()) {
                WebElement webElement = driver.findElement(locator);
                webElement.click();
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
    }
    
    public void sendkeys(By locator, String msg,Duration waitTime) {
        try {
        	 WebDriverWait wait= new WebDriverWait(driver, waitTime);
             wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()) {
                WebElement webElement = driver.findElement(locator);
                webElement.sendKeys(msg);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
    }
    
    public void clearData(By locator,Duration waitTime) {

        try {
        	 WebDriverWait wait= new WebDriverWait(driver, waitTime);
             wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()) {
                WebElement webElement = driver.findElement(locator);
                webElement.clear();
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to click.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to click.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to click.." + e);
        }
    }
    
    public void mouseHover(By locator,Duration waitTime){
        try
        {
        	WebDriverWait wait= new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if(driver.findElement(locator).isDisplayed()){
                Actions builder = new Actions(driver);
                WebElement HoverElement = driver.findElement(locator);
                builder.moveToElement(HoverElement).build().perform();
            }
            else {
                Assert.fail("Locator" + locator + "was not visible to hover");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visble to hover.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visble to hover.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to hover.." + e);
        }
    }
    
    public void SelectOptionInDropDownByValue(By locator, Duration waitTime, String sValuefOptionToSelect) {
        try {
        	WebDriverWait wait= new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()) {
                WebElement selectElement = driver.findElement(locator);
                Select select = new Select(selectElement);
                select.selectByValue(sValuefOptionToSelect);
            }

        } catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visible to select.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visible to select.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to select.." + e);
        }
    }
    
    public void SelectOptionInDropDownByIndexValue(By locator, Duration waitTime, int iIndexOfOptionToSelect) {
        try {
        	WebDriverWait wait= new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()) {
                WebElement selectElement = driver.findElement(locator);
                Select select = new Select(selectElement);
                select.selectByIndex(iIndexOfOptionToSelect);
            }

        } catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visible to select.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visible to select.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to select.." + e);
        }
    }

    public void SelectOptionInDropDownByVisibleText(By locator, Duration waitTime, String sVisibleTextOptionToSelect) {
        try {
        	WebDriverWait wait= new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()) {
                WebElement selectElement = driver.findElement(locator);
                Select select = new Select(selectElement);
                select.selectByVisibleText(sVisibleTextOptionToSelect);
            }

        } catch (StaleElementReferenceException e) {
            System.out.println("Element" + " is not visible to select.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " is not visible to select.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to select.." + e);
        }
    }
    
    public void checkCheckbox(By locator, Duration waitTime) {
        try {
        	WebDriverWait wait= new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()) {
                WebElement checkBox = driver.findElement(locator);
                if(checkBox.isSelected())
                {
                    System.out.println("checkBox is already selected...");
                }else {
                    checkBox.click();
                }
            }

        } catch (StaleElementReferenceException e) {
            System.out.println("Element" + " was unable to check.." + "- StaleElementReferenceException");
            Assert.fail("Locator" + locator + "is not present to check");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " unable to check.." + "-NosuchElementException");
            Assert.fail("Locator" + locator + "is not present to check");
        } catch (Exception e) {
            System.out.println("unable to check.." + e);
            Assert.fail("Locator" + locator + "is not present to check");
        }
    }
    
    public void safeGetText(By locator, Duration waitTime) {
        
        try {
        	WebDriverWait wait= new WebDriverWait(driver, waitTime);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (driver.findElement(locator).isDisplayed()) {
               String text= driver.findElement(locator).getText();
               System.out.println(text);	
            }

        } catch (StaleElementReferenceException e) {
            System.out.println("Element" + " was not found in Time.." + "- StaleElementReferenceException");
        } catch (NoSuchElementException e) {
            System.out.println("Element" + " was not found in Time.." + "-NosuchElementException");
        } catch (Exception e) {
            System.out.println("unable to find text.." + e);
        }
        
    }
    
    public void takescreenshotForWebPage(String ScreenshotAbsoluteFileName) throws Exception {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(ScreenshotAbsoluteFileName));
    }
    
    public String getCurrentURL()
    {
        String sUrl = null;
        try
        {
            sUrl = driver.getCurrentUrl();
        }
        catch(Exception e)
        {
            Assert.fail("Some exception occured while retriving current url");
        }

        return sUrl;
    }
    
    public void refresh()
    {
        try
        {
            driver.navigate().refresh();
        }
        catch(Exception e)
        {
            Assert.fail("Some exception occured while refreshing the page,");
        }
    }
    
    public void scrollIntoElementView(By locator,String friendlyWebElementName)
    {
        try
        {
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(locator));
        }
        catch(StaleElementReferenceException e)
        {
            
            Assert.fail(friendlyWebElementName +" is not attached to the page document");
        }
        catch (NoSuchElementException e)
        {
            
            Assert.fail(friendlyWebElementName +" was not found in DOM");
        }
        catch(Exception e)
        {
           
            Assert.fail("Unable to scroll the page to find "+ friendlyWebElementName);
        }
    }
}
