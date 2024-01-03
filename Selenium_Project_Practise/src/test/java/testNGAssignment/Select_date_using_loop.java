package testNGAssignment;

import org.testng.annotations.Test;

import base_Test.Base_class1;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Select_date_using_loop extends Base_class1 {
	WebElement date_dropdown;
	@Test
	public void verify_date_dropdown() {
		date_dropdown = driver.findElement(By.cssSelector("input[class*='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
	    date_dropdown.click();
	}
	
	@Test
	public void verify_month_year() {
	int date =29;
	
	while(true) {
		String month_year= driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-title ng-tns-c58-10')]")).getText();
	if (!month_year.equalsIgnoreCase("March2024")) {
		// Next Button
	driver.findElement(By.cssSelector("span[class*='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();			
	}
	else {	
		break;
	}
	}
	// select date
	 
	driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	System.out.println("Entered Date: "+ date_dropdown.getAttribute("value") );
		
	}

	@BeforeClass
	public void invoke_Browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/");
		System.out.println("Title of the webpage : " + driver.getTitle());
		System.out.println("Current Url of the webpage : " + driver.getCurrentUrl());
	}

	@AfterClass
	public void afterClass() {
	}

}
