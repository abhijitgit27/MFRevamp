package investicaMobilePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class BasicDetails {
	
	public WebDriver driver;
	
	
	
	@FindBy(id="com.choicebroking.investica:id/email")
	public WebElement Email_id;
	
	@FindBy(id="com.choicebroking.investica:id/mobile")
	public WebElement mobile_number;
	
	@FindBy(id="com.choicebroking.investica:id/dob")
	public WebElement dob;
	
	@FindBy(id="com.choicebroking.investica:id/pan")
	public WebElement pancard_number;
	
	@FindBy(id="com.choicebroking.investica:id/refID")
	public WebElement referal_code;
	
	@FindBy(name="Terms and Conditions")
	public WebElement Terms_conditions;
	
	@FindBy(id="com.choicebroking.investica:id/tnc_chkbox")
	public WebElement Terms_chkbox;
	
	@FindBy(id="com.choicebroking.investica:id/continueBtn")
	public WebElement Continue_Button;
	
	public BasicDetails(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void basic_Details_entry(){
		
		// fetching data from excel for Email field
		//utility.Highlighter.elementHighlight(driver, Email_id);
		Email_id.clear();
		//Email_id.sendKeys("abhijit@choicetechlab.com");
		Email_id.sendKeys(DataProviderFactory.getExcel().getData(0, 6, 1));
		
		// fetching data from excel for Mobile field
		//utility.Highlighter.elementHighlight(driver, Email_id);
		//mobile_number.clear();
		//mobile_number.sendKeys(DataProviderFactory.getExcel().getData(0, 7, 1));
		
		//utility.Highlighter.elementHighlight(driver, pancard_number);
		//pancard_number.clear();
		//pancard_number.sendKeys(DataProviderFactory.getExcel().getData(0, 8, 1));
		
		// fetching data from excel for Referal Code
		
		//referal_code.clear();
		//referal_code.sendKeys(DataProviderFactory.getExcel().getData(0, 9, 1));
		
		//dob handle calendar
		
		
		//Terms_chkbox.click();
		
		//Continue_Button.click();
			
	}

}
