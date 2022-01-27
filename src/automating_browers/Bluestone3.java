package automating_browers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='The Thom Ring']")).click();
		for(String winHandle : driver.getWindowHandles()){ // Switch to new window opened
		    driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		driver.findElement(By.xpath("//li[1][@onclick='selectRingSize(this)']/span[2]")).click();
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		driver.findElement(By.xpath("//a[@title='Place Order']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saisravancool143@gamil.com");
		driver.findElement(By.xpath("//input[@id='contactNumber']")).sendKeys("9396265550");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		WebElement ele = driver.findElement(By.xpath("//button[@title='Proceed to Payment']"));
		if (ele.isEnabled()) {
			ele.click();
			System.out.println(driver.getTitle());
		}
}
}
