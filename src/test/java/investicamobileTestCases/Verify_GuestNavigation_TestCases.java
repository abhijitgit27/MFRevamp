package investicamobileTestCases;

import org.testng.annotations.Test;

import appiumGrid.appiumTestPOM3;
import investicaMobilePages.Fund_Explorer_Page;
import utility.CaptureScreenshot;

public class Verify_GuestNavigation_TestCases extends appiumTestPOM3{
	
	Fund_Explorer_Page fund_explorer_obj;

	@Test(priority=1)
	
	public void verify_navigation_SignInPage(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.navigateToSignIn();
			CaptureScreenshot.takeDeviceScreenshot(driver, "SignInPage_displayed");
			
			
			
		}catch(Exception e)
		{
			System.out.println("verify_navigation_SignInPage testcase failed");
			e.printStackTrace();
		}	
	}
	
	
	
	@Test(priority=2)
	public void verify_navigation_to_Guest_InvestorDashboard(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.navigate_Investor_Dashboard();
			CaptureScreenshot.takeDeviceScreenshot(driver, "InvestorDashboardPage");
			
		}catch(Exception e)
		{
			System.out.println("verify_navigation_to_Guest_InvestorDashboard testcase failed");
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=3)
	
	public void verify_navigation_to_FundExplorer_Guest(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.navigate_FundExplorerPage();
			
			
		}catch(Exception e)
		{
			System.out.println("verify_navigation_to_FundExplorer_Guest testcase failed");
			e.printStackTrace();
		}	
	}
	
	
	
	@Test(priority=4)
	
	public void verify_navigation_to_MyInvestments_Guest(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.navigate_MyInvestmentspPage();
			
			
		}catch(Exception e)
		{
			System.out.println("verify_navigation_to_MyInvestments_Guest testcase failed");
			e.printStackTrace();
		}	
	}
	
	
	@Test(priority=5)
	
	public void verify_navigation_to_MyTransactions_Guest(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.navigate_MyTransactionsPage();
			
			
		}catch(Exception e)
		{
			System.out.println("verify_navigation_to_MyTransactions_Guest testcase failed");
			e.printStackTrace();
		}	
	}
	
	
	
	@Test(priority=6)
	
	public void verify_navigation_to_MyProfile_Guest(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.navigate_MyProfilePage();
			
			
		}catch(Exception e)
		{
			System.out.println("verify_Guest_MyProfile testcase failed");
			e.printStackTrace();
		}	
	}
	
	
	
	@Test(priority=7)
	
	public void verify_navigation_to_SupportPage(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.navigate_SupportPage();
				
			
		}catch(Exception e)
		{
			System.out.println("verify_Guest_SupportPage testcase failed");
			e.printStackTrace();
		}	
	}
	
	

	@Test(priority=8)
	
	public void verify_Guest_Share_functionality(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.navigate_SharePage();
			
			
		}catch(Exception e)
		{
			System.out.println("verify_Guest_Share_functionality testcase failed");
			e.printStackTrace();
		}	
	}
	
	
	@Test(priority=9)
	
	public void verify_navigation_FaqPage(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.navigate_FAQPage();
			
			
		}catch(Exception e)
		{
			System.out.println("verify_navigation_FaqPage testcase failed");
			e.printStackTrace();
		}	
		
		
	}
	
	
	
}
