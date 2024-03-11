import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class DesiredCapabilities {

	public static void main(String[] args) {
		String ProjectPath=System.getProperty("user.dir");
		
		//DesiredCapabilities caps=new DesiredCapabilities();
		//InternetExplorerOptions options = new InternetExplorerOptions();
		//options.setCapability("ignoreProtectedModeSettings",true);
		
		System.setProperty("weddriver.io.driver",ProjectPath+"Drivers/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("welcome");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("step by step by automation");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.RETURN);
		 
		
		

	}

}
