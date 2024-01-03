package page_Object_model_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_AccountPage {
	
	public Create_AccountPage(WebDriver driver) {
		// initialize WebElement
		PageFactory.initElements(driver, this); // this keyword defines all instance variable
	}
	
	// WebElement locate
	@FindBy(name = "id_gender")
	WebElement usertitle;
	@FindBy(name = "customer_firstname")
	WebElement firstname;
	@FindBy(name = "customer_lastname")
	WebElement lastname;
	@FindBy(name = "passwd")
	WebElement password;
	@FindBy(xpath = "(//select[@class= 'form-control'])[1]")
	WebElement userdate;
	@FindBy(xpath = "(//select[@class= 'form-control'])[2]")
	WebElement usermonth;
	@FindBy(xpath = "(//select[@class= 'form-control'])[3]")
	WebElement useryear;
	@FindBy(xpath = "//div[contains(@id,'uniform-news')]")
	WebElement checkbox;
	@FindBy(xpath = "//button[@id='submitAccount']")
	WebElement register;
	
	//Operation
		public void user_createaccount() {
			usertitle.click();
			firstname.sendKeys("Jackie");
			lastname.sendKeys("chan");
			password.sendKeys("Jack@123");
			
			// select class user date
			Select s1 = new Select(userdate);
			s1.selectByValue("5");
			// select class user month
			Select s2 = new Select(usermonth);
			s2.selectByVisibleText("December ");
			// select class user year
			Select s3 = new Select(useryear);
			s3.selectByIndex(1);
			checkbox.click();
			register.click();
			
			
		}

}
