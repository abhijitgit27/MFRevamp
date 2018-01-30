package investicamobileTestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppiumDemo {

	/*
	@Test
	
	public void launchApk() throws MalformedURLException, InterruptedException
	
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Google Nexus 5X");
		cap.setCapability(CapabilityType.VERSION, "6.0.0");
		cap.setCapability("appPackage","com.choicebroking.investica");
		cap.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
		
		WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
				
		Thread.sleep(10000);
		//fund explorer page
		driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
		
		//left drawer
		driver.findElement(By.name("Sign In or Join")).click();
		
		//sign in 
		
		driver.findElement(By.name("Click Here")).click();
		
		driver.findElement(By.id("com.choicebroking.investica:id/email")).sendKeys("inauto1@mailinator.com");
		
		driver.findElement(By.id("com.choicebroking.investica:id/mobile")).sendKeys("1234567890");
		
		//driver.findElement(By.id("com.choicebroking.investica:id/dob")).sendKeys("inauto1@mailinator.com");
		
		driver.findElement(By.id("com.choicebroking.investica:id/pan")).sendKeys("AABBC5432A");
		
		driver.findElement(By.id("com.choicebroking.investica:id/refID")).sendKeys("ASD1234");
		
		//driver.findElement(By.name("Terms and Conditions")).click();
			
		//driver.findElement(By.id("com.choicebroking.investica:id/tnc_chkbox")).click();
		
		driver.findElement(By.name("I have read all agreed to the Terms of Use.")).click();
		
		driver.findElement(By.id("com.choicebroking.investica:id/continueBtn")).click();
		
		
		//Aadhaar Card 2nd page
		driver.findElement(By.id("com.choicebroking.investica:id/adhar_no")).sendKeys("987654321230");
		
		driver.findElement(By.id("com.choicebroking.investica:id/generate_otp")).click();
		
		//error message for invalid aadhaar number
		
		String invalid_aadhar = driver.findElement(By.id("com.choicebroking.investica:id/api_received_msg")).getText();
	
		//aadhaar success message
		String success_aadhaar_msg  = driver.findElement(By.id("com.choicebroking.investica:id/api_received_msg")).getText();
		
		driver.findElement(By.id("RESEND OTP")).click();
		
		
		//driver.findElement(By.id(id));
		
		//for entering otp
		driver.findElement(By.id("com.choicebroking.investica:id/etOtp1")).sendKeys("1");
		driver.findElement(By.id("com.choicebroking.investica:id/etOtp2")).sendKeys("2");
		driver.findElement(By.id("com.choicebroking.investica:id/etOtp3")).sendKeys("3");
		driver.findElement(By.id("com.choicebroking.investica:id/etOtp4")).sendKeys("4");
		driver.findElement(By.id("com.choicebroking.investica:id/etOtp5")).sendKeys("5");
		driver.findElement(By.id("com.choicebroking.investica:id/etOtp6")).sendKeys("6");
		
		//for skipping
		driver.findElement(By.id("com.choicebroking.investica:id/skip")).click();
		
		Thread.sleep(10000);
		
		//frame uidai
		String frame_name= driver.findElement(By.className("android.widget.FrameLayout")).getText();
		
		driver.findElement(By.id("android:id/button1")).click();
		
		//basic details page
		String pan_fullname = driver.findElement(By.id("com.choicebroking.investica:id/fullname")).getText();
		
		System.out.println(pan_fullname);
		
		driver.findElement(By.id("com.choicebroking.investica:id/father_name")).sendKeys("Dad");
		
		driver.findElement(By.id("com.choicebroking.investica:id/mother_name")).sendKeys("Mom");
		
		String dob = driver.findElement(By.id("com.choicebroking.investica:id/dob")).getText();
		
		String pan_number= driver.findElement(By.id("com.choicebroking.investica:id/pan")).getText();
		
		String aadhar_number= driver.findElement(By.id("com.choicebroking.investica:id/adhar")).getText();
		
		
		//driver.findElement(By.id("com.choicebroking.investica:id/rb_yes")).click();
		
		//default selected political party
		driver.findElement(By.id("com.choicebroking.investica:id/rb_no")).click();
		
		driver.findElement(By.id("com.choicebroking.investica:id/rb_yes")).click();
		
		//pre populated based on card details
		
		//driver.findElement(By.id("com.choicebroking.investica:id/gender1")).click();
		
		driver.findElement(By.id("com.choicebroking.investica:id/gender2")).click();
		
		//pre populated based on Marital status
		
		//driver.findElement(By.id("com.choicebroking.investica:id/marital_status1")).click();
		
		driver.findElement(By.id("com.choicebroking.investica:id/marital_status2")).click();
		
		driver.findElement(By.id("com.choicebroking.investica:id/continueBtn")).click();
		
		//address page
		//pre populated but need to verify if data not there for all address page
		driver.findElement(By.id("com.choicebroking.investica:id/address")).sendKeys("A KAILADEVI MARBAL,NAINA GARH ROAD,Morena");;
		driver.findElement(By.id("com.choicebroking.investica:id/city")).sendKeys("Morena");
		driver.findElement(By.id("com.choicebroking.investica:id/state")).sendKeys("Madhya Pradesh");
		driver.findElement(By.id("com.choicebroking.investica:id/zipcode")).sendKeys("476001");
		//checked by default
		driver.findElement(By.id("com.choicebroking.investica:id/address_chkbox")).click();
		
		//on unchecking checkbox
		
		driver.findElement(By.id("com.choicebroking.investica:id/address1")).sendKeys("address line 2");
		driver.findElement(By.id("com.choicebroking.investica:id/city1")).sendKeys("Mumbai");
		WebElement state= driver.findElement(By.id("com.choicebroking.investica:id/state1"));
		state.click();
		//scroll and click in new dropdown page or search list
		driver.findElement(By.id("com.choicebroking.investica:id/ivSearchButton")).click();
		
		//enter state e.g Maharashtra to select
		
		driver.findElement(By.id("com.choicebroking.investica:id/search")).sendKeys("Andhra Pradesh");
		
		//List state = driver.findElement(By.id("com.choicebroking.investica:id/bankNameList")).getText();
		//get list of state if required
		List state_list = driver.findElements(By.id("com.choicebroking.investica:id/bankNameList"));
	
		driver.findElement(By.id("com.choicebroking.investica:id/zipcode1")).sendKeys("485002");
		
		driver.findElement(By.id("com.choicebroking.investica:id/continueBtn")).click();
		
		//nominee page-Minor unchecked by default
		
		driver.findElement(By.id("com.choicebroking.investica:id/name")).sendKeys("ashish");
		
		driver.findElement(By.id("com.choicebroking.investica:id/nominee")).click();
		
		//need to handle dropdown
		
		List nominee_values= driver.findElements(By.id("com.choicebroking.investica:id/listNominee"));
		//driver.findElement(By.name("Mother")).click();
		
		
		
		
		driver.findElement(By.id("com.choicebroking.investica:id/minor_chkbox")).click();
		
		//minor dob
		driver.findElement(By.id("com.choicebroking.investica:id/dob")).click();
		//handle calender
		
		//driver.findElement(By.className("android.widget.FrameLayout"));
		List month_table = driver.findElements(By.id("android:id/month_view"));
		
		//to skip nominee details
		driver.findElement(By.id("com.choicebroking.investica:id/btnSkipNominee")).click();
		//to save nominee details
		driver.findElement(By.id("com.choicebroking.investica:id/continueBtn")).click();
		
		
		driver.findElement(By.id(""));
		
		
		
		
			
		
	}
	*/
}
