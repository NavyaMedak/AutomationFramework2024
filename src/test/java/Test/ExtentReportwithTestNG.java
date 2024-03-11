package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.dockerjava.api.model.Driver;

public class ExtentReportwithTestNG {
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;

	@BeforeSuite
	public void setUp()
	{
		htmlReporter = new ExtentSparkReporter("extent1.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@BeforeTest
	public void setUpTest()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test1()
	{
		ExtentTest test = extent.createTest("My FirstTest", "Sample description");
		
		driver.get("https://www.google.com/");
		test.pass("Navigate to google.com page");
		
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");
        
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	
	
	@Test
	public void test3()
	{
		ExtentTest test2 = extent.createTest("Second Test", "Sample description");
		
        test2.log(Status.INFO, "This step shows usage of log(status, details)");

        test2.info("This step shows usage of info(details)");
        
        test2.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        test2.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void tearDownTest()
	{
		
		driver.close();
	}

	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}

}
