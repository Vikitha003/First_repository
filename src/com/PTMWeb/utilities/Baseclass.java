package com.PTMWeb.utilities;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.PTMWeb.pages.AlertsPage;
import com.PTMWeb.pages.AppliedForPage;
import com.PTMWeb.pages.DashboardPage;
import com.PTMWeb.pages.HomePage;
import com.PTMWeb.pages.LiabilitiesIssuesPage;
import com.PTMWeb.pages.NSFHoldPage;
import com.PTMWeb.pages.PaymentIssuesPage;
import com.PTMWeb.pages.RecentLiabilitiesPage;
import com.PTMWeb.pages.loginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;



public class Baseclass {
	public static WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports extent;
	
	static String df = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		static String videoFolder="C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\PTMWeb\\Videorecordings\\";
	static String videoFile = "TestVideo."+df;
	public static ATUTestRecorder recorder;
	
//	loginPage Lp= new loginPage(driver);
//	HomePage HP=new HomePage(driver);
//	DashboardPage DP= new DashboardPage(driver);
//	LiabilitiesIssuesPage LI = new LiabilitiesIssuesPage(driver);
//	PaymentIssuesPage PI = new PaymentIssuesPage(driver);
//	NSFHoldPage NSF = new NSFHoldPage(driver);
//	AppliedForPage AF=new AppliedForPage(driver);
//	AlertsPage AP = new AlertsPage(driver);
//	RecentLiabilitiesPage RL = new RecentLiabilitiesPage(driver);
	
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String Username = readconfig.getUsername();
	public String Password = readconfig.getPassword();
	public String ValidateExcelRecordforReasoninLI = readconfig.VerifyLiabilitiesIssuesReason();
	public String LiabilitiesIssues_checkDate = readconfig.LiabilitiesIssues_CheckDate();
	public String payrollID_DoughNuts = readconfig.PayrollID_DoughNuts();
	public String LiabilitiesIssues_Reason= readconfig.LiabilitiesIssues_Reason();
	public String PaymentIssues_AgencyID = readconfig.PaymentIssues_AgencyID();
	public String PaymentIssues_Description = readconfig.PaymentIssues_Description();
	public String PaymentIssues_DueDate = readconfig.PaymentIssues_Duedate();
	public String PaymentIssues_Amount = readconfig.PaymentIssues_Amount();
	public String PaymentIssues_Amount_specialchar = readconfig.PaymentIssues_Amount_specialchar();
	public String PaymentIssues_ReasonCode = readconfig.PaymentIssues_Reasoncode();
	public String NSFHold_AgentID = readconfig.NSFHold_AgencyID();
	public String NSFHold_Description = readconfig.NSFHold_Description();
	public String NSFHold_Amount = readconfig.NSFHold_Amount();
	public String NSFHold_Amount_specialchar = readconfig.NSFHold_Amount_specialchar();
	public String AppliedFor_AgencyID = readconfig.AppliedFor_AgencyID();
	public String AppliedFor_Description = readconfig.AppliedFor_Description();
	public String AppliedFor_CheckDate = readconfig.AppliedFor_CheckDate();
	public String AppliedFor_Amount = readconfig.AppliedFor_Amount();
	public String AppliedFor_Amount_specialchar = readconfig.VerifyAFAmount_specialchar();
	public String AppliedFor_Duedate = readconfig.AppliedFor_Duedate();
	public String Alerts_ActiveFromDate = readconfig.Alerts_ActiveFromDate();
	public String Alerts_AlertName = readconfig.Alerts_AlertName();
	public String Alerts_AlertText = readconfig.Alerts_AlertText();
	public String RecentLiabilities_checkDate = readconfig.enterRecentLiabilities_CheckDate();
	public String RecentLiabilities_EntryDate = readconfig.enterRecentLiabilities_EntryDate();
	public String RecentLiabilities_Amount = readconfig.enterRecentLiabilities_Amount();
	public String RecentLiabilities_Amount_Specialchar = readconfig.enterRecentLiabilities_Amount_Specialchar();
	public String RecentLiabilities_Status = readconfig.enterRecentLiabilities_Status();
	public String RLVerifyDescriptionTitle = readconfig.RLVerifyRecentLiabilities_Description();
	public String NSFHoldStatus = readconfig.NSFHoldStatus();
	public String NSFHoldStatus_BHBAKERY = readconfig.NSFHoldStatus_BHBAKERY();
	public String SelectQuarter = readconfig.SelectQuarter();
	public String SelectYear = readconfig.SelectYear();
	public String TPQepkgFilename = readconfig.TaxPackags_QepkgFilename();
	public String TPRtnpkgFilename = readconfig.TaxPackags_RtnpkgFilename();
	public String TAAgencyID = readconfig.TaxAgencies_AgencyID();
	public String TADescription = readconfig.TaxAgencies_Description();
	public String TAMAinagencyID = readconfig.TaxAgencies_MAinagencyID();
	public String TAMainAgencyID_TIBERIUMSYSTEMS = readconfig.TaxAgencies_MainAgencyID_TIBERIUMSYSTEMS();
	public String TAClientTaxID = readconfig.TaxAgencies_ClientTaxID();
	public String TAFrequencyType = readconfig.TaxAgencies_FrequencyType();
	public String TAFrequencyTypeFEDSWQREC = readconfig.TaxAgencies_FrequencyType_FEDSWQREC();
	public String TAFrequency = readconfig.TaxAgencies_Frequency();
	public String TATaxRate = readconfig.TaxAgencies_TaxRate();
	public String TATaxRate02 = readconfig.TaxAgencies_TaxRate02();
	public String TATaxRate_TIBERIUMSYSTEMS = readconfig.TaxAgencies_TaxRate_TIBERIUMSYSTEMS();
	public String TAStatus = readconfig.TaxAgencies_TaxStatus();
	public String DoughNutsLegalName_1 = readconfig.DoughNutsLegalName();
	public String DoughNutsDBA_1 = readconfig.DoughNutsDBA();
	public String DoughNutsAddress_1 = readconfig.DoughNutsAddress();
	public String DoughNutsFEIN_1 = readconfig.DoughNutsFEIN();
	public String DoughNutsClientID_1 = readconfig.DoughNutsClientID();
	public String DoughNutsPayrollID_1 = readconfig.DoughNutsPayrollID();
	public String DoughNutsAnnouncementName = readconfig.DoughNutsAnnouncementName();
	public String UPDuedate = readconfig.UpcomingPayments_Duedate();
	public String UPAmount = readconfig.UpcomingPayments_Amount();
	public String UPAmount_specialchar = readconfig.UpcomingPayments_Amount_specialchar();
	public String UPCount = readconfig.UpcomingPayments_Count();
	public String UPAgencyID = readconfig.UpcomingPayments_AgencyID();
	public String UPDescription = readconfig.UpcomingPayments_Description();
	public String UPDuedate1 = readconfig.UpcomingPayments_Duedate1();
	public String UPAmount_1 = readconfig.UpcomingPayments_Amount_1();
	public String UPAmount1_Specialchar = readconfig.UpcomingPayments_Amount1_Specialchar();
	public String FIAmount = readconfig.FundingIssues_Amount();
	public String FIAmount_specialchar = readconfig.FundingIssues_Amount_specialchar();
	public String FIDuedate = readconfig.FundingIssues_Duedate();
	public String FIReason = readconfig.FundingIssues_Reason();
	public String RLDescName = readconfig.RecentLiabilities_DescName();
	public String RLDescAmount = readconfig.RecentLiabilities_DescAmount();
	public String RLDescAmount_specialchar = readconfig.RecentLiabilities_DescAmount_specialchar();
	public String PayrollID_BHBAKERY = readconfig.PayrollID_BHBAKERY();
	public String PayrollID_TIBERIUM = readconfig.PayrollID_TIBERIUM();
	public String PIAgencyID_BHBAKERY = readconfig.PaymentIssues_AgencyID_BHBAKERY();
	public String PIDescription_BHBAKERY = readconfig.PaymentIssues_Description_BHBAKERY();
	public String PIDuedate_BHBAKERY = readconfig.PaymentIssues_Duedate_BHBAKERY();
	public String PIAmount_BHBAKERY = readconfig.PaymentIssues_Amount_BHBAKERY();
	public String PIAmount_specialchar_BHBAKERY = readconfig.PaymentIssues_Amount_specialchar_BHBAKERY();
	public String PIReasoncode_BHBAKERY = readconfig.PaymentIssues_Reasoncode_BHBAKERY();
	public String PIAgencyID_TIBERIUM = readconfig.PaymentIssues_AgencyID_TIBERIUM();
	public String PIDescription_TIBERIUM = readconfig.PaymentIssues_Description_TIBERIUM();
	public String PIDuedate_TIBERIUM = readconfig.PaymentIssues_Duedate_TIBERIUM();
	public String PIAmount_TIBERIUM = readconfig.PaymentIssues_Amount_TIBERIUM();
	public String PIAmount_specialchar_TIBERIUM = readconfig.PaymentIssues_Amount_specialchar_TIBERIUM();
	
	
	
//	@BeforeMethod
//	public void setup() throws Exception {
//		recorder=new ATUTestRecorder(videoFolder, videoFile, false);
//		recorder.start();
////		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
////		String repName = "PTM Web-Report-"+timestamp+".html";
////		extent=new ExtentReports();
//	String log4jConfPath = "C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\PTMWeb\\log4j.properties";
//	PropertyConfigurator.configure(log4jConfPath);
//	
//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	
//	
//	ChromeOptions options = new ChromeOptions();
//	
//	HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//	chromePrefs.put("profile.default_content_settings.popups", 0);
//	
//	chromePrefs.put("download.default_directory", "C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\Asure Tax Portal\\Downloads");
//	options.setExperimentalOption("prefs",chromePrefs);
//	driver=new ChromeDriver(options);
//	Thread.sleep(4000);
//	driver.get(baseURL);
//	driver.manage().window().maximize();
//	
//	
//	JavascriptExecutor j = (JavascriptExecutor)driver;
//    if (j.executeScript("return document.readyState").toString().equals("complete")){
//       System.out.println("Page has loaded");
//    }
//    Thread.sleep(4000);
//	loginPage Login= new loginPage(driver);
//	Login.setUsername(Username);
//	Login.setPassword(Password);
//	Login.clickOnLogin();
//	
//	}

		
	
	
	 @Parameters("browser")
	 
	@BeforeMethod
	public void setup(String browser) throws InterruptedException, ATUTestRecorderException {
		if(browser.equals("chrome")) {
			recorder=new ATUTestRecorder(videoFolder, videoFile, false);
			recorder.start();
		String log4jConfPath = "C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\PTMWeb\\log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		
		chromePrefs.put("download.default_directory", "C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\Asure Tax Portal\\Downloads");
		options.setExperimentalOption("prefs",chromePrefs);
		driver=new ChromeDriver(options);
		Thread.sleep(4000);
		driver.get(baseURL);
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor)driver;
	    if (j.executeScript("return document.readyState").toString().equals("complete")){
	       System.out.println("Page has loaded");
	    }
	    Thread.sleep(4000);
		loginPage Login= new loginPage(driver);
		Login.setUsername(Username);
		Login.setPassword(Password);
		Login.clickOnLogin();
		}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", readconfig.getEdgePath());
			driver=new EdgeDriver();
			driver.get(baseURL);
			driver.manage().window().maximize();
			JavascriptExecutor j = (JavascriptExecutor)driver;
		    if (j.executeScript("return document.readyState").toString().equals("complete")){
		       System.out.println("Page has loaded");
		    }
		    Thread.sleep(4000);
			loginPage Login= new loginPage(driver);
			Login.setUsername(Username);
			Login.setPassword(Password);
			Login.clickOnLogin();
			}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
			driver.get(baseURL);
			driver.manage().window().maximize();
			JavascriptExecutor j = (JavascriptExecutor)driver;
		    if (j.executeScript("return document.readyState").toString().equals("complete")){
		       System.out.println("Page has loaded");
		    }
		    Thread.sleep(4000);
			loginPage Login= new loginPage(driver);
			Login.setUsername(Username);
			Login.setPassword(Password);
			Login.clickOnLogin();
			}
		}

/*
 * @BeforeTest public static void createVideo() throws ATUTestRecorderException
 * { recorder=new ATUTestRecorder(videoFolder, videoFile, false);
 * recorder.start(); }
 */

//@BeforeTest
//public void login() throws Exception {
//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	
//	
//	ChromeOptions options = new ChromeOptions();
//	
//	HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//	chromePrefs.put("profile.default_content_settings.popups", 0);
//	
//	chromePrefs.put("download.default_directory", "C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\Asure Tax Portal\\Downloads");
//	options.setExperimentalOption("prefs",chromePrefs);
//	driver=new ChromeDriver(options);
//	Thread.sleep(4000);
//	driver.get(baseURL);
//	driver.manage().window().maximize();
//	
//	
//	JavascriptExecutor j = (JavascriptExecutor)driver;
//    if (j.executeScript("return document.readyState").toString().equals("complete")){
//       System.out.println("Page has loaded");
//    }
//    Thread.sleep(4000);
//	loginPage Login= new loginPage(driver);
//	Login.setUsername(Username);
//	Login.setPassword(Password);
//	Login.clickOnLogin();
//
//
//}


	@AfterMethod
		public void quitbrowser() throws Exception {
			driver.quit();
			recorder.stop();
//			ScreenRecorderUtil.stopRecord();
		}

	 public static String CaptureScreenshot() throws IOException {
		
		 Date currentdate= new Date();
		 String scrshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 String path = "C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\Asure Tax Portal\\screenshots\\"+scrshotfilename+ ".png";
		 File DestFile=new File(path);
		 FileUtils.copyFile(SrcFile, DestFile);
		return path;
		 
	 }
	 
	 
	 public static boolean isFileDownloaded(String fileName) {
		   File dir = new File("C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\Asure Tax Portal\\Downloads");
		   File[] dir_contents = dir.listFiles();

		   if (dir_contents != null) {
		       for (File dir_content : dir_contents) {
		            if (dir_content.getName().equals(fileName)) {
		            	System.out.println("Dowloaded File Name is "+fileName ); 
		            	return true;
		            }
		       }
		       
		   }
		   System.out.println(fileName +"is not downloaded" );
		   return false;
		   
		}
	 
	 public static boolean DeleteFile() {
		   File dir = new File("C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\Asure Tax Portal\\Downloads");
		   File[] dir_contents = dir.listFiles();

		   for (File file : dir_contents) {
		        System.out.println("Deleted filename :"+ file.getName());
		        file.delete();
		    }
		   

		   return false;
		}
	 
	 public void SetHighlight(WebElement element)
     {
         try
         {
        	 for (int i = 0; i < 2; i++)
             {
        	 JavascriptExecutor js = (JavascriptExecutor) driver;
        	 js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element	);
        	 if (element.getAttribute("style") != null)
             {
                 Thread.sleep(2000);
             }
        	 js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
             }
         }
         catch (Exception e)
         {

         }
     }
}
