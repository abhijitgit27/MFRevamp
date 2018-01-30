package appiumGrid;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCasesParallel2 extends parallelAndroidPom {

	
	@Test(priority=1)
	
	public void testm1(){
		
		ParallelPage2.testm1_navigate_MyInvestmentspPage();
		
	}
	
	
	@Test(priority=2)
	public void testm2(){
		
		ParallelPage2.testm2_navigate_Investor_Dashboard();
		
	}
	
	/*
	
	@Test(priority=3)
	public void testm3(){
		
		ParallelPage2.testm2_navigate_Investor_Dashboard();
		
	}
	
	*/

}
