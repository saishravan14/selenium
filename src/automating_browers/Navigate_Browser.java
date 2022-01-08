package automating_browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	WebDriver driver = new ChromeDriver(); //upcasting is done to avoid unnecessary methods
	driver.get("https://www.google.in/");
	driver.navigate().forward();
	driver.navigate().to("https://www.fb.com/");
	driver.close();
}
}
