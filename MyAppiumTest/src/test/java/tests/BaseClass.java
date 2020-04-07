package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup(){
		
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.VERSION, "26");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_XL_API_26");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability(MobileCapabilityType.APP,"");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		
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
