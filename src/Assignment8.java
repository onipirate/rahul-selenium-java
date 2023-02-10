import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		String country = "India";
		String input = country.substring(0,3).toLowerCase();
		System.out.println(input);
		
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(input);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-menu-item")));
		
		List<WebElement> countryList = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		
		for(WebElement cntry: countryList) {
			if(cntry.getText().equalsIgnoreCase(country)) {
				cntry.click();
				break;
			}
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String cnt_input = (String) js.executeScript("return document.getElementById(\"autocomplete\").value");
		if(country.equalsIgnoreCase(cnt_input)) {
			System.out.println("We have selected the country correctly");
		}
		
		
		Thread.sleep(5000);
	
		
	}

}
