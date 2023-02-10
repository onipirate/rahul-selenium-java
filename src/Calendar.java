import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
//SECTION 11 Real Time Exercise and End to End Programming
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//Actions mv = new Actions(driver);
		//WebElement search = driver.findElement(By.cssSelector(".elementor-button-text"));
		//mv.moveToElement(search).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-field-travel_comp_date")));
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
		
		//Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".flatpickr-next-month")));
		
		while(!driver.findElement(By.cssSelector(".flatpickr-current-month span[class='cur-month']")).getText().contains("September")) {
			//System.out.println(driver.findElement(By.cssSelector(".flatpickr-current-month span[class='cur-month']")).getText());
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
			Thread.sleep(500);
		}
		
		List<WebElement> d = driver.findElements(By.cssSelector(".flatpickr-day "));
		for(WebElement dy: d) {
			String thisday = dy.getText();
			if(thisday.equalsIgnoreCase("6")) {
				dy.click();
				break;
			}
		}
		
		Thread.sleep(5000);
	}

}
