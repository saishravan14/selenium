package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Google_LastNextValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java", Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']"));
		while (ele.isEnabled()) {
			driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
			Thread.sleep(2000);
		}

	}
}
