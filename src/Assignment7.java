import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		String stable = "//table[@name='courses']";
		
		int rowNo = driver.findElements(By.xpath(stable +"//tr")).size();
		System.out.println(rowNo);
		List<WebElement> column = driver.findElements(By.xpath(stable +"//tr[3]/td"));
		int colNo = column.size();
		System.out.println(colNo);
		
		for(WebElement data: column) {
			System.out.println(data.getText());
		}

	}

}
