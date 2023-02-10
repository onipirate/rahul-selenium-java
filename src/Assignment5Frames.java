import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		WebDriver topDriver = driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		topDriver.switchTo().frame(topDriver.findElement(By.xpath("//frame[@name='frame-middle']")));
		
		System.out.println(topDriver.findElement(By.id("content")).getText());
	}

}
