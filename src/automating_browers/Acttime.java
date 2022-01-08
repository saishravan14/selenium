package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acttime {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); //upcasting is done to avoid unnecessary methods
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager",Keys.ENTER);                      // keys is a class  it has several keys like enter
		//WebElement login= driver.findElement(By.name("Login "));
		//login.click();
}
}
