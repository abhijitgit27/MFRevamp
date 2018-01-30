package investicaMobilePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;
import utility.AbstractPage;


//check if working
public class BasicDetailsMobile extends AbstractPage {
	
	
	@FindBy(id="com.choicebroking.investica:id/email")
	private static WebElement Email_id;
	
	@FindBy(id="com.choicebroking.investica:id/mobile")
	private static WebElement mobile_number;
	
	@FindBy(id="com.choicebroking.investica:id/dob")
	private static WebElement dob;
	
	@FindBy(id="com.choicebroking.investica:id/pan")
	private static WebElement pancard_number;
	
	@FindBy(id="com.choicebroking.investica:id/refID")
	private static WebElement referal_code;
	
	@FindBy(name="Terms and Conditions")
	private static WebElement Terms_conditions;
	
	@FindBy(id="com.choicebroking.investica:id/tnc_chkbox")
	private static WebElement Terms_chkbox;
	
	@FindBy(id="com.choicebroking.investica:id/continueBtn")
	private static WebElement Continue_Button;
	
	
	
	private static void basic_Details_entry(){
		
		// fetching data from excel for Email field
		//utility.Highlighter.elementHighlight(driver, Email_id);
		Email_id.clear();
		Email_id.sendKeys("abhijit@choicetechlab.com");
		//Email_id.sendKeys(DataProviderFactory.getExcel().getData(0, 6, 1));
		
		// fetching data from excel for Mobile field
		//utility.Highlighter.elementHighlight(driver, Email_id);
		mobile_number.clear();
		mobile_number.sendKeys("9123456789");
		//mobile_number.sendKeys(DataProviderFactory.getExcel().getData(0, 7, 1));
		
		//utility.Highlighter.elementHighlight(driver, pancard_number);
		pancard_number.clear();
		pancard_number.sendKeys("ABCDE1234K");
		//pancard_number.sendKeys(DataProviderFactory.getExcel().getData(0, 8, 1));
		
		// fetching data from excel for Referal Code
		
		referal_code.clear();
		referal_code.sendKeys("test1f");
		//referal_code.sendKeys(DataProviderFactory.getExcel().getData(0, 9, 1));
		
		//dob handle calendar
		
		
		//Terms_chkbox.click();
		
		//Continue_Button.click();
		
		
			
	}

}
