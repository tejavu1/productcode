package pomtestt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import zbaseclass.baseclass;

public class login extends baseclass {
	
	public  login() {
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="email")
	private WebElement login;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement loginbutton;
	
	
	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPass() {
		return pass;
	}

	
	
	
	
	
	
	
	
	
	

}
