package appiumGrid;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelMobileAndroidTest {

	//This class for parallelmobile test i.e grid was success with json files and globally installed appium
	//use along with C:\Softwares-Testing\MFAppScripts\src\test\java\appiumGrid\parallelMobiletestng.xml .
	
	//Need to verify for page object model and with appium driver
	
	public AndroidDriver<MobileElement> driver;
	public static DesiredCapabilities cap;
	
	@BeforeTest
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void test1() throws Exception{
		
		Thread.sleep(5000);
		//fund explorer page
		driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
