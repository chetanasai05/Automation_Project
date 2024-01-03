package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_Test.Base_class1;

public class Action_class_slider extends Base_class1{

	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jqueryui.com/slider");
		
		Actions act = new Actions(driver);
		
		// Locate iframe
		WebElement iframe = driver.findElement(By.className("demo-frame")); 
		// Move to iframe
		driver.switchTo().frame(iframe); 
		
		// locate slider
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Thread.sleep(2000);
		
		// 
		act.clickAndHold(slider).moveByOffset(500,0).release().build().perform();
		act.dragAndDropBy(slider, -200, 0).build().perform();
		screenshot("Slider");
	}

}
