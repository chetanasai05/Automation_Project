package select_method_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base_Test.Base_class1;

public class Class01 extends Base_class1{

	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=CjwKCAiAjfyqBhAsEiwA-UdzJIj2eFKs5y3LdN5jnHzMp_L26jyd3YbvEXZiz95s7qEEoRtlmke7EBoCgOwQAvD_BwE");
        System.out.println("Title of webpage : " +driver.getTitle());
        System.out.println("Current url of webpage : " +driver.getCurrentUrl());
        
        // select class object
        
        Select s = new Select (driver.findElement(By.cssSelector("select#reg_relationship")));
        
        // select by visible text
        // s.selectByVisibleText("Son");
        // screenshot("by taking visible text");
        
        // select by value
        // s.selectByValue("4");
        // screenshot("by taking value");
        
       // select by index
        s.selectByIndex(1);
        screenshot("by taking index");
	}

}
