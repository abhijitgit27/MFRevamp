package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fatca
{
	@FindBy(id= "com.choicebroking.investica:id/etIncomeTaxslab")
	private static WebElement IncomeTax;

	@FindBy(id= "com.choicebroking.investica:id/etOccupationDetails")
	private static WebElement Occupation;

	@FindBy(id= "com.choicebroking.investica:id/etBirthCountry")
	private static WebElement CountryOfBirth;

	@FindBy(id= "com.choicebroking.investica:id/etTaxCountry")
	private static WebElement CountryOfTax;
	
	@FindBy(id="")
	private static WebElement TIN;

	@FindBy(id= "")
	private static WebElement Continue;

}
