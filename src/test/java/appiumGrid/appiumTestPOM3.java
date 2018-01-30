package appiumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import appiumGrid.FundPageAppium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class appiumTestPOM3 {

	
	//This is working successfully for page object model
	//revert to remove protected and no access modifiers for AppiumDriver
	protected AppiumDriver driver;
	
	//try this if above does not work
	//static AppiumDriver<WebElement> driver;
	
	//FundPageAppium fundPage_obj;
	//declared below here bcoz navigateToLogin() will return LoginPage object==>
	//LoginPage loginPage_obj;
	
	@BeforeMethod
	@Parameters({"port","device","platform_name","platform_version"})
	//@Parameters({"device","platform_name","platform_version"})
	
	public void appium_initial_setUp(String port, String device, String platform_name, String platform_version) throws MalformedURLException{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", platform_name);
		cap.setCapability("deviceName", device);
		cap.setCapability("platformVersion", platform_version);
		//cap.setCapability("applicationName", "Lenovo Z1");
		cap.setCapability("appPackage", "com.choicebroking.investica");
		cap.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
		
		URL url= new URL("http://localhost:"+port+"/wd/hub");
		
		try {
				driver= new AndroidDriver(url, cap);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

        
        
        @AfterMethod
        public void tearDown(){
        	//driver.quit();
        	driver.closeApp();
        }
}
