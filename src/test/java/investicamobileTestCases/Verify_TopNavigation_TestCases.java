package investicamobileTestCases;

import org.testng.annotations.Test;

import appiumGrid.appiumTestPOM3;
import factory.DataProviderFactory;
import investicaMobilePages.Fund_Explorer_Page;
import investicaMobilePages.TopNavigation_Page;
import utility.HelperClass;

public class Verify_TopNavigation_TestCases extends appiumTestPOM3 {

	TopNavigation_Page top_Navigation_Page_obj;
	
	
	
	@Test(priority=1)
	
	public void verify_global_search(){
		
		try{
			
			top_Navigation_Page_obj = new TopNavigation_Page(driver);
			top_Navigation_Page_obj.search_MutalFund_Schemes("HDFC Top 200 Fund - Growth");
			//can use excel to pass data
			//top_Navigation_Page_obj.search_MutalFund_Schemes(DataProviderFactory.getExcel().getData(0, 38, 1));
			
		}
		catch(Exception e){
			
			System.out.println("verify_global_search testcase failed");
			e.printStackTrace();
		}
	}
	
	

	
}
