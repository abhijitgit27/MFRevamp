package appiumGrid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParallelPage1 extends AbstractPageGrid {
	
	
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
	
	
	
	
	public static void testm1(){
		
		try{
			
			wait.until(ExpectedConditions.visibilityOf(LeftMenuIcon1));
			LeftMenuIcon1.click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void testm2(){
		
		try{
			
			//wait.until(ExpectedConditions.visibilityOf(LeftMenuIcon1));
			//LeftMenuIcon1.click();
			//System.out.println("test2");
			testm1();
			Investor_Dashboard_Link.click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void testm3(){
		
		try{
			
			//wait.until(ExpectedConditions.visibilityOf(LeftMenuIcon1));
			//LeftMenuIcon1.click();
			//System.out.println("test3");
			testm1();
			My_Investments_Link.click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
