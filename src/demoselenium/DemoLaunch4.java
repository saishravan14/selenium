package demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch4 {
static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();// method chaining
   driver.get("http://google.com/");
   driver.get("https://fb.com/");
   driver.quit();
}
}
