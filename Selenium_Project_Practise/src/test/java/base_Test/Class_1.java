package base_Test;


import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class_1 extends Base_class1{

	public static void main(String[] args) throws Throwable {
	    driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com");
		Base_class1.screenshot("home");
	}

}
