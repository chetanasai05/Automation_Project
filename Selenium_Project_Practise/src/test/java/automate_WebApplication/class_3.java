package automate_WebApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.railyatri.in");

		
		// Size of Web ELement
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Enter train no. or name']"));
		
		System.out.println(searchbox.getSize());
		
		// get locate at x-coordinate
		
		System.out.println(searchbox.getLocation().x);
		
		// get locate at y-coordinate
		System.out.println(searchbox.getLocation().y);
		
		// to check isenabled
		System.out.println(searchbox.isEnabled());
	}

}
