package PractestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PracTestCases {
	
	AppiumDriver<WebElement> appiumdriver;
	WebDriver driver;
	
	@Test
	 //utility tested passed
	public void testnewUtility1(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium server3.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		
		List<WebElement> hiddenElements = driver.findElements(By.id("male"));
		
		utility.HandleHiddenElements.click_Hidden_Elements(driver, hiddenElements);
		
		driver.close();
	}
	
	
	@Test
	public void testnewUtility2(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium server3.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		utility.VerifyBrokenLinks.getAllLinks_OnPage(driver);
			
	}
	
	@Test
	public void testnewUtility3(){
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("deviceName", "c1b5fe2f");
		capabilities.setCapability("app", "C:\\Users\\Admin\\Desktop\\Apks\\Investica\\appium\\app-debug.apk");
		capabilities.setCapability("appPackage", "com.choicebroking.investica");
		capabilities.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
		

		
		try {
			appiumdriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		FundExplorer1 fundexp1 = new FundExplorer1(appiumdriver);
		fundexp1.navigateSignUp();
	}

}
