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
     
     
     
     
     
     public String PayrollID_DoughNuts() {
  		
    	 String payrollId=Pro.getProperty("PayrollID_DoughNuts");
    	 return payrollId;
    	 
     }
     
     public String LiabilitiesIssues_CheckDate() {
 		
    	 String LIcheckdate=Pro.getProperty("LiabilitiesIssues_CheckDate");
    	 return LIcheckdate;
    	 
     }
     
     public String LiabilitiesIssues_Reason() {
  		
    	 String LIReason=Pro.getProperty("LiabilitiesIssues_Reason");
    	 return LIReason;
    	 
     }
     
     
     public String PaymentIssues_AgencyID() {
    	 String AgencyID = Pro.getProperty("PaymentIssues_AgencyID");
    	 return AgencyID;
     }
     
     public String PaymentIssues_Description() {
    	 String Desc = Pro.getProperty("PaymentIssues_Description");
    	 return Desc;
     }
     
     public String PaymentIssues_Duedate() {
    	 String duedate = Pro.getProperty("PaymentIssues_Duedate");
    	 return duedate;
     }
     
     public String PaymentIssues_Amount() {
    	 String amount = Pro.getProperty("PaymentIssues_Amount");
    	 return amount;
     }
     
     public String PaymentIssues_Amount_specialchar() {
    	 String amount = Pro.getProperty("PaymentIssues_Amount_specialchar");
    	 return amount;
     }
     
     public String PaymentIssues_Reasoncode() {
    	 String reasoncode = Pro.getProperty("PaymentIssues_Reasoncode");
    	 return reasoncode;
     }
     
     public String NSFHold_AgencyID() {
    	 String AgencyID = Pro.getProperty("NSFHold_AgencyID");
    	 return AgencyID;
     }
     
     public String NSFHold_Description() {
    	 String Desc = Pro.getProperty("NSFHold_Description");
    	 return Desc;
     }
     
     public String NSFHold_Amount() {
    	 String amount = Pro.getProperty("NSFHold_Amount");
    	 return amount;
     }
     
     public String NSFHold_Amount_specialchar() {
    	 String amount = Pro.getProperty("NSFHold_Amount_specialchar");
    	 return amount;
     }
     
     public String AppliedFor_AgencyID() {
    	 String AgencyID = Pro.getProperty("AppliedFor_AgencyID");
    	 return AgencyID;
     }
     
     public String AppliedFor_Description() {
    	 String Desc = Pro.getProperty("AppliedFor_Description");
    	 return Desc;
     }
     
     public String AppliedFor_CheckDate() {
    	 String checkdate = Pro.getProperty("AppliedFor_CheckDate");
    	 return checkdate;
     }
     
     public String AppliedFor_Amount() {
    	 String amount = Pro.getProperty("AppliedFor_Amount");
    	 return amount;
     }
     
     public String AppliedFor_Amount_specialchar() {
    	 String amount = Pro.getProperty("AppliedFor_Amount_specialchar");
    	 return amount;
     }
     
     public String AppliedFor_Duedate() {
    	 String duedate = Pro.getProperty("AppliedFor_Duedate");
    	 return duedate;
     }
     
     public String Alerts_ActiveFromDate() {
    	 String activedate = Pro.getProperty("Alerts_ActiveFromDate");
    	 return activedate;
     }
     
     public String Alerts_AlertName() {
    	 String alertname = Pro.getProperty("Alerts_AlertName");
    	 return alertname;
     }
     
     public String Alerts_AlertText() {
    	 String alerttext = Pro.getProperty("Alerts_AlertText");
    	 return alerttext;
     }
     
     public String VerifyLiabilitiesIssuesReason() {
    	 String path = Pro.getProperty("LiabilitiesIssues_Reason");
    	 return path;
     }
     
    
     
     public String VerifyPIAgencyID() {
    	 String path = Pro.getProperty("PIAgencyID");
    	 return path;
     }
     
   
     
    
     
   
     
    
     public String VerifyAFAmount_specialchar() {
    	 String path = Pro.getProperty("AppliedFor_Amount_specialchar");
    	 return path;
     }
     
     
     
     
     
     public String enterRecentLiabilities_CheckDate() {
    	 String path = Pro.getProperty("RecentLiabilities_CheckDate");
    	 return path;
     }
     
     public String enterRecentLiabilities_EntryDate() {
    	 String path = Pro.getProperty("RecentLiabilities_EntryDate");
    	 return path;
     }
     
     public String enterRecentLiabilities_Amount() {
    	 String path = Pro.getProperty("RecentLiabilities_Amount");
    	 return path;
     }
     
     public String enterRecentLiabilities_Amount_Specialchar() {
    	 String path = Pro.getProperty("RecentLiabilities_Amount_Specialchar");
    	 return path;
     }
        
     public String enterRecentLiabilities_Status() {
    	 String path = Pro.getProperty("RecentLiabilities_Status");
    	 return path;
     }
     
     
     
     public String RLVerifyRecentLiabilities_Description() {
    	 String path = Pro.getProperty("RecentLiabilities_Description");
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
    	 String path = Pro.getProperty("TaxPackags_Quarterdropdown");
    	 return path;
     }
     
     public String SelectYear() {
    	 String path = Pro.getProperty("TaxPackags_Yeardropdown");
    	 return path;
     }
     
     public String TaxPackags_QepkgFilename() {
    	 String path = Pro.getProperty("TaxPackags_QepkgFilename");
    	 return path;
     }
     
     public String TaxPackags_RtnpkgFilename() {
    	 String path = Pro.getProperty("TaxPackags_RtnpkgFilename");
    	 return path;
     }
     
    
     
     public String TaxAgencies_AgencyID() {
    	 String path = Pro.getProperty("TaxAgencies_AgencyID");
    	 return path;
     }
     
     public String TaxAgencies_Description() {
    	 String path = Pro.getProperty("TaxAgencies_Description");
    	 return path;
     }
     
     public String TaxAgencies_MAinagencyID() {
    	 String path = Pro.getProperty("TaxAgencies_MAinagencyID");
    	 return path;
     }
     
     public String TaxAgencies_MainAgencyID_TIBERIUMSYSTEMS() {
    	 String path = Pro.getProperty("TaxAgencies_MainAgencyID_TIBERIUMSYSTEMS");
    	 return path;
     }
     
     public String TaxAgencies_ClientTaxID() {
    	 String path = Pro.getProperty("TaxAgencies_ClientTaxID");
    	 return path;
     }
     
     public String TaxAgencies_FrequencyType() {
    	 String path = Pro.getProperty("TaxAgencies_FrequencyType");
    	 return path;
     }
     
     public String TaxAgencies_FrequencyType_FEDSWQREC () {
    	 String path = Pro.getProperty("TaxAgencies_FrequencyType_FEDSWQREC");
    	 return path;
     }
     
     public String TaxAgencies_Frequency() {
    	 String path = Pro.getProperty("TaxAgencies_Frequency");
    	 return path;
     }
     
     public String TaxAgencies_TaxRate() {
    	 String path = Pro.getProperty("TaxAgencies_TaxRate");
    	 return path;
     }
     
     public String TaxAgencies_TaxRate02() {
    	 String path = Pro.getProperty("TaxAgencies_TaxRate02");
    	 return path;
     }
     
     public String TaxAgencies_TaxStatus() {
    	 String path = Pro.getProperty("TaxAgencies_TaxStatus");
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
     
     
     
     public String UpcomingPayments_Duedate() {
    	 String path = Pro.getProperty("UpcomingPayments_Duedate");
    	 return path;
     }
     
     public String UpcomingPayments_Amount() {
    	 String path = Pro.getProperty("UpcomingPayments_Amount");
    	 return path;
     }
     
     public String UpcomingPayments_Amount_specialchar() {
    	 String path = Pro.getProperty("UpcomingPayments_Amount_specialchar");
    	 return path;
     }
     
     public String UpcomingPayments_Count() {
    	 String path = Pro.getProperty("UpcomingPayments_Count");
    	 return path;
     }
     
     public String UpcomingPayments_AgencyID() {
    	 String path = Pro.getProperty("UpcomingPayments_AgencyID");
    	 return path;
     }
     
     public String UpcomingPayments_Description() {
    	 String path = Pro.getProperty("UpcomingPayments_Description");
    	 return path;
     }
     
     public String UpcomingPayments_Duedate1() {
    	 String path = Pro.getProperty("UpcomingPayments_Duedate1");
    	 return path;
     }
     
     public String UpcomingPayments_Amount_1() {
    	 String path = Pro.getProperty("UpcomingPayments_Amount_1");
    	 return path;
     }
     
     public String UpcomingPayments_Amount1_Specialchar() {
    	 String path = Pro.getProperty("UpcomingPayments_Amount1_Specialchar");
    	 return path;
     }
     
     
     
     public String FundingIssues_Amount() {
    	 String path = Pro.getProperty("FundingIssues_Amount");
    	 return path;
     }
     
     public String FundingIssues_Amount_specialchar() {
    	 String path = Pro.getProperty("FundingIssues_Amount_specialchar");
    	 return path;
     }
     
     public String FundingIssues_Duedate() {
    	 String path = Pro.getProperty("FundingIssues_Duedate");
    	 return path;
     }
     
     public String FundingIssues_Reason() {
    	 String path = Pro.getProperty("FundingIssues_Reason");
    	 return path;
     }
      
     
     public String RecentLiabilities_DescName() {
    	 String path = Pro.getProperty("RecentLiabilities_DescName");
    	 return path;
     }
     
     public String RecentLiabilities_DescAmount() {
    	 String path = Pro.getProperty("RecentLiabilities_DescAmount");
    	 return path;
     }
     
     public String RecentLiabilities_DescAmount_specialchar() {
    	 String path = Pro.getProperty("RecentLiabilities_DescAmount_specialchar");
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
     
    
     
     public String PaymentIssues_AgencyID_BHBAKERY() {
    	 String path = Pro.getProperty("PaymentIssues_AgencyID_BHBAKERY");
    	 return path;
     }
     
     public String PaymentIssues_Description_BHBAKERY() {
    	 String path = Pro.getProperty("PaymentIssues_Description_BHBAKERY");
    	 return path;
     }
     
     public String PaymentIssues_Duedate_BHBAKERY() {
    	 String path = Pro.getProperty("PaymentIssues_Duedate_BHBAKERY");
    	 return path;
     }
     
     public String PaymentIssues_Amount_BHBAKERY() {
    	 String path = Pro.getProperty("PaymentIssues_Amount_BHBAKERY");
    	 return path;
     }
     
     public String PaymentIssues_Amount_specialchar_BHBAKERY() {
    	 String path = Pro.getProperty("PaymentIssues_Amount_specialchar_BHBAKERY");
    	 return path;
     }
     
     public String PaymentIssues_Reasoncode_BHBAKERY() {
    	 String path = Pro.getProperty("PaymentIssues_Reasoncode_BHBAKERY");
    	 return path;
     }
     
     
     
     public String PaymentIssues_AgencyID_TIBERIUM() {
    	 String path = Pro.getProperty("PaymentIssues_AgencyID_TIBERIUM");
    	 return path;
     }
     
     public String PaymentIssues_Description_TIBERIUM() {
    	 String path = Pro.getProperty("PaymentIssues_Description_TIBERIUM");
    	 return path;
     }
     
     public String PaymentIssues_Duedate_TIBERIUM() {
    	 String path = Pro.getProperty("PaymentIssues_Duedate_TIBERIUM");
    	 return path;
     }
     
     public String PaymentIssues_Amount_TIBERIUM() {
    	 String path = Pro.getProperty("PaymentIssues_Amount_TIBERIUM");
    	 return path;
     }
     
     public String PaymentIssues_Amount_specialchar_TIBERIUM() {
    	 String path = Pro.getProperty("PaymentIssues_Amount_specialchar_TIBERIUM");
    	 return path;
     }
     
     
     public String TaxAgencies_TaxRate_TIBERIUMSYSTEMS() {
    	 String path = Pro.getProperty("TaxAgencies_TaxRate_TIBERIUMSYSTEMS");
    	 return path;
     }
     
   
     
     
}
