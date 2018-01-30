package utility;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class HandleAutoComplete {

	public static void autocomplete(AppiumDriver driver, List<WebElement> optionsToSelect, String textToSelect){
		
		try{
			
			for(WebElement option : optionsToSelect ){
				
				System.out.println("list options "+ option.getText());
				if(option.getText().equalsIgnoreCase(textToSelect)){
					//need to check with tap also
					option.click();
					break;
				}
			}
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	public static void autocompletenew(AppiumDriver driver, List<WebElement> optionsToSelect, String textToSelect){
		
		try{
			
			System.out.println(optionsToSelect.size() + " ->");
			
			for(WebElement option : optionsToSelect ){
				
				System.out.println("list options "+ option.getText());
				System.out.println(option.getText() + "-->");
				
				if(option.getText().equalsIgnoreCase(textToSelect)){
					
					option.click();
					break;
					
				}else if(!option.getText().equalsIgnoreCase(textToSelect)){
					
					HelperClass.swipeMobileScreenVertically(driver);
					
				}else{
					System.out.println("Why here?");
				}
				
			}
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
}
