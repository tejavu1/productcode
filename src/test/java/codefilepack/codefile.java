package codefilepack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class codefile {
	
	WebDriver driver;
	
	@Given("The user must be in the facebook home page")
	public void the_user_must_be_in_the_facebook_home_page() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
	}
	
//	@Given("Close the Browser")
//	public void close_the_Browser() {
//	   driver.quit();
//	    
//	}

	@When("The user must fill the {string} and {string}")
	public void the_user_must_fill_the_and(String txtuser, String txtpass) {
		
		driver.findElement(By.id("email")).sendKeys(txtuser);
		driver.findElement(By.id("pass")).sendKeys(txtpass);
		Assert.assertTrue(false);
	    
	}

	@When("The user must click the login button")
	public void the_user_must_click_the_login_button() {
		
//		driver.findElement(By.name("login")).click();
	    
	}

	@Then("The user must navigate to the invalid login page")
	public void the_user_must_navigate_to_the_invalid_login_page() {
		
		System.out.println("invalid login page");
	   
	}
//
//	@Given("The user should be in facebook home page")
//	public void the_user_should_be_in_facebook_home_page() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//	
//	}

	@When("The user has to click the create account button")
	public void the_user_has_to_click_the_create_account_button() {
		
	    
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	   
	}

	@When("The user has to fill the details")
	public void the_user_has_to_fill_the_details() {
		
		driver.findElement(By.name("firstname")).sendKeys("Teja");
		driver.findElement(By.name("lastname")).sendKeys("vu");
		driver.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
	    
	}

	@When("The user has to click the signup button")
	public void the_user_has_to_click_the_signup_button() {
		
		driver.findElement(By.name("websubmit")).click();
	  
	}

	@When("the user must receive the successfully registered message")
	public void the_user_must_receive_the_successfully_registered_message() {
		System.out.println("not successfully registred");
	    
	}






}
