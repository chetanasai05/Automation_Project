package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_js_01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.get("https://www.jiomart.com");
		// driver.get("https://www.udemy.com");
		driver.get("https://www.netmeds.com");

		// Page Scroll with help of java script executor by pixel value

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");

		// Page Scroll with help of java script executor towards the end of web page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.linkText("About Netmeds")).click();

	}

}
