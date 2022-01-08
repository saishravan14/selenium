package automating_browers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_GetTitle {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title1=driver.getTitle();
	System.out.println(title1);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement username=driver.findElement(By.name("email"));
	username.sendKeys("saisravan1995@gmail.com");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("narutohinata143*");
	WebElement login = driver.findElement(By.name("login"));
	System.out.println(login.isDisplayed());
	System.out.println(login.isEnabled());
	System.out.println(login.getTagName());
	System.out.println(login.isSelected());
	login.click();
	driver.getCurrentUrl();
	String title2 = driver.getTitle();
	System.out.println(title2);
	if (title1!=title2) {
		System.out.println(" login successful");
	}
	else {
		System.out.println("login unsuccessful");
	}
	driver.quit();
	
}
}
