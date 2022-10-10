package com.PTMWeb.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PTMWeb.utilities.Baseclass;
import com.ctc.wstx.shaded.msv_core.grammar.xmlschema.XPath;

public class TaxPackagesPage extends Baseclass{
	
	public static final long EXPLICIT_WAIT = 20;
	public static WebDriver driver;
	
	public TaxPackagesPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//span[text()='2']")
	WebElement Quarter;
	
	@FindBy(xpath = "//span[text()='2022']")
	WebElement Year;
	
	
	@FindBy(xpath = "(//span[@class='k-list-item-text'])[1]")
	WebElement Quarter1;
	
	
	
	@FindBy(xpath = "(//span[@class='k-list-item-text'])[2]")
	WebElement Year1;
	
	@FindBy(xpath = "//tr[@class='k-master-row']")
	WebElement QepkgFilename;
	
	@FindBy(xpath = "//tr[@class='k-master-row k-alt']")
	WebElement RtnPkgFilename;
	
	@FindBy(xpath = "//a[@class='a-download']")
	WebElement qepkgdownload;
	
	@FindBy(xpath="//tr[@class='k-grid-norecords']")
	WebElement Norecords;
	
	public void selectQuarter() throws InterruptedException {
		try {
			
			SetHighlight(Quarter);
//			Select sel=new Select(Quarter);
//			Thread.sleep(3000);
//			sel.selectByVisibleText("1");
			Quarter.click();
			Thread.sleep(3000);
			Quarter1.click();
				
		} catch (StaleElementReferenceException e) {
            System.out.println(Quarter1 + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Select Quarter");
        } catch (NoSuchElementException e) {
            System.out.println(Quarter1 + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Select Quarter");
        } catch (Exception e) {
            System.out.println("unable to click.."+ Quarter1 + e);
            assertTrue(false, "Unable to Select Quarter");
        }
		Thread.sleep(3000);
	}

	public void selectYear() throws InterruptedException {
		try {
			
			Year.click();
			Thread.sleep(3000);
			Year1.click();
				
		} catch (StaleElementReferenceException e) {
            System.out.println(Year + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to Select Year");
        } catch (NoSuchElementException e) {
            System.out.println(Year + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to Select Year");
        } catch (Exception e) {
            System.out.println("unable to click.." + Year + e);
            assertTrue(false, "Unable to Select Year");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateQePkg() throws InterruptedException {
		try {
			
			String btext= QepkgFilename.getText();
			assertEquals(btext,TPQepkgFilename);
				
		} catch (StaleElementReferenceException e) {
            System.out.println(QepkgFilename + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to validate QePkg");
        } catch (NoSuchElementException e) {
            System.out.println(QepkgFilename + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to validate QePkg");
        } catch (Exception e) {
            System.out.println("unable to click.." + QepkgFilename + e);
            assertTrue(false, "Unable to validate QePkg");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateRtnPkg() throws InterruptedException {
		try {
			
			String btext= RtnPkgFilename.getText();
			assertEquals(btext,TPRtnpkgFilename);
				
		} catch (StaleElementReferenceException e) {
            System.out.println(RtnPkgFilename + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to validate RtnPkg");
        } catch (NoSuchElementException e) {
            System.out.println(RtnPkgFilename + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to validate RtnPkg");
        } catch (Exception e) {
            System.out.println("unable to click.." + RtnPkgFilename + e);
            assertTrue(false, "Unable to validate RtnPkg");
        }
		Thread.sleep(3000);
	}
	
	public void ValidateNorecords() throws InterruptedException {
		try {
			
			String btext= Norecords.getText();
			assertEquals(btext,PIReasoncode_BHBAKERY);
				
		} catch (StaleElementReferenceException e) {
            System.out.println(Norecords + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to validate No Records Available Message");
        } catch (NoSuchElementException e) {
            System.out.println(Norecords + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to validate No Records Available Message");
        } catch (Exception e) {
            System.out.println("unable to click.." + Norecords + e);
            assertTrue(false, "Unable to validate No Records Available Message");
        }
		Thread.sleep(3000);
	}
	
	public void clickOnqepkgDownload() throws InterruptedException {
		try {
			
			qepkgdownload.click();
				
		} catch (StaleElementReferenceException e) {
            System.out.println(qepkgdownload + " is not visble to click.." + "- StaleElementReferenceException");
            assertTrue(false, "Unable to click on Download button");
        } catch (NoSuchElementException e) {
            System.out.println(qepkgdownload + " is not visble to click.." + "-NosuchElementException");
            assertTrue(false, "Unable to click on Download button");
        } catch (Exception e) {
            System.out.println("unable to click.." + qepkgdownload + e);
            assertTrue(false, "Unable to click on Download button");
        }
		Thread.sleep(3000);
	}
	
	
	
}
