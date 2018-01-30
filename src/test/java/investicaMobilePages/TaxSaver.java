package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.AbstractPage;

public class TaxSaver extends AbstractPage{

	//Blocks page are web view pages
	
	@FindBy(id= "com.choicebroking.investica:id/title")
	private static WebElement Tax_Saver_Page_Title;
	
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


