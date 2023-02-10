import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//SECTION 11
public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		//calculate link counts in the page
		int count=driver.findElements(By.xpath("//a")).size();
		System.out.println(count);
		
		//limit webdriver scope to a section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		int countFooter = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(countFooter);
		
		WebElement columnDriver=footerDriver.findElement(By.xpath("(//ul)[1]"));
		
		int countCol= columnDriver.findElements(By.tagName("a")).size();
		System.out.println(countCol);
		
		for(int i=1; i < countCol ; i++) {
			String ctrlenter = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(ctrlenter);
		}
		Thread.sleep(5000);
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
