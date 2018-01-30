package appiumGrid;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCasesParallel extends parallelAndroidPom {

	
	@Test(priority=1)
	
	public void testm1(){
		
		ParallelPage1.testm1();
		
	}
	
	
	@Test(priority=2)
	public void testm2(){
		
		ParallelPage1.testm2();
		
	}
	
	
	@Test(priority=3)
	public void testm3(){
		
		ParallelPage1.testm2();
		
	}
	
	@Test(priority=3)
	public void testm4(){
		
		ParallelPage1.testm3();
		
	}
	

}
