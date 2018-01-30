package investicaMobilePages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PractestCases.parallelMobileAndroidTestNew;
import appiumGrid.AbstractPageGrid;
import factory.DataProviderFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;

//working correctly


public class Login_Investica_Page {


	public AppiumDriver driver;
	
	public Login_Investica_Page(AppiumDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
		
	}
	
	
	@FindBy(xpath="//*[@text='Click Here']")
	private static WebElement ClickHere;
	
	@FindBy(id="com.choicebroking.investica:id/etInvestorCode")
	private static WebElement InvestorCode_Field;
	
	@FindBy(id="com.choicebroking.investica:id/etPassword")
	private static WebElement Password_Field;
	
	@FindBy(id="com.choicebroking.investica:id/ibShowAndHide")
	private static WebElement eyeIcon_Button;
	
	@FindBy(id="com.choicebroking.investica:id/btnLogin")
	private static WebElement SignIn_Button_loginPage;
	
	//error messages
	
	@FindBy(id="com.choicebroking.investica:id/textinput_error")
	private static WebElement errormsg_reqd;
	
	@FindBy(id="android:id/message")
	private static WebElement unable_login_errormsg;
	
	@FindBy(id="android:id/button1")
	private static WebElement errormsg_OK_button;
	
	
	/*
	public static void navigateUserDetails(){
		
		ClickHere.click();
		//will navigate to basic details page
		PageFactory.initElements(new AppiumFieldDecorator(driver), new BasicDetailsMobile());
	}
	
	public static void login_to_investica_account(){
		
		try{
			
			
			WebDriverWait wait= new WebDriverWait(driver, 2);
			
			wait.until(ExpectedConditions.visibilityOf(InvestorCode_Field));
			//utility.Highlighter.mobileelementHighlight(driver, InvestorCode_Field);
			InvestorCode_Field.clear();
			//InvestorCode_Field.sendKeys("20000460");
			InvestorCode_Field.sendKeys(DataProviderFactory.getExcel().getData(0, 25, 1));
			wait.until(ExpectedConditions.visibilityOf(Password_Field));
			Password_Field.clear();
			//Password_Field.sendKeys("choice@123");
			Password_Field.sendKeys(DataProviderFactory.getExcel().getData(0, 26, 1));
			wait.until(ExpectedConditions.visibilityOf(eyeIcon_Button));
			eyeIcon_Button.click();
			eyeIcon_Button.click();
			
			driver.hideKeyboard();
			
			//wait.until(ExpectedConditions.visibilityOf(SignIn_Button_loginPage));
			SignIn_Button_loginPage.click();
			
			Thread.sleep(5000);
			
			PageFactory.initElements(new AppiumFieldDecorator(driver), new Dashboard());
				 
			
		}catch(Exception e){
			
			System.out.println("login_to_investica_account testcase failed");
			e.printStackTrace();
			
		}
		
		
	}
	
	public static void login_fields_error_messages(){
		
		try{
			
			WebDriverWait wait= new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.visibilityOf(SignIn_Button_loginPage));
			SignIn_Button_loginPage.click();
			Assert.assertEquals(errormsg_reqd.getText(), DataProviderFactory.getExcel().getData(0, 29, 1));
			
			InvestorCode_Field.clear();
			InvestorCode_Field.sendKeys(DataProviderFactory.getExcel().getData(0, 25, 1));
			driver.hideKeyboard();
			
			SignIn_Button_loginPage.click();
			Assert.assertEquals(errormsg_reqd.getText(), DataProviderFactory.getExcel().getData(0, 30, 1));
			
			//login with invalid credentials
			InvestorCode_Field.clear();
			InvestorCode_Field.sendKeys(DataProviderFactory.getExcel().getData(0, 33, 1));
			driver.hideKeyboard();
			
			Password_Field.clear();
			Password_Field.sendKeys(DataProviderFactory.getExcel().getData(0, 34, 1));
			driver.hideKeyboard();
			eyeIcon_Button.click();
			
			
			SignIn_Button_loginPage.click();
			Assert.assertEquals(unable_login_errormsg.getText(), DataProviderFactory.getExcel().getData(0, 35, 1));
			
			errormsg_OK_button.click();
			
		}catch(Exception e)
		{
			System.out.println("login_fields_error_messages test case failed");
			e.printStackTrace();
		}

		
		
		
		
	}
	
	*/
}
