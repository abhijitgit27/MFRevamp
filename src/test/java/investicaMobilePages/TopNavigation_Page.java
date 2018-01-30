package investicaMobilePages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import factory.DataProviderFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.HandleAutoComplete;
import utility.HelperClass;

public class TopNavigation_Page {

	public AppiumDriver driver;

	// private static WebDriverWait wait= new WebDriverWait(driver, 10);

	public TopNavigation_Page(AppiumDriver driver) {

		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);

	}

	// Fund Explorer left Menu elements

	@FindBy(id = "com.choicebroking.investica:id/menu_scheme_search")
	private WebElement LensIcon;

	@FindBy(id = "com.choicebroking.investica:id/menu_scheme_search")
	private WebElement Xbutton;

	@FindBy(id = "com.choicebroking.investica:id/searchEdit")
	private WebElement searchEditField;
	
	@FindBy(id = "com.choicebroking.investica:id/ivToolbarBack")
	private WebElement backArrow;
	
	
	@FindBy(id="com.choicebroking.investica:id/tvValue")
	private List<WebElement> autoCompleteList;
	
	/*
	@AndroidFindBy(id="sdf")
	private List<WebElement> xyz;*/

	public void tap_LensIcon() {

		try {

			HelperClass.tapMobileElement(driver, LensIcon);

		} catch (Exception e) {

			System.out.println("LensIcon button is not clickable");
			e.printStackTrace();
		}

	}

	public void tap_Xbutton() {

		try {

			HelperClass.tapMobileElement(driver, Xbutton);

		} catch (Exception e) {

			System.out.println("Xbutton button is not clickable");
			e.printStackTrace();
		}

	}

	public void enter_Text_Global_Search() {

		try {

			// HelperClass.tapMobileElement(driver, searchEditField);
			searchEditField.sendKeys(DataProviderFactory.getExcel().getData(0, 38, 1));
			driver.hideKeyboard();
			

		} catch (Exception e) {

			System.out.println("Not able to enter text button in searchEditField for global search");
			e.printStackTrace();
		}

	}

	public void search_MutalFund_Schemes(String schemeName) {

		try {

			tap_LensIcon();
			enter_Text_Global_Search();
			HandleAutoComplete.autocompletenew(driver, autoCompleteList, schemeName);
			
			//below method of autocomplete is working
			//HandleAutoComplete.autocomplete(driver, autoCompleteList, schemeName);
			
			
		} catch (Exception e)

		{
			System.out.println("autocomplete utility failed and hence testcase failed");
			e.printStackTrace();

		}
	}
}
