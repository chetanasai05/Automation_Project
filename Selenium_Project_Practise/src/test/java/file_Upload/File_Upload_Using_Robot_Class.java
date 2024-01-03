package file_Upload;

import org.testng.annotations.Test;

import base_Test.Base_class1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class File_Upload_Using_Robot_Class extends Base_class1 {
	@Test
	public void verify_file_upload() throws Exception {
		// click on Add files
		driver.findElement(By.xpath("//button[text()='Add files']")).click();

		// Create object String Selection class
		StringSelection s = new StringSelection("\"C:\\Users\\Admin\\Desktop\\assignment-selenium(jiomart).txt\"");

		// Copy File path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		// Robot Class
		Robot r = new Robot();

		// Press Control V

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		// Release Control V
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		// Press Enter and release
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://uploadnow.io/");
		System.out.println("Title of the webpage : " + driver.getTitle());
		System.out.println("Current Url of the webpage : " + driver.getCurrentUrl());
	}

}
