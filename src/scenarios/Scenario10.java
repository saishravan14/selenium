package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings",Keys.ENTER);
		Thread.sleep(2000);
		WebElement gender=driver.findElement(By.xpath("//span[contains(.,'Gender')]/parent::span"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(gender).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-displayname='women']")).click();
		Thread.sleep(2000);
		WebElement rings = driver.findElement(By.xpath("//span[contains(.,'2141 Designs')]"));
		String count = rings.getText();
		System.out.println("the count of rings designs for women are: "+count);
		Thread.sleep(1000);
		driver.quit();
}
}
