

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {

	    // Invoking the Browser Driver
		System.setProperty("webdriver.chrome.driver","C:\\Ruby27\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shipserv.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		System.out.println("Finish");
	}

}

