package com.PTMWeb.testcases;


import java.io.IOException;


import org.testng.annotations.Test;

import com.PTMWeb.pages.AlertsPage;
import com.PTMWeb.pages.AnnouncementsPage;
import com.PTMWeb.pages.AppliedForPage;
import com.PTMWeb.pages.DashboardPage;
import com.PTMWeb.pages.FundingIssuesPage;
import com.PTMWeb.pages.HomePage;
import com.PTMWeb.pages.LiabilitiesIssuesPage;
import com.PTMWeb.pages.NSFHoldPage;
import com.PTMWeb.pages.PaymentIssuesPage;
import com.PTMWeb.pages.ProfilePage;
import com.PTMWeb.pages.RecentLiabilitiesPage;
import com.PTMWeb.pages.TaxAgenciesPage;
import com.PTMWeb.pages.TaxPackagesPage;
import com.PTMWeb.pages.UpcomingPaymentspage;

import com.PTMWeb.utilities.Baseclass;
import com.PTMWeb.utilities.Reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TC_AsureTaxPortal extends Baseclass{
	public static ExtentTest test;
	ExtentReports rep;
	
    @Test(description = "User downloads the Liabilities Issues Excel Report by searching with Payroll ID")
	public void TC_01_User_downloads_the_Liabilities_issues_Report_by_searching_with_Payroll_ID() throws InterruptedException, IOException, ATUTestRecorderException{
    	rep=Reports.InitializeReport();
        
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnLiabilitiesIssues();
	LiabilitiesIssuesPage LiabilitiesIssues = new LiabilitiesIssuesPage(driver);
	LiabilitiesIssues.searchwithPayrollID();
	LiabilitiesIssues.clickOnExporttoExcel();
	isFileDownloaded("Liabilities Issues_04150_20221010.xlsx");
	DeleteFile();
	}
   
    @Test(description = "User downloads the Liabilities Issues Excel Report by searching with Check Date")
    public void TC_02_User_downloads_the_Liabilities_issues_Report_by_searching_with_Check_Date() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnLiabilitiesIssues();
		LiabilitiesIssuesPage LiabilitiesIssues = new LiabilitiesIssuesPage(driver);
		LiabilitiesIssues.searchwithCheckDate(LiabilitiesIssues_checkDate);
		LiabilitiesIssues.verifycheckDate();
		LiabilitiesIssues.clickOnExporttoExcel();
		isFileDownloaded("Liabilities Issues_04150_20221010.xlsx");
		DeleteFile();
		
    }
    
    @Test(description = "User downloads the Liabilities Issues Excel Report by searching with Reason")
    public void TC_03_User_downloads_the_Liabilities_issues_Report_by_searching_with_Reason() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnLiabilitiesIssues();
    	LiabilitiesIssuesPage LiabilitiesIssues = new LiabilitiesIssuesPage(driver);
    	LiabilitiesIssues.searchwithReason(LiabilitiesIssues_Reason);
    	LiabilitiesIssues.verifyReason();
    	LiabilitiesIssues.clickOnExporttoExcel();
    	isFileDownloaded("Liabilities Issues_04150_20221010.xlsx");
    	DeleteFile();
	
    }
   
    @Test(description = "User downloads the Payment Issues Excel Report by searching with PayrollID")
    public void TC_04_User_downloads_the_Payment_issues_Report_by_searching_with_Payroll_ID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentsIssues = new PaymentIssuesPage(driver);
    	PaymentsIssues.searchwithPayrollID();
    	PaymentsIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Payment Issues Excel Report by searching with Agency ID")
    public void TC_05_User_downloads_the_Payment_issues_Report_by_searching_with_Agency_ID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentsIssues = new PaymentIssuesPage(driver);
    	PaymentsIssues.searchwithAgencyID();
    	PaymentsIssues.verifyAgencyID();
    	PaymentsIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Payment Issues Excel Report by searching with Description")
    public void TC_06_User_downloads_the_Payment_issues_Report_by_searching_with_Description() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentsIssues = new PaymentIssuesPage(driver);
    	PaymentsIssues.searchwithDescription();
    	PaymentsIssues.verifyDecription();
    	PaymentsIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Payment Issues Excel Report by searching with Due date")
    public void TC_07_User_downloads_the_Payment_issues_Report_by_searching_with_Due_Date() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentsIssues = new PaymentIssuesPage(driver);
    	PaymentsIssues.searchwithDuedate();
    	PaymentsIssues.verifyDueDate();
    	PaymentsIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Payment Issues Excel Report by searching with Amount")
    public void TC_08_User_downloads_the_Payment_issues_Report_by_searching_with_Amount() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentsIssues = new PaymentIssuesPage(driver);
    	PaymentsIssues.searchwithAmount();
    	PaymentsIssues.verifyAmount();
    	PaymentsIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Payment Issues Excel Report by searching with Reason code")
    public void TC_09_User_downloads_the_Payment_issues_Report_by_searching_with_Reason_Code() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentsIssues = new PaymentIssuesPage(driver);
    	PaymentsIssues.searchwithReasoncode();
    	PaymentsIssues.verifyReasoncode();
    	PaymentsIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the NSF Hold Excel Report by searching with PayrollID")
    public void TC_10_User_downloads_the_NSF_Hold_Report_by_searching_with_Payroll_ID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnNSFhold();
    	NSFHoldPage NSFHold = new NSFHoldPage(driver);
    	NSFHold.searchwithPayrollID();
    	NSFHold.clickOnExporttoExcel();
    	isFileDownloaded("NSF Hold_04150_20221010.xlsx");
    	DeleteFile();
    }
  
     @Test(description = "User downloads the NSF Hold Excel Report by searching with AgencyID")
    public void TC_11_User_downloads_the_NSF_Hold_Report_by_searching_with_Agency_ID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnNSFhold();
    	NSFHoldPage NSFHold = new NSFHoldPage(driver);
    	NSFHold.searchwithAgencyID();
    	NSFHold.verifyAgencyID();
    	NSFHold.clickOnExporttoExcel();
    	isFileDownloaded("NSF Hold_04150_20221010.xlsx");
    	DeleteFile();
    }
   
   @Test(description = "User downloads the NSF Hold Excel Report by searching with Description")
    public void TC_12_User_downloads_the_NSF_Hold_Report_by_searching_with_Description() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnNSFhold();
    	NSFHoldPage NSFHold = new NSFHoldPage(driver);
    	NSFHold.searchwithDescription();
    	NSFHold.verifyDescription();
    	NSFHold.clickOnExporttoExcel();
    	isFileDownloaded("NSF Hold_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the NSF Hold Excel Report by searching with Amount")
    public void TC_13_User_downloads_the_NSF_Hold_Report_by_searching_with_Amount() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnNSFhold();
    	NSFHoldPage NSFHold = new NSFHoldPage(driver);
    	NSFHold.clearSearch();
    	NSFHold.searchwithAmount();
    	NSFHold.verifyAmount();
    	NSFHold.clickOnExporttoExcel();
    	isFileDownloaded("NSF Hold_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Applied For Excel Report by searching with Payroll ID")
    public void TC_14_User_downloads_the_Applied_For_Report_by_searching_with_PayrollID() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnAppliedFor();
    	AppliedForPage AppliedFor=new AppliedForPage(driver);
    	AppliedFor.searchwithPayrollID();
    	AppliedFor.clickOnExporttoExcel();
    	isFileDownloaded("Applied For_04150_20221010.xlsx");
    	DeleteFile();
    }
   
    @Test(description = "User downloads the Applied For Excel Report by searching with Agency ID")
    public void TC_15_User_downloads_the_Applied_For_Report_by_searching_with_AgencyID() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnAppliedFor();
    	AppliedForPage AppliedFor=new AppliedForPage(driver);
    	AppliedFor.searchwithAgencyID();
    	AppliedFor.verifyAgencyID();
    	AppliedFor.clickOnExporttoExcel();
    	isFileDownloaded("Applied For_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Applied For Excel Report by searching with Description")
    public void TC_16_User_downloads_the_Applied_For_Report_by_searching_with_Description() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnAppliedFor();
    	AppliedForPage AppliedFor=new AppliedForPage(driver);
    	AppliedFor.searchwithDescription();
    	AppliedFor.verifyDecription();
    	AppliedFor.clickOnExporttoExcel();
    	isFileDownloaded("Applied For_04150_20221010.xlsx");
    	DeleteFile();
    	
    }
    
    @Test(description = "User downloads the Applied For Excel Report by searching with CheckDate")
    public void TC_17_User_downloads_the_Applied_For_Report_by_searching_with_Check_Date() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnAppliedFor();
    	AppliedForPage AppliedFor=new AppliedForPage(driver);
    	AppliedFor.searchwithCheckdate();
    	AppliedFor.verifyCheckDate();
    	AppliedFor.clickOnExporttoExcel();
    	isFileDownloaded("Applied For_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Applied For Excel Report by searching with Amount")
    public void TC_18_User_downloads_the_Applied_For_Report_by_searching_with_Amount() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnAppliedFor();
    	AppliedForPage AppliedFor=new AppliedForPage(driver);
    	AppliedFor.searchwithAmount();
    	AppliedFor.verifyAmount();
    	AppliedFor.clickOnExporttoExcel();
    	isFileDownloaded("Applied For_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Applied For Excel Report by searching with Duedate")
    public void TC_19_User_downloads_the_Applied_For_Report_by_searching_with_Due_date() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnAppliedFor();
    	AppliedForPage AppliedFor=new AppliedForPage(driver);
    	AppliedFor.searchwithDuedate();
    	AppliedFor.verifyDueDate();
    	AppliedFor.clickOnExporttoExcel();
    	isFileDownloaded("Applied For_04150_20221010.xlsx");
    	DeleteFile();	
    }
    
    @Test(description = "User downloads the Alerts Excel Report by searching with Active From Date")
    public void TC_20_User_downloads_the_Alerts_Report_by_searching_with_Active_From_Date() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnAlerts();
    	AlertsPage Alerts = new AlertsPage(driver);
    	Alerts.searchwithActivateFromdate();
    	Alerts.verifyActiveFromDate();
    	Alerts.clickOnExporttoExcel();
    	isFileDownloaded("Alerts_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Alerts Excel Report by searching with Alert Name")
    public void TC_21_User_downloads_the_Alerts_Report_by_searching_with_Alert_Name() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnAlerts();
    	AlertsPage Alerts = new AlertsPage(driver);
    	Alerts.searchwithAlertName();
    	Alerts.verifyAlertName();
    	Alerts.clickOnExporttoExcel();
    	isFileDownloaded("Alerts_04150_20221010.xlsx");
    	DeleteFile();	
    }
    
    @Test(description = "User downloads the Alerts Excel Report by searching with Alert Text")
    public void TC_22_User_downloads_the_Alerts_Report_by_searching_with_Alert_Text() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnAlerts();
    	AlertsPage Alerts = new AlertsPage(driver);
    	Alerts.searchwithAlertText();
    	Alerts.verifyAlertText();
    	Alerts.clickOnExporttoExcel();
    	isFileDownloaded("Alerts_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Recent Liabilitis Excel Report by searching with Payroll ID")
    public void TC_23_User_downloads_the_Recent_Liabilities_by_searching_with_Payroll_ID() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	RecentLiabilitiesPage RecentLiabilities= new RecentLiabilitiesPage(driver);
    	RecentLiabilities.searchwithPayrollID();
    	RecentLiabilities.clickOnExporttoExcel();
    	isFileDownloaded("RecentLiabilities_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Recent Liabilitis Excel Report by searching with Check Date")
    public void TC_24_User_downloads_the_Recent_Liabilities_by_searching_with_Check_Date() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	RecentLiabilitiesPage RecentLiabilities= new RecentLiabilitiesPage(driver);
    	RecentLiabilities.searchwithCheckDate(RecentLiabilities_checkDate);
    	RecentLiabilities.verifycheckDate();
    	RecentLiabilities.clickOnExporttoExcel();
    	isFileDownloaded("RecentLiabilities_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Recent Liabilitis Excel Report by searching with Entry Date")
    public void TC_25_User_downloads_the_Recent_Liabilities_by_searching_with_Entry_Date() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	RecentLiabilitiesPage RecentLiabilities= new RecentLiabilitiesPage(driver);
    	RecentLiabilities.searchwithEntryDate(RecentLiabilities_EntryDate);
    	RecentLiabilities.verifyEntryDate();
    	RecentLiabilities.clickOnExporttoExcel();
    	isFileDownloaded("RecentLiabilities_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Recent Liabilitis Excel Report by searching with Amount")
    public void TC_26_User_downloads_the_Recent_Liabilities_by_searching_with_Amount() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	RecentLiabilitiesPage RecentLiabilities= new RecentLiabilitiesPage(driver);
    	RecentLiabilities.searchwithAmount(RecentLiabilities_Amount);
    	RecentLiabilities.verifyAmount();
    	RecentLiabilities.clickOnExporttoExcel();
    	isFileDownloaded("RecentLiabilities_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User downloads the Recent Liabilitis Excel Report by searching with Status")
    public void TC_27_User_downloads_the_Recent_Liabilities_by_searching_with_Status() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	RecentLiabilitiesPage RecentLiabilities= new RecentLiabilitiesPage(driver);
    	RecentLiabilities.searchwithStatus(RecentLiabilities_Status);
    	RecentLiabilities.verifyStatus();
    	RecentLiabilities.clickOnExporttoExcel();
    	isFileDownloaded("RecentLiabilities_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "User Validates the Description in Recent Liabilities table")
    public void TC_28_Validating_the_Description_in_Recent_Liabilities() throws InterruptedException, ATUTestRecorderException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	RecentLiabilitiesPage RecentLiabilities= new RecentLiabilitiesPage(driver);
    	RecentLiabilities.searchwithStatus(RecentLiabilities_Status);
    	RecentLiabilities.clickOnRecentLiabilities();
    	RecentLiabilities.ValidateDescrptioninRL();
    	RecentLiabilities.clickOnExporttoExcel1();
    	isFileDownloaded("RecentLiabilities_587483_08_19_22_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate NSF Hold card color is Red if NSF Hold status is Yes or NSF card colour is green if the NSF Hold status is No in company details")
    public void TC_29_Validate_NSF_Hold_Card_colour_is_Red_if_the_status_of_NSF_Hold_is_Yes_Or_Card_colour_should_be_Green_if_the_status_of_NSF_Hold_is_No_in_company_details() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	ProfilePage Profile = new ProfilePage(driver);
    	Profile.ValidateDoughNutsNSFHold();
    	Home.clickOnDashboard();
    	dashboard.ValidateNSFCardcolour();
    }
    
    @Test(description = "User Validates the Tax Packages by selecting quarter and year")
    public void TC_30_Validate_User_can_view_the_Tax_Packages_by_selecting_quarter_and_year() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnTaxPackages();
    	TaxPackagesPage TaxPackages=new TaxPackagesPage(driver);
    	TaxPackages.selectQuarter();
    	TaxPackages.selectYear();
    	TaxPackages.ValidateQePkg();
    	TaxPackages.ValidateRtnPkg();
    }
    
    @Test(description = "User downloads the Tax Packages by selecting quarter and year")
    public void TC_31_Validate_User_can_download_the_Tax_Packages_by_selecting_quarter_and_year() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnTaxPackages();
    	TaxPackagesPage TaxPackages=new TaxPackagesPage(driver);
    	TaxPackages.selectQuarter();
    	TaxPackages.selectYear();
    	TaxPackages.ValidateQePkg();
    	TaxPackages.ValidateRtnPkg();
    	TaxPackages.clickOnqepkgDownload();
    	RecentLiabilitiesPage RecentLiabilities = new RecentLiabilitiesPage(driver);
    	
    }
    
    @Test(description = "Validate user can view the company details for DOUGH NUTS INC Client")
    public void TC_32_Validate_user_can_view_the_company_details_by_selecting_DOUGH_NUTS_INC() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	ProfilePage Profile = new ProfilePage(driver);
    	Profile.ValidateDoughNutsLegalName();
    	Profile.ValidateDoughNutsDBA();
    	Profile.ValidateDoughNutsAddress();
    	Profile.ValidateDoughNutsFEIN();
    	Profile.ValidateDoughNutsClientID();
    	Profile.ValidateDoughNutsPayrollID();
    	Profile.ValidateDoughNutsNSFHold();
    }
    
    @Test(description = "Validate user can view the contact details for DOUGH NUTS INC Client")
    public void TC_33_Validate_user_can_view_the_contact_by_selecting_DOUGH_NUTS_INC() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	ProfilePage Profile = new ProfilePage(driver);
    	Profile.ValidateDoughNutsContact();
    	Profile.ValidateDoughNutsPhone();
    	Profile.ValidateDoughNutsFax();
    	Profile.ValidateDoughNutsEmail();
    }
    
    @Test(description = "Validate user can view the Tax Agency details for DOUGH NUTS INC Client by searching with Agency ID")
    public void TC_34_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Agency_ID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.searchwithAgencyID();
    	TaxAgencies.clickOnAgencyID_FUTA();
    	TaxAgencies.ValidateDoughNutsAgencyID_FUTA();
    	TaxAgencies.ValidateDoughNutsDescription_FUTA();
    	TaxAgencies.ValidateDoughNutsMainAgencyID_FUTA();
    	TaxAgencies.ValidateDoughNutsPayee_FUTA();
    	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
    	TaxAgencies.ValidateDoughNutsStatus_Active();
    	TaxAgencies.ValidateDoughNutsAuthority_Federal();
    	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
    	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
    	TaxAgencies.ValidateDoughNutsTaxRate_06();
    	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
    	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_Yes();
    	TaxAgencies.CloseAgency();
    }
    
    @Test(description = "Validate user can view the Tax Agency details for DOUGH NUTS INC Client by searching with Description")
    public void TC_35_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Description() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.searchwithDescription();
    	TaxAgencies.clickOnAgencyID_IRS();
    	TaxAgencies.ValidateDoughNutsAgencyID_IRS();
    	TaxAgencies.ValidateDoughNutsDescription_IRS();
    	TaxAgencies.ValidateDoughNutsMainAgencyID_IRS();
    	TaxAgencies.ValidateDoughNutsPayee_IRS();
    	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
    	TaxAgencies.ValidateDoughNutsStatus_Active();
    	TaxAgencies.ValidateDoughNutsAuthority_Federal();
    	TaxAgencies.ValidateDoughNutsFrequencyType_FEDSWQREC();
    	TaxAgencies.ValidateDoughNutsFrequency_SemiWeekly();
    	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
    	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
    	TaxAgencies.CloseAgency();
    }
    
    @Test(description = "Validate user can view the Tax Agency details for DOUGH NUTS INC Client by searching with Main Agency ID")
    public void TC_36_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Main_Agency_ID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.searchwithMainAgencyID();
    	TaxAgencies.clickOnAgencyID_AZSUI();
    	TaxAgencies.ValidateDoughNutsAgencyID_AZASSESS();
    	TaxAgencies.ValidateDoughNutsDescription_AZJobTrainingTax();
    	TaxAgencies.ValidateDoughNutsMainAgencyID_AZSUI();
    	TaxAgencies.ValidateDoughNutsPayee_AZSUIASSESMENT();
    	TaxAgencies.ValidateDoughNutsClientTaxID_12121211();
    	TaxAgencies.ValidateDoughNutsStatus_Active();
    	TaxAgencies.ValidateDoughNutsAuthority_State();
    	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
    	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
    	TaxAgencies.ValidateDoughNutsTaxRate_0();
    	TaxAgencies.ValidateDoughNutsQEFiling_Paper();
    	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_Yes();
    	TaxAgencies.CloseAgency();
    }
    
    @Test(description = "Validate user can view the Tax Agency details for DOUGH NUTS INC Client by searching with Client Tax ID")
    public void TC_37_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Client_Tax_ID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.searchwithClientTaxID();
    	TaxAgencies.clickOnAgencyID_IRS();
    	TaxAgencies.ValidateDoughNutsAgencyID_IRS();
    	TaxAgencies.ValidateDoughNutsDescription_IRS();
    	TaxAgencies.ValidateDoughNutsMainAgencyID_IRS();
    	TaxAgencies.ValidateDoughNutsPayee_IRS();
    	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
    	TaxAgencies.ValidateDoughNutsStatus_Active();
    	TaxAgencies.ValidateDoughNutsAuthority_Federal();
    	TaxAgencies.ValidateDoughNutsFrequencyType_FEDSWQREC();
    	TaxAgencies.ValidateDoughNutsFrequency_SemiWeekly();
    	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
    	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
    	TaxAgencies.CloseAgency();
    }
    
    @Test(description = "Validate user can view the Tax Agency details for DOUGH NUTS INC Client by searching with Frequency Type")
    public void TC_38_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Frequency_Type() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.searchwithFrequencyType();
    	TaxAgencies.clickOnFrequencyType_COWEEK3DAY();
    	TaxAgencies.ValidateDoughNutsAgencyID_COSW();
    	TaxAgencies.ValidateDoughNutsDescription_COSTATEWITHHOLDING();
    	TaxAgencies.ValidateDoughNutsMainAgencyID_COSW();
    	TaxAgencies.ValidateDoughNutsPayee_ColoradoDepartmentofRevenue();
    	TaxAgencies.ValidateDoughNutsClientTaxID_12121212();
    	TaxAgencies.ValidateDoughNutsPiNo_3717752271();
    	TaxAgencies.ValidateDoughNutsStatus_Active();
    	TaxAgencies.ValidateDoughNutsAuthority_State();
    	TaxAgencies.ValidateDoughNutsFrequencyType_COWEEK3DAY();
    	TaxAgencies.ValidateDoughNutsFrequency_Weekly();
    	TaxAgencies.ValidateDoughNutsQEFiling_Paper();
    	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_Yes();
    	TaxAgencies.CloseAgency();
    }
    
    @Test(description = "Validate user can view the Tax Agency details for DOUGH NUTS INC Client by searching with Frequency")
    public void TC_39_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Frequency() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.searchwithFrequency();
    	TaxAgencies.clickOnAgencyID_AZSW();;
    	TaxAgencies.ValidateDoughNutsAgencyID_AZSW();
    	TaxAgencies.ValidateDoughNutsDescription_AZSTATEWITHHOLDING();
    	TaxAgencies.ValidateDoughNutsMainAgencyID_AZSW();
    	TaxAgencies.ValidateDoughNutsPayee_ARIZONADEPARTMENTOFREVENUE();
    	TaxAgencies.ValidateDoughNutsClientTaxID_121212121();
    	TaxAgencies.ValidateDoughNutsStatus_Active();
    	TaxAgencies.ValidateDoughNutsAuthority_State();
    	TaxAgencies.ValidateDoughNutsFrequencyType_FEDSWQREC();
    	TaxAgencies.ValidateDoughNutsFrequency_SemiWeekly();
    	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
    	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
    	TaxAgencies.CloseAgency();
    }
    
    @Test(description = "Validate user can view the Tax Agency details for DOUGH NUTS INC Client by searching with Tax Rsate")
    public void TC_40_Validate_User_can_view_the_Tax_Agencies_by_searching_with_TaxRate() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.searchwithTaxRate();
    	TaxAgencies.clickOnAgencyID_TXSUI();
    	TaxAgencies.ValidateDoughNutsAgencyID_TXSUI();
    	TaxAgencies.ValidateDoughNutsDescription_TXSUI();
    	TaxAgencies.ValidateDoughNutsMainAgencyID_TXSUI();
    	TaxAgencies.ValidateDoughNutsPayee_TXWORKFORCECOMMISSION();
    	TaxAgencies.ValidateDoughNutsClientTaxID_Applied();
    	TaxAgencies.ValidateDoughNutsStatus_Active();
    	TaxAgencies.ValidateDoughNutsAuthority_State();
    	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
    	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
    	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
    	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
    	TaxAgencies.CloseAgency();
    }
    
    @Test(description = "Validate user can search and download the Announcements Excel File")
    public void TC_41_Validate_User_can_search_and_download_the_Announcements_in_Excel_file() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	HomePage HP=new HomePage(driver);
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	AnnouncementsPage Announcements= new AnnouncementsPage(driver);
    	Announcements.clickOnViewAll();
    	Announcements.searchwithAnnouncementName();
    	Announcements.clickOnExporttoExcel();
    	isFileDownloaded("Announcements_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can search and download the Announcements Pdf File")
    public void TC_42_Validate_User_can_search_and_download_the_Announcements_in_Pdf_file() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	HomePage HP=new HomePage(driver);
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	AnnouncementsPage Announcements= new AnnouncementsPage(driver);
    	Announcements.clickOnViewAll();
    	Announcements.searchwithAnnouncementName();
    	Announcements.clickOnExporttoPdf();
    	isFileDownloaded("Announcements_20221010.pdf");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the upcoming payments record by searching with Due date")
    public void TC_43_Validate_User_can_view_the_Upcoming_Payments_record_by_searching_with_Due_date() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	UpcomingPaymentspage UpcomingPayments = new UpcomingPaymentspage(driver);
    	UpcomingPayments.searchwithDuedate();
    	UpcomingPayments.verifyDuedate();
    	UpcomingPayments.clickOnExporttoExcel();
    	isFileDownloaded("UpcomingPayments_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the upcoming payments record by searching with Amount")
    public void TC_44_Validate_User_can_view_the_Upcoming_Payments_record_by_searching_with_Amount() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	UpcomingPaymentspage UpcomingPayments = new UpcomingPaymentspage(driver);
    	UpcomingPayments.searchwithAmount();
    	UpcomingPayments.verifyAmount();
    	UpcomingPayments.clickOnExporttoExcel();
    	isFileDownloaded("UpcomingPayments_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the upcoming payments record by searching with count")
    public void TC_45_Validate_User_can_view_the_Upcoming_Payments_record_by_searching_with_Count() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	UpcomingPaymentspage UpcomingPayments = new UpcomingPaymentspage(driver);
    	UpcomingPayments.searchwithCount();
    	UpcomingPayments.verifyCount();
    	UpcomingPayments.clickOnExporttoExcel();
    	isFileDownloaded("UpcomingPayments_04150_20221010.xlsx");
    	DeleteFile();
    }

    @Test(description = "Validate user can view the upcoming payments record by searching with Payroll ID")
    public void TC_46_Validate_User_can_view_the_Upcoming_Payments_record_by_searching_with_PayrollID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	UpcomingPaymentspage UpcomingPayments = new UpcomingPaymentspage(driver);
    	UpcomingPayments.clickOnAmount96983();
    	UpcomingPayments.searchwithPayrollID();
    	UpcomingPayments.clickOnExporttoExcel1();
    	isFileDownloaded("UpcomingPayments_04150_10_31_22_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the upcoming payments record by searching with Agency ID")
    public void TC_47_Validate_User_can_view_the_Upcoming_Payments_record_by_searching_with_AgencyID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	UpcomingPaymentspage UpcomingPayments = new UpcomingPaymentspage(driver);
    	UpcomingPayments.clickOnAmount96983();
    	UpcomingPayments.searchwithAgencyID();
    	UpcomingPayments.verifyAgencyID();
    	UpcomingPayments.clickOnExporttoExcel1();
    	isFileDownloaded("UpcomingPaymen20221010_10_31_22_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the upcoming payments record by searching with Description")
    public void TC_48_Validate_User_can_view_the_Upcoming_Payments_record_by_searching_with_Description() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	UpcomingPaymentspage UpcomingPayments = new UpcomingPaymentspage(driver);
    	UpcomingPayments.clickOnAmount96983();
    	UpcomingPayments.searchwithDescription();
    	UpcomingPayments.verifyDescription();
    	UpcomingPayments.clickOnExporttoExcel1();
    	isFileDownloaded("UpcomingPayments_04150_10_31_22_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the upcoming payments record by searching with Duedate1")
    public void TC_49_Validate_User_can_view_the_Upcoming_Payments_record_by_searching_with_Duedate1() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	UpcomingPaymentspage UpcomingPayments = new UpcomingPaymentspage(driver);
    	UpcomingPayments.clickOnAmount96983();
    	UpcomingPayments.searchwithDuedate1();
    	UpcomingPayments.verifyDuedate1();
    	UpcomingPayments.clickOnExporttoExcel1();
    	isFileDownloaded("UpcomingPayments_04150_10_31_22_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the upcoming payments record by searching with Amount")
    public void TC_50_Validate_User_can_view_the_Upcoming_Payments_record_by_searching_with_Amount() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	UpcomingPaymentspage UpcomingPayments = new UpcomingPaymentspage(driver);
    	UpcomingPayments.clickOnAmount96983();
    	UpcomingPayments.searchwithAmount1();
    	UpcomingPayments.verifyAmount1();
    	UpcomingPayments.clickOnExporttoExcel1();
    	isFileDownloaded("UpcomingPayments_04150_10_31_22_20221010.xlsx");
    	DeleteFile();
    	
    }
    
    @Test(description = "Validate user can view the Funding Isses records by searching with PayrollID")
    public void TC_51_Validate_User_can_view_the_Funding_Issues_by_searching_with_PayrollID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnFundingIssues();
    	FundingIssuesPage FundingIssues = new FundingIssuesPage(driver);
    	FundingIssues.searchwithPayrollID();
    	FundingIssues.clickOnExporttoExcel();
    	isFileDownloaded("Funding Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the Funding Isses records by searching with Amount")
    public void TC_52_Validate_User_can_view_the_Funding_Issues_by_searching_with_Amount() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnFundingIssues();
    	FundingIssuesPage FundingIssues = new FundingIssuesPage(driver);
    	FundingIssues.searchwithAmount();
    	FundingIssues.verifyAmount();
    	FundingIssues.clickOnExporttoExcel();
    	isFileDownloaded("Funding Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the Funding Isses records by searching with Funding Date")
    public void TC_53_Validate_User_can_view_the_Funding_Issues_by_searching_with_FundingDate() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnFundingIssues();
    	FundingIssuesPage FundingIssues = new FundingIssuesPage(driver);
    	FundingIssues.searchwithFundingDate();
    	FundingIssues.verifyFundingDueDate();
    	FundingIssues.clickOnExporttoExcel();
    	isFileDownloaded("Funding Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the Funding Issues records by searching with Reason")
    public void TC_54_Validate_User_can_view_the_Funding_Issues_by_searching_with_Reason() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.clickOnFundingIssues();
    	FundingIssuesPage FundingIssues = new FundingIssuesPage(driver);
    	FundingIssues.searchwithReason();
    	FundingIssues.verifyReason();
    	FundingIssues.clickOnExporttoExcel();
    	isFileDownloaded("Funding Issues_04150_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the Recent Liabilities Tax records by searching with Description")
    public void TC_55_Validate_User_can_view_the_Recent_Liabilities_Tax_records_by_searching_with_Description() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	RecentLiabilitiesPage RecentLiabilities = new RecentLiabilitiesPage(driver);
    	RecentLiabilities.searchwithPayrollID();
    	RecentLiabilities.clickOnRecentLiabilities();
    	RecentLiabilities.searchwithDescription();
    	RecentLiabilities.verifyDescription();
    	RecentLiabilities.clickOnExporttoExcel1();
    	isFileDownloaded("RecentLiabilities_587483_08_19_22_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view the Recent Liabilities Tax records by searching with Amount")
    public void TC_56_Validate_User_can_view_the_Recent_Liabilities_Tax_records_by_searching_with_Amount() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	RecentLiabilitiesPage RecentLiabilities = new RecentLiabilitiesPage(driver);
    	RecentLiabilities.searchwithPayrollID();
    	RecentLiabilities.clickOnRecentLiabilities();
    	RecentLiabilities.searchwithAmount1();
    	RecentLiabilities.verifyAmount1();
    	RecentLiabilities.clickOnExporttoExcel1();
    	isFileDownloaded("RecentLiabilities_587483_08_19_22_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view NSF Hold card color as Red and able to view NSF Hold records are displayed in the table")
    public void TC_57_Validate_User_can_view_the_NSF_Hold_Card_color_as_Red_if_NSF_Hold_records_are_displayed_in_the_table() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	dashboard.ValidateNSFCardcolour();
    	dashboard.clickOnNSFhold();
    	NSFHoldPage NSFHold = new NSFHoldPage(driver);
    	NSFHold.verifyNSFHoldrecords();
    	NSFHold.clickOnNSFClose();
    }
    
    @Test(description = "Validate user can search and download the Payment issues Excel File by searching with Payroll ID")
    public void TC_BHBAKERY_58_User_downloads_the_Payment_issues_Report_by_searching_with_Payroll_ID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
    	PaymentIssues.searchwithPayrollID_BHBAKERY();
    	PaymentIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_06500_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can search and download the Payment issues Excel File by searching with AgencyID")
    public void TC_BHBAKERY_59_User_downloads_the_Payment_issues_Report_by_searching_with_Agency_ID() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
    	PaymentIssues.searchwithAgencyID_BHBAKERY();
    	PaymentIssues.verifyAgencyID_BHBAKERY();
    	PaymentIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_06500_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can search and download the Payment issues Excel File by searching with Description")
    public void TC_BHBAKERY_60_User_downloads_the_Payment_issues_Report_by_searching_with_Description() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
    	PaymentIssues.searchwithDescription_BHBAKERY();
    	PaymentIssues.verifyDecription_BHBAKERY();
    	PaymentIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_06500_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can search and download the Payment issues Excel File by searching with Duedate")
    public void TC_BHBAKERY_61_User_downloads_the_Payment_issues_Report_by_searching_with_Duedate() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
    	PaymentIssues.clearSearch();
    	PaymentIssues.searchwithDuedate_BHBAKERY();
    	PaymentIssues.verifyDueDate_BHBAKERY();
    	PaymentIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_06500_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can search and download the Payment issues Excel File by searching with Amount")
    public void TC_BHBAKERY_62_User_downloads_the_Payment_issues_Report_by_searching_with_Amount() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
    	PaymentIssues.searchwithAmount_BHBAKERY();
    	PaymentIssues.verifyAmount_BHBAKERY();
    	PaymentIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_06500_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can search and download the Payment issues Excel File by searching with Reason code")
    public void TC_BHBAKERY_63_User_downloads_the_Payment_issues_Report_by_searching_with_Reason_code() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	dashboard.clickOnPaymentsIssues();
    	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
    	PaymentIssues.searchwithReasoncode_BHBAKERY();
    	PaymentIssues.verifyReasoncode_BHBAKERY();
    	PaymentIssues.clickOnExporttoExcel();
    	isFileDownloaded("Payments Issues_06500_20221010.xlsx");
    	DeleteFile();
    }
    
    @Test(description = "Validate user can view NSF Hold card colour is Red if NSF Hold status is Yes or the NSF card color should be Green if the status of NSF Hold is No in Company Details")
    public void TC_64_BHBAKERY_Validate_NSF_Hold_Card_colour_is_Red_if_the_status_of_NSF_Hold_is_Yes_Or_Card_colour_should_be_Green_if_the_status_of_NSF_Hold_is_No_in_company_details() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	ProfilePage Profile = new ProfilePage(driver);
    	Profile.ValidateBHBAKERYNSFHold();
    	Home.clickOnDashboard();
    	dashboard.ValidateNSFCardcolour_BHBAKERY();
    }
    
    @Test(description = "Validate user can view the Tax Packages by selecting quarter and year")
    public void TC_65_Validate_User_can_view_the_Tax_Packages_by_selecting_quarter_and_year() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnTaxPackages();
    	TaxPackagesPage TaxPackages=new TaxPackagesPage(driver);
    	TaxPackages.selectQuarter();
    	TaxPackages.selectYear();
    	TaxPackages.ValidateNorecords();
    }
    
    @Test(description = "Validate user can view the company details for BH BAKERY INC")
    public void TC_66_BHBakery_Validate_user_can_view_the_company_details_by_selecting_BH_BAKERY_INC() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	ProfilePage Profile = new ProfilePage(driver);
    	Profile.ValidateBHBakeryLegalName();
    	Profile.ValidatebHBakeryDBA();
    	Profile.ValidateBHBakeryAddress();
    	Profile.ValidateBHBakeryFEIN();
    	Profile.ValidateBHBakeryClientID();
//    	Profile.ValidateBHBakeryPayrollID();
    	Profile.ValidateBHBAKERYNSFHold();
    }
    
    @Test(description = "Validate user can view the contact details for BH BAKERY INC")
    public void TC_67_BHBakery_Validate_user_can_view_the_contact_by_selecting_BH_BAKERY_INC() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectBHBakryInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	ProfilePage Profile = new ProfilePage(driver);
    	Profile.ValidateBHBakeryContact();
    	Profile.ValidateBHBakeryPhone();
    	Profile.ValidateBHBakeryFax();
    	Profile.ValidateBHBakeryEmail();
    }
    
    @Test(description = "Validate user can view the Tax Agencies by searching with Agency ID")
  public void TC_68_BH_BAKERY_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Agency_ID() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectBHBakryInc();
	HomePage Home=new HomePage(driver);
	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithAgencyID();
  	TaxAgencies.clickOnAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsDescription_FUTA();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsPayee_FUTA();
  	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_Federal();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
  	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
  	TaxAgencies.ValidateDoughNutsTaxRate_06();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_Yes();
  	TaxAgencies.CloseAgency();
  }
    
    @Test(description = "Validate user can view the Tax Agencies by searching with Description")
  public void TC_69_BH_BAKERY_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Description() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectBHBakryInc();
	HomePage Home=new HomePage(driver);
	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithDescription();
  	TaxAgencies.clickOnAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsDescription_IRS();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsPayee_IRS();
  	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_Federal();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDSWQREC();
  	TaxAgencies.ValidateDoughNutsFrequency_SemiWeekly();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax Agencies by searching with Main Agency ID")
  public void TC_70_BH_BAKERY_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Main_Agency_ID() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectBHBakryInc();
	HomePage Home=new HomePage(driver);
	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.clearSearch();
  	TaxAgencies.searchwithMainAgencyID();
  	TaxAgencies.clickOnAgencyID_AZSUI1();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_AZSUI();
  	TaxAgencies.ValidateBHBAKERYDescription_AZSUI();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_AZSUI();
  	TaxAgencies.ValidateBHBAKERY_ARIZONADEPARTMENTOFECONOMICSECURITY();
  	TaxAgencies.ValidateDoughNutsClientTaxID_12121211();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_State();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
  	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
  	TaxAgencies.ValidateBHBAKERYTaxRate_008();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_Yes();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax Agencies by searching with Client Tax ID")
  public void TC_71_BH_BAKERY_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Client_Tax_ID() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectBHBakryInc();
	HomePage Home=new HomePage(driver);
	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithClientTaxID();
  	TaxAgencies.clickOnAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsDescription_FUTA();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsPayee_FUTA();
  	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_Federal();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
  	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
  	TaxAgencies.ValidateDoughNutsTaxRate_06();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_Yes();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax Agencies by searching with Frequency Type")
  public void TC_72_BH_BAKERY_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Frequency_Type() throws InterruptedException {
  	rep=Reports.InitializeReport();
	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectBHBakryInc();
	HomePage Home=new HomePage(driver);
	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.clearSearch();
  	TaxAgencies.searchwithFrequencyType_FEDSWQREC();
  	TaxAgencies.clickOnAgencyID_AZSW();
  	TaxAgencies.ValidateDoughNutsAgencyID_AZSW();
  	TaxAgencies.ValidateDoughNutsDescription_AZSTATEWITHHOLDING();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_AZSW();
  	TaxAgencies.ValidateDoughNutsPayee_ARIZONADEPARTMENTOFREVENUE();
  	TaxAgencies.ValidateDoughNutsClientTaxID_121212121();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_State();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDSWQREC();
  	TaxAgencies.ValidateDoughNutsFrequency_SemiWeekly();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax Agencies by searching with Frequency")
  public void TC_73_BH_BAKERY_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Frequency() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectBHBakryInc();
	HomePage Home=new HomePage(driver);
	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.clearSearch();
  	TaxAgencies.searchwithFrequency();
  	TaxAgencies.clickOnAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsDescription_IRS();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsPayee_IRS();
  	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_Federal();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDSWQREC();
  	TaxAgencies.ValidateDoughNutsFrequency_SemiWeekly();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax Agencies by searching with Tax Rate")
  public void TC_74_BH_BAKERY_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Tax_Rate() throws InterruptedException {
  	rep=Reports.InitializeReport();
	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectBHBakryInc();
	HomePage Home=new HomePage(driver);
	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithTaxRate02();
  	TaxAgencies.clickOnAgencyID_TXREPLEN();
  	TaxAgencies.ValidateBHBAKERYAgencyID_TXREPLEN();
  	TaxAgencies.ValidateBHBAKERYDescription_TXREPLENISHMENTTAX();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_TXSUI();
  	TaxAgencies.ValidateBHBAKERYPayee_TXREPLENISHMENTTAX();
  	TaxAgencies.ValidateBHBAKERYClientTaxID_122121211();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_State();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
  	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
  	TaxAgencies.ValidateBHBAKERYTaxRate_02();
  	TaxAgencies.ValidateDoughNutsQEFiling_Paper();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can search and download the Payment Issues Excel File by searching with Payroll ID")
public void TC_BHBAKERY_75_TIBERIUM_SYSTEMS_User_downloads_the_Payment_issues_Report_by_searching_with_Payroll_ID() throws InterruptedException {
	rep=Reports.InitializeReport();
	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home = new HomePage(driver);
	Home.clickOnDashboard();
	dashboard.clickOnPaymentsIssues();
	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
	PaymentIssues.searchwithPayrollID_TIBERIUM();
	PaymentIssues.clickOnExporttoExcel();
	isFileDownloaded("Payments Issues_05830_20221010.xlsx");
	DeleteFile();
}
  
    @Test(description = "Validate user can search and download the Payment Issues Excel File by searching with Agency ID")
    public void TC_BHBAKERY_76_TIBERIUM_SYSTEMS_User_downloads_the_Payment_issues_Report_by_searching_with_Agency_ID() throws InterruptedException {
	rep=Reports.InitializeReport();
	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home = new HomePage(driver);
	Home.clickOnDashboard();
	dashboard.clickOnPaymentsIssues();
	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
	PaymentIssues.searchwithAgencyID_TIBERIUM();
	PaymentIssues.verifyAgencyID_TIBERIUM();
	PaymentIssues.clickOnExporttoExcel();
	isFileDownloaded("Payments Issues_05830_20221010.xlsx");
	DeleteFile();
}
  
    @Test(description = "Validate user can search and download the Payment Issues Excel File by searching with Description")
public void TC_BHBAKERY_77_TIBERIUM_SYSTEMS_User_downloads_the_Payment_issues_Report_by_searching_with_Description() throws InterruptedException {
	rep=Reports.InitializeReport();
	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home = new HomePage(driver);
	Home.clickOnDashboard();
	dashboard.clickOnPaymentsIssues();
	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
	PaymentIssues.searchwithDescription_TIBERIUM();
	PaymentIssues.verifyDecription_TIBERIUM();
	PaymentIssues.clickOnExporttoExcel();
	isFileDownloaded("Payments Issues_05830_20221010.xlsx");
	DeleteFile();
}
  
    @Test(description = "Validate user can search and download the Payment Issues Excel File by searching with Due date")
  public void TC_BHBAKERY_78_TIBERIUM_SYSTEMS_User_downloads_the_Payment_issues_Report_by_searching_with_Due_date() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home = new HomePage(driver);
	Home.clickOnDashboard();
	dashboard.clickOnPaymentsIssues();
	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
	PaymentIssues.searchwithDuedate_TIBERIUM();
	PaymentIssues.verifyDueDate_TIBERIUM();
	PaymentIssues.clickOnExporttoExcel();
	isFileDownloaded("Payments Issues_05830_20221010.xlsx");
	DeleteFile();
  }
  
    @Test(description = "Validate user can search and download the Payment Issues Excel File by searching with Amount")
  public void TC_BHBAKERY_79_TIBERIUM_SYSTEMS_User_downloads_the_Payment_issues_Report_by_searching_with_Amount() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home = new HomePage(driver);
	Home.clickOnDashboard();
	dashboard.clickOnPaymentsIssues();
	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
	PaymentIssues.searchwithAmount_TIBERIUM();
	PaymentIssues.verifyAmount_TIBERIUM();
	PaymentIssues.clickOnExporttoExcel();
	isFileDownloaded("Payments Issues_05830_20221010.xlsx");
	DeleteFile();
  }
  
    @Test(description = "Validate user can search and download the Payment Issues Excel File by searching with Reason Code")
  public void TC_BHBAKERY_80_TIBERIUM_SYSTEMS_User_downloads_the_Payment_issues_Report_by_searching_with_Reason_Code() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home = new HomePage(driver);
	Home.clickOnDashboard();
	dashboard.clickOnPaymentsIssues();
	PaymentIssuesPage PaymentIssues = new PaymentIssuesPage(driver);
	PaymentIssues.searchwithReasoncode();
	PaymentIssues.verifyReasoncode();
	PaymentIssues.clickOnExporttoExcel();
	isFileDownloaded("Payments Issues_05830_20221010.xlsx");
	DeleteFile();
  }
  
    @Test(description = "Validate user can view the NSF Card colr as Green if no NSF Hold records are diaplayed in the table")
  public void TC_81_TIBERIUM_SYSTEMS_Validate_User_can_view_the_NSF_Hold_Card_color_as_Green_if_NSF_Hold_records_are_not_displayed_in_the_table() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	dashboard.ValidateNSFCardcolour();
	dashboard.clickOnNSFhold();
  	NSFHoldPage NSFHold = new NSFHoldPage(driver);
  	NSFHold.verifyAmount_0();
  	NSFHold.clickOnNSFClose();
  }
  
    @Test(description = "Validate user can view the Tax Packages by selecting quarter and year")
  public void TC_82_TIBERIUM_SYSTEMS_Validate_User_can_view_the_Tax_Packages_by_selecting_quarter_and_year() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
  	HomePage Home=new HomePage(driver);
  	Home.clickOnTaxPackages();
  	TaxPackagesPage TaxPackages=new TaxPackagesPage(driver);
  	TaxPackages.selectQuarter();
  	TaxPackages.selectYear();
  	TaxPackages.ValidateNorecords();
  }
  
    @Test(description = "Validate user can view the company details for TIBERIUM SYSTEMS client")
  public void TC_83_TIBERIUM_SYSTEMS_Validate_user_can_view_the_company_details_by_selecting_TIBERIUM_SYSTEMS_LLC() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
  	HomePage Home=new HomePage(driver);
  	Home.clickOnProfile();
  	ProfilePage Profile = new ProfilePage(driver);
  	Profile.ValidateTIBERIUMSYSTEMSLegalName();
  	Profile.ValidateTIBERIUMSYSTEMSDBA();
  	Profile.ValidateTIBERIUMSYSTEMSAddress();
  	Profile.ValidateTIBERIUMSYSTEMSFEIN();
  	Profile.ValidateTIBERIUMSYSTEMSClientID();
  	Profile.ValidateTIBERIUMSYSTEMSPayrollID();
  	Profile.ValidateTIBERIUMSYSTEMSNSFHold();
  }
  
    @Test(description = "Validate user can view the contact details for TIBERIUM SYSTEMS client")
  public void TC_84_TIBERIUM_SYSTEMS_Validate_user_can_view_the_contact_by_selecting_TIBERIUM_SYSTEMS_LLC() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
  	HomePage Home=new HomePage(driver);
  	Home.clickOnProfile();
  	ProfilePage Profile = new ProfilePage(driver);
  	Profile.ValidateTIBERIUMSYSTEMSContact();
  	Profile.ValidateTIBERIUMSYSTEMSPhone();
  	Profile.ValidateTIBERIUMSYSTEMSFax();
  	Profile.ValidateTIBERIUMSYSTEMSEmail();
  }
    
    @Test(description = "Validate user can view the Tax agency details by searching with Agency ID")
  public void TC_85_TIBERIUM_SYSTEMS_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Agency_ID() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home=new HomePage(driver);
  	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithAgencyID();
  	TaxAgencies.clickOnAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsDescription_FUTA();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsPayee_FUTA();
  	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_Federal();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
  	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
  	TaxAgencies.ValidateDoughNutsTaxRate_06();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_Yes();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax agency details by searching with Description")
  public void TC_86_TIBERIUM_SYSTEMS_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Description() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home=new HomePage(driver);
  	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithDescription();
  	TaxAgencies.clickOnAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsDescription_IRS();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsPayee_IRS();
  	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_Federal();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDSWQREC();
  	TaxAgencies.ValidateDoughNutsFrequency_SemiWeekly();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax agency details by searching with Main Agency ID")
  public void TC_87_TIBERIUM_SYSTEMS_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Main_Agency_ID() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home=new HomePage(driver);
  	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithMainAgencyID_TIBERIUMSYSTEMS();
  	TaxAgencies.clickOnAgencyID_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSAgencyID_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMDescription_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSMainAgencyID_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSPayee_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSClientTaxID_121212211();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_State();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
  	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSTaxRate_118();
  	TaxAgencies.ValidateDoughNutsQEFiling_Paper();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax agency details by searching with Client Tax ID")
  public void TC_88_TIBERIUM_SYSTEMS_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Client_Tax_ID() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home=new HomePage(driver);
  	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithClientTaxID();
  	TaxAgencies.clickOnAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsDescription_FUTA();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_FUTA();
  	TaxAgencies.ValidateDoughNutsPayee_FUTA();
  	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_Federal();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
  	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
  	TaxAgencies.ValidateDoughNutsTaxRate_06();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_Yes();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax agency details by searching with Frequency Type")
  public void TC_89_TIBERIUM_SYSTEMS_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Frequency_Type() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home=new HomePage(driver);
  	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithFrequencyType();
  	TaxAgencies.clickOnFrequencyType_COWEEK3DAY();
  	TaxAgencies.ValidateDoughNutsAgencyID_COSW();
  	TaxAgencies.ValidateDoughNutsDescription_COSTATEWITHHOLDING();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_COSW();
  	TaxAgencies.ValidateDoughNutsPayee_ColoradoDepartmentofRevenue();
  	TaxAgencies.ValidateDoughNutsClientTaxID_12121212();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSPiNo_3714345313();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_State();
  	TaxAgencies.ValidateDoughNutsFrequencyType_COWEEK3DAY();
  	TaxAgencies.ValidateDoughNutsFrequency_Weekly();
  	TaxAgencies.ValidateDoughNutsQEFiling_Paper();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_Yes();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax agency details by searching with Frequency")
  public void TC_90_TIBERIUM_SYSTEMS_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Frequency() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home=new HomePage(driver);
  	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithFrequency();
  	TaxAgencies.clickOnAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsDescription_IRS();
  	TaxAgencies.ValidateDoughNutsMainAgencyID_IRS();
  	TaxAgencies.ValidateDoughNutsPayee_IRS();
  	TaxAgencies.ValidateDoughNutsClientTaxID_122121212();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_Federal();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDSWQREC();
  	TaxAgencies.ValidateDoughNutsFrequency_SemiWeekly();
  	TaxAgencies.ValidateDoughNutsQEFiling_EFile();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
  	TaxAgencies.CloseAgency();
  }
  
    @Test(description = "Validate user can view the Tax agency details by searching with Tax Rate")
  public void TC_91_TIBERIUM_SYSTEMS_Validate_User_can_view_the_Tax_Agencies_by_searching_with_Tax_Rate() throws InterruptedException {
  	rep=Reports.InitializeReport();
  	DashboardPage dashboard= new DashboardPage(driver);
	dashboard.selectClientList();
	dashboard.selectTiberiumSystemsLLC();
	HomePage Home=new HomePage(driver);
  	Home.clickOnProfile();
  	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
  	TaxAgencies.searchwithTaxRate118();
  	TaxAgencies.clickOnAgencyID_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSAgencyID_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMDescription_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSMainAgencyID_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSPayee_COSUI();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSClientTaxID_121212211();
  	TaxAgencies.ValidateDoughNutsStatus_Active();
  	TaxAgencies.ValidateDoughNutsAuthority_State();
  	TaxAgencies.ValidateDoughNutsFrequencyType_FEDQTR();
  	TaxAgencies.ValidateDoughNutsFrequency_Quarterly();
  	TaxAgencies.ValidateTIBERIUMSYSTEMSTaxRate_118();
  	TaxAgencies.ValidateDoughNutsQEFiling_Paper();
  	TaxAgencies.ValidateDoughNutsAcceptAppliedFor_No();
  	TaxAgencies.CloseAgency();
  }
    
    @Test(description = "Validate User can sort with Inactive Tax Agencies")
    public void TC_92_DOUGH_NUTS_Validate_User_can_sort_with_Inactive_Tax_Agencies() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.clickonStatusDropdown();
    	TaxAgencies.clickonInactiveStatus();
    	TaxAgencies.ValidateinactiveStatus();
    }
    
    @Test(description = "Validate User can sort with Active Tax Agencies")
    public void TC_93_DOUGH_NUTS_Validate_User_can_sort_with_Active_Tax_Agencies() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.clickonStatusDropdown();
    	TaxAgencies.clickonActiveStatus();
    	TaxAgencies.ValidateActiveStatus();
    }
    
    @Test(description = "Validate User can sort with All Tax Agencies")
    public void TC_94_DOUGH_NUTS_Validate_User_can_sort_with_All_Tax_Agencies() throws InterruptedException {
    	rep=Reports.InitializeReport();
    	DashboardPage dashboard= new DashboardPage(driver);
    	dashboard.selectClientList();
    	dashboard.selectDoughNutsInc();
    	HomePage Home=new HomePage(driver);
    	Home.clickOnProfile();
    	TaxAgenciesPage TaxAgencies = new TaxAgenciesPage(driver);
    	TaxAgencies.clickonStatusDropdown();
    	TaxAgencies.clickonAllStatus();
    	TaxAgencies.ValidateAllStatus();
    }
  
}
