package testNGAssignment;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base_Test.Base_class1;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class SoftAssert001 extends Base_class1 {
	@Test
	public void Verify_Url() {
		String Expected_url = "https://www.amazon.i/";
		String Actual_url = driver.getCurrentUrl();
		System.out.println("The Current url of the webpage: " + Actual_url);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Actual_url, Expected_url, "the url is not same");

		// insert data in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		sa.assertAll();
	}

	@BeforeSuite
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		System.out.println("Title of the webpage : " + driver.getTitle());
		System.out.println("Current Url of the webpage : " + driver.getCurrentUrl());
	}

	@AfterSuite
	public void afterSuite() {
	}

}
