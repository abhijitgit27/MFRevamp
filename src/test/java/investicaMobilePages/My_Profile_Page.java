package investicaMobilePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appiumGrid.AbstractPageGrid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;

public class My_Profile_Page extends AbstractPageGrid {
	
	public AppiumDriver driver;
	
	public My_Profile_Page(AppiumDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
		
	}
	
	
	@FindBy(id= "Sign In or Join")
	private static WebElement SignIn_Or_Join_Button;
	
	//navigate to Login page from My Profile as guest user
	public static void navigate_Login_From_MyProfile(){
		
		try{
			 
			SignIn_Or_Join_Button.click();
			
			//will navigate to Login/signin page
			//PageFactory.initElements(new AppiumFieldDecorator(driver), new LoginInvesticaMobileNew());
			 
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	

}
