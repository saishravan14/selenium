package automating_browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nakuri {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	WebDriver driver = new ChromeDriver(); //upcasting is done to avoid unnecessary methods
	driver.get("https://www.naukri.com/");
	driver.close();// to close current tab or window in which web driver instance has been found
	driver.quit();// it will close all the tabs 
}
}
