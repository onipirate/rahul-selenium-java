import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.manage().window().maximize();
		
		
		//Action Class is needed for selenium to perform some actions by the users, mouse and keyboard interactions and other gestures
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		//plain moving
		a.moveToElement(move).build().perform();
		//holding a key down
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").build().perform();
		driver.manage().window().maximize();
		//contect click is right click
		a.moveToElement(move).contextClick().build().perform();
		
		//drag and drop

	}

}
