package scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[@id='deny']")).click();
		Thread.sleep(20000);
		WebElement el = driver.findElement(By.xpath("//a[contains(.,'Coins ')]/parent::li/descendant::li[5]"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		//a.moveToElement(allJewl).build().perform();
		a.moveToElement(el).perform();
		System.out.println(el.getText());
	}
}
