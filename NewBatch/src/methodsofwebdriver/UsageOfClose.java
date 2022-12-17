package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClose {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//According to the OOAD Principle
		WebDriver driver = new ChromeDriver();
		
		//driver.close();
		driver.quit();
	}

}
