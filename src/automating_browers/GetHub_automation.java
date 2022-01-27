package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHub_automation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://github.com/login");
	System.out.println(driver.getTitle());
	driver.manage().window().fullscreen();
	WebElement username = driver.findElement(By.id("login_field"));
	username.sendKeys("saishravan14");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("pnrao8968*",Keys.ENTER);
	
}
}
