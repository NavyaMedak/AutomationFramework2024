package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver=null;
	
	By textbox_search=By.xpath("//textarea[@class='gLFyf']");
	By button_search=By.xpath("//textarea[@class='gLFyf']");	
	
	
	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setTextinGoogleSearch(String text)
	{
		
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clickButton()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
