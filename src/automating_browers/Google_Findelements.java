package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_Findelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./software/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("saisravan1995@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("narutohinata143*");
		WebElement login= driver.findElement(By.name("login"));
		login.click();
		
	}

}
