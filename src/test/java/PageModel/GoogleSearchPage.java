package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
private	static WebDriver driver=null;

  public static WebElement tex_Search(WebDriver driver)
  {
	  WebElement element=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	 // element.sendKeys("Step by Step by Automation");
	   return element;  
  }
  
  public static WebElement ClickSearch_Button(WebDriver driver)
  {
	  
	  WebElement element=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	  //element.sendKeys(Keys.ENTER);
	  
	  return element;
  }
}
