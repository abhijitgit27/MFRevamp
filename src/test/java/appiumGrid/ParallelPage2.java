package appiumGrid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import investicaMobilePages.Investor_Dashboard_Page;
import investicaMobilePages.MyInvestments;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ParallelPage2 extends AbstractPageGrid{
	
	
	private static WebDriverWait wait= new WebDriverWait(driver, 10);
	
	//left Menu
	@FindBy(xpath= "//android.widget.ImageButton[@index='0']")
	public static WebElement LeftMenuIcon1;
	
	
	@FindBy(xpath="//*[@text='Investor Dashboard']")
	private static WebElement Investor_Dashboard_Link;
	
	
	@FindBy(xpath= "//*[@text='Fund Explorer']")
	private static WebElement Fund_Explorer_Link;
	
	
	@FindBy(xpath= "//*[@text='My Investments']")
	private static WebElement My_Investments_Link;
	
	
	
	
	public static void testm1_navigate_MyInvestmentspPage(){
		
		try{
			
			//wait.until(ExpectedConditions.visibilityOf(LeftMenuIcon1));
			//LeftMenuIcon1.click();
			//Thread.sleep(4000);
			ParallelPage1.testm1();
			ParallelPage1.testm2();
			//My_Investments_Link.click();
			Thread.sleep(1000);
			//will navigate to My Investments page
			PageFactory.initElements(new AppiumFieldDecorator(driver), new MyInvestments());
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void testm2_navigate_Investor_Dashboard(){
		
		try{
			
			//wait.until(ExpectedConditions.visibilityOf(LeftMenuIcon1));
			//LeftMenuIcon1.click();
			//Thread.sleep(4000);
			Investor_Dashboard_Link.click();
			//will navigate to My Investments page
			PageFactory.initElements(new AppiumFieldDecorator(driver), new Investor_Dashboard_Page());
			
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	//navigate to signup page
}
