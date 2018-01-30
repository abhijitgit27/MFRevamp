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
import org.testng.annotations.Test;

import appiumGrid.FundPageAppium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class appiumTestPOM2 {

	
	//This is working successfully for page object model
	AppiumDriver driver;
	
	//try this if above does not work
	//static AppiumDriver<WebElement> driver;
	
	FundPageAppium fundPage_obj;
	//declared below here bcoz navigateToLogin() will return LoginPage object==>
	//LoginPage loginPage_obj;
	
	@BeforeMethod
	
	public void appium_initial_setUp(){
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "c1b5fe2f");
		cap.setCapability("platformVersion", "5.1.1");
		cap.setCapability("appPackage", "com.choicebroking.investica");
		cap.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
		try {
			driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			
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
