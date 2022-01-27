package automating_browers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sai/Desktop/html/selenium.html");
		Thread.sleep(2000);
	 WebElement ele =driver.findElement(By.id("b"));
	 Select s = new Select(ele);
	 if (s.isMultiple()) {
		/*s.selectByIndex(0);*/
		List<WebElement> opts = s.getOptions();
		for (WebElement e : opts) {
			s.selectByVisibleText(e.getText());
		}
	}
	 WebElement first = s.getFirstSelectedOption();
	 System.err.println(first.getText());
	 
	 List<WebElement> sopts = s.getAllSelectedOptions();
	 for (WebElement opt : sopts) {
		System.out.println(opt.getText());
	}
	 /*s.deselectByIndex(2);
	 s.deselectByValue("321");
	 s.deselectByVisibleText("322");*/
	 s.deselectAll();
		
}
}
