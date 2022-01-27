package automating_browers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sai/Downloads/WebDriverWait%20Examples/WebDriverWait%20Examples/VisibilityOfTextbox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait ww = new WebDriverWait(driver,Duration.ofSeconds(10));
		ww.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				WebElement ele = d.findElement(By.xpath("//input[@id='iamtextbox']"));
						return ele.isDisplayed();
			}
		});
		driver.findElement(By.xpath("//input[@id='iamtextbox']")).sendKeys("shravan");
}
}
