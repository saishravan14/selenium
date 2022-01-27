package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='menuTable']/div[4]")).click();
	driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
	WebElement ele=driver.findElement(By.xpath("//td[@class='aboutCopyright']/span"));
	System.out.println(ele.getText());
	driver.quit();
	
}
}
