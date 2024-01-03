package testNGAssignment;

import org.testng.annotations.Test;

import base_Test.Base_class1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Flipkart extends Base_class1 {
//	public static WebDriver driver;

	@Test(priority = 2)
	public void Verify_SearchBox() {
		WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		searchbox.sendKeys("shirt");
		System.out.println("Entered text of searchbox : " + searchbox.getAttribute("value"));
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	}

	@Test(priority = 1)
	public void Close_Login_Popup() {
		WebElement Pop_up = driver.findElement(By.xpath("//span[@role='button']"));
		if (Pop_up.isDisplayed()) {
			Pop_up.click();
		}
	}

	@Test(priority = 3)
	public void Click_on_shirt() {
		driver.findElement(By.xpath("//a[text()='Men Regular Fit Solid Spread Collar Casual Shirt']")).click();

	}

	@Test(priority = 4)
	public void Switch_Child_Window() {
		Switch_Window();
		driver.switchTo().window(child_window);
	}

	@Test(priority = 5)
	public void Add_to_cart() {
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

	}
	
	@Test(priority = 6)
	public void Place_order() {
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();

	}
		
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of the webpage : " + driver.getTitle());
		System.out.println("Current Url of the webpage : " + driver.getCurrentUrl());
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

}
