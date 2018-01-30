package investicaMobilePages;

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

import appiumGrid.AbstractPageGrid;
import appiumGrid.InvestorDashboardPageAppium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AbstractPage;
import utility.HelperClass;

public class Fund_Explorer_Page{

	
	public AppiumDriver driver;
	
	//private static WebDriverWait wait= new WebDriverWait(driver, 10);
	
	public Fund_Explorer_Page(AppiumDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);	
		
		//Use below if above pagefactory with implicit does not work
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	
	//Fund Explorer left Menu elements
	
	//for calling list
	/*@AndroidFindBy(id="sdf")
	private List<WebElement> xyz;*/
	
	@FindBy(xpath= "//android.widget.ImageButton[@index='0']")
	private WebElement LeftMenuIcon1;
	
	@FindBy(xpath="//*[@text='Investor Dashboard']")
	private WebElement Investor_Dashboard_Link;
	
	
	@FindBy(xpath= "//*[@text='Fund Explorer']")
	private WebElement Fund_Explorer_Link;
	
	
	@FindBy(xpath= "//*[@text='My Investments']")
	private WebElement My_Investments_Link;
	
	@FindBy(xpath= "//*[@text='My Transactions']")
	private WebElement My_Transactions_Link;
	
	@FindBy(xpath= "//*[@text='My Profile']")
	private WebElement My_Profile_link;
	
	@FindBy(xpath="//*[@text='Sign In or Join']")
	private WebElement Join_link;
	
	@FindBy(xpath="//*[@text='Support']")
	private WebElement Support_link;
	
	@FindBy(xpath="//*[@text='Share']")
	private WebElement Share_link;
	
	@FindBy(xpath="//*[@text='FAQ']")
	private WebElement FAQ_link;
	
	//rotators
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[1]")
	private static WebElement rotator1;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[2]")
	private static WebElement rotator2;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")
	private static WebElement rotator3;
	
	//@FindBy(xpath="(//android.widget.LinearLayout)[2]")
	//private static WebElement rotator4;
	
	
	//Most popular categories
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE1")
	private WebElement Tax_Saving_ELSS_Category_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE2")
	public WebElement Large_Cap_Funds_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE3")
	private WebElement Small_Cap_Funds_Button;
	
	//need to horizontal scroll for below categories
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE4")
	public WebElement Liquid_Funds_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE5")
	private WebElement Multicap_Funds_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnFE6")
	private WebElement Midcap_Funds_Button;
	
	@FindBy(id= "com.choicebroking.investica:id/btnViewAllCategories")
	private WebElement View_All_Categories_Link;
	
	//Theme based baskets (lump sum)
	
	@FindBy(xpath= "//*[@text='Agressive Returns']")
	private WebElement Aggressive_Returns_Basket;
	
	@FindBy(xpath= "//*[@text='Consumption Story']")
	public WebElement Consumption_Story_Basket;
	
	@FindBy(xpath= "//*[@text='Large Cap Heroes']")
	private WebElement Large_Cap_Heroes_Basket;
	
	//horizontal scroll for theme based baskets
	
	@FindBy(xpath= "//*[@text='Digital India']")
	private WebElement Digital_India_Basket;
	
	@FindBy(xpath= "//*[@text='The Tax Saviour']")
	private WebElement Tax_Saviour_Basket;
	
	@FindBy(xpath= "//*[@text='Go with Index']")
	private WebElement Go_with_Index_Basket;
	
	//horizontal scroll for theme based baskets
	
	@FindBy(xpath= "//*[@text='Wealth Builder EMI']")
	private WebElement Wealth_Builder_EMI_Basket;
	
	@FindBy(xpath= "//*[@text='Best of All']")
	private WebElement Best_of_All_Basket;
	
	@FindBy(xpath= "//*[@text='Outperform Savings Returns']")
	private static WebElement Outperform_Savings_Returns;
	
	//Theme Based baskets(Sip)
	
	@FindBy(xpath= "//*[@class='android.widget.FrameLayout'and @index='2']")
	private WebElement Theme_based_bakets_sip_frame;
	
	@FindBy(xpath= "//*[@text='Blue-chip Value Creator']")
	private WebElement Blue_Chip_Value_Creator_Basket;
	
	@FindBy(xpath= "//*[@text='Retirement Corpus Builder']")
	public WebElement Retirement_Corpus_Builder_Basket;
	
	@FindBy(xpath= "//*[@text='Tax Saver']")
	private WebElement Tax_Saver_Basket;
	
	@FindBy(xpath= "//*[@text='Wealth Creator']")
	private WebElement Wealth_Creator_Basket;
	
	
	//scroll above for view of Blogs
	
	@FindBy(xpath= "//*[@text='Large Cap Mutual Funds – Everything You Need to Know!']")
	private WebElement Blogs_Card1;
	
	@FindBy(xpath= "(//*[@id='com.choicebroking.investica:id/tvBlog][@index='1']")
	private WebElement Blogs_CardN1;
	
	//swipe right to left
	@FindBy(xpath= "//*[@text='What’s next for the Pharma Mutual Funds?']")
	private WebElement Blogs_Card2;
	
	//swipe right to left
	@FindBy(xpath= "//*[@text='Unlocking Tax Saving (ELSS) Mutual Funds in Just 2 Minutes!']")
	private WebElement Blogs_Card3;
	
	@FindBy(id= "com.choicebroking.investica:id/btnViewAllBlog")
	private WebElement View_All_Blogs_link;
	
	@FindBy(xpath= "//*[@text='Login']")
	public WebElement Login_Button_FundExplorer;
	
	
	
	public void open_Guest_Left_Menu(){
		
		try{
			
			HelperClass.tapMobileElement(driver, LeftMenuIcon1);
			
			
		}catch(Exception e)
		
		{
			System.out.println("LeftMenuIcon1 not clicked and hence testcase failed");
			e.printStackTrace();
			
		}
	}
	
 	//navigate to Login page
	public Login_Investica_Page navigateToSignIn(){
		
		try {
			
			open_Guest_Left_Menu();
			//will navigate to Login page
			HelperClass.tapMobileElement(driver, Join_link);
			//Join_link.click();
			
			
		} catch (Exception e) {
			
			System.out.println(" Join_link not clicked hence testcase failed");
			e.printStackTrace();
		}
		
		return new Login_Investica_Page(driver);
	}
	
	//method for navigation to investor dashboard page
	
	public Investor_Dashboard_Page navigate_Investor_Dashboard(){
		
		try{
			
			open_Guest_Left_Menu();
			HelperClass.tapMobileElement(driver, Investor_Dashboard_Link);
			//Investor_Dashboard_Link.click();
			//will navigate to Investor Dashboard Page for Guest user
			
			 
		}catch(Exception e){
			
			System.out.println("Investor_Dashboard_Link not clicked hence testcase failed");
			e.printStackTrace();
		}
		
		return new Investor_Dashboard_Page(driver);
	}
	
	
	
	//method for navigation to FundExplorer page
	public Fund_Explorer_Page navigate_FundExplorerPage(){
		
		try{
			 
			open_Guest_Left_Menu();
			HelperClass.tapMobileElement(driver, Fund_Explorer_Link);
			//Fund_Explorer_Link.click();
			//will navigate to FundExplorer page

			 
		}catch(Exception e){
			
			System.out.println("Fund_Explorer_Link not clicked hence testcase failed");
			e.printStackTrace();
		}
		
		return new Fund_Explorer_Page(driver);
		
	}
	
	
	//method for navigation to My Investments page
		public Investor_Dashboard_Page navigate_MyInvestmentspPage(){
			
			try{
				 
				open_Guest_Left_Menu();
				//will navigate to My Investments page
				HelperClass.tapMobileElement(driver, My_Investments_Link);
				//My_Investments_Link.click();
				
				
				 
			}catch(Exception e){
				
				System.out.println(" My_Investments_Link not clicked hence testcase failed");
				e.printStackTrace();
			}
			
			return new Investor_Dashboard_Page(driver);
		}

		
		//method for navigation to My Transactions page
		public My_Transactions_Page navigate_MyTransactionsPage(){
			
			try{
				 
				open_Guest_Left_Menu();
				//will navigate to My Transactions page
				HelperClass.tapMobileElement(driver, My_Transactions_Link);
				//My_Transactions_Link.click();
				
				 
			}catch(Exception e){
				
				System.out.println(" My_Transactions_Link not clicked hence testcase failed");
				e.printStackTrace();
			}
			
			return new My_Transactions_Page(driver);
			
		}
		
       //method for navigation to My Profile page
		public My_Profile_Page navigate_MyProfilePage(){
					
					try{
						 
						open_Guest_Left_Menu();
						//will navigate to My Profile page
						
						HelperClass.tapMobileElement(driver, My_Profile_link);
						//My_Profile_link.click();
						 
					}catch(Exception e){
						
						System.out.println(" My_Profile_link not clicked hence testcase failed");
						e.printStackTrace();
					}
					
					return new My_Profile_Page(driver);
				}
				
		
	     //method for navigation investor Support page
		 public Support_Page navigate_SupportPage(){
						
						try{
							 
							open_Guest_Left_Menu();
							//will navigate to My Support page
							HelperClass.tapMobileElement(driver, Support_link);
							//Support_link.click();
							 
						}catch(Exception e){
							
							System.out.println(" Support_link not clicked hence testcase failed");
							e.printStackTrace();
						}
						
						return new Support_Page(driver);
					}
		 
		
		//navigate to investor Share page
		 public Share_Page navigate_SharePage(){
						
						try{
							 
							open_Guest_Left_Menu();
							//will navigate to Share page
							HelperClass.tapMobileElement(driver, Share_link);
							//Share_link.click();

							 
						}catch(Exception e){
							
							System.out.println(" Share_link not clicked hence testcase failed");
							e.printStackTrace();
						}
						
						return new Share_Page(driver);
					}
		 
		
		 //navigate to investor FAQ page(web view page)
		 public Faq_Page navigate_FAQPage(){
						
						try{
							 
							open_Guest_Left_Menu();
							//will navigate to Faq page
							HelperClass.tapMobileElement(driver, FAQ_link);
							//FAQ_link.click();
							 
						}catch(Exception e){
							
							System.out.println(" FAQ_link not clicked hence testcase failed");
							e.printStackTrace();
						}
						
						return new Faq_Page(driver);
					}	
		 
		   

			
		 	//navigate to Tax Saving(ELSS) page
			public TaxSavingElss_Page tax_Saving_Category_View(){
				
				try{
					
					//will navigate to Tax Saving page
					HelperClass.tapMobileElement(driver, Tax_Saving_ELSS_Category_Button);
					//Tax_Saving_ELSS_Category_Button.click();
					
					
				}catch(Exception e)
				{
					System.out.println(" Tax_Saving_ELSS_Category_Button is not clicked hence testcase failed");
					e.printStackTrace();
				}
				
				return new TaxSavingElss_Page(driver);
			}
			
			
			
			public LargeCapFunds_Page large_Cap_Funds_View(){
				
				try{
					
					//will navigate to Tax Saving page
					HelperClass.tapMobileElement(driver, Large_Cap_Funds_Button);
					//Large_Cap_Funds_Button.click();
					
						
				}catch(Exception e)
				{
					System.out.println(" Large_Cap_Funds_Button is not clicked hence testcase failed");
					e.printStackTrace();
				}
				
				return new LargeCapFunds_Page(driver);
			}		 

		
			public SmallCapFunds_Page small_Cap_Funds_View(){
				
				try{
					
					TouchAction touchact = new TouchAction(driver);
					touchact.longPress(Large_Cap_Funds_Button).moveTo(198,1060).release().perform();
					
			
					WebDriverWait wait= new WebDriverWait(driver, 5);
					wait.until(ExpectedConditions.visibilityOf(Small_Cap_Funds_Button)).click();
					Thread.sleep(2000);
					

					
					//wait.until(ExpectedConditions.titleContains(TaxSavingElss.Tax_Saving_ELSS_PageTitle.getAttribute("value")));
					
					
				}catch(Exception e)
				{
					System.out.println("Small_Cap_Funds_Button is not clicked hence testcase failed");
					e.printStackTrace();
				}
				
				return new SmallCapFunds_Page(driver);
			}
			
			
			public LiquidFunds_Page liquid_Funds_View(){
				
				try{
					
					HelperClass.swipeElementScreenHorizontally(driver, Large_Cap_Funds_Button, 198, 1060);
					
					//TouchAction touchact = new TouchAction(driver);
					//touchact.longPress(Large_Cap_Funds_Button).moveTo(1202,931).release().perform();
					
					WebDriverWait wait= new WebDriverWait(driver, 5);
					//will navigate to Tax Saving page
					wait.until(ExpectedConditions.visibilityOf(Liquid_Funds_Button)).click();
					
					
				}catch(Exception e)
				{
					System.out.println("Liquid_Funds_Button is not clicked hence testcase failed");
					e.printStackTrace();
				}
				
				return new LiquidFunds_Page(driver);
			}
			
			
			/*
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

		*/	
}
