package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_placeOrder {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 12+");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 12 (128GB) - Blue']")).click();
	Thread.sleep(2000);
	for(String winHandle : driver.getWindowHandles()){ // Switch to new window opened
	    driver.switchTo().window(winHandle);
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	Thread.sleep(2000);			
}
}
