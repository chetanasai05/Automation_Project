package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import base_Test.Base_class1;

public class Rail_yatri extends Base_class1 {

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.railyatri.in/");
		System.out.println("Title of page:" + driver.getTitle());
		System.out.println("Get current page url:" + driver.getCurrentUrl());

		// Add Boarding from
		driver.findElement(By.xpath("//input[@name='boarding_from']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//li[@id='ui-id-12']")).click();

		// Add Boarding to
		driver.findElement(By.xpath("//input[@name='boarding_to']")).sendKeys("Nagpur");
		driver.findElement(By.xpath("//li[text()='NAGPUR | NGP']")).click();

		// date select
		driver.findElement(By.xpath("//input[@id='datepicker_train']")).click();
		driver.findElement(By.xpath("//td[text()=8]")).click();

		// search button
		driver.findElement(By.xpath("//button[@id='search_btn_dweb']")).click();

		// Scrolling down till book now
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(2000);

		// book now
		driver.findElement(By.xpath("(//div[text()=' Book Now '])[1]")).click();

		// Scrolling down till book 685 for 12dec
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);

		// book 685 for 18dec
		driver.findElement(By.xpath("(//button[@class='GoToBooking ShowTrainFare'])[5]")).click();

		// Scrolling down till add passenger details
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);

		// Add full name
		driver.findElement(By.xpath("//input[@id='adult_add_fullname']")).sendKeys("Chetan Asai");
		Thread.sleep(3000);

		// Add age
		driver.findElement(By.xpath("//input[@id='adult_add_age']")).sendKeys("31");
		Thread.sleep(3000);

		// Select birth in train
		driver.findElement(By.xpath("//input[@id='adult_add_berth']")).click();
		driver.findElement(By.xpath("//li[text()='Upper']")).click();
		Thread.sleep(3000);

		// Save button
		driver.findElement(By.xpath("//button[@class='save_psngr_btn']")).click();
		Thread.sleep(3000);

		// Scrolling down till contact details
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);

		// Add email
		driver.findElement(By.xpath("// input[@name='user_email']")).sendKeys("chetanasai05@gmail.com");

		// Add phone number
		driver.findElement(By.xpath("//input[@name='phone_no']")).sendKeys("8779792815");

		// Add IRCTC user id
		driver.findElement(By.xpath("// input[@class='idInput']")).sendKeys("Asai_wr");

		// Verify IRCTC id
		driver.findElement(By.xpath("//button[@class='verifyIdBtn']")).click();
		Thread.sleep(2000);

		// continue button
		driver.findElement(By.xpath("//div[text()='Continue ']")).click();

		// UPI
		driver.findElement(By.xpath("(//div[@class='paymt_method__text'])[4]")).click();
		
		// Add UPI address
		driver.findElement(By.xpath("//input[@class='Bank_Name upi_vpa upi-link']")).sendKeys("chetan");
		
		// web page close
		driver.close();
		

	}

}
