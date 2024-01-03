package select_method_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base_Test.Base_class1;

public class Class02 extends Base_class1 {

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
        System.out.println("Title of webpage : " +driver.getTitle());
        System.out.println("Current url of webpage : " +driver.getCurrentUrl());       
        
        WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
        Select s = new Select(dropdown);
        s.selectByVisibleText("Black");
        System.out.println("is dropdown multi-selected :" +s.isMultiple());
        
        Select s1 = new Select(driver.findElement(By.id("cars")));
        s1.selectByValue("volvo");
        System.out.println("is dropdown multi-selected :" +s1.isMultiple());
        s1.selectByValue("saab");
        s1.deselectByValue("volvo");
        
        
        
        
	}

}
