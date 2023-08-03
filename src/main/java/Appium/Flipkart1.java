package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Flipkart1 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "RZ8M93CRXJE");
        caps.setCapability(MobileCapabilityType.APP, "Flipkart"); 

    
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

   
        Thread.sleep(5000);

      
        driver.findElement(By.id("com.flipkart.android:id/search_widget_textbox")).click();
        driver.findElement(By.id("com.flipkart.android:id/search_autoCompleteTextView")).sendKeys("Product Name");

        driver.pressKeyCode(66);

     
        Thread.sleep(5000);

   
        driver.quit();
    }
}

	