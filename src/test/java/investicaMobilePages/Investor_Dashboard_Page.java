package investicaMobilePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appiumGrid.AbstractPageGrid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;

public class Investor_Dashboard_Page{
	
	public AppiumDriver driver;
	
	
	public Investor_Dashboard_Page(AppiumDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	
	@FindBy(name= "Login")
	private static WebElement LoginButton;
	
	@FindBy(id= "Open an Account")
	private static WebElement OpenAccount;
	
	@FindBy(name= "Seems like you are a Guest user")
	private static WebElement Guest_User_Text;
	
	//methods
	
	public static void navigate_Login_From_Dashboard(){
		
		try{
			
			 LoginButton.click();
			 //will navigate to LoginInvesticaMobile page
				//PageFactory.initElements(new AppiumFieldDecorator(driver), new Login_Investica_Page());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void Open_Account_From_Dashboard(){
		
		try{
			
			OpenAccount.click();
			//will navigate to Open Your Investment Account page, update below
			//PageFactory.initElements(new AppiumFieldDecorator(driver), new LoginInvesticaMobileNew());
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
