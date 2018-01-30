package PractestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class FundExplorer1 {
	
	public FundExplorer1(AppiumDriver appiumdriver){
		
		PageFactory.initElements(new AppiumFieldDecorator(appiumdriver), this);
	}
	
	
	
	@FindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement LeftMenuIcon;
	
	@FindBy(name="Sign In or Join")
	public WebElement Join;
	
    public void navigateSignUp(){
    	LeftMenuIcon.click();
    	Join.click();
    }

    

}
