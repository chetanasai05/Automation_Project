package testNGAssignment;

import org.testng.annotations.Test;

import base_Test.Base_class1;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class HardAsset_001 extends Base_class1{
  @Test
  public void Verify_link() {
	  String Expected_link_name ="Amazon miniTV";
	  WebElement link =driver.findElement(By.linkText("Amazon miniTV"));
	  String Actual_link_name = link.getText();
	    System.out.println(Actual_link_name);
	    
	    // Verify actual and expected link name	    
	//    Assert.assertEquals(Expected_link_name, Actual_link_name);
	    Assert.assertTrue(Actual_link_name.equals(Expected_link_name), "Both links are same");
	    
	    // insert data in search box	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	    	    
  }
  @BeforeSuite
  public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		System.out.println("Title of the webpage : " + driver.getTitle());
		System.out.println("Current Url of the webpage : " + driver.getCurrentUrl());
	}

  @AfterSuite
  public void afterSuite() {
  }

}
