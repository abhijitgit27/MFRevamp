package investicamobileTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import appiumGrid.appiumTestPOM3;
import factory.DataProviderFactory;
import investicaMobilePages.TopNavigation_Page;
import utility.HelperClass;

public class Verify_Interapp_Switching_TestCases extends appiumTestPOM3 {

	TopNavigation_Page top_Navigation_Page_obj;
	
	@Test(priority=1)
	
	public void verify_messagingApp(){
		
		try{
			
			Thread.sleep(5000);
			//HelperClass.switch_To_Differnt_App(driver, "com.android.mms", "com.android.mms.ui.ConversationList");
			//passing apppackage and app activity from excel
			HelperClass.switch_To_Differnt_App(driver, DataProviderFactory.getExcel().getData(0, 47, 1), DataProviderFactory.getExcel().getData(0, 48, 1));
			Thread.sleep(2000);
			HelperClass.get_OTP_from_Sms(driver);
			//System.out.println(otp_obtained);
			//HelperClass.run_App_inBackground(driver, 10);
			//top_Navigation_Page_obj = new TopNavigation_Page(driver);
			//top_Navigation_Page_obj.search_MutalFund_Schemes("HDFC Top 200 Fund - Growth");
			
			
		}
		catch(Exception e){
			
			System.out.println("verify_messagingApp testcase failed");
			e.printStackTrace();
		}
	}
}
