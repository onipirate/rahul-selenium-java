import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		//driver.switchTo().alert().accept();

		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
		
		Select logindropdown= new Select(dropdown);
		logindropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("app-card")));
		driver.manage().window().maximize();
		
		
		List<WebElement> cart = driver.findElements(By.xpath("//app-card//h4"));
		
		for(int i=0; i < cart.size(); i++) {
			System.out.println(cart.get(i).getText());
			driver.findElements(By.xpath("//app-card//button[@class='btn btn-info']")).get(i).click();
		}
		
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(), 'Total')]")));
		
	}

}
