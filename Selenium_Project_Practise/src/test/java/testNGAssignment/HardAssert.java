package testNGAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_Test.Base_class1;

public class HardAssert extends Base_class1{
	
	@Test (priority =1)
	public void locate_frame() {	
		WebElement iframe = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
		driver.switchTo().frame(iframe);
	}
	
	@Test (priority =2)
	public void Close_Popup() {
		WebElement Pop_up = driver.findElement(By.xpath("(//div[@class='wrapper'])/div/a/i"));
		if (Pop_up.isDisplayed()) {
			Pop_up.click();
		}
		
	}

	@Test (priority =3)
	public void Verify_logo_name() {
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//p[text()='Super Offers']")).click();
//		String Expected_logo = "Make My Trip";
//		WebElement logo = driver.findElement(By.xpath("//img [@src='//imgak.mmtcdn.com/pwa_v3/pwa_hotel_assets/header/mmtLogoWhite.png']"));
//	    String Actual_logo = logo.getText();
//	    System.out.println(Actual_logo);
	
	}
	
	@BeforeClass
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		System.out.println("Title of the webpage : " + driver.getTitle());
		System.out.println("Current Url of the webpage : " + driver.getCurrentUrl());
	}
}
