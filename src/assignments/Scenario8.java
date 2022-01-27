package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings", Keys.ENTER);
		Thread.sleep(2000);
		WebElement metal=driver.findElement(By.xpath("//span[contains(.,'Metal')]/parent::span"));
		Actions a = new Actions(driver);
		a.moveToElement(metal).perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[text()='(79)']"));
		String count = e.getText();
		System.out.println("the count of platinum rings is: "+count);
        e.click();
        driver.close();
		/*List<WebElement> rings = driver.findElements(By.xpath("//ul[@class='product-grid search-box-result']/li"));
		int count = 0;
		for (WebElement ring : rings) {
			count++;
		}
		System.out.println(count);*/
}
}
