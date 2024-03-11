package pomtestt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import zbaseclass.baseclass;

public class register extends baseclass{
	
	public register() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createbutton;
	
	@FindBy(name="firstname")
	private WebElement firstname;

	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(name="reg_email__")
	private WebElement regemail;
	
	@FindBy(id="password_step_input")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement signupbutton;

	public WebElement getCreatebutton() {
		return createbutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getRegemail() {
		return regemail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignupbutton() {
		return signupbutton;
	}
	

}
