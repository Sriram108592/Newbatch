package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement userNameTextField = driver.findElement(By.id("username"));
		Thread.sleep(5000);
		//Pre-Condition for sendKeys()
		userNameTextField.clear();
		Thread.sleep(5000);
		//IllegalArgumentException - When we try to pass null as the charSequence
		//Java Exception- Unchecked Exception
		userNameTextField.sendKeys("null");
		Thread.sleep(5000);
		driver.quit();
	}

}
