package extentReport;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base_Test.Base_class1;

public class Report01 extends Base_class1 {

	@Test
	public void verify_report() {
		String path = System.getProperty("user.dir");
		ExtentSparkReporter report = new ExtentSparkReporter(path + "\\extentReport\\Report01.html");
		report.config().setDocumentTitle("Automation Report");
		report.config().setReportName("Functioal Testing");
		report.config().setTheme(Theme.STANDARD);

		// Attach Report

		ExtentReports r = new ExtentReports();
		r.attachReporter(report);

		// Name of OS
		r.setSystemInfo("OS", "Window");

		// Name of QA
		r.setSystemInfo("QA", "Chetan");

		// Name of Browser
		r.setSystemInfo("Browser", "Chrome");
		
		//use Create test()
		
		ExtentTest test = r.createTest("Launch Browser");
		
		// to give description
		test.log(Status.INFO, "Opened Chrome Browser");
		test.log(Status.PASS, "pass");
		test.log(Status.FAIL, "failed");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		//to stop monitoring
		r.flush();
		
		

	}

}
