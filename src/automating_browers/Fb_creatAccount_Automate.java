package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_creatAccount_Automate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement fb = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		fb.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("shravan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("saisravan1995@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sai123466");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//label[@for='u_o_2_ib']"));
		WebElement ele = driver.findElement(By.xpath("//input[@value='2']"));
		ele.click();
		System.out.println(ele.isSelected());
		Point loc = ele.getLocation();
		Dimension di = ele.getSize();
		System.out.println("width: "+di.width+"    height: "+di.height);
		System.out.println("x: "+loc.getX()+"    y:"+loc.getY());
		// driver.findElement(By.xpath("//label[text()='Custom']"));
		Thread.sleep(3000);
		driver.close();
	}
}
