package base_Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Base_class {

	public static WebDriver driver;
	public static Actions act;
	public static String child_window;
	public static String parent_window;

	// Dynamic code for screenshot
	public static void screenshot(String Screenshot) throws Throwable {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("../Selenium_Project_Practise/Screenshots/" + Screenshot + ".png");
		FileHandler.copy(source, destination);
	}

	// Dynamic code for action class
	public static void action() {
		act = new Actions(driver);
	}

	// dynamic code for switch window
	public static void Switch_Window() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		parent_window = itr.next();
		child_window = itr.next();
		System.out.println("Parent window ID : " + parent_window);
		System.out.println("Child window ID : " + child_window);

	}
	
	public static int random_number() {
		Random r = new Random();
		int random_number= r.nextInt(12456);
		return random_number;
		
	}

}
