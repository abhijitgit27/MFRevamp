package investicaMobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicDetailsA 
{
	@FindBy(id= "com.choicebroking.investica:id/fullname")
	private static WebElement FullName;

	@FindBy(id= "com.choicebroking.investica:id/father_name")
	private static WebElement FatherName;

	@FindBy(id= "com.choicebroking.investica:id/mother_name")
	private static WebElement Mothername;

	@FindBy(id= "com.choicebroking.investica:id/rb_male")
	private static WebElement Gender_M;
	
	@FindBy(id= "com.choicebroking.investica:id/rb_female")
	private static WebElement Gender_F;

	@FindBy(id= "com.choicebroking.investica:id/rb_single")
	private static WebElement MaritalStatus_S;
	
	@FindBy(id= "com.choicebroking.investica:id/rb_married")
	private static WebElement MaritalStatus_M;

	@FindBy(id= "com.choicebroking.investica:id/rb_yes")
	private static WebElement PoliticalParty_Y;
	
	@FindBy(id= "com.choicebroking.investica:id/rb_no")
	private static WebElement PoliticalParty_N;

	@FindBy(id= "")
	private static WebElement AddNominee_Y;
	
	@FindBy(id= "")
	private static WebElement AddNominee_N;

	@FindBy(id= "com.choicebroking.investica:id/continueBtn")
	private static WebElement Continue;

}
