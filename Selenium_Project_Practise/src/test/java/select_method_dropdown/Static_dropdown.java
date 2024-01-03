package select_method_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base_Test.Base_class1;

public class Static_dropdown extends Base_class1{

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jeevansathi.com/");
        System.out.println("Title of webpage : " +driver.getTitle());
        System.out.println("Current url of webpage : " +driver.getCurrentUrl());
        
       // locate dropdown
        driver.findElement(By.cssSelector("div[data-qa=\'relationship\']")).click();
        
//        List<WebElement> option = driver.findElements(By.xpath("//div[@id='relationshipOptions']/ul/li"));
//        
//        for (int i=0; i< option.size();i++) {
//        	
//        	if(option.get(i).getText().equalsIgnoreCase("Brother")) {
//        	option.get(i).click();
//        	}
//        	
//        }
        
        driver.findElement(By.xpath("(//div[@id='relationshipOptions']/ul/li)[4]")).click();
        	

	}

}
