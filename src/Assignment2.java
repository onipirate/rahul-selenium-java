import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("John Erwin Chan");
		driver.findElement(By.name("email")).sendKeys("jcsserv@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Qwer123$");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select genderDropdown = new Select(staticDropdown);
		genderDropdown.selectByVisibleText("Female");
		Thread.sleep(2000);
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("19850906");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText().trim());
		Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText().trim().contains("The Form has been submitted successfully!."));
		

	}

}
