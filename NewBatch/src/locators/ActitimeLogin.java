package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	public static void main(String[] args) throws InterruptedException {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class 
		WebDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Pass the main Url of the application
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		//Find the username in the Webpage
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("admin");
		Thread.sleep(5000);
		//Find the Password text field
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys("manager");
		Thread.sleep(5000);
		//Find the login button and click
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
