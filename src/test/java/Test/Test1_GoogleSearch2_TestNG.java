package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertyFile;

public class Test1_GoogleSearch2_TestNG {

	static WebDriver driver=null; 
    public static String browserName=null;
    
	@BeforeTest
	public void setUpTest()
	{
		String projectPath=System.getProperty("user.dir"); 
		PropertyFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			//System.out.println(projectPath);
			//.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.out.println(projectPath);
			System.setProperty("webdriver.gecko.driver", projectPath+"/Drivers/chromedriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver=new ChromeDriver();
	}
	@Test	
	public  void  googleSearch()
	{

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("step by step by automation");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDown()
	{
		//driver.close(); //closing the current window of browser.
		PropertyFile.setProperties();
	}

}
