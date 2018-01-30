package PractestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import investicaMobilePages.Fund_Explorer_Page;

public class TestClass extends parallelMobileAndroidTestNew {
	
	@Test
	
	public void test1() throws Exception{
		
		Thread.sleep(10000);
		//fund explorer page
		driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
		
	}
	
	@Test
	
	public void test2() throws Exception{
		
		Thread.sleep(10000);
		//fund explorer page
		driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
		System.out.println("navigating investor dashboard");
		new Fund_Explorer_Page().navigate_Investor_Dashboard();
		
	}
	
	

}
