package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleToFb {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); //upcasting is done to avoid unnecessary methods
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("facebook");
		
		
	}
}
