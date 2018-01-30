package appiumGrid;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import investicaMobilePages.AggressiveReturns;
import investicaMobilePages.BestOfAll;
import investicaMobilePages.Blog;
import investicaMobilePages.BlogsWebView;
import investicaMobilePages.BluechipValueCreator;
import investicaMobilePages.ConsumptionStory;
import investicaMobilePages.DigitalIndia;
import investicaMobilePages.Faq_Page;
import investicaMobilePages.Fund_Explorer_Page;
import investicaMobilePages.GoWithIndex;
import investicaMobilePages.Investor_Dashboard_Page;
import investicaMobilePages.LargeCapFunds_Page;
import investicaMobilePages.LargeCapHeroes;
import investicaMobilePages.LiquidFunds_Page;
import investicaMobilePages.Login_Investica_Page;
import investicaMobilePages.MidCapFunds;
import investicaMobilePages.MostPopularCategories;
import investicaMobilePages.MulticapFunds;
import investicaMobilePages.MyInvestments;
import investicaMobilePages.My_Profile_Page;
import investicaMobilePages.My_Transactions_Page;
import investicaMobilePages.OutperformSavingsReturns;
import investicaMobilePages.RetirementCorpusBuilder;
import investicaMobilePages.Share_Page;
import investicaMobilePages.SmallCapFunds_Page;
import investicaMobilePages.Support_Page;
import investicaMobilePages.TaxSavingElss_Page;
import investicaMobilePages.TaxSaviour;
import investicaMobilePages.WealthBuilderEMI;
import investicaMobilePages.WealthCreator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;
import utility.HelperClass;

public class FundExplorerMobileFinal extends AbstractPageGrid{

	private static WebDriverWait wait= new WebDriverWait(driver, 10);
	
	
	/*verify if below also works
	public static AppiumDriver<MobileElement> driver;
	
	public static AppiumDriver driver = null;*/
	
 
	
	//working successfully
	
	//left Menu
	@FindBy(id= "Open navigation drawer")
	private static WebElement LeftMenuIcon1;
	
	@FindBy(xpath="//*[@text='Investor Dashboard']")
	private static WebElement Investor_Dashboard_Link;
	
	
	@FindBy(xpath= "//*[@text='Fund Explorer']")
	private static WebElement Fund_Explorer_Link;
	
	
	@FindBy(xpath= "//*[@text='My Investments']")
	private static WebElement My_Investments_Link;
	
	@FindBy(xpath= "//*[@text='My Transactions']")
	private static WebElement My_Transactions_Link;
	
	@FindBy(xpath= "//*[@text='My Profile']")
	private static WebElement My_Profile_link;
	
	@FindBy(xpath="//*[@text='Sign In or Join']")
	private static WebElement Join_link;
	
	@FindBy(xpath="//*[@text='Support']")
	private static WebElement Support_link;
	
	@FindBy(xpath="//*[@text='Share']")
	private static WebElement Share_link;
	
	@FindBy(xpath="//*[@text='FAQ']")
	private static WebElement FAQ_link;
	
	//rotators
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[1]")
	private static WebElement rotator1;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[2]")
	private static WebElement rotator2;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")
	private static WebElement rotator3;
	
	@FindBy(xpath="(//android.widget.LinearLayout)[2]")
	private static WebElement rotator4;
	
	
	//Most popular categories
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE1")
	private static WebElement Tax_Saving_ELSS_Category_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE2")
	public static WebElement Large_Cap_Funds_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE3")
	private static WebElement Small_Cap_Funds_Button;
	
	//need to horizontal scroll for below categories
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE4")
	public static WebElement Liquid_Funds_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE5")
	private static WebElement Multicap_Funds_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE6")
	private static WebElement Midcap_Funds_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnViewAllCategories")
	private static WebElement View_All_Categories_Link;
	
	//Theme based baskets (lump sum)
	
	@FindBy(xpath= "//*[@text='Agressive Returns']")
	private static WebElement Aggressive_Returns_Basket;
	
	@FindBy(xpath= "//*[@text='Consumption Story']")
	public static WebElement Consumption_Story_Basket;
	
	@FindBy(xpath= "//*[@text='Large Cap Heroes']")
	private static WebElement Large_Cap_Heroes_Basket;
	
	//horizontal scroll for theme based baskets
	
	@FindBy(xpath= "//*[@text='Digital India']")
	public static WebElement Digital_India_Basket;
	
	@FindBy(xpath= "//*[@text='The Tax Saviour']")
	private static WebElement Tax_Saviour_Basket;
	
	@FindBy(xpath= "//*[@text='Go with Index']")
	private static WebElement Go_with_Index_Basket;
	
	//horizontal scroll for theme based baskets
	
	@FindBy(xpath= "//*[@text='Wealth Builder EMI']")
	private static WebElement Wealth_Builder_EMI_Basket;
	
	@FindBy(xpath= "//*[@text='Best of All']")
	private static WebElement Best_of_All_Basket;
	
	@FindBy(xpath= "//*[@text='Outperform Savings Returns']")
	private static WebElement Outperform_Savings_Returns;
	
	//Theme Based baskets(Sip)
	
	@FindBy(xpath= "//*[@class='android.widget.FrameLayout'and @index='2']")
	private static WebElement Theme_based_bakets_sip_frame;
	
	@FindBy(xpath= "//*[@text='Blue-chip Value Creator']")
	private static WebElement Blue_Chip_Value_Creator_Basket;
	
	@FindBy(xpath= "//*[@text='Retirement Corpus Builder']")
	public static WebElement Retirement_Corpus_Builder_Basket;
	
	@FindBy(xpath= "//*[@text='Tax Saver']")
	private static WebElement Tax_Saver_Basket;
	
	@FindBy(xpath= "//*[@text='Wealth Creator']")
	private static WebElement Wealth_Creator_Basket;
	
	
	//scroll above for view of Blogs
	
	@FindBy(xpath= "//*[@text='Large Cap Mutual Funds – Everything You Need to Know!']")
	private static WebElement Blogs_Card1;
	
	@FindBy(xpath= "(//*[@id='com.choicebroking.investica:id/tvBlog][@index='1']")
	private static WebElement Blogs_CardN1;
	
	//swipe right to left
	@FindBy(xpath= "//*[@text='What’s next for the Pharma Mutual Funds?']")
	private static WebElement Blogs_Card2;
	
	//swipe right to left
	@FindBy(xpath= "//*[@text='Unlocking Tax Saving (ELSS) Mutual Funds in Just 2 Minutes!']")
	private static WebElement Blogs_Card3;
	
	@FindBy(id= "com.choicebroking.investica:id/btnViewAllBlog")
	private static WebElement View_All_Blogs_link;
	
	@FindBy(xpath= "//*[@text='Login']")
	public static WebElement Login_Button_FundExplorer;
	
	
	
	public static void open_Guest_Left_Menu(){
		
		try{
			
			wait.until(ExpectedConditions.visibilityOf(LeftMenuIcon1));
			LeftMenuIcon1.click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//navigate to signup page
	
	public static void navigateToSignUp(){
		
		try {
			
			
			LeftMenuIcon1.click();
			Thread.sleep(2000);
			Join_link.click();
			//will navigate to LoginInvesticaMobile page
			PageFactory.initElements(new AppiumFieldDecorator(driver), new Login_Investica_Page());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//navigate to investor dashboard page
	public static void navigate_Investor_Dashboard(){
		
		try{
			
			
			Thread.sleep(5000); 
			LeftMenuIcon1.click();
			Investor_Dashboard_Link.click();
			Thread.sleep(5000);
			//will navigate to InvestorDashboardGuest page
			PageFactory.initElements(new AppiumFieldDecorator(driver), new Investor_Dashboard_Page());
			 
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	//navigate to investor FundExplorer page
	public static void navigate_FundExplorerPage(){
		
		try{
			 
			LeftMenuIcon1.click();
			Fund_Explorer_Link.click();
			//will navigate to InvestorDashboardGuest page
			PageFactory.initElements(new AppiumFieldDecorator(driver), new Fund_Explorer_Page());
			 
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	//navigate to investor My Investments page
		public static void navigate_MyInvestmentspPage(){
			
			try{
				 
				LeftMenuIcon1.click();
				My_Investments_Link.click();
				Thread.sleep(1000);
				//will navigate to My Investments page
				PageFactory.initElements(new AppiumFieldDecorator(driver), new MyInvestments());
				 
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
		}
	
		//navigate to investor My Transactions page
		public static void navigate_MyTransactionsPage(){
			
			try{
				 
				LeftMenuIcon1.click();
				My_Transactions_Link.click();
				//will navigate to My Transactions page
				PageFactory.initElements(new AppiumFieldDecorator(driver), new My_Transactions_Page());
				 
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
		}
		
       //navigate to investor My Profile page
		public static void navigate_MyProfilePage(){
					
					try{
						 
						LeftMenuIcon1.click();
						My_Profile_link.click();
						Thread.sleep(1000);
						//will navigate to My Profile page
						PageFactory.initElements(new AppiumFieldDecorator(driver), new My_Profile_Page());
						 
					}catch(Exception e){
						
						e.printStackTrace();
					}
					
				}
				
	
	     //navigate to investor Support page
		 public static void navigate_SupportPage(){
						
						try{
							 
							LeftMenuIcon1.click();
							Support_link.click();
							Thread.sleep(1000);
							//will navigate to My Profile page
							PageFactory.initElements(new AppiumFieldDecorator(driver), new Support_Page());
							 
						}catch(Exception e){
							
							e.printStackTrace();
						}
						
					}
		//navigate to investor Share page
		 public static void navigate_SharePage(){
						
						try{
							 
							LeftMenuIcon1.click();
							Share_link.click();
							Thread.sleep(1000);
							//will navigate to My Profile page
							PageFactory.initElements(new AppiumFieldDecorator(driver), new Share_Page());
							 
						}catch(Exception e){
							
							e.printStackTrace();
						}
						
					}
		 
		 //navigate to investor FAQ page
		 public static void navigate_FAQPage(){
						
						try{
							 
							LeftMenuIcon1.click();
							FAQ_link.click();
							Thread.sleep(2000);
							//will navigate to My Profile page
							PageFactory.initElements(new AppiumFieldDecorator(driver), new Faq_Page());
							 
						}catch(Exception e){
							
							e.printStackTrace();
						}
						
					}	
		 
			public static void navigateToSignIn(){
				
				try {
					
					
					LeftMenuIcon1.click();
					Thread.sleep(2000);
					Join_link.click();
					
					//will navigate to LoginInvesticaMobile page
					PageFactory.initElements(new AppiumFieldDecorator(driver), new Login_Investica_Page());
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			public static void tax_Saving_Category_View(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Tax_Saving_ELSS_Category_Button)).click();
					
					//will navigate to Tax Saving page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new TaxSavingElss_Page());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void large_Cap_Funds_View(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Large_Cap_Funds_Button)).click();
					
					//will navigate to Tax Saving page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new LargeCapFunds_Page());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}		 

			
			public static void small_Cap_Funds_View(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Large_Cap_Funds_Button).moveTo(198,1060).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Small_Cap_Funds_Button)).click();
					
					//will navigate to Tax Saving page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new SmallCapFunds_Page());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void liquid_Funds_View(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Large_Cap_Funds_Button).moveTo(1202,931).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Liquid_Funds_Button)).click();
					
					//will navigate to Tax Saving page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new LiquidFunds_Page());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void multicap_Funds_View(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Small_Cap_Funds_Button).moveTo(40,1034).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Multicap_Funds_Button)).click();
				
					PageFactory.initElements(new AppiumFieldDecorator(driver), new MulticapFunds());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void midCap_Funds_View(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Small_Cap_Funds_Button).moveTo(40,1034).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Multicap_Funds_Button));
					
					touchact.longPress(Multicap_Funds_Button).moveTo(23,1034).release().perform();
					
					//139,1029
					WebDriverWait wait1= new WebDriverWait(driver, 2);
					wait1.until(ExpectedConditions.visibilityOf(Midcap_Funds_Button)).click();
					
					//will navigate to Tax Saving page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new MidCapFunds());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void navigate_view_all_categories_page(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(View_All_Categories_Link)).click();
					
					//will navigate to Tax Saving page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new MostPopularCategories());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			//navigation to Aggressive Returns-Lump Sum basket page
			public static void navigate_Aggressive_Returns_page(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Aggressive_Returns_Basket)).click();
					
					//will navigate to Aggressive Returns page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new AggressiveReturns());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void navigate_Consumption_Story_page(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Consumption_Story_Basket)).click();
					
					//will navigate to Aggressive Returns page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new ConsumptionStory());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void navigate_Large_Cap_Heroes_page(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Large_Cap_Heroes_Basket).moveTo(50,1761).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Large_Cap_Heroes_Basket)).click();
					
					//will navigate to Large Cap Heroes page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new LargeCapHeroes());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			public static void navigate_Digital_India_page(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Digital_India_Basket)).click();
					
					//will navigate to Aggressive Returns page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new DigitalIndia());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void navigate_Tax_Saviour_page(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Tax_Saviour_Basket)).click();
					
					//will navigate to Aggressive Returns page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new TaxSaviour());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void navigate_Go_with_index_page(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Large_Cap_Heroes_Basket).moveTo(50,1761).release().perform();
					
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Tax_Saviour_Basket)).click();
					
				
					//will navigate to Aggressive Returns page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new GoWithIndex());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void navigate_Wealth_Builder_EMI_page(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Wealth_Builder_EMI_Basket)).click();
					
					//will navigate to Aggressive Returns page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new WealthBuilderEMI());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			
			public static void navigate_Best_of_all_page(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Large_Cap_Heroes_Basket).moveTo(50,1761).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Tax_Saviour_Basket));
					
					touchact.longPress(Tax_Saviour_Basket).moveTo(17,1726).release().perform();
					
					WebDriverWait wait1= new WebDriverWait(driver, 2);
					wait1.until(ExpectedConditions.visibilityOf(Wealth_Builder_EMI_Basket)).click();
					
					//will navigate to Aggressive Returns page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new BestOfAll());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void navigate_Outperform_Savings_page(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Large_Cap_Heroes_Basket).moveTo(50,1761).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Tax_Saviour_Basket));
					
					touchact.longPress(Tax_Saviour_Basket).moveTo(17,1726).release().perform();
			
					WebDriverWait wait1= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Best_of_All_Basket));
					
					touchact.longPress(Best_of_All_Basket).moveTo(31,1657).release().perform();
					
					WebDriverWait wait3= new WebDriverWait(driver, 2);
					wait3.until(ExpectedConditions.visibilityOf(Outperform_Savings_Returns)).click();
					
					
					
					//will navigate to Aggressive Returns page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new OutperformSavingsReturns());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			//theme based baskets(SIP) methods need to be identified
			
			public static void navigate_Bluechip_Value_Creator_page(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Consumption_Story_Basket).moveTo(588,1101).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Blue_Chip_Value_Creator_Basket)).click();
					
					//will navigate to  page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new BluechipValueCreator());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			
			public static void navigate_Retirement_Corpus_Builder_page(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Consumption_Story_Basket).moveTo(588,1101).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Retirement_Corpus_Builder_Basket)).click();
					
					//WebDriverWait wait1= new WebDriverWait(driver, 2);
					//wait.until(ExpectedConditions.visibilityOf(Retirement_Corpus_Builder_Basket)).click();
					
					//will navigate to page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new RetirementCorpusBuilder());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}		
			
			public static void navigate_Tax_Saver_page(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Consumption_Story_Basket).moveTo(588,1101).release().perform();
					
					Thread.sleep(2000);
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Retirement_Corpus_Builder_Basket));
					
					List<WebElement>theme_list = driver.findElements(By.xpath("//android.support.v7.widget.RecyclerView[@id='com.choicebroking.investica:id/recyclerViewBasket2' and @index='5']"));
					System.out.println(theme_list.size());
					
					//working
					//driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.choicebroking.investica:id/txtBucketTitle' and @text='Blue-chip Value Creator']")).click();
					
					
					WebElement Bluechip =driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.choicebroking.investica:id/txtBucketTitle' and @text='Blue-chip Value Creator']"));
					System.out.println(Bluechip.getLocation());
					System.out.println("x"+Bluechip.getLocation().getX());
					System.out.println("y"+Bluechip.getLocation().getY());
					Dimension size = driver.manage().window().getSize();
					System.out.println(size);
					
					
					
					  //Find swipe x points from screen's with and height.
					
					  //Find x1 point which is at right side of screen.
					  int x1 = (int) (size.width * 0.20);
					  
					  //Find x2 point which is at left side of screen.
					  int x2 = (int) (size.width * 0.80);
					
					TouchAction touchact1 = new TouchAction(driver);
					touchact1.press(Bluechip).moveTo(416,1100).release().perform();
					Thread.sleep(2000);
					//utility.HelperClass.mobileScrollIntoView(driver, Blogs_CardN1);
					
					//List<WebElement>blog_elements = driver.findElements(By.xpath("//*[@id='com.choicebroking.investica:id/tvBlog' and @index='1']"));
					
					//System.out.println("Blog Size : "+blog_elements.size());
					
					//for(WebElement blog:blog_elements){		
						
						//WebElement sipbasket = sipbasket.findElement(By.id.("txtBucketTitle"));
				
						//System.out.println("blog text : "+blog.getText());
					//}
					
					
					//Blogs_CardN1.click();
					
					//touchact.longPress(Retirement_Corpus_Builder_Basket).moveTo(124, 1339).release().perform();
					//Thread.sleep(5000);
					//Theme_based_bakets_sip_frame
					/*
					Thread.sleep(10000);
					
					List<WebElement>theme_elements = driver.findElements(By.id("com.choicebroking.investica:id/recyclerViewBasket2"));
					
					System.out.println("SipBasket Size : "+theme_elements.size());
					for(WebElement sipbasket:theme_elements){		
						
						//WebElement sipbasket = sipbasket.findElement(By.id.("txtBucketTitle"));
				
						System.out.println("SipBasket.getText() : "+sipbasket.getText());
					}
					
					
					
					
					//driver.switchTo().frame(Theme_based_bakets_sip_frame);
					
					//Retirement_Corpus_Builder_Basket.click();
					
					//WebDriverWait wait= new WebDriverWait(driver, 2);
					//System.out.println("Retirement_Corpus_Builder_Basket"+wait.until(ExpectedConditions.visibilityOf(Retirement_Corpus_Builder_Basket)).getLocation());
					
					//System.out.println(Blue_Chip_Value_Creator_Basket.getLocation());
					
					//touchact.longPress(Retirement_Corpus_Builder_Basket).moveTo(416, 1795).release().perform();
					
					//WebDriverWait wait1= new WebDriverWait(driver, 2);
					//wait1.until(ExpectedConditions.visibilityOf(Tax_Saver_Basket)).click();
					
					//will navigate to page
					*/
					//PageFactory.initElements(new AppiumFieldDecorator(driver), new TaxSaver());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}		
			
			
			public static void navigate_Wealth_Creator_page(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Wealth_Creator_Basket)).click();
					
					//will navigate to page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new WealthCreator());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}			
			
			
			
			//Blogs functionality
			
			public static void navigate_Blogs_Card(WebElement Blogcard){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(Blogcard)).click();
					
					//will navigate to Aggressive Returns page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new BlogsWebView());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			
			public static void navigate_viewall_blogs(){
				
				try{
					
					WebDriverWait wait= new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.visibilityOf(View_All_Blogs_link)).click();
					
					//will navigate to Blog page
					
					PageFactory.initElements(new AppiumFieldDecorator(driver), new Blog());
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			

			public static void rotator_click(){
				
				try{
					
					rotator4.click();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void m1(){
				
				//List<MobileElement> mob= (List<MobileElement>)androidDriver.findElements(By.className("android.widget.TextView"));
				
				List<MobileElement> mob1= (List<MobileElement>)driver.findElements(By.className("android.widget.ImageView"));
				mob1.get(4).click();
				//System.out.println(mob1.get(1).getText());
			}

			
}
