package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KYC 
{
	@FindBy(id= "com.choicebroking.investica:id/allow_access")
	private static WebElement AllowAccess;
	
	@FindBy(id= "com.android.packageinstaller:id/permission_deny_button")
	private static WebElement Deny;

	@FindBy(id= "com.android.packageinstaller:id/permission_allow_button")
	private static WebElement Allow;

}
