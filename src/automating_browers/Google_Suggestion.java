package automating_browers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Suggestion {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		for (WebElement sugges : sugg) {
			System.out.println(sugges.getText());
		}
		sugg.get(3).click();
		
}
}
