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
	ExtentTest test;
	ExtentReports extent;
	
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
	public String LIExcelReportwithPayrollID = readconfig.getLiabilitiesIssuesWithPayrollIDExcelReportPath();
	public String ValidateExcelRecordforPayrollIDinLI = readconfig.VerifyLI_PayrollIDExcelRecord();
	public String ValidateExcelRecordforReasoninLI = readconfig.VerifyLIReason();
	public String LIcheckDate = readconfig.LIcheckDate();
	public String payrollID = readconfig.PayrollID();
	public String LIReason= readconfig.LIReason();
	public String Filebutton = readconfig.Filebutton();
	public String Closebutton = readconfig.closebutton();
	public String Close = readconfig.close();
	public String PIAgencyID = readconfig.PIAgencyID();
	public String PIDescription = readconfig.PIDescription();
	public String PIDueDate = readconfig.PIDuedate();
	public String PIAmount = readconfig.PIAmount();
	public String PIAmount_specialchar = readconfig.PIAmount_specialchar();
	public String PIReasonCode = readconfig.PIReasoncode();
	public String NSFAgentID = readconfig.NSFAgencyID();
	public String NSFDescription = readconfig.NSFDescription();
	public String NSFAmount = readconfig.NSFAmount();
	public String NSFAmount_specialchar = readconfig.NSFAmount_specialchar();
	public String AFAgencyID = readconfig.AFAgencyID();
	public String AFDescription = readconfig.AFDescription();
	public String AFCheckDate = readconfig.AFCheckDate();
	public String AFAmount = readconfig.AFAmount();
	public String AFDuedate = readconfig.AFDuedate();
	public String ALActiveFromDate = readconfig.ALActiveFromDate();
	public String ALAlertName = readconfig.ALAlertName();
	public String ALAlertText = readconfig.ALAlertText();
	public String PIExcelReportwithPayrollID = readconfig.getPIExcelReportPath();
	public String ValidatePIExcelReportWithPayrollID = readconfig.VerifyLI_PayrollIDExcelRecord();
	public String ValidatePIExcelReportwithAgencyId = readconfig.VerifyPIAgencyID();
	public String ValidatePIExcelReportwithDescription = readconfig.VerifyPIDescription();
	public String ValidatePIExcelReportwithDuedate = readconfig.VerifyPIDuedate();
	public String ValidatePIExcelReportwithAmount = readconfig.VerifyAmount();
	public String clickonNSFExcelFilewithPayrollID = readconfig.clickonNSFExcelFilewithPayrollID();
	public String VerifyNSFExcelwithPayrollID = readconfig.VerifyNSFExcelwithPayrollID();
	public String VerifyNSFExcelwithAgencyID = readconfig.VerifyNSFExcelwithAgencyID();
	public String VerifyNSFExcelwithDescription = readconfig.VerifyNSFExcelwithDescription();
	public String VerifyNSFExcelwithAmount = readconfig.VerifyNSFExcelwithAmount();
	public String clickonAppliedForExcel = readconfig.clickonAppliedForExcel();
	public String VerifyAFExcelwithPayrollID = readconfig.VerifyAFExcelwithPayrollID();
	public String VerifyAFExcelwithAgencyID = readconfig.VerifyAFExcelwithAgencyID();
	public String VerifyAFExcelwithDescription = readconfig.VerifyAFExcelwithDescription();
	public String VerifyAFAmount_specialchar = readconfig.VerifyAFAmount_specialchar();
	public String ALExcelFile = readconfig.ALExcelFile();
	public String VerifyALExcelwithActivedate = readconfig.VerifyALExcelwithActivedate();
	public String VerifyALExcelwithAlertName = readconfig.VerifyALExcelwithAlertName();
	public String VerifyALExcelwithAlertText = readconfig.VerifyALExcelwithAlertText();
	public String RLcheckDate = readconfig.enterRLcheckDate();
	public String RLEntryDate = readconfig.enterRLEntryDate();
	public String RLAmount = readconfig.enterRLAmount();
	public String RLAmount_Specialchar = readconfig.enterRLAmount_Specialchar();
	public String RLStatus = readconfig.enterRLStatus();
	public String RLExcelFile = readconfig.RLExcelFile();
	public String RLVerifyPayrollIDinExcel = readconfig.RLVerifyPayrollIDinExcel();
	public String RLVerifyCheckDateinExcel = readconfig.RLVerifyCheckDateinExcel();
	public String RLVerifyEntryDateinExcel = readconfig.RLVerifyEntryDateinExcel();
	public String RLVerifyAmountinExcel = readconfig.RLVerifyAmountinExcel();
	public String RLVerifyStatusinExcel = readconfig.RLVerifyStatusinExcel();
	public String RLVerifyDescriptionTitle = readconfig.RLVerifyDescriptionTitle();
	public String NSFHoldStatus = readconfig.NSFHoldStatus();
	public String NSFHoldStatus_BHBAKERY = readconfig.NSFHoldStatus_BHBAKERY();
	public String SelectQuarter = readconfig.SelectQuarter();
	public String SelectYear = readconfig.SelectYear();
	public String TPQepkgFilename = readconfig.TPQepkgFilename();
	public String TPRtnpkgFilename = readconfig.TPRtnpkgFilename();
	public String qepkgdownloadedFile = readconfig.qepkgdownloadedFile();
	public String TAAgencyID = readconfig.TAAgencyID();
	public String TADescription = readconfig.TADescription();
	public String TAMAinagencyID = readconfig.TAMAinagencyID();
	public String TAMainAgencyID_TIBERIUMSYSTEMS = readconfig.TAMainAgencyID_TIBERIUMSYSTEMS();
	public String TAClientTaxID = readconfig.TAClientTaxID();
	public String TAFrequencyType = readconfig.TAFrequencyType();
	public String TAFrequencyTypeFEDSWQREC = readconfig.TAFrequencyTypeFEDSWQREC();
	public String TAFrequency = readconfig.TAFrequency();
	public String TATaxRate = readconfig.TATaxRate();
	public String TATaxRate02 = readconfig.TATaxRate02();
	public String TATaxRate_TIBERIUMSYSTEMS = readconfig.TATaxRate_TIBERIUMSYSTEMS();
	public String TAStatus = readconfig.TAStatus();
	public String DoughNutsLegalName_1 = readconfig.DoughNutsLegalName();
	public String DoughNutsDBA_1 = readconfig.DoughNutsDBA();
	public String DoughNutsAddress_1 = readconfig.DoughNutsAddress();
	public String DoughNutsFEIN_1 = readconfig.DoughNutsFEIN();
	public String DoughNutsClientID_1 = readconfig.DoughNutsClientID();
	public String DoughNutsPayrollID_1 = readconfig.DoughNutsPayrollID();
	public String DoughNutsAnnouncementName = readconfig.DoughNutsAnnouncementName();
	public String AnnouncementsExcelFile = readconfig.AnnouncementsExcelFile();
	public String ValidateDoughNutsAnnouncements = readconfig.ValidateDoughNutsAnnouncements();
	public String AnnouncementsPdfFile = readconfig.AnnouncementsPdfFile();
	public String ValidateDoughNutsAnnouncementsPdf = readconfig.ValidateDoughNutsAnnouncementsPdf();
	public String UPDuedate = readconfig.UPDuedate();
	public String UPAmount = readconfig.UPAmount();
	public String UPAmount_specialchar = readconfig.UPAmount_specialchar();
	public String UPCount = readconfig.UPCount();
	public String UPAgencyID = readconfig.UPAgencyID();
	public String UPDescription = readconfig.UPDescription();
	public String UPDuedate1 = readconfig.UPDuedate1();
	public String UPAmount_1 = readconfig.UPAmount_1();
	public String UPAmount1_Specialchar = readconfig.UPAmount1_Specialchar();
	public String UPExcelFile = readconfig.UPExcelFile();
	public String UPValidatingDuedateExcel = readconfig.UPValidatingDuedateExcel();
	public String UPValidatingAmountExcel = readconfig.UPValidatingAmountExcel();
	public String UPValidatingCountExcel = readconfig.UPValidatingCountExcel();
	public String UPValidatingPayrollIDExcel = readconfig.UPValidatingPayrollIDExcel();
	public String UPValidatingAgencyIDExcel = readconfig.UPValidatingAgencyIDExcel();
	public String UPValidatingDescriptionExcel = readconfig.UPValidatingDescriptionExcel();
	public String UPValidatingDuedate1Excel = readconfig.UPValidatingDuedate1Excel();
	public String FIAmount = readconfig.FIAmount();
	public String FIAmount_specialchar = readconfig.FIAmount_specialchar();
	public String FIDuedate = readconfig.FIDuedate();
	public String FIReason = readconfig.FIReason();
	public String FIValidateExcelFile = readconfig.FIValidateExcelFile();
	public String FIValidatePayrollID = readconfig.FIValidatePayrollID();
	public String FIValidateAmount = readconfig.FIValidateAmount();
	public String FIValidateFundingDate = readconfig.FIValidateFundingDate();
	public String FIValidateReason = readconfig.FIValidateReason();
	public String UPValidatingAmount1Excel = readconfig.UPValidatingAmount1Excel();
	public String RLDescName = readconfig.RLDescName();
	public String RLDescAmount = readconfig.RLDescAmount();
	public String RLDescAmount_specialchar = readconfig.RLDescAmount_specialchar();
	public String RLValidateRLDesc = readconfig.RLValidateRLDesc();
	public String RLValidateRLAmount = readconfig.RLValidateRLAmount();
	public String PayrollID_BHBAKERY = readconfig.PayrollID_BHBAKERY();
	public String PayrollID_TIBERIUM = readconfig.PayrollID_TIBERIUM();
	public String PIExcelFileWithPayrollID_BHBAKERY = readconfig.PIExcelFileWithPayrollID_BHBAKERY();
	public String PIAgencyID_BHBAKERY = readconfig.PIAgencyID_BHBAKERY();
	public String PIDescription_BHBAKERY = readconfig.PIDescription_BHBAKERY();
	public String PIDuedate_BHBAKERY = readconfig.PIDuedate_BHBAKERY();
	public String PIAmount_BHBAKERY = readconfig.PIAmount_BHBAKERY();
	public String PIAmount_specialchar_BHBAKERY = readconfig.PIAmount_specialchar_BHBAKERY();
	public String PIReasoncode_BHBAKERY = readconfig.PIReasoncode_BHBAKERY();
	public String PIValidateAgencyID_BHBAKERY = readconfig.PIValidateAgencyID_BHBAKERY();
	public String PIValidateDescription_BHBAKERY = readconfig.PIValidateDescription_BHBAKERY();
	public String PIValidateDuedate_BHBAKERY = readconfig.PIValidateDuedate_BHBAKERY();
	public String PIValidateAmount_BHBAKERY = readconfig.PIValidateAmount_BHBAKERY();
	public String PIValidateNoRecords_BHBAKERY = readconfig.PIValidateNoRecords_BHBAKERY();
	public String PIValidatePayrollID_TIBERIUM = readconfig.PIValidatePayrollID_TIBERIUM();
	public String PIAgencyID_TIBERIUM = readconfig.PIAgencyID_TIBERIUM();
	public String PIDescription_TIBERIUM = readconfig.PIDescription_TIBERIUM();
	public String PIDuedate_TIBERIUM = readconfig.PIDuedate_TIBERIUM();
	public String PIAmount_TIBERIUM = readconfig.PIAmount_TIBERIUM();
	public String PIAmount_specialchar_TIBERIUM = readconfig.PIAmount_specialchar_TIBERIUM();
	public String PIValidateAgencyID_TIBERIUM = readconfig.PIValidateAgencyID_TIBERIUM();
	public String PIValidateDuedate_TIBERIUM = readconfig.PIValidateDuedate_TIBERIUM();
	public String PIValidateAmount_TIBERIUM = readconfig.PIValidateAmount_TIBERIUM();
	public String PIValidateReasonCode_TIBERIUM = readconfig.PIValidateReasonCode_TIBERIUM();

	
	
	
	
	// @Parameters("browser")
	
	@BeforeTest
	public void setup() throws Exception {
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "PTM Web-Report-"+timestamp+".html";
		extent=new ExtentReports();
	
	//recorder.start();
	String log4jConfPath = "C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\PTMWeb\\log4j.properties";
	PropertyConfigurator.configure(log4jConfPath);
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	
	ChromeOptions options = new ChromeOptions();
	
	HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	chromePrefs.put("profile.default_content_settings.popups", 0);
	
	chromePrefs.put("download.default_directory", "C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\Asure Tax Portal\\Downloads");
	options.setExperimentalOption("prefs",chromePrefs);
	driver=new ChromeDriver(options);
	
// ScreenRecorderUtil.startRecord("setup");
	Thread.sleep(4000);
	driver.get(baseURL);
	driver.manage().window().maximize();
	
	
	JavascriptExecutor j = (JavascriptExecutor)driver;
    if (j.executeScript("return document.readyState").toString().equals("complete")){
       System.out.println("Page has loaded");
    }
//    //iterate 50 times after every one second to verify if in ready state
//    for (int i=0; i<20; i++){
//       try {
//          Thread.sleep(1000);
//       }catch (InterruptedException ex) {
//          System.out.println("Page has not loaded yet ");
//       }
//    }
    Thread.sleep(4000);
	loginPage Login= new loginPage(driver);
	Login.setUsername(Username);
	Login.setPassword(Password);
	Login.clickOnLogin();
	recorder=new ATUTestRecorder(videoFolder, videoFile, false);
	recorder.start();
	}

	
//	@DataProvider(name="loginTestData")
//	public Object[][] getData() {
//		Object[][] data = new Object[2][2];
//			data[0][0] = "demo.user";
//			data[0][1] = "password";
//			
//			data[1][0] = "demo.user";
//			data[1][1] = "password";
//			
//			return data;
//		};
		
	
	
	
	
//	public void setup(String br) {
//		if(br.equals("chrome")) {
//		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
//		driver=new ChromeDriver();
//		driver.get(baseURL);
//		driver.manage().window().maximize();
//		}
//		else if(br.equals("edge")) {
//			System.setProperty("webdriver.edge.driver", readconfig.getEdgePath());
//			driver=new EdgeDriver();
//			driver.get(baseURL);
//			driver.manage().window().maximize();
//			}
//		else if(br.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
//			driver=new FirefoxDriver();
//			driver.get(baseURL);
//			driver.manage().window().maximize();
//			}
//		}

/*
 * @BeforeTest public static void createVideo() throws ATUTestRecorderException
 * { recorder=new ATUTestRecorder(videoFolder, videoFile, false);
 * recorder.start(); }
 */

//@BeforeMethod
//public static void startvideo() throws ATUTestRecorderException {
//	recorder.start();
//}
//@AfterMethod
//	public static void stopvideo() throws ATUTestRecorderException {
//	recorder.stop();
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
		            	 
		            	return true;
		            }
		       }
		       
		   }
		   System.out.println("Dowloaded File Name is "+fileName );
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
