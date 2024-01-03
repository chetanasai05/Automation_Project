package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class3_drag_drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicitly wait for 10 seconds
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		// Actions class
		Actions act = new Actions(driver);
		
		// locate iframe
		 WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		// To enter into frame
		driver.switchTo().frame(iframe);
	
		// locate source to click and hold and drag image
		WebElement source = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		
		// locate target to drop image
		WebElement target = driver.findElement(By.cssSelector("div#trash"));
		
		// perform action class to drag and drop
		act.dragAndDrop(source, target).build().perform();
		
		act.clickAndHold(source).moveToElement(target).build().perform();
		

	}

}
