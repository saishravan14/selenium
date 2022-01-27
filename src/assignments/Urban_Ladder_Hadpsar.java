package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urban_Ladder_Hadpsar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait
		driver.findElement(By.xpath("//ul[@class='featuredLinksBar__linkContainer']/li[1]")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_3oCTi']/descendant::h3"));
		for (WebElement loc : ele) {
			System.out.println(loc.getText());
		}
		driver.findElement(By.xpath("//div[@class='_3oCTi']/a[6] ")).click();
		WebElement ah = driver.findElement(By.xpath("//h3[@class='no-padding text-left address-name']"));
		System.err.println(ah.getText());
		List<WebElement> ad = driver.findElements(By.xpath("//address[@class='detail']/div"));
		for (WebElement ads : ad) {
			System.out.println(ads.getText());
		}
		driver.quit();
	}
}
