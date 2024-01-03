package testNGAssignment;

import org.testng.annotations.Test;

import base_Test.Base_class1;
import page_Object_model_POM.Create_AccountPage;
import page_Object_model_POM.SignIn_Page;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class POM_Execution extends Base_class1 {
	@Test(priority = 1)
	public void verify_UserSignIn_Page() {
		SignIn_Page sp = new SignIn_Page(driver);
		sp.user_sign();

	}

	@Test(priority = 2)
	public void verify_UserCreateAccount_Page() {
		Create_AccountPage ca = new Create_AccountPage(driver);
        ca.user_createaccount();
	}

	@BeforeClass
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.automationpractice.pl/");
		System.out.println("Title of the webpage : " + driver.getTitle());
		System.out.println("Current Url of the webpage : " + driver.getCurrentUrl());
	}

	@AfterMethod
	public void afterMethod() {
	}

}
