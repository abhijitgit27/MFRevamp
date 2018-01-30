package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class HelperClass {

	// int horizontal and int vertical are pixels
	//+ is used to pass horizontal comma and brackets
	
	public static void scrollDown(WebDriver driver, int horizontal, int vertical){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("scroll("+horizontal+","+vertical+")");
		
		
	}
	
	//it will check for specific element
	
	public static void scrollIntoView(WebDriver driver,WebElement element){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
	public static void mobileScrollIntoView(AppiumDriver driver,WebElement element){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
	public static void swipeMobileScreenVertically(AppiumDriver driver){
		
		try{
			
					Dimension dimensions = driver.manage().window().getSize();
					Double mobileScreenHeightStart = dimensions.getHeight()*0.5;
					
					int scrollStart = mobileScreenHeightStart.intValue();
					
					Double mobileScreenHeightEnd = dimensions.getHeight()*0.2;
					int scrollEnd = mobileScreenHeightEnd.intValue();
					
					new TouchAction(driver).press(0,scrollStart ).waitAction(2000).moveTo(0, scrollEnd).release().perform();
					
					Thread.sleep(2000);
			 

			
		}catch(Exception e){
			
			System.out.println("element is not displayed. Hence keep on scrolling");
		}
	
	}
	
	public static void swipeMobileScreenHorizontally(AppiumDriver driver, WebElement element){
		
		try{
			
					//not working
					int wide = element.getSize().getWidth();
					int hgt = element.getSize().getHeight();
					
					int startx = (int)(wide*(0.8));
					int endx= (int)(wide*(0.2));
					
					int starty = hgt/2;
					int endy= hgt/2;
					
					System.out.println("wide"+wide+" hgt"+hgt+ "startx"+startx+" endx"+endx+" starty"+starty);
					new TouchAction(driver).press(startx,0 ).waitAction(2000).moveTo(endx, 0).release().perform();
					
					Thread.sleep(2000);

																					
		}catch(Exception e){
			
			System.out.println("element is not displayed. Hence keep on scrolling");
		}
	
	}
	
	public static void swipeElementScreenHorizontally(AppiumDriver driver, WebElement element, int x, int y ){
		
		try{
					//working correctly
					
					new TouchAction(driver).longPress(element).moveTo(x,y).release().perform();
					
					Thread.sleep(2000);
					
					//Dimension size = driver.manage().window().getSize();
					
					//swiping from right to left
                    //			   size.width-1, size.height/2, 1,    size.height/2, 	2000
					//driver.swipe(startx,       starty,       endx,   endy,       duration);
					//swiping from left to right
					//driver.swipe(startx,       starty,       endx,   endy,       duration);
					
																								
		}catch(Exception e){
			
			System.out.println("element is not displayed. Hence keep on scrolling");
		}
	
	}
	
	public static void tapMobileElement(AppiumDriver driver, WebElement element){
		
		try{
			
			//working correctly
			new TouchAction(driver).tap(element).perform().release();
			
		}catch(Exception e){
			
			System.out.println("Failed to tap mobile Element:"+ element);
			e.printStackTrace();
		}
	}
	
	public static void rotate_Device_Screen(AppiumDriver driver, String ChangeOrientation){
		
		try{
			
			ScreenOrientation current_orientation= driver.getOrientation();
			System.out.println("Current orientation is: "+current_orientation);
			
			if(ChangeOrientation.equalsIgnoreCase("LANDSCAPE")){
				
				driver.rotate(ScreenOrientation.LANDSCAPE);
				System.out.println("Current screen orientation after rotation :"+driver.getOrientation());
				
			}else if(ChangeOrientation.equalsIgnoreCase("PORTRAIT")){
				
				driver.rotate(ScreenOrientation.PORTRAIT);
				System.out.println("Current screen orientation after rotation:"+driver.getOrientation());
				
			}
			
			
		}catch(Exception e){
			
			System.out.println("Screen rotation failed");
			e.printStackTrace();
		}
	}
	
	public static void switch_To_Differnt_App(AppiumDriver driver,String appPackage,String appActivity){
		
		Activity activity = new Activity(appPackage, appActivity);
		//activity.setWaitAppPackage("app wait package goes here");
		//activity.setWaitAppActivity("app wait activity goes here");
		((AndroidDriver)driver).startActivity(activity);
		
	}
	
	public static void run_App_inBackground(AppiumDriver driver, int Time_for_Background){
		
		((AndroidDriver)driver).runAppInBackground(10);
		
	}
	
	public static void get_OTP_from_Sms(AppiumDriver driver){
		
		
		List<WebElement> message_Sub= driver.findElements(By.id("com.android.mms:id/subject"));
		
		
		for(int i=0; i<message_Sub.size();i++){
			
			System.out.println("without split:"+message_Sub.get(i).getText());
			
			String[] message_Text= message_Sub.get(i).getText().split(",",-2);
			
			for(String message:message_Text){
				
				System.out.println("split:"+message);
				
			}
			

		}
		
		
		/* after scroll appium fails to capture each message , there is known bug in appium library
		for(WebElement m1:message_Sub){
			
			if(m1.getText().equalsIgnoreCase("OTP for Aadhaar")){
				
				System.out.println(m1.getText().split("is",-2));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			else if(!(m1.getText().equalsIgnoreCase("OTP for Aadhaar"))){
				swipeMobileScreenVertically(driver);
				System.out.println(m1.getText());
			}
		}
		*/

			
	}
	
	
}
