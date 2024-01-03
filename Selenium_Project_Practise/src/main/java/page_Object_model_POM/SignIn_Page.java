package page_Object_model_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page  {
	
	//Web-Element
	@FindBy(linkText = "Sign in") WebElement signin_button;
	@FindBy(id = "email_create") WebElement userEmail;
	@FindBy(id = "SubmitCreate") WebElement createAccButton;
	
	public SignIn_Page(WebDriver driver) {
		// initialize WebElement
		PageFactory.initElements(driver, this); // this keyword defines all instance variable
	}
	
	// Operation
	public void user_sign() {
		signin_button.click();
		userEmail.sendKeys("QA2356@gmail.com");
		createAccButton.click();
	}
}
