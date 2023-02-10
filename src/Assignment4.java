import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Multiple Windows")).click();
		//Click Here
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		
		String newWindow = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(newWindow);
		
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		String parentWindow = driver.findElement(By.cssSelector("div h3")).getText();
		System.out.println(parentWindow);
		
		driver.quit();
		
		Thread.sleep(5000);
		

	}

}
