package automating_browers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		WebDriverWait ww = new WebDriverWait(driver,Duration.ofSeconds(10));
		ww.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//input[@class='textField' and @id='username']"),"admin"));
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logoutLink']")));
		driver.findElement(By.id("logoutLink")).click();
}
}
