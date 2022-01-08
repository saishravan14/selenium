package automating_browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./software/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().fullscreen();
	driver.manage().window().minimize();
	driver.close();
}
}
