package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportDemo {
	private static WebDriver driver=null;
	 

	public static void main(String[] args) {
	  
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "Sample description");
        
       driver=new ChromeDriver();
       test1.log(Status.INFO, "Starting Test Case");
       
       driver.get("https://google.com");
       test1.pass("Navigated to google.com");
       
       
       driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("step by step by automation");
		test1.pass("Entered text in search box");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.RETURN);
		test1.pass("Enter the press button");
		
		test1.info("Test is completed");
		extent.flush();
       

	}

}
