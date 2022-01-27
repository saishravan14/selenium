package demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLaunch4 {
static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
   driver = new FirefoxDriver();
   driver.manage().window().maximize();// method chaining
   driver.get("http://google.com/");
   driver.get("https://fb.com/");
   driver.quit();
}
}
