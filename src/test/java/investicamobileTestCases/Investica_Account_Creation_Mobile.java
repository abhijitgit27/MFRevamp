package investicamobileTestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import investicaMobilePages.BasicDetails;
import investicaMobilePages.FundExplorerOld;
import investicaMobilePages.Login_Investica;
import io.appium.java_client.android.AndroidDriver;

public class Investica_Account_Creation_Mobile {

	/*
	WebDriver driver;
	
	//adding extent reports
	
	ExtentReports report;
	ExtentTest logger;
	
	public void appium_initial_setUp() throws InterruptedException{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Google Nexus 5X");
		cap.setCapability(CapabilityType.VERSION, "6.0.0");
		cap.setCapability("appPackage","com.choicebroking.investica");
		cap.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
		
		try {
			
			driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		Thread.sleep(10000);
		
	}
	

	public void report_setUp(){
		
		//new reports will override old reports each time
		report= new ExtentReports("C:\\Softwares-Testing\\Framework1\\com.Companyname.Framework\\Reports\\investica_mobile"+System.currentTimeMillis()+".html", false);
			
	}
	
	@Test
	public void account_creation_mobile(){
		
		logger = report.startTest("account creation", "test description: creation of account on investica from mobile device");
		
		//user details
		FundExplorerOld fundexplorer= PageFactory.initElements(driver, FundExplorerOld.class);
		fundexplorer.LeftMenuIcon.click();
		
		String account_creation_imagepath1= logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, "LeftMenu"));
		logger.log(LogStatus.INFO, account_creation_imagepath1);
		
		fundexplorer.Join.click();
		
		Login_Investica login = PageFactory.initElements(driver, Login_Investica.class);
		login.ClickHere.click();
		
		logger.log(LogStatus.INFO, "Entering User details");
		
		BasicDetails basic = PageFactory.initElements(driver, BasicDetails.class);
		basic.basic_Details_entry();
		
			
	}
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(result.getStatus()== ITestResult.FAILURE){
			
			String path4 = logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, result.getName()));
			logger.log(LogStatus.FAIL, path4);
		}
		
		report.endTest(logger);
		report.flush();
		driver.close();
	}
	
	*/
}
