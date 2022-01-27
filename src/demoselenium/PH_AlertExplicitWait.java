package demoselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PH_AlertExplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software2/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent()); //better code
	Alert a = driver.switchTo().alert();
	a.accept();
	
}
}
