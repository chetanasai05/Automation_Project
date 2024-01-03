package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicitly wait for 10 seconds
		driver.get("https://www.amazon.in");

		// Actions class
		Actions act = new Actions(driver);

		// SearchBox
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobiles");
		
		// To capture input data of SearchBox
		System.out.println("Input data of searchbox : " + searchbox.getAttribute("value"));

		// double click
		act.moveToElement(searchbox).doubleClick().build().perform();
		
	}

}
