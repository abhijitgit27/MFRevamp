package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankDetails
{
	@FindBy(id= "")
	private static WebElement BankName;

	@FindBy(id= "")
	private static WebElement BranchName;

	@FindBy(id= "com.choicebroking.investica:id/ifsc_code")
	private static WebElement IFSC;
	
	@FindBy(id="com.choicebroking.investica:id/btnFindBankBranchIFSC")
	private static WebElement Dont_IFSC;
	
	@FindBy(id="")
	private static WebElement switcher;
	
	@FindBy(id= "com.choicebroking.investica:id/continueBtn")
	private static WebElement Continue;

	
}