package action_class;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_Test.Base_class1;

public class Action_class1 extends Base_class1 {

	public static void main(String[] args) throws Throwable {
	    driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the window
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicitly wait for 10 seconds
		driver.get("https://www.facebook.com");
		
		// Actions class
		Actions act = new Actions(driver);
		
		// Click on create account
		
		//WebElement createacc= driver.findElement(By.cssSelector("a#u_0_0_e8"));
		WebElement createacc= driver.findElement(By.linkText("Create new account"));
		
		// Capture name of Web ELement
		System.out.println("Click on web element:"+createacc.getText());
		
		// Click on create account using action class 		
		act.moveToElement(createacc).click().build().perform();
		Thread.sleep(2000);
		Base_class1.screenshot("facebook"); // Capture Screenshot 
		
		// Right click or  context click
		act.contextClick().build().perform();
		Thread.sleep(2000);
		Base_class1.screenshot("facebook1");
		 
	}

}
