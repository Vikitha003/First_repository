package com.PTMWeb.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
     public static Properties Pro;
     
     public ReadConfig() {
    	 File Src=new File("./configurationfiles/config.properties");
    	 try {
			FileInputStream fis=new FileInputStream(Src);
			Pro=new Properties();
			Pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
     }
     
     public String getApplicationURL() {
		
    	 String url=Pro.getProperty("baseURL");
    	 return url;
    	 
     }
     
     public String getUsername() {
 		
    	 String uname=Pro.getProperty("Username");
    	 return uname;
    	 
     }
     
     public String getPassword() {
  		
    	 String pwd=Pro.getProperty("Password");
    	 return pwd;
    	 
     }
     
     public String getChromePath() {
   		
    	 String ChromePath=Pro.getProperty("chromepath");
    	 return ChromePath;
    	 
     }
     
     public String getEdgePath() {
    		
    	 String EdgePath=Pro.getProperty("edgepath");
    	 return EdgePath;
    	 
     }
     
     public String getFirefoxPath() {
    		
    	 String FirefoxPath=Pro.getProperty("firefoxpath");
    	 return FirefoxPath;
    	 
     }
     
     public String getLiabilitiesIssuesWithPayrollIDExcelReportPath() {
 		
    	 String LiabXpath=Pro.getProperty("LiabilitiesIssuesExcelSheetWithPayrollID");
    	 return LiabXpath;
    	 
     }
     
     public String VerifyLI_PayrollIDExcelRecord() {
  		
    	 String LiabXpath=Pro.getProperty("PayrollIDRecordForLI");
    	 return LiabXpath;
    	 
     }
     
     public String PayrollID() {
  		
    	 String payrollId=Pro.getProperty("PayrollID");
    	 return payrollId;
    	 
     }
     
     public String LIcheckDate() {
 		
    	 String LIcheckdate=Pro.getProperty("LICheckDate");
    	 return LIcheckdate;
    	 
     }
     
     public String LIReason() {
  		
    	 String LIReason=Pro.getProperty("LIReason");
    	 return LIReason;
    	 
     }
     
     public String Filebutton() {
   		
    	 String file=Pro.getProperty("Filebutton");
    	 return file;
    	 
     }
     
     public String closebutton() {
  		
    	 String close=Pro.getProperty("Closebutton");
    	 return close;
    	 
     }

     public String close() {
   		
    	 String close=Pro.getProperty("Close");
    	 return close;
    	 
     }
     
     public String PIAgencyID() {
    	 String AgencyID = Pro.getProperty("PIAgencyID");
    	 return AgencyID;
     }
     
     public String PIDescription() {
    	 String Desc = Pro.getProperty("PIDescription");
    	 return Desc;
     }
     
     public String PIDuedate() {
    	 String duedate = Pro.getProperty("PIDuedate");
    	 return duedate;
     }
     
     public String PIAmount() {
    	 String amount = Pro.getProperty("PIAmount");
    	 return amount;
     }
     
     public String PIAmount_specialchar() {
    	 String amount = Pro.getProperty("PIAmount_specialchar");
    	 return amount;
     }
     
     public String PIReasoncode() {
    	 String reasoncode = Pro.getProperty("PIReasoncode");
    	 return reasoncode;
     }
     
     public String NSFAgencyID() {
    	 String AgencyID = Pro.getProperty("NSFAgencyID");
    	 return AgencyID;
     }
     
     public String NSFDescription() {
    	 String Desc = Pro.getProperty("NSFDescription");
    	 return Desc;
     }
     
     public String NSFAmount() {
    	 String amount = Pro.getProperty("NSFAmount");
    	 return amount;
     }
     
     public String NSFAmount_specialchar() {
    	 String amount = Pro.getProperty("NSFAmount_specialchar");
    	 return amount;
     }
     
     public String AFAgencyID() {
    	 String AgencyID = Pro.getProperty("AFAgencyID");
    	 return AgencyID;
     }
     
     public String AFDescription() {
    	 String Desc = Pro.getProperty("AFDescription");
    	 return Desc;
     }
     
     public String AFCheckDate() {
    	 String checkdate = Pro.getProperty("AFCheckDate");
    	 return checkdate;
     }
     
     public String AFAmount() {
    	 String amount = Pro.getProperty("AFAmount");
    	 return amount;
     }
     
     public String AFDuedate() {
    	 String duedate = Pro.getProperty("AFDuedate");
    	 return duedate;
     }
     
     public String ALActiveFromDate() {
    	 String activedate = Pro.getProperty("ALActiveFromDate");
    	 return activedate;
     }
     
     public String ALAlertName() {
    	 String alertname = Pro.getProperty("ALAlertName");
    	 return alertname;
     }
     
     public String ALAlertText() {
    	 String alerttext = Pro.getProperty("ALAlertText");
    	 return alerttext;
     }
     
     public String VerifyLIReason() {
    	 String path = Pro.getProperty("ReasonRecordForLI");
    	 return path;
     }
     
     public String getPIExcelReportPath() {
    	 String path = Pro.getProperty("PaymentIssuesExcelFileWithPayrollID");
    	 return path;
     }
     
     public String VerifyPIPayrollID() {
    	 String path = Pro.getProperty("PayrollIDRecordForPI");
    	 return path;
     }
     
     public String VerifyPIAgencyID() {
    	 String path = Pro.getProperty("PIAgencyID");
    	 return path;
     }
     
     public String VerifyPIDescription() {
    	 String path = Pro.getProperty("VerifyPIDescription");
    	 return path;
     }
     
     public String VerifyPIDuedate() {
    	 String path = Pro.getProperty("VerifyPIDuedate");
    	 return path;
     }
     
     public String VerifyAmount() {
    	 String path = Pro.getProperty("VerifyAmount");
    	 return path;
     }
     
     public String clickonNSFExcelFilewithPayrollID() {
    	 String path = Pro.getProperty("NSFExcelwithPayrollID");
    	 return path;
     }
     
     public String VerifyNSFExcelwithPayrollID() {
    	 String path = Pro.getProperty("VerifyNSFExcelwithPayrollID");
    	 return path;
     }
     
     public String VerifyNSFExcelwithAgencyID() {
    	 String path = Pro.getProperty("VerifyNSFExcelwithAgencyID");
    	 return path;
     }
     
     public String VerifyNSFExcelwithDescription() {
    	 String path = Pro.getProperty("VerifyNSFExcelwithDescription");
    	 return path;
     }
     
     public String VerifyNSFExcelwithAmount() {
    	 String path = Pro.getProperty("VerifyNSFExcelwithAmount");
    	 return path;
     }
     
     public String clickonAppliedForExcel() {
    	 String path = Pro.getProperty("AFExcelSheetWithPayrollID");
    	 return path;
     }
     
     public String VerifyAFExcelwithPayrollID() {
    	 String path = Pro.getProperty("VerifyAFExcelwithPayrollID");
    	 return path;
     }
     
     public String VerifyAFExcelwithAgencyID() {
    	 String path = Pro.getProperty("VerifyAFExcelwithAgencyID");
    	 return path;
     }
     
     public String VerifyAFExcelwithDescription() {
    	 String path = Pro.getProperty("VerifyAFExcelwithDescription");
    	 return path;
     }
     
     public String VerifyAFAmount_specialchar() {
    	 String path = Pro.getProperty("AFAmount_specialchar");
    	 return path;
     }
     
     public String ALExcelFile() {
    	 String path = Pro.getProperty("ALExcelFile");
    	 return path;
     }
     
     public String VerifyALExcelwithActivedate() {
    	 String path = Pro.getProperty("VerifyALExcelwithActivedate");
    	 return path;
     }
     
     public String VerifyALExcelwithAlertName() {
    	 String path = Pro.getProperty("VerifyALExcelwithAlertName");
    	 return path;
     }
     
     public String VerifyALExcelwithAlertText() {
    	 String path = Pro.getProperty("VerifyALExcelwithAlertText");
    	 return path;
     }
     
     public String enterRLcheckDate() {
    	 String path = Pro.getProperty("RLCheckDate");
    	 return path;
     }
     
     public String enterRLEntryDate() {
    	 String path = Pro.getProperty("RLEntryDate");
    	 return path;
     }
     
     public String enterRLAmount() {
    	 String path = Pro.getProperty("RLAmount");
    	 return path;
     }
     
     public String enterRLAmount_Specialchar() {
    	 String path = Pro.getProperty("RLAmount_Specialchar");
    	 return path;
     }
        
     public String enterRLStatus() {
    	 String path = Pro.getProperty("RLStatus");
    	 return path;
     }
     
     public String RLExcelFile() {
    	 String path = Pro.getProperty("RLExcelFile");
    	 return path;
     }
     
     public String RLVerifyPayrollIDinExcel() {
    	 String path = Pro.getProperty("RLVerifyPayrollIDinExcel");
    	 return path;
     }
     
     
     public String RLVerifyCheckDateinExcel() {
    	 String path = Pro.getProperty("RLVerifyCheckDateinExcel");
    	 return path;
     }
     
     public String RLVerifyEntryDateinExcel() {
    	 String path = Pro.getProperty("RLVerifyEntryDateinExcel");
    	 return path;
     }
     
     public String RLVerifyAmountinExcel() {
    	 String path = Pro.getProperty("RLVerifyAmountinExcel");
    	 return path;
     }
     
     public String RLVerifyStatusinExcel() {
    	 String path = Pro.getProperty("RLVerifyStatusinExcel");
    	 return path;
     }
     
     public String RLVerifyDescriptionTitle() {
    	 String path = Pro.getProperty("RLDescription");
    	 return path;
     }
     
     public String NSFHoldStatus() {
    	 String path = Pro.getProperty("DoughNutsNSFHold");
    	 return path;
     }
     
     public String NSFHoldStatus_BHBAKERY() {
    	 String path = Pro.getProperty("BHBAKERYNSFHold");
    	 return path;
     }
     
     public String SelectQuarter() {
    	 String path = Pro.getProperty("TPQuarterdropdown");
    	 return path;
     }
     
     public String SelectYear() {
    	 String path = Pro.getProperty("TPYeardropdown");
    	 return path;
     }
     
     public String TPQepkgFilename() {
    	 String path = Pro.getProperty("TPQepkgFilename");
    	 return path;
     }
     
     public String TPRtnpkgFilename() {
    	 String path = Pro.getProperty("TPRtnpkgFilename");
    	 return path;
     }
     
     public String qepkgdownloadedFile() {
    	 String path = Pro.getProperty("qepkgdownloadedFile");
    	 return path;
     }
     
     public String TAAgencyID() {
    	 String path = Pro.getProperty("TAAgencyID");
    	 return path;
     }
     
     public String TADescription() {
    	 String path = Pro.getProperty("TADescription");
    	 return path;
     }
     
     public String TAMAinagencyID() {
    	 String path = Pro.getProperty("TAMAinagencyID");
    	 return path;
     }
     
     public String TAMainAgencyID_TIBERIUMSYSTEMS() {
    	 String path = Pro.getProperty("TAMainAgencyID_TIBERIUMSYSTEMS");
    	 return path;
     }
     
     public String TAClientTaxID() {
    	 String path = Pro.getProperty("TAClientTaxID");
    	 return path;
     }
     
     public String TAFrequencyType() {
    	 String path = Pro.getProperty("TAFrequencyType");
    	 return path;
     }
     
     public String TAFrequencyTypeFEDSWQREC () {
    	 String path = Pro.getProperty("TAFrequencyTypeFEDSWQREC");
    	 return path;
     }
     
     public String TAFrequency() {
    	 String path = Pro.getProperty("TAFrequency");
    	 return path;
     }
     
     public String TATaxRate() {
    	 String path = Pro.getProperty("TATaxRate");
    	 return path;
     }
     
     public String TATaxRate02() {
    	 String path = Pro.getProperty("TATaxRate02");
    	 return path;
     }
     
     public String TAStatus() {
    	 String path = Pro.getProperty("TATaxStatus");
    	 return path;
     }
     
     
     public String DoughNutsLegalName() {
    	 String path = Pro.getProperty("DoughNutsLegalName");
    	 return path;
     }
     
     public String DoughNutsDBA() {
    	 String path = Pro.getProperty("DoughNutsDBA");
    	 return path;
     }
     
     public String DoughNutsAddress() {
    	 String path = Pro.getProperty("DoughNutsAddress");
    	 return path;
     }
     
     public String DoughNutsFEIN() {
    	 String path = Pro.getProperty("DoughNutsFEIN");
    	 return path;
     }
     
     public String DoughNutsClientID() {
    	 String path = Pro.getProperty("DoughNutsClientID");
    	 return path;
     }
     
     public String DoughNutsPayrollID() {
    	 String path = Pro.getProperty("DoughNutsPayrollID");
    	 return path;
     }
     
     public String DoughNutsAnnouncementName() {
    	 String path = Pro.getProperty("AnnouncementName");
    	 return path;
     }
     
     public String AnnouncementsExcelFile() {
    	 String path = Pro.getProperty("AnnouncementsExcelFile");
    	 return path;
     }
     
     public String ValidateDoughNutsAnnouncements() {
    	 String path = Pro.getProperty("ValidateDoughNutsAnnouncements");
    	 return path;
     }
     
     public String AnnouncementsPdfFile() {
    	 String path = Pro.getProperty("AnnouncementsPdfFile");
    	 return path;
     }
     
     public String ValidateDoughNutsAnnouncementsPdf() {
    	 String path = Pro.getProperty("ValidateDoughNutsAnnouncementsPdf");
    	 return path;
     }
     
     public String UPDuedate() {
    	 String path = Pro.getProperty("UPDuedate");
    	 return path;
     }
     
     public String UPAmount() {
    	 String path = Pro.getProperty("UPAmount");
    	 return path;
     }
     
     public String UPAmount_specialchar() {
    	 String path = Pro.getProperty("UPAmount_specialchar");
    	 return path;
     }
     
     public String UPCount() {
    	 String path = Pro.getProperty("UPCount");
    	 return path;
     }
     
     public String UPAgencyID() {
    	 String path = Pro.getProperty("UPAgencyID");
    	 return path;
     }
     
     public String UPDescription() {
    	 String path = Pro.getProperty("UPDescription");
    	 return path;
     }
     
     public String UPDuedate1() {
    	 String path = Pro.getProperty("UPDuedate1");
    	 return path;
     }
     
     public String UPAmount_1() {
    	 String path = Pro.getProperty("UPAmount_1");
    	 return path;
     }
     
     public String UPAmount1_Specialchar() {
    	 String path = Pro.getProperty("UPAmount1_Specialchar");
    	 return path;
     }
     
     public String UPExcelFile() {
    	 String path = Pro.getProperty("UPExcelFile");
    	 return path;
     }
     
     public String UPValidatingDuedateExcel() {
    	 String path = Pro.getProperty("UPValidatingDuedateExcel");
    	 return path;
     }
     
     public String UPValidatingAmountExcel() {
    	 String path = Pro.getProperty("UPValidatingAmountExcel");
    	 return path;
     }
     
     public String UPValidatingCountExcel() {
    	 String path = Pro.getProperty("UPValidatingCountExcel");
    	 return path;
     }
     
     public String UPValidatingPayrollIDExcel() {
    	 String path = Pro.getProperty("UPValidatingPayrollIDExcel");
    	 return path;
     }
     
     public String UPValidatingAgencyIDExcel() {
    	 String path = Pro.getProperty("UPValidatingAgencyIDExcel");
    	 return path;
     }
     
     public String UPValidatingDescriptionExcel() {
    	 String path = Pro.getProperty("UPValidatingDescriptionExcel");
    	 return path;
     }
     
     public String UPValidatingDuedate1Excel() {
    	 String path = Pro.getProperty("UPValidatingDuedate1Excel");
    	 return path;
     }
     
     public String UPValidatingAmount1Excel() {
    	 String path = Pro.getProperty("UPValidatingAmount1Excel");
    	 return path;
     }
     
     public String FIAmount() {
    	 String path = Pro.getProperty("FIAmount");
    	 return path;
     }
     
     public String FIAmount_specialchar() {
    	 String path = Pro.getProperty("FIAmount_specialchar");
    	 return path;
     }
     
     public String FIDuedate() {
    	 String path = Pro.getProperty("FIDuedate");
    	 return path;
     }
     
     public String FIReason() {
    	 String path = Pro.getProperty("FIReason");
    	 return path;
     }
     
     public String FIValidateExcelFile() {
    	 String path = Pro.getProperty("FIValidateExcelFile");
    	 return path;
     }
     
     public String FIValidatePayrollID() {
    	 String path = Pro.getProperty("FIValidatePayrollID");
    	 return path;
     }
     
     public String FIValidateAmount() {
    	 String path = Pro.getProperty("FIValidateAmount");
    	 return path;
     }
     
     public String FIValidateFundingDate() {
    	 String path = Pro.getProperty("FIValidateFundingDate");
    	 return path;
     }
     
     public String FIValidateReason() {
    	 String path = Pro.getProperty("FIValidateReason");
    	 return path;
     }
     
     public String RLDescName() {
    	 String path = Pro.getProperty("RLDescName");
    	 return path;
     }
     
     public String RLDescAmount() {
    	 String path = Pro.getProperty("RLDescAmount");
    	 return path;
     }
     
     public String RLDescAmount_specialchar() {
    	 String path = Pro.getProperty("RLDescAmount_specialchar");
    	 return path;
     }
     
     public String RLValidateRLDesc() {
    	 String path = Pro.getProperty("RLValidateRLDesc");
    	 return path;
     }
     
     public String RLValidateRLAmount() {
    	 String path = Pro.getProperty("RLValidateRLAmount");
    	 return path;
     }
     
     public String PayrollID_BHBAKERY() {
    	 String path = Pro.getProperty("PayrollID_BHBAKERY");
    	 return path;
     }
     
     public String PayrollID_TIBERIUM() {
    	 String path = Pro.getProperty("PayrollID_TIBERIUM");
    	 return path;
     }
     
     public String PIExcelFileWithPayrollID_BHBAKERY() {
    	 String path = Pro.getProperty("PIExcelFileWithPayrollID_BHBAKERY");
    	 return path;
     }
     
     public String PIAgencyID_BHBAKERY() {
    	 String path = Pro.getProperty("PIAgencyID_BHBAKERY");
    	 return path;
     }
     
     public String PIDescription_BHBAKERY() {
    	 String path = Pro.getProperty("PIDescription_BHBAKERY");
    	 return path;
     }
     
     public String PIDuedate_BHBAKERY() {
    	 String path = Pro.getProperty("PIDuedate_BHBAKERY");
    	 return path;
     }
     
     public String PIAmount_BHBAKERY() {
    	 String path = Pro.getProperty("PIAmount_BHBAKERY");
    	 return path;
     }
     
     public String PIAmount_specialchar_BHBAKERY() {
    	 String path = Pro.getProperty("PIAmount_specialchar_BHBAKERY");
    	 return path;
     }
     
     public String PIReasoncode_BHBAKERY() {
    	 String path = Pro.getProperty("PIReasoncode_BHBAKERY");
    	 return path;
     }
     
     public String PIValidateAgencyID_BHBAKERY() {
    	 String path = Pro.getProperty("PIValidateAgencyID_BHBAKERY");
    	 return path;
     }
     
     public String PIValidateDescription_BHBAKERY() {
    	 String path = Pro.getProperty("PIValidateDescription_BHBAKERY");
    	 return path;
     }
     
     public String PIValidateDuedate_BHBAKERY() {
    	 String path = Pro.getProperty("PIValidateDuedate_BHBAKERY");
    	 return path;
     }
     
     public String PIValidateAmount_BHBAKERY() {
    	 String path = Pro.getProperty("PIValidateAmount_BHBAKERY");
    	 return path;
     }
     
     public String PIValidateNoRecords_BHBAKERY() {
    	 String path = Pro.getProperty("PIValidateNoRecords_BHBAKERY");
    	 return path;
     }
     
     public String PIValidatePayrollID_TIBERIUM() {
    	 String path = Pro.getProperty("PIValidatePayrollID_TIBERIUM");
    	 return path;
     }
     
     public String PIAgencyID_TIBERIUM() {
    	 String path = Pro.getProperty("PIAgencyID_TIBERIUM");
    	 return path;
     }
     
     public String PIDescription_TIBERIUM() {
    	 String path = Pro.getProperty("PIDescription_TIBERIUM");
    	 return path;
     }
     
     public String PIDuedate_TIBERIUM() {
    	 String path = Pro.getProperty("PIDuedate_TIBERIUM");
    	 return path;
     }
     
     public String PIAmount_TIBERIUM() {
    	 String path = Pro.getProperty("PIAmount_TIBERIUM");
    	 return path;
     }
     
     public String PIAmount_specialchar_TIBERIUM() {
    	 String path = Pro.getProperty("PIAmount_specialchar_TIBERIUM");
    	 return path;
     }
     
     public String PIValidateAgencyID_TIBERIUM() {
    	 String path = Pro.getProperty("PIValidateAgencyID_TIBERIUM");
    	 return path;
     }
     
     public String PIValidateDuedate_TIBERIUM() {
    	 String path = Pro.getProperty("PIValidateDuedate_TIBERIUM");
    	 return path;
     }
     
     public String PIValidateAmount_TIBERIUM() {
    	 String path = Pro.getProperty("PIValidateAmount_TIBERIUM");
    	 return path;
     }
     
     public String PIValidateReasonCode_TIBERIUM() {
    	 String path = Pro.getProperty("PIValidateReasonCode_TIBERIUM");
    	 return path;
     }
     
     public String TATaxRate_TIBERIUMSYSTEMS() {
    	 String path = Pro.getProperty("TATaxRate_TIBERIUMSYSTEMS");
    	 return path;
     }
     
   
     
     
}
