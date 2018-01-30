package PractestCases;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestRunnable2  implements Runnable {
   
	//runnable class working fine for appium grid multiple android device
	
    String port;
    String udid;
    URL url;
    String device;
    String apppackage1;
    String activity;
    String version;
    String appiumServer;
    AppiumDriver<MobileElement> driver1;
    
    
    public void appiumGridSetup(String device,String apppackage1,String activity,String version,String appiumServer){
    	
    	DesiredCapabilities android_cap = DesiredCapabilities.android();
    	DesiredCapabilities ios_cap = DesiredCapabilities.iphone();
  
    	android_cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
    	android_cap.setCapability(MobileCapabilityType.UDID, device);
    	android_cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
    	android_cap.setCapability("appPackage", apppackage1);
    	android_cap.setCapability("appActivity", activity);
    	android_cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		//cap1.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.ANDROID);
    	android_cap.setCapability(MobileCapabilityType.VERSION, version);
    	
    	try {
			url= new URL(appiumServer);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
    	
    	driver1= new AndroidDriver<>(url, android_cap);
    }
   
    public TestRunnable2(String portNumber, String udid) {
        this.port = portNumber;
        this.udid = udid;
    }
    
    @FindBy(id="Open navigation drawer")
	private WebElement hamburgerIcon;
    
    @FindBy(xpath="//*[@text='Investor Dashboard']")
	private WebElement hello;
   
    @AndroidFindBy(id="Open navigation drawer")
    private WebElement hamburgerIcon1;
   
    @AndroidFindBy(xpath="//*[@text='Investor Dashboard']")
    private WebElement hello1;
   
    @AndroidFindBy(id="ap_email")
    private WebElement email;
   
    @AndroidFindBy(id="ap_password")
    private WebElement password;
   
    AppiumDriver<WebElement> driver;
    DesiredCapabilities capabilities = new DesiredCapabilities();
    
   
    private void openAppAndPerformSomeActions() {
        capabilities.setCapability("deviceName", "My Mobile Device");
        capabilities.setCapability("udid", udid);
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.choicebroking.investica");
        capabilities.setCapability("appActivity", "com.choicebroking.investica.ui.MutualFundActivity");
       
        try {
            driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:" + port + "/wd/hub"), capabilities);
            Thread.sleep(10000);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  catch (Exception e) {
            e.printStackTrace();
        } 
       
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
       
        hamburgerIcon.click();
        hello.click();
    }
   
    public static void main(String args[]) {
        Runnable r1 = new TestRunnable2("4723", "c1b5fe2f"); //device id of first mobile device
        Runnable r2 = new TestRunnable2("4733", "LS5501"); //device id of second mobile device
        new Thread(r1).start();
        new Thread(r2).start();
    }

    @Override
    public void run() {
        //openAppAndPerformSomeActions();
        appiumGridSetup(device,apppackage1,activity,version,appiumServer);
        System.out.println("test");
    	
    }
}