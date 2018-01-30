package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appiumGrid.AbstractPageGrid;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;

public class MyInvestments extends AbstractPageGrid {
	
	@FindBy(id= "Sign In or Join")
	private static WebElement SignIn_Or_Join_Button;
	
	@FindBy(xpath= "//*[@text='Login']")
	private static WebElement Login_Button;
	
	@FindBy(xpath= "//*[@text='Open an Account']")
	private static WebElement Open_An_Account;
	
	
	//navigate to Login page from My Investments as guest user
	public static void navigate_Login_From_MyInvestments(){
		
		try{
			 
			
			Login_Button.click();
			
			//will navigate to Login/signin page
			//PageFactory.initElements(new AppiumFieldDecorator(driver), new Login_Investica_Page());
			 
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	

}
