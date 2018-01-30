package PractestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Test1 {

	AppiumDriver<MobileElement> mobDriver;
	WebDriver driver;
	
	
	@Test
	public void account_creation_mobile() throws InterruptedException{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "c1b5fe2f");
		cap.setCapability("platformName", "5.1.1");
		cap.setCapability("appPackage","com.choicebroking.investica");
		cap.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
		
		try {
			
			mobDriver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
			//driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		Thread.sleep(10000);
		
		
		FundExplorer1 FundExplorer1 = PageFactory.initElements(mobDriver, FundExplorer1.class);
		FundExplorer1.LeftMenuIcon.click();
		
}
	
}

