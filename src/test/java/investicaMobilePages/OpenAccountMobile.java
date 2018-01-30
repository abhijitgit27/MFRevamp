package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;

public class OpenAccountMobile extends AbstractPage
{
	@FindBy(id= "com.choicebroking.investica:id/email")
	private static WebElement Email;
	
	@FindBy(id= "com.choicebroking.investica:id/mobile")
	private static WebElement MobileNo;
	
	@FindBy(id= "com.choicebroking.investica:id/dob")
	private static WebElement DOB;
	
	@FindBy(id= "com.choicebroking.investica:id/pan")
	private static WebElement PAN;
	
	@FindBy(id= "com.choicebroking.investica:id/refID")
	private static WebElement Referral;
	
	@FindBy(id= "com.choicebroking.investica:id/btnTermsAndConditions")
	private static WebElement UsagePolicy;
	
	@FindBy(id= "com.choicebroking.investica:id/tnc_chkbox")
	private static WebElement TermC;
	
	@FindBy(id= "com.choicebroking.investica:id/continueBtn")
	private static WebElement Continue;
	
	public static void navigateToAadhaar()
	{
		try {
			  Thread.sleep(5000);
			  Email.sendKeys("ankush@choicetechla.com");
			  MobileNo.sendKeys("9874563210");
			  DOB.sendKeys("26.02.1995");
			  PAN.sendKeys("AWEPQ4521F");
			  Referral.sendKeys("Free");
			  TermC.click();
			  Continue.click();
			  
			 } 
		catch (InterruptedException e) 
		    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),new Aadhaar());
	}
	
	

}
