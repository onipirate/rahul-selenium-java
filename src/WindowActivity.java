

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); //will wait until all the components are loaded until that is fully ready
		driver.navigate().to("https://rahulshettyacademy.com"); //this will not wait..it will just help you to move to a different page
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();

	}

}
