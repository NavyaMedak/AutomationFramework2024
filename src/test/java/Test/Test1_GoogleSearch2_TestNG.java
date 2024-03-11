package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1_GoogleSearch2_TestNG {

	static WebDriver driver=null;

	@BeforeTest
	public void setUpTest()
	{
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
	}

}
