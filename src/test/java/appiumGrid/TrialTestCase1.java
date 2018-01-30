package appiumGrid;

import org.testng.annotations.Test;

import appiumGrid.FundPageAppium;
import appiumGrid.InvestorDashboardPageAppium;
import appiumGrid.LoginPageAppium;


public class TrialTestCase1 extends appiumTestPOM3  {
	
	FundPageAppium fundPage_obj;
	InvestorDashboardPageAppium Investor_Dashboard_Page_obj;
	LoginPageAppium login_Page_obj;
	
	
	@Test(priority=1)
	public void testcase1(){
		
		fundPage_obj= new FundPageAppium(driver);
    	try {
			Thread.sleep(5000);
			fundPage_obj.clickLeftMenu();
			
		} catch (InterruptedException e) {
			
			
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=2)
	public void testcase2(){
	
		
		fundPage_obj= new FundPageAppium(driver);
		Investor_Dashboard_Page_obj = new InvestorDashboardPageAppium(driver);
    	
		try {
			Thread.sleep(5000);
			fundPage_obj.clickLeftMenu();
			fundPage_obj.navigateInvestorDashboardPage();
		} catch (InterruptedException e) {
			
			
			e.printStackTrace();
		}
	
		
	}
	
	
	@Test(priority=3)
	public void testcase3(){
	
		
		fundPage_obj= new FundPageAppium(driver);
		Investor_Dashboard_Page_obj = new InvestorDashboardPageAppium(driver);
		
    	
		try {
			Thread.sleep(5000);
			fundPage_obj.clickLeftMenu();
			fundPage_obj.navigateInvestorDashboardPage();
			Investor_Dashboard_Page_obj.navigateLoginPageFromDashboard();
			Investor_Dashboard_Page_obj.navigateSignupPageFromDashboard();
			
		} catch (InterruptedException e) {
			
			
			e.printStackTrace();
		}
	
		
	}
	
	@Test(priority=4)
	public void testcase4(){
	
		
		fundPage_obj= new FundPageAppium(driver);
		Investor_Dashboard_Page_obj = new InvestorDashboardPageAppium(driver);
		
    	
		try {
			Thread.sleep(5000);
			fundPage_obj.clickLeftMenu();
			fundPage_obj.navigateInvestorDashboardPage();
			Investor_Dashboard_Page_obj.navigateSignupPageFromDashboard();
			
		} catch (InterruptedException e) {
			
			
			e.printStackTrace();
		}
	
		
	}
}
