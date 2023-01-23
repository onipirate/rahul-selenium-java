import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws TimeoutException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		// driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='ui-menu-item'] a")));
		System.out.println(driver.findElement(By.cssSelector("li[class='ui-menu-item'] a")).isDisplayed());
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));


		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("India")) {
                System.out.println(option.isDisplayed());
				option.click();

				break;

			}
		}
	}

}
