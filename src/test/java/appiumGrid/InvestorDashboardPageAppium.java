package appiumGrid;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvestorDashboardPageAppium {

	//This class is working successfully for page object model
	
	public AppiumDriver driver;
	
	
	public InvestorDashboardPageAppium(AppiumDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);	
		
		//Use below if above pagefactory with implicit does not work
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
	//if above mobileElement does not work
	@AndroidFindBy(xpath= "//android.widget.ImageButton[@index='0']")
	public WebElement LeftMenuIcon1;
	
	
	@FindBy(xpath= "//*[@text='Login']")
	private static WebElement LoginButton;
	
	//Open an Account
	@FindBy(xpath= "//*[@text='Open an Account']")
	private static WebElement OpenAccount;
	
	//Seems like you are a Guest user
	@FindBy(xpath= "//*[@text='Seems like you are a Guest user']")
	private static WebElement Guest_User_Text;
	
	
	//for calling list
	/*@AndroidFindBy(id="sdf")
	private List<WebElement> xyz;*/
	
	@FindBy(xpath="//*[@text='Investor Dashboard']")
	private static WebElement Investor_Dashboard_Link;
	
	
	public LoginPageAppium navigateLoginPageFromDashboard(){
		
		try{
			
			Thread.sleep(1000);
			LoginButton.click();
			
		}catch(Exception e){
			System.out.println("Login button not clickable");
		}
		return new LoginPageAppium(driver);
	}
	
	public SignUpPageAppium navigateSignupPageFromDashboard(){
		
		try{
			
			Thread.sleep(1000);
			OpenAccount.click();
			
		}catch(Exception e){
			//System.out.println("OpenAccount button not clickable");
		}
		return new SignUpPageAppium(driver);
	}
	
	
	/*say on clicking login button login page opens
	 * so we can use below method
	 * public LoginPage navigateToLogin(){
	          LoginButton.click();
	          return new LoginPage(driver); 
	   }
	 *
	 */
	
	
}
