package automate_WebApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in");

		// Capture title of Webpage
		System.out.println("The title of Webpage is:" + driver.getTitle());

		// Send data on searchbox

		WebElement source = driver.findElement(By.cssSelector("input#src"));
		source.sendKeys("Nagpur");
		Thread.sleep(2000);
		
		WebElement destination = driver.findElement(By.cssSelector("input[id='dest'][autocomplete='off']"));
		destination.sendKeys("Mumbai");
		Thread.sleep(3000);
		destination.clear();
		
        
	}

}
