package appiumGrid;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAppium {

	//This class is working successfully for page object model
	//no need for public? as per video
	public AppiumDriver driver;
	
	public LoginPageAppium(AppiumDriver driver){
		
		this.driver = driver;
		//PageFactory.initElements
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	

	/*
	@FindBy(name= "Login")
	private static WebElement LoginButton;
	*/

	
	
	//for calling list
	/*@AndroidFindBy(id="sdf")
	private List<WebElement> xyz;*/
	
	
	
	
	/*say on clicking login button login page opens
	 * so we can use below method
	 * public LoginPage navigateToLogin(){
	          LoginButton.click();
	          return new LoginPage(driver); 
	   }
	 *
	 */
	
	
}
