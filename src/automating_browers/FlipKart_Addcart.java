package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_Addcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//String windowHandleBefore =driver.getWindowHandle(); // to store the parent window
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 12 (Black, 64 GB)']")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		for(String winHandle : driver.getWindowHandles()){ // Switch to new window opened
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'ADD TO CART')]")).click();
		Thread.sleep(2000);
}
}
