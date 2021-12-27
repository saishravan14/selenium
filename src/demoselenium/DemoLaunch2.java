package demoselenium;
import org.openqa.selenium.edge.EdgeDriver;
public class DemoLaunch2 {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./software/msedgedriver.exe");
    EdgeDriver driver = new EdgeDriver();
}
}
