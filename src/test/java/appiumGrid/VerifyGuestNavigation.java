package appiumGrid;

import org.testng.annotations.Test;

public class VerifyGuestNavigation extends parallelAndroidPom {
	
	//on single device multiple testcase use public class VerifyGuestNavigation extends AbstractTest(utility package)
	//parallelMobileAndroidTestNew
	// since extending abstract test don't need to write before
	
	//For Normal: use public class VerifyGuestNavigation extends AbstractTest
	//pages should extend to public class FundExplorerMobile extends AbstractPage
	
	//For grid : need to do 1)use public class VerifyGuestNavigation extends parallelAndroidPom
	//pages should extend to public class FundExplorerMobile extends AbstractPageGrid
	
	
	@Test(priority=1)
	  
	
	public void verify_Guest_InvestorDashboard(){
		
		try{
			
			FundExplorerMobileFinal.navigate_Investor_Dashboard();
			//FundExplorerMobileFinal.navigate_Investor_Dashboard();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
	@Test(priority=2)
	
	public void verify_Guest_MyInvestments(){
		
		try{
			
			FundExplorerMobileFinal.navigate_MyInvestmentspPage();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	
	@Test(priority=3)
	
	public void verify_Guest_MyProfile(){
		
		try{
			
			FundExplorerMobileFinal.navigate_MyProfilePage();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	
	
	@Test(priority=4)
	
	public void verify_Guest_SupportPage(){
		
		try{
			
			FundExplorerMobileFinal.navigate_SupportPage();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	

	@Test(priority=5)
	
	public void verify_Guest_Share_functionality(){
		
		try{
			
			FundExplorerMobileFinal.navigate_SharePage();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	
	@Test(priority=6)
	
	public void verify_navigation_FaqPage(){
		
		try{
			
			FundExplorerMobileFinal.navigate_FAQPage();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	@Test(priority=7)
	
	public void verify_navigation_SignInPage(){
		
		try{
			
			FundExplorerMobileFinal.navigateToSignIn();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
