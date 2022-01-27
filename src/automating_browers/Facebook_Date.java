package automating_browers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Date {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Thread.sleep(2000);
		Select sday = new Select(day);
		sday.selectByVisibleText("13");
		//sday.selectByIndex(12);
		//sday.selectByValue("13");
		List<WebElement> opts = sday.getOptions();
		for (WebElement op : opts) {
			System.out.println(op.getText());
		}
		     
}
}
