package testNGAssignment;

import org.testng.annotations.Test;

import base_Test.Base_class1;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Netmeds extends Base_class1 {
	public static WebDriver driver;
    Actions act;
	// mouse Hover to Wellness
	@Test(priority = 1)
	public void Verify_Mouse_Hover_001() throws Throwable {
		act = new Actions(driver);
		WebElement Wellness = driver.findElement(By.linkText("Wellness"));
		act.moveToElement(Wellness).build().perform();
		Thread.sleep(2000);
	    screenshot("Mouse Hover to Wellness");
	}

	@Test(priority = 2)
	public void Verify_Searchbox() throws Throwable {
		act = new Actions(driver);
		WebElement Searchbox = driver.findElement(By.xpath("//input[@id='search']"));
		act.sendKeys(Searchbox, "dolo").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		screenshot("Search product on searchbox");
	}

	@Test(priority = 3)
	public void Verify_Add_to_cart() throws Throwable {
		WebElement Pop_up = driver.findElement(By.xpath("//i[@class ='wewidgeticon we_close icon-large']"));
		if (Pop_up.isDisplayed()) {
			Pop_up.click();
		}
		act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
	 driver.findElement(By.xpath("//button[@data-sku='45297']")).click();
	 //Add_to_cart.click();

		 Thread.sleep(2000);
		 screenshot("Search product on searchbox");
	}
	
	@Test(priority = 4)
	public void Verify_cart() throws Throwable {
		act = new Actions(driver);
		WebElement cart = driver.findElement(By.xpath("(//span[text()=' Cart ']"));
		cart.click();
		screenshot("Verify cart");
	}
	
	@Test(priority = 5)
	public void Verify_proceed() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		act = new Actions(driver);
		WebElement proceed = driver.findElement(By.xpath("(//button[text()='Proceed']"));
		proceed.click();
		screenshot("Verify proceed");
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void LaunchBRowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netmeds.com/");
		System.out.println("Title of the webpage : " + driver.getTitle());
		System.out.println("Current Url of the webpage : " + driver.getCurrentUrl());
	}
}
