package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;

public class Aadhaar extends AbstractPage
{
	@FindBy(id= "com.choicebroking.investica:id/adhar_no")
	private static WebElement AadhaarNo;

	@FindBy(id= "com.choicebroking.investica:id/generate_otp")
	private static WebElement GenerateOTP;

	@FindBy(id= "com.choicebroking.investica:id/skip")
	private static WebElement Skip;
	
	@FindBy(id= "com.choicebroking.investica:id/btnBottomSheetPositive")
	private static WebElement SkipDoc;

	@FindBy(id= "com.choicebroking.investica:id/btnBottomSheetNegative")
	private static WebElement Cancel;
	
	public static void navigateToAadhaarPage()
	{
		try {
			  Thread.sleep(5000);
			  
			  AadhaarNo.click();
			  GenerateOTP.click();
			  
			 } 
		catch (InterruptedException e) 
		    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),new Aadhaar());
	}
	
	
	
	

}
