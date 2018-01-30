package investicamobileTestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.DataProviderFactory;
import investicaMobilePages.MobileActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.HandleTouchAction;

public class Investica_Account_Creation_Mobile2 {
    
	//success using excel
	
	/*
	AndroidDriver androidDriver;
	
	@BeforeClass
	
	public void appium_initial_setUp(){
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", DataProviderFactory.getExcel().getData(0, 16, 1));
		cap.setCapability("deviceName",   DataProviderFactory.getExcel().getData(0, 17, 1));
		cap.setCapability("platformName", DataProviderFactory.getExcel().getData(0, 18, 1));
		cap.setCapability("appPackage",   DataProviderFactory.getExcel().getData(0, 19, 1));
		cap.setCapability("appActivity",  DataProviderFactory.getExcel().getData(0, 20, 1));
		
		try {
			
			androidDriver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
			//driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		try{
			Thread.sleep(10000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	

	
	@Test
	public void account_creation_mobile() throws InterruptedException{
		
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "c1b5fe2f");
		cap.setCapability("platformName", "5.1.1");
		cap.setCapability("appPackage","com.choicebroking.investica");
		cap.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
		*/
		
		/*try {
			
			androidDriver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
			//driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		Thread.sleep(20000);
	
		
		//user details
		MobileActions mobactions = PageFactory.initElements((WebDriver) androidDriver, MobileActions.class);
		mobactions.mobelement1.click();
		
		mobactions.longPress(androidDriver);
		
		
		WebElement we1 = androidDriver.findElement(By.id("com.mobeta.android.demodslv:id/drag_handle"));
		WebElement we2 = androidDriver.findElement(By.name("Miles Davis"));
			
		
		new HandleTouchAction().longPressMove(androidDriver);
		
		
		/*FundExplorer fundexplorer= PageFactory.initElements(driver, FundExplorer.class);
		fundexplorer.LeftMenuIcon.click();
		
		fundexplorer.Join.click();
		
		LoginInvesticaMobile login = PageFactory.initElements(driver, LoginInvesticaMobile.class);
		login.ClickHere.click();
		
		
		BasicDetails basic = PageFactory.initElements(driver, BasicDetails.class);
		basic.basic_Details_entry();
		
			
	}
	
	@AfterClass
	public void appium_env_teardown(){
		androidDriver.quit();
	}
	
	*/
}
