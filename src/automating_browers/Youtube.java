package automating_browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	WebDriver driver = new ChromeDriver(); //upcasting is done to avoid unnecessary methods
	driver.get("https://www.youtube.in/");
	driver.manage().window().maximize();
	driver.manage().window().fullscreen();
	driver.close();
}
}
