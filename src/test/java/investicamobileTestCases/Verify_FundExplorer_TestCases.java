package investicamobileTestCases;

import org.testng.annotations.Test;

import appiumGrid.appiumTestPOM3;
import investicaMobilePages.Fund_Explorer_Page;
import utility.AbstractTest;

public class Verify_FundExplorer_TestCases extends appiumTestPOM3 {

	Fund_Explorer_Page fund_explorer_obj;
	
	
	
	@Test(priority=1)
	
	public void verify_navigation_Tax_Saving_Elss_page(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.tax_Saving_Category_View();

		}
		catch(Exception e){
			
			System.out.println("verify_navigation_Tax_Saving_Elss_page testcase failed");
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=2)
	
	public void verify_navigation_Large_Cap_Fund_page(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.large_Cap_Funds_View();
			
			
		}
		catch(Exception e){
			
			System.out.println("verify_navigation_Large_Cap_Fund_page testcase failed");
			e.printStackTrace();
			
		}
		
	}
	
	
	
	//scroll working
	
	
	@Test(priority=3)
	
	public void verify_navigation_Small_Cap_Funds_page(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.small_Cap_Funds_View();
			
		}
		catch(Exception e){
			
			System.out.println("verify_navigation_Small_Cap_Funds_page testcase failed");
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test(priority=4)
	
	public void verify_navigation_Liquid_Funds_page(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			fund_explorer_obj.liquid_Funds_View();
			
		}
		catch(Exception e){
			
			System.out.println("verify_navigation_Liquid_Funds_page testcase failed");
			e.printStackTrace();
		}
		
	}
	
	
	
/*
	@Test
	
	public void verify_navigation_Multicap_Funds_page(){
		
		try{
			
			fund_explorer_obj = new Fund_Explorer_Page(driver);
			FundExplorerMobile.multicap_Funds_View();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test
	
	public void verify_navigation_Midcap_Funds_page(){
		
		try{
			
			FundExplorerMobile.midCap_Funds_View();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@Test
	
	public void verify_navigation_viewall_MostPopular_Categories_page(){
		
		try{
			
			FundExplorerMobile.navigate_view_all_categories_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	//Navigation to Theme based baskets Lump sum
	
	@Test
	
	public void verify_navigation_Aggressive_Returns_Basket_page(){
		
		try{
			
			FundExplorerMobile.navigate_Aggressive_Returns_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@Test
	
	public void verify_navigation_Consumption_Story_Basket_page(){
		
		try{
			
			FundExplorerMobile.navigate_Consumption_Story_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@Test
	
	public void verify_navigation_Large_Cap_Heroes_Basket_page(){
		
		try{
			
			FundExplorerMobile.navigate_Large_Cap_Heroes_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test
	
		public void verify_navigation_Go_with_Index_Basket_page(){
		
		try{
			
			FundExplorerMobile.navigate_Go_with_index_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@Test
	
	public void verify_navigation_Best_of_all_Basket_page(){
		
		try{
			
			FundExplorerMobile.navigate_Best_of_all_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@Test
	
	public void verify_navigation_Outperform_Savings_Basket_page(){
		
		try{
			
			FundExplorerMobile.navigate_Outperform_Savings_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
		
	
		@Test
		
		public void verify_navigation_Bluechip_Value_Creator_page(){
		
		try{
			
			FundExplorerMobile.navigate_Bluechip_Value_Creator_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
		
		
		
		@Test
		
		public void verify_navigation_Retirement_Corpus_Builder_page(){
		
		try{
			
			FundExplorerMobile.navigate_Retirement_Corpus_Builder_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	    
	
		//not working
		@Test
		public void verify_navigation_Tax_Saver_page(){
			
		try{
			
			FundExplorerMobile.navigate_Tax_Saver_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
		
	
		//not working
		@Test
		public void verify_wealth_creator_page(){
			
		try{
			
			FundExplorerMobile.navigate_Wealth_Creator_page();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	    
		@Test
		public void verify_scroll(){
			
			//working ==>success
		try{
			
			for(int i=0; i<=50; i++){
				
				try{
					
					FundExplorerMobile.Login_Button_FundExplorer.click();
					break;
					
				}catch(Exception e){
					
					utility.HelperClass.swipeMobileScreenVertically(driver);
				}
			}
			
		}
		catch(Exception e){
			System.out.println("scroll failed");
		}
		
	}

		
		@Test
		public void verify_horizontalSwipe(){
			
			
		try{
			
			for(int i=0; i<=4; i++){
				
				try{
					
					//not working
					utility.HelperClass.swipeMobileScreenHorizontally(driver, FundExplorerMobile.Consumption_Story_Basket);
					FundExplorerMobile.Digital_India_Basket.click();
					break;
					
				}catch(Exception e){
					
					System.out.println("keep trying");
				}
			}
			
		}
		catch(Exception e){
			System.out.println("swipe failed");
		}
		
	}
			
		@Test
		public void verify_horizontalSwipe_element(){
			
			
		try{
			
					//working
					utility.HelperClass.swipeElementScreenHorizontally(driver,new Fund_Explorer_Page(driver).Large_Cap_Funds_Button, 198,1060);
					
					Thread.sleep(2000);
					
					
				}catch(Exception e){
					
					System.out.println("keep trying");
				}
			}
				

		*/
}
		

