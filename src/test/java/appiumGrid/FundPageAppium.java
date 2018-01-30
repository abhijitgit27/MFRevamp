package appiumGrid;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FundPageAppium {

	//This class is working successfully for page object model
	//no need for public? as per blog
	public AppiumDriver driver;
	
	public FundPageAppium(AppiumDriver driver){
		
		this.driver = driver;
		//Use below if pagefactory with implicit does not work
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
		
		//PageFactory model with Appium, then you can add implicit wait in InitElements() method as below
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	
	@AndroidFindBy(xpath= "//android.widget.ImageButton[@index='0']")
	public MobileElement LeftMenuIcon;
	
	//if above mobileElement does not work
	@AndroidFindBy(xpath= "//android.widget.ImageButton[@index='0']")
	public WebElement LeftMenuIcon1;
	
	//for calling list
	/*@AndroidFindBy(id="sdf")
	private List<WebElement> xyz;*/
	
	@FindBy(xpath="//*[@text='Investor Dashboard']")
	private static WebElement Investor_Dashboard_Link;
	
	
	@FindBy(xpath= "//*[@text='Fund Explorer']")
	private static WebElement Fund_Explorer_Link;
	
	
	@FindBy(xpath= "//*[@text='My Investments']")
	private static WebElement My_Investments_Link;
	
	
	public void clickLeftMenu(){
		
		try {
			Thread.sleep(1000);
			LeftMenuIcon.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public InvestorDashboardPageAppium navigateInvestorDashboardPage(){
		
		try {
			Thread.sleep(1000);
			Investor_Dashboard_Link.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new InvestorDashboardPageAppium(driver);
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
