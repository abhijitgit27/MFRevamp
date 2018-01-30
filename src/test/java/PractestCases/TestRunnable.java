package PractestCases;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TestRunnable  implements Runnable {
   
	//runnable class working fine for appium grid multiple android device
	
    String port;
    String udid;
   
    public TestRunnable(String portNumber, String udid) {
        this.port = portNumber;
        this.udid = udid;
    }
   
    @AndroidFindBy(id="Open navigation drawer")
    private WebElement hamburgerIcon;
   
    @AndroidFindBy(xpath="//*[@text='Investor Dashboard']")
    private WebElement hello;
   
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
        Runnable r1 = new TestRunnable("4723", "c1b5fe2f"); //device id of first mobile device
        Runnable r2 = new TestRunnable("4733", "LS5501"); //device id of second mobile device
        new Thread(r1).start();
        new Thread(r2).start();
    }

    @Override
    public void run() {
        openAppAndPerformSomeActions();
    }
}