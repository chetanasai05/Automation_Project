package practice_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_Test.Base_class1;

public class class_01 extends Base_class1{

	public static void main(String[] args) throws Throwable   {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jiomart.com/");
		
		System.out.println("Current web-page Title: "+driver.getTitle());
		System.out.println("Current web-page URL: "+driver.getCurrentUrl());
		
		Actions act = new Actions(driver);

		// hover to element groceries
		WebElement groceries = driver.findElement(By.linkText("Groceries"));
		act.moveToElement(groceries).build().perform();
		screenshot("groceries");
		
		// hover to element Premium_Fruits
		WebElement Premium_Fruits = driver.findElement(By.linkText("Premium Fruits"));
		act.moveToElement(Premium_Fruits).build().perform();
		screenshot("Premium Fruits");
		Thread.sleep(2000);
		
		// hover to element Home_and_kitchen
		WebElement Home_and_kitchen = driver.findElement(By.linkText("Home & Kitchen"));
		act.moveToElement(Home_and_kitchen).build().perform();
		screenshot("Home and kitchen");
		Thread.sleep(2000);
		
		// hover to element Fashion
		WebElement Fashion = driver.findElement(By.linkText("Fashion"));
		act.moveToElement(Fashion).build().perform();
		screenshot("Fashion");
		Thread.sleep(2000);
		
		// hover to element Electronics
		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
		act.moveToElement(Electronics).build().perform();
		screenshot("Electronics");
		Thread.sleep(2000);
				
		WebElement search_product = driver.findElement(By.cssSelector("input#autocomplete-0-input"));
	    act.sendKeys(search_product, "tv").build().perform();
	    System.out.println("Name of the product:"+ search_product.getAttribute("value"));
	    act.keyDown(search_product, Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	    Thread.sleep(2000);

        // click on real-me TV product
	    driver.findElement(By.xpath("//div[text()=' Realme 80 cm (32 inch) HD Ready LED Smart Android TV 2023 Edition with Android 11 RMV2205 ']")).click();
	    Thread.sleep(3000);
	    System.out.println("Name of the product:"+ driver.getTitle());
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,2500)");
	  
		
		//add to cart
		driver.findElement(By.xpath("//button[@class='jm-btn secondary medium center full-width jm-fw-bold addtocartbtn']")).click();
		
		// verify cart
		driver.findElement(By.xpath("(//img[@class='icon'])[3]")).click();
		Thread.sleep(5000);
		screenshot("verify_cart");
		
		// place order
		driver.findElement(By.xpath("(//button[@aria-label='button Place Order']/div)[1]")).click();
		Thread.sleep(2000);
		screenshot("sign_page");
		}
	
	
	

}
