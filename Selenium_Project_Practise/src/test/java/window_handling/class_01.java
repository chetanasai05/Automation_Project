package window_handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base_Test.Base_class1;

public class class_01 extends Base_class1 {

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.salesforce.com");

		// click on link

		driver.findElement(By.linkText("Start free trial")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		String parentwindow = itr.next();
		String childwindow = itr.next();

		System.out.println("Parent window ID : " + parentwindow);
		System.out.println("Child window ID : " + childwindow);

		// switch to child window
		driver.switchTo().window(childwindow);

		// locate first name from child window
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("chetan");

		// switch to parent window
		driver.switchTo().window(parentwindow);

		// locate watch demo from parent window
		driver.findElement(By.linkText("Watch demo")).click();

	}

}
