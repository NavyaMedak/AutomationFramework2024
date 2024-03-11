package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageModel.GoogleSearchPage;

public class GoogleSearchTest {


	static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void  googleSearch()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("step by step by automation");
		//driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.RETURN);
		GoogleSearchPage.tex_Search(driver).sendKeys("Step by Step Automation");
		GoogleSearchPage.ClickSearch_Button(driver).sendKeys(Keys.RETURN);
		
	}

}
