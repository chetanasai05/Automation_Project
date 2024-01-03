package automate_WebApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class_2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");

		// Capture title of Web page
		System.out.println("The title of Webpage is:" + driver.getTitle());

		// Locate link on Web page
		WebElement deals = driver.findElement(By.linkText("Today's Deals"));
		// get properties / attribute of web element
		System.out.println("href:" + deals.getAttribute("href"));
		// get Tag name of web element
		System.out.println("Tagname:" + deals.getTagName());
		// get Text of link
		System.out.println(deals.getText());
		// To check WebElement is visible or not
		System.out.println(deals.isDisplayed());
		// click on link
		deals.click();

	}

}
