package launch_Browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_01 {

	public static void main(String[] args) throws InterruptedException {

		// Launch ChromeBrowser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the window
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicitly wait for 10 seconds
		driver.get("https://www.amazon.in"); // navigate to url
		// System.out.println(driver.getPageSource()); // capture html source code
		System.out.println("The url of current webpage :- " + driver.getCurrentUrl()); // capture current url of webpage

		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");


		// driver.navigate().to("https://www.amazon.in"); // Refresh the web page
		// driver.navigate().to(driver.getCurrentUrl()); // Refresh the web page
		Thread.sleep(2000);
		Actions act = new Actions(driver);
	//	act.keyDown(Keys.F5).keyUp(Keys.F5).build().perform();
	//	act.keyDown(Keys.CONTROL).sendKeys("R").keyUp(Keys.CONTROL).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.go(0)");

		
		

	}

}
