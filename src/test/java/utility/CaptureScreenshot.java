package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;



//need to check why not coming import org.apache.commons.io.FileUtils;



public class CaptureScreenshot {
	
	static WebDriver driver;
	

	public static String takeScreenshot(WebDriver driver, String screenshotName){
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		String destination = "C:\\Softwares-Testing\\Framework1\\com.Companyname.Framework\\Screenshots\\"+screenshotName+System.currentTimeMillis()+".png";
		
		try {
			FileUtils.copyFile(src, new File(destination));
			
		} catch (IOException e) {
			
			
		}
		
		return destination;
		
		
	}
	
	//Note : For Reports return String which is used (e.g verify login testcase under testcases in desktop framework)
	public static String takeDeviceScreenshot(AppiumDriver driver, String screenshotName){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date = new Date();
		String date_timestamp = sdf.format(date);
		File src = driver.getScreenshotAs(OutputType.FILE);
			
		String destination = "C:\\Softwares-Testing\\MFAppScripts\\Screenshots\\"+screenshotName+date_timestamp+".png";
		
		
		try {
				FileUtils.copyFile(src, new File(destination));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//uncomment return destination when using in reports, since we should return path of image screenshot
		return destination;
		
		
	}
	
}
