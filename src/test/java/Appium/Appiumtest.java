package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appiumtest {
	
	
	public static void main(String[] args) {
	}
		public static <WebElement> void openCalculator() throws MalformedURLException {
		  
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability("devicename","samsung MS2");
			cap.setCapability("udid","RZ8M93CRXJE");
			cap.setCapability("platformName","Android");
			cap.setCapability("platformversion","11");
			cap.setCapability("apppakage","com.sec.android.app.popupcalculator");
			cap.setCapability("appactivity","com.sec.android.app.popupcalculator.calculator");
			
			Appiumtest  driver = new Appiumtest();
		
	}
}
