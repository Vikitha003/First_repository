package com.PTMWeb.utilities;


import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;




public class Reports extends Baseclass implements ITestListener{
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentTest logger;
	static String df = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	
	public static ExtentReports InitializeReport()
    {
        if (extent == null)
        {
            
        	String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    		String repName = "PTM Web-Report-"+timestamp+".html";
            
            
            sparkReporter=new ExtentSparkReporter("C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\"+repName);
    		
    		try {
    			sparkReporter.loadXMLConfig("C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\Asure Tax Portal\\extent-config.xml");
    		} catch (IOException e) {
    			
    			e.printStackTrace();
    		}


    		extent=new ExtentReports();
    		extent.attachReporter(sparkReporter);
    		extent.setSystemInfo("Host Name", "QT-INHD-LT0694");
    		extent.setSystemInfo("Environment", "Dev");
    		extent.setSystemInfo("User", "Veera Lakshmi Bikkina");
    		sparkReporter.config().setDocumentTitle("Asure Tax Portal");
    		sparkReporter.config().setReportName("Regression Test Report");
    		sparkReporter.config().setTheme(Theme.STANDARD);
    		
        }
        return extent;

   }
	
	
	public void onTestStart() {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "PTM Web-Report-"+timestamp+".html";
		sparkReporter=new ExtentSparkReporter("C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\"+repName);
		
		try {
			sparkReporter.loadXMLConfig("C:\\Users\\Veeralakshmi.bikkina\\PTMWeb\\Asure Tax Portal\\extent-config.xml");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Host Name", "QT-INHD-LT0694");
		extent.setSystemInfo("Environment", "Dev");
		extent.setSystemInfo("User", "Veera Lakshmi Bikkina");
		
		
		sparkReporter.config().setDocumentTitle("Asure Tax Portal");
		sparkReporter.config().setReportName("Regression Test Report");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
	}
	
	
	public void onTestSuccess(ITestResult tr) {
		
		logger=extent.createTest(tr.getName());  //create new entry in the report
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));//send the passed information
		try {
			if(tr.getStatus()==ITestResult.SUCCESS) {
				String temp= CaptureScreenshot();
				logger.pass(MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.log(Status.INFO, "<a href="+videoFolder+videoFile+".mov"+"><span class='label.info'>Download Video</span></a>");
	
	}
	
	public void onTestFailure(ITestResult tr) {
		logger=extent.createTest(tr.getName());  //create new entry in the report
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED)); //send the Failed information
		
		try {
			if(tr.getStatus()==ITestResult.FAILURE) {
				String temp= CaptureScreenshot();
			logger.fail(tr.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.log(Status.INFO, "<a href="+videoFolder+videoFile+".mov"+"><span class='label.info'>Download Video</span></a>");
	
 }
	
	
	public void onTestSkipped(ITestResult tr) {
		logger=extent.createTest(tr.getName());  
		logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));  //send the passed information
		logger.log(Status.INFO, "<a href="+videoFolder+videoFile+".mov"+"><span class='label.info'>Download Video</span></a>");

	}
	
	@AfterTest
	public void onFinish(ITestContext testContext) {
		extent.flush();
		
	}
	
	

	

	

}
	


