package investicaMobilePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileActions{

public WebDriver driver;

public AndroidDriver androidDriver;
	
	
	@FindBy(id="com.mobeta.android.demodslv:id/activity_desc")
	public WebElement mobelement1;
	
	@FindBy(id="com.mobeta.android.demodslv:id/drag_handle")
	public WebElement ElementA;
	
	@FindBy(name="Miles Davis")
	public WebElement ElementB;
	
	
	public MobileActions(WebDriver driver){
		this.driver= driver;
		
	}
	
	public void longPress(AndroidDriver androidDriver){
		
		TouchAction touchact = new TouchAction(androidDriver);
		touchact.longPress(androidDriver.findElement(By.id("com.mobeta.android.demodslv:id/drag_handle")))
				.moveTo(androidDriver.findElement(By.name("Miles Davis")))
				.release()
				.perform();
		//touchact.longPress(ElementA).moveTo(ElementB).release().perform();
	}
	//androidDriver.findElement(By.id("com.mobeta.android.demodslv:id/activity_desc")).click();
	
	//((androidDriver)MobileElement).findElements(By.className("android.widget.TextView")).get(0).click();
	
	
			//TouchAction touchact = new TouchAction(androidDriver);
			
			//touchact.longPress(androidDriver.findElement(By.id("com.mobeta.android.demodslv:id/drag_handle"))).moveTo(androidDriver.findElement(By.name("Miles Davis"))).release().perform();

}


