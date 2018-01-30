package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class HandlePageIndicator {

	//use for webdriver driver
	public static void clickPageIndicator(WebDriver driver, WebElement pagination, String pagination_value){
		
		//one less than page you want to be
		try{
			
			pagination.sendKeys(pagination_value);
			Thread.sleep(1000);
			
		}catch(Exception e){
			
			System.out.println(e);
			
		}
		
		
	}
	
	//use for appium driver ie. any android or ios driver
	public static void clickMobilePageIndicator(AppiumDriver<WebElement> driver, WebElement pagination, String pagination_value){
		
		//one less than page you want to be
		try{
			
			pagination.sendKeys(pagination_value);
			Thread.sleep(1000);
			
		}catch(Exception e){
			
			System.out.println(e);
			
		}
		
		
	}
	
}
