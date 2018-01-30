package utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import investicaMobilePages.Fund_Explorer_Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AbstractTest {

	//for cross platform-old working fine
	//public static AndroidDriver driver;
	
	//new==added public
	public static AndroidDriver driver;
	
	//initialise the environment only once before suite
	
	@BeforeMethod
	
	public static void createEnvironment(){
		
		//Desired Capabilities will need to be parameterized 
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("deviceName", "c1b5fe2f");
		capabilities.setCapability("app", "C:\\Users\\Admin\\Desktop\\Apks\\Investica\\appium\\app-debug.apk");
		capabilities.setCapability("appPackage", "com.choicebroking.investica");
		capabilities.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
		
		//capabilities.setCapability("newCommandTimeout", 60);
		

		
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		PageFactory.initElements(new AppiumFieldDecorator(driver), new Fund_Explorer_Page());
	}
	
	@AfterMethod
	public static void tearEnvironment(){
		
		//used to close the run
		driver.closeApp();
		//driver.launchApp();
		//driver.close();
	}
	
	
}
