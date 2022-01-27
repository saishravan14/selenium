package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_Sceno13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		WebElement ring = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.moveToElement(ring).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[3]/span[contains(.,'Kadas')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='pid_5675']/parent::div")).click();
		for(String winHandle : driver.getWindowHandles()){ // Switch to new window opened
		    driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		String s =ele.getText();
		if(s==null) {
			System.out.println("test case failed");
		}
		else {
		System.out.println("Error message: "+s);
		}
		
}
}
