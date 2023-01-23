package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	protected WebDriver driver;
	
	@BeforeMethod
	protected void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

}
