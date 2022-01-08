package automating_browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonToGoolge_navigation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	WebDriver driver = new ChromeDriver(); //upcasting is done to avoid unnecessary methods
	driver.get("https://www.google.in/");
	driver.manage().window().fullscreen();
	driver.get("https://www.amazon.in/");
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
}
}
