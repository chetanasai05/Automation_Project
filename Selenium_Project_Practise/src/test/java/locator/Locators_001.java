package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_001 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");

		// Requirement to click on search box

		// driver.findElement(By.id("twotabsearchtextbox")).click(); // By id

		// driver.findElement(By.name("url")).click(); // By name

		// WebElement All = driver.findElement(By.className("hm-icon-label")); // By
		// class name
		// All.click();

		// click on link

		// WebElement Best_seller_link = driver.findElement(By.linkText("Best Sellers"));  // By linkText
		// Best_seller_link.click();

		//  WebElement Today_deal_link = driver.findElement(By.partialLinkText("Today's")); // By partialLinkText
		//  Today_deal_link.click();
		
		// Css- selector
		// driver.findElement(By.cssSelector("a#nav-logo-sprites")).click(); // combination of tagname and id(using #)
		
		// driver.findElement(By.cssSelector("a.a-button-text")).click(); // combination of tagname and classname (using .)
		
		driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).click(); // combination of tagname and attribute
	}
}
