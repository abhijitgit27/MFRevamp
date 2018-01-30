package appiumGrid;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelAndroidPom {

	
	//Need to verify for page object model and with appium driver
	
	public static AppiumDriver driver;
	public static DesiredCapabilities cap;
	
	//@BeforeTest(use if u want 1 session) and @AfterTest
	//try @BeforeClass
	
	@BeforeClass
	@Parameters({"port","device","platform_name","platform_version"})
	public void setUp(String port, String device, String platform_name, String platform_version) throws MalformedURLException{
		
		//File file = new File("C:\\Users\\Admin\\Desktop\\Apks\\Investica\\appium\\app-debug.apk");
		
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		cap.setCapability("applicationName", "Lenovo Z1");
		//cap.setCapability(MobileCapabilityType.APP, file);
		cap.setCapability("appPackage", "com.choicebroking.investica");
		cap.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
		
		URL url= new URL("http://localhost:"+port+"/wd/hub");
		
		driver = new AndroidDriver<MobileElement>(url,cap);
		try{
			Thread.sleep(10000);
		}catch(Exception e){
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//adding fundExplorer page invokation
		PageFactory.initElements(new AppiumFieldDecorator(driver), new ParallelPage1());
		
		
	}
	

	
	@AfterClass
	public void tearDown(){
		driver.closeApp();
		//driver.quit();
		
	}
}
