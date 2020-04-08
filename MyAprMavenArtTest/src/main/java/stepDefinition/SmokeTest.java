package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.lang.System;;

public class SmokeTest {

	
	WebDriver driver ;
	
	
	@Given("Open firefox and start application")
	public void open_firefox_and_start_application() {
		System.setProperty("webdriver.gecko.driver", "C:\\Kiran\\Gecko\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	   
		
	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		
		driver.findElement(By.id("email")).sendKeys("kiran");
		driver.findElement(By.id("pass")).sendKeys("kiran");
	    
		
	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	    
		driver.findElement(By.id("loginbutton")).click();
	}
	
}
