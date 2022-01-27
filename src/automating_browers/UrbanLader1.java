package automating_browers;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLader1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.urbanladder.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		 List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		 Actions a = new Actions(driver);
		 for (WebElement menu : menus) {
			String mName = menu.getText();
			System.err.println(mName);
			a.moveToElement(menu).perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(By.xpath("//span[contains(.,'"+ mName +"')]/parent::li/descendant::a[@class='inverted']"));
			for (WebElement submenu :submenus) {
				System.out.println(submenu.getText());
			}
			Thread.sleep(2000);
		}
}
}
