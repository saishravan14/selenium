package automating_browers;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multi {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		System.setProperty("webdriver.edge.driver","./software/msedgedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
	    driver = new EdgeDriver();
	    driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		String parentWH = driver.getWindowHandle();
		System.out.println("parent window handel"+parentWH);
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.getClass());
		wins.remove(parentWH);
		for (String handle : wins) {
			System.out.println(handle);
			driver.switchTo().window(handle);
			driver.close();
			//Thread.sleep(20000);
		}
}
}
