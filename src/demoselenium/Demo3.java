package demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3 {
static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	System.setProperty("webdriver.edge.driver","./software/msedgedriver.exe");
   driver = new ChromeDriver();
   driver.get("http://google.com/");
   driver.manage().window().minimize();
   driver.quit();
   driver = new EdgeDriver();
   driver.get("http://fb.com/");
   driver.manage().window().maximize();
   driver.quit();
}
}
