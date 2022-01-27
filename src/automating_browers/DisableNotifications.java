package automating_browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotifications {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software2/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.justdial.com/");
}
}
