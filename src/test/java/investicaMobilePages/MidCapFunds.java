package investicaMobilePages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import appiumGrid.AbstractPageGrid;
import utility.AbstractPage;

public class MidCapFunds extends AbstractPageGrid {
	
	@FindBy(id= "com.choicebroking.investica:id/tvTitle")
	public static WebElement Midcap_Funds_PageTitle;
	
	/*@FindBy(id= "com.choicebroking.investica:id/tvChoiceMail")
	private static WebElement CustomerCare_EmailId;
	
	@FindBy(id= "com.choicebroking.investica:id/etYourName")
	private static WebElement Your_Name_field;
	
	@FindBy(id= "com.choicebroking.investica:id/etYourEmailId")
	private static WebElement Your_EmailID_field;
	
	@FindBy(id= "com.choicebroking.investica:id/etMessage")
	private static WebElement Message_field;
	
	@FindBy(id= "com.choicebroking.investica:id/tvChoiceMail")
	private static WebElement Send_Message_Button;
	
	//error messages
	@FindBy(name= "Enter valid name")
	private static WebElement name_error_message;
	
	@FindBy(name= "Enter valid Email Id")
	private static WebElement emailid_error_message;
	
	//click customer care number
	
	public static void call_CustomerCare(){
		
		try{
			
			CustomerCare_Number.click();
			//phone app opens to close click again any field
			CustomerCare_EmailId.click();
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
			
	}
	
	public static void click_CustomerCare_emailID(){
		
		try{
			
			CustomerCare_Number.click();
			//phone app opens to close click again any field
			CustomerCare_EmailId.click();
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
			
	}	
	
	public static void send_Support_Message(){
		
		try{
			
			Your_Name_field.sendKeys("test");
			Your_EmailID_field.sendKeys("test@mailinator.com");
			Message_field.sendKeys("testing message, please don't call back");
			Send_Message_Button.click();
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
			
	}
	
	public static void verify_Error_Message(){
		
		try{
	
			Send_Message_Button.click();
			Assert.assertEquals(name_error_message.getText(), "Enter valid name");
			Send_Message_Button.sendKeys("test");
			Send_Message_Button.click();
			Assert.assertEquals(emailid_error_message.getText(), "Enter valid Email Id");
			
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
			
	}*/

}
