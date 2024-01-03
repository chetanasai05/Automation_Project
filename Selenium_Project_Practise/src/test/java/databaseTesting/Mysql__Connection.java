package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_Test.Base_class1;

public class Mysql__Connection extends Base_class1 {
	public ResultSet r;
	@Test (priority =1)
	public void Verify_Database() throws Throwable {
		String port_no = "3306";
		String  host= "localhost";
		// create jdbc (java database connection ) connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port_no + "/chetandb","root",
				"asaichetan@05");

		// create statement (path for database to send query)
		Statement s = conn.createStatement();
		r = s.executeQuery("select * from QA where Name = \"Peter\";");

		// r=0 
		r.next(); // shift from 0 to 1
		System.out.println(r.getString("Name"));
		System.out.println(r.getString("Password"));

	}
	
	@Test (priority =2)
	public void Verify_facebook_login() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		System.out.println("Title of the webpage : " + driver.getTitle());
		System.out.println("Current Url of the webpage : " + driver.getCurrentUrl());
		
		driver.findElement(By.id("email")).sendKeys(r.getString("Name"));
		driver.findElement(By.id("pass")).sendKeys(r.getString("Password"));
	}

}
