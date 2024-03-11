import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
  public static void main(String[] args) {  //ctrl+space bar
	  
	  
	  String projectPath=System.getProperty("user.dir"); //Get the Project path
	  System.out.println(projectPath);
	  //System.setProperty("webdriver.chrome.driver","projectPath/Drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  //driver.close(); //clsoing the current window from browser if it is last window
	  driver.quit(); //closing every associated webdriver window 
	
}
}
