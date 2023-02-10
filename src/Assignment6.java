import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		int Min = 0, Max = 2;
		int randomNo=getRandomValue(Min, Max);
		//System.out.println(randomNo);
		
		WebElement cb = driver.findElements(By.xpath("//div[@id='checkbox-example']//label")).get(randomNo);
		
		cb.findElement(By.tagName("input")).click();
		
		String cbLabel = cb.getText().trim();
		System.out.println(cbLabel);
		
		WebElement dropdownExample = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(dropdownExample);
		dropdown.selectByVisibleText(cbLabel);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(cbLabel);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		String alertTxt = driver.switchTo().alert().getText();
		
		if(alertTxt.contains(cbLabel)) {
			System.out.println(cbLabel+" is in the alert text " + alertTxt);
		} else {
			System.out.println("Incorrect logic");
		}
		
		driver.switchTo().alert().accept();
		//Thread.sleep(5000);
		

	}
	
	 public static int getRandomValue(int Min, int Max)
	    {
	        return ThreadLocalRandom
	            .current()
	            .nextInt(Min, Max + 1);
	    }
	  

}
