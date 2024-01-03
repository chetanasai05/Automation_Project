package extentReport;

import java.time.Duration;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base_Test.Base_class1;

public class Report3 extends Base_class1 {
	public static ExtentReports r1;
	public static ExtentTest test;
	String path = System.getProperty("user.dir");

	@Test(priority = 1)
	public void Verify_skills() throws Throwable {

		test = r1.createTest("Verify Search Box");
		test.log(Status.INFO, "Entered Automation Skill");

		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']"))
				.sendKeys("Automation tester");

		// click on Automation tester
		driver.findElement(By.xpath("(//b[@class='pre-wrap'])[1]")).click();

		Thread.sleep(3000);

		// take Screenshot

		screenshot("Entered Automation Testing");

		// Add Screenshot in Report

		test.addScreenCaptureFromPath(path + "\\Screenshots\\Entered Automation Testing.png");

	}

	@Test(priority = 2)
	public void Verify_dropdown() throws Throwable {

		test = r1.createTest("Verify dropdown");
		test.log(Status.INFO, "Click on 2year");

		// click on drop-down
		driver.findElement(By.xpath(" //input[@id='expereinceDD']")).click();
		driver.findElement(By.xpath("(//ul[@class='dropdown ']/li[3])")).click();

		Thread.sleep(3000);

		// take Screenshot

		screenshot("Click on Dropdown Year");

		// Add Screenshot in Report

		test.addScreenCaptureFromPath(path + "\\Screenshots\\Click on Dropdown Year.png");
	}

	@Test(priority = 3)
	public void click_dropdown() throws Throwable {

		test = r1.createTest("Click dropdown");
		test.log(Status.INFO, "Entered Mumbai Location");

		// click on drop-down
		driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("Mumbai");

		Thread.sleep(3000);

		// take Screenshot

		screenshot("Entered Mumbai Location");

		// Add Screenshot in Report

		test.addScreenCaptureFromPath(path + "\\Screenshots\\Entered Mumbai Location.png");
	}

	@Test(priority = 4)
	public void click_search_box() throws Throwable {

		test = r1.createTest("Click Searchbox");
		test.log(Status.INFO, "Clicked Search Button");

		// click on drop-down
		driver.findElement(By.xpath("//div[text()='Search']")).click();

		Thread.sleep(3000);

		// take Screenshot

		screenshot("Entered Click Search Button");

		// Add Screenshot in Report

		test.addScreenCaptureFromPath(path + "\\Screenshots\\Entered Click Search Button.png");
	}

	@BeforeClass
	public void Launch_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");


		String path = System.getProperty("user.dir");
		ExtentSparkReporter report = new ExtentSparkReporter(path + "\\extentReport\\Report3.html");
		
		report.config().setDocumentTitle("Automation Report");
		report.config().setReportName("Functional Testing");
		report.config().setTheme(Theme.STANDARD);

		// Attach Report
		r1 = new ExtentReports();
		r1.attachReporter(report);
		r1.setSystemInfo("OS", "Window");
		r1.setSystemInfo("QA", "Chetan");
		r1.setSystemInfo("Browser", "Chrome");

	}

	@AfterClass
	public void Close_Browser() {
		r1.flush();
	}
}
