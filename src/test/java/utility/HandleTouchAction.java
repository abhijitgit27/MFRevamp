package utility;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class HandleTouchAction {

	@FindBy(id="com.mobeta.android.demodslv:id/drag_handle")
	public WebElement ElementA;
	
	@FindBy(name="Miles Davis")
	public WebElement ElementB;
	
	public void longPressMove(AndroidDriver androidDriver){
		try
		{
			if(androidDriver!=null)
			{
				
				TouchAction touchact = new TouchAction(androidDriver);
				
				System.out.println("alasdasdkfjav "+ElementA.getClass());
				System.out.println("alasdasdkfjav "+ElementB.getClass());

				
				if(ElementA instanceof org.openqa.selenium.internal.HasIdentity)
					touchact.longPress(ElementA);
				if(element2 instanceof org.openqa.selenium.internal.HasIdentity)
					touchact.moveTo(element2);
				
				touchact.release();
				touchact.perform();
			}
			else
			{
				System.out.println("Something was null in HandleTouchAction#longPressMove()");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
