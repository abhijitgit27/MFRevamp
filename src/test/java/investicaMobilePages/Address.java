package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Address 
{
	@FindBy(id= "com.choicebroking.investica:id/address")
	private static WebElement Address;

	@FindBy(id= "com.choicebroking.investica:id/city")
	private static WebElement City;

	@FindBy(id= "com.choicebroking.investica:id/state")
	private static WebElement State;

	@FindBy(id= "com.choicebroking.investica:id/zipcode")
	private static WebElement PostalCode;

	@FindBy(id= "com.choicebroking.investica:id/address_chkbox")
	private static WebElement Checkbox_add;

	@FindBy(id= "com.choicebroking.investica:id/address1")
	private static WebElement C_Address;

	@FindBy(id= "com.choicebroking.investica:id/city1")
	private static WebElement C_City;

	@FindBy(id= "com.choicebroking.investica:id/state1")
	private static WebElement C_State;

	@FindBy(id= "com.choicebroking.investica:id/zipcode1")
	private static WebElement C_PostalCode;

	@FindBy(id= "com.choicebroking.investica:id/continueBtn")
	private static WebElement Continue;

}
