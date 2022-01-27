package automating_browers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Findelements1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); //upcasting is done to avoid unnecessary methods
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.name("q"));
		boolean dis = searchBox.isDisplayed();
		System.out.println(dis);
		searchBox.sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));//finding multiple elements "a" is anchor tag
		System.out.println(links.size());
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		search.clear();
		Thread.sleep(2000);
		System.out.println(search.getAttribute("href"));
		System.out.println(search.getAttribute("id")); // no attribute thats why null(blank)
		System.out.println(search.getAttribute("name"));
		System.out.println(search.getCssValue("border"));
		search.sendKeys("testng",Keys.ENTER);
		driver.close();
}
}
