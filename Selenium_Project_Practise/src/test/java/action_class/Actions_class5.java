package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_Test.Base_class1;

public class Actions_class5 extends Base_class1{

	public static void main(String[] args) {
		
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.navigate().to("https://www.railyatri.in");
            
            act = new Actions(driver);
            WebElement search = driver.findElement(By.cssSelector("input[placeholder='Enter train no. or name']"));
          // act.moveToElement(search).click().sendKeys("12140").sendKeys(Keys.ENTER).build().perform();
            act.sendKeys(search, "12140").sendKeys(Keys.ENTER).build().perform();
            
            
            		
	}

}
