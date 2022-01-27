package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domsnapshot.model.Rectangle;

public class Acttime2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
		ele.click();
		System.out.println(ele.isSelected());
		org.openqa.selenium.Rectangle re = ele.getRect();
		System.out.println("x axies: "+re.getX());
		System.out.println("y axies: "+re.getY());
		System.out.println("height: "+re.getHeight());
		System.out.println("width: "+re.getWidth());
}
}
