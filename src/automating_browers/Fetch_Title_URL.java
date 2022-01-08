package automating_browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Title_URL {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); //upcasting is done to avoid unnecessary methods
		driver.get("https://www.google.in/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
	}
}
