package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import appiumGrid.AbstractPageGrid;
import utility.AbstractPage;

public class BlogsWebView extends AbstractPageGrid{

	//Blocks page are web view pages
	
	@FindBy(id= "com.choicebroking.investica:id/title")
	private static WebElement BlogsWebView_Page_Title;
	
	/*@FindBy(name= "Gmail")
	private static WebElement Gmail_link;
	
	
	
	public static void share_Investica_WhatsApp(){
		
		WhatsApp_link.click();
	}
	
	public static void share_Investica_Gmail(){
		
		Gmail_link.click();
	}
	*/
}


