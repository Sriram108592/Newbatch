package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginScript {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement userNameTextField = driver.findElement(By.id("username"));
		Thread.sleep(5000);
		userNameTextField.clear();
		Thread.sleep(5000);
		userNameTextField.sendKeys("admin");
		Thread.sleep(5000);
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		Thread.sleep(5000);
		passwordTextField.clear();
		Thread.sleep(5000);
		passwordTextField.sendKeys("manager");
		Thread.sleep(5000);
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		Thread.sleep(5000);
		//loginButton.click();
		//Enumeration is a java template
		//Keys is an one of the enum of Selenium
		//Inside the enum we will store the constants in Upper case
		//Here Performing Key Board simulation
		//ElementNotInteractableException if we could not able to perform the keyboard on the target element
		loginButton.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

}
