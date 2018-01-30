package investicaMobilePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;

public class My_Transactions_Page {
	
	public AppiumDriver driver;
	
	public My_Transactions_Page(AppiumDriver driver){
		
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	
	
	@FindBy(id= "Sign In or Join")
	private WebElement SignIn_Or_Join_Button;
	
	@FindBy(xpath= "//*[@text='Login']")
	private WebElement Login_Button;
	
	@FindBy(xpath= "//*[@text='Open an Account']")
	private WebElement Open_An_Account;
	
	//navigate to Login page from My Investments as guest user
		public static void navigate_Login_From_MyTransactions(){
			
			try{
				 System.out.println("hi");
				 //Open_An_Account.click();
				 System.out.println("open account button clicked");
				 //Login_Button.click();
				
				//will navigate to Login/signin page
				//PageFactory.initElements(new AppiumFieldDecorator(driver), new LoginInvesticaMobileNew());
				 
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
		}

}
