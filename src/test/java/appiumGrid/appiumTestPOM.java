package appiumGrid;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appiumGrid.FundPageAppium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class appiumTestPOM {

	
	//This is working successfully for page object model
	AppiumDriver driver;
	
	//try this if above does not work
	//static AppiumDriver<WebElement> driver;
	
	FundPageAppium fundPage_obj;
	//declared below here bcoz navigateToLogin() will return LoginPage object==>
	//LoginPage loginPage_obj;
	
	@BeforeTest
	
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

        @Test
        public void testm1(){
        	
        	//FundPageAppium fundpage_obj= PageFactory.initElements(new AppiumFieldDecorator(driver), FundPageAppium.class);
        	
        	/*we can use ==>FundPageAppium fundPage_obj= new FundPageAppium(driver);
        	 but in case of multiple @test declare at classlevel and initialise it as shown below
        	*/
        	
        	fundPage_obj= new FundPageAppium(driver);
        	
        	try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
        	
        	//working successfully
        	//fundPage_obj.LeftMenuIcon.click();
        	
        	//working successfully
        	 fundPage_obj.clickLeftMenu();
        	/*now when I use navigateToLogin() it will return me LoginPage object
        	*e.g
        	*LoginPage = fundPage_obj.navigateToLogin(); will return LoginPage object
        	*Hence no need to create Login Page obj but declare it above in class level as shown above
        	*LoginPage.setloginCreds();
        	*/
        	
        }
        
        @AfterTest
        public void tearDown(){
        	driver.quit();
        }
}
