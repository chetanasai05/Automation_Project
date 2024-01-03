package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_Test.Base_class1;

public class Action_class4 extends Base_class1 {

	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");

		act = new Actions(driver);

		// Mouse Hover
		WebElement Account = driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"));
		act.moveToElement(Account).build().perform();
		// Capture text of Web Element
		System.out.println("Move to Account : " + Account.getText());

		// Take Screenshot
		screenshot("Move to account");

		// Click on your orders
		WebElement orders = driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']"));
		orders.click();
		screenshot("Move to account and click on orders");

		// Click on create account
		WebElement createacc = driver.findElement(By.linkText("Create your Amazon account"));
		createacc.click();

		// Click on name
		WebElement name = driver.findElement(By.id("ap_customer_name"));

		// send input
		act.sendKeys(name, "chetan").build().perform();

		// To capture input data
		System.out.println("Input data of Name field :" + name.getAttribute("value"));

		screenshot("Input data Name capture");

		// select data
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		// copy data
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		// press tab and paste data
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		screenshot("After pasting data capture");

	}

}
