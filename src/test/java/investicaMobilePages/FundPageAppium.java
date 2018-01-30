package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FundPageAppium {

	//no need for public? as per video
	public AppiumDriver driver;
	
	public FundPageAppium(AppiumDriver driver){
		
		this.driver = driver;
		//PageFactory.initElements
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	@AndroidFindBy(xpath= "//android.widget.ImageButton[@index='0']")
	public MobileElement LeftMenuIcon;
	
	//if above mobileElement does not work
	@AndroidFindBy(xpath= "//android.widget.ImageButton[@index='0']")
	public WebElement LeftMenuIcon1;
	
	//for calling list
	/*@AndroidFindBy(id="sdf")
	private List<WebElement> xyz;*/
	
	public void clickLeftMenu(){
		LeftMenuIcon.click();
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
