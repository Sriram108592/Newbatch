package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById_01 {
public static void main(String[] args) throws Throwable {
	//Set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	//maximize the browser window
	driver.manage().window().maximize();
	//pass the main URL Of the application
	driver.get("https://demo.actitime.com/");
	//Find the USer name text field and enter The username
	WebElement usernameTextField = driver.findElement(By.id("username"));
	Thread.sleep(5000);
	usernameTextField.sendKeys("admin");
	Thread.sleep(5000);
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	Thread.sleep(5000);
	passwordTextField.sendKeys("manager");
	Thread.sleep(5000);
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	Thread.sleep(5000);
	loginButton.click();
	Thread.sleep(5000);
	driver.quit();
}
}