package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageModel.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	
	static WebDriver driver=null;
	
	public static void main(String[] args) {
		googleSearchText();

	}
	
	public static void googleSearchText()
	{
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		GoogleSearchPageObjects set=new GoogleSearchPageObjects(driver);
		
		 driver.get("https://www.google.com/");
		 
		 set.setTextinGoogleSearch("Step By Step By Automation");
		 
		 set.clickButton();
		 
		 driver.close();
		 
		 
		
	}

}
