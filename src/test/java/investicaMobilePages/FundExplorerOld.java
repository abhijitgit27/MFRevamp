package investicaMobilePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FundExplorerOld {
	
	public WebDriver driver;
	
	
	@FindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement LeftMenuIcon;
	
	@FindBy(name="Sign In or Join")
	public WebElement Join;
	
	public FundExplorerOld(WebDriver driver){
		
		this.driver= driver;
		
	}

    

}
