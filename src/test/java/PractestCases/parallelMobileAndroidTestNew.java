package PractestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class parallelMobileAndroidTestNew {

	/*Below script working correctly for appium grid with parallelMobilegrid.xml located at below location
	C:\Softwares-Testing\MFAppScripts\TestCases XML\parallelMobilegrid.xml 
	open 2 appium desktop app for connecting 2 android devices
	in app just check override session and change port as mentioned in xml with gap of 10 and bootstrap port as 100 and 200 etc
	*/
	
	URL url;
	
	//revert to below if not working since below is working
	protected AppiumDriver<MobileElement> driver;
	
	
	//trying for appium grid mulitple testcases in same suite
	//public static AndroidDriver driver;
	//protected static AppiumDriver<MobileElement> driver;
	
	@Parameters({"device","apppackage","activity","version","appiumServer"})
	@BeforeClass
	public void GridAndroidSetup(String device,String apppackage1,String activity,String version,String appiumServer){
		
		System.out.println("=====");
		System.out.println("Setting up device and desired capablilities");
		
		
		DesiredCapabilities cap1 = DesiredCapabilities.android();
		cap1.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		cap1.setCapability(MobileCapabilityType.UDID, device);
		cap1.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		cap1.setCapability("appPackage", apppackage1);
		cap1.setCapability("appActivity", activity);
		cap1.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		//cap1.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.ANDROID);
		cap1.setCapability(MobileCapabilityType.VERSION, version);
		
		try {
			url= new URL(appiumServer);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		driver= new AndroidDriver<>(url, cap1);
		
		
	}
	
	

	@AfterClass
	public void tearDown1(){
		if(driver!=null){
			
			System.out.println("Destroying test Environment");
			driver.quit();
		}
	}
}
