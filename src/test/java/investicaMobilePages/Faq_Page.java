package investicaMobilePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appiumGrid.AbstractPageGrid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;

public class Faq_Page extends AbstractPageGrid {

	public AppiumDriver driver;
	
	public Faq_Page(AppiumDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
		
	}
	
	
	@FindBy(id= "Navigate up")
	private static WebElement Cross_Button;
	
	
	public static void close_Faq(){
		
		try{
		
			Cross_Button.click();
			
	     }catch(Exception e){
		
	}

	}

}
