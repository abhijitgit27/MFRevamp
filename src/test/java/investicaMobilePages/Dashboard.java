package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.AbstractPage;

public class Dashboard extends AbstractPage

{
	private static WebDriverWait wait= new WebDriverWait(driver, 4);
	
	@FindBy(xpath="//*[@text='dummy']")
	private static WebElement dummy;

}
