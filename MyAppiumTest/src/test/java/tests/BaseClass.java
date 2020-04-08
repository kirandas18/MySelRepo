package tests;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup(){
		
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("platformName", "Android");
		//caps.setCapability(CapabilityType.PLATFORM_NAME, Android);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		caps.setCapability(MobileCapabilityType.VERSION, "8.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		//caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		//caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability(MobileCapabilityType.APP,"");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.ANDROID);
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.browser");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.browser.browserActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver =new AppiumDriver<MobileElement>(url,caps);
		
		}catch(Exception e) {
			System.out.println("The cause is" + e.getCause());
			System.out.println("The cause is" + e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void sampleTest()
	{
		System.out.println("Inside sample Test");
	}
	@AfterTest
	public void teardown() {
		
	}
	
	
}
