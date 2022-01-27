package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_forgettenpassword {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement fb = driver.findElement(By.partialLinkText("Forgotten"));
	System.out.println(fb.getAttribute("href"));
	System.out.println(fb.getTagName());
	fb.click();
}
}
