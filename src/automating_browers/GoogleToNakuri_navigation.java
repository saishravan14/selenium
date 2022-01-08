package automating_browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleToNakuri_navigation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.in/");
	driver.get("https://www.naukri.com/");
	driver.navigate().back();
	
    System.out.println(driver.getTitle());  // to get the title of the page
	Thread.sleep(3000);
	
	driver.navigate().to("https://www.naukri.com");
    System.out.println(driver.getCurrentUrl()); //to get the url of page
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.quit();
}
}
