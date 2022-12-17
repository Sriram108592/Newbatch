package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	Dimension emailSize = emailTextField.getSize();
	int emailHeight = emailSize.getHeight();
	System.out.println("emailHeight = " + emailHeight + " Pixels");
	int emailWidth = emailSize.getWidth();
	System.out.println("emailWidth = " + emailWidth  + " Pixels");
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Dimension passwordSize = passwordTextField.getSize();
	int passwordHeight = passwordSize.getHeight();
	System.out.println("passwordHeight = " + passwordHeight + " Pixels");
	int passwordWidth = passwordSize.getWidth();
	System.out.println("passwordWidth = " + passwordWidth + " Pixels");
	if (emailHeight==passwordHeight && emailWidth==passwordWidth) {
		System.out.println("Pass: The Size of the username and password textfield is equal and verified upon it's height and width.");
	}else {
		System.out.println("Fail: The Size Of the username and password textfield is not equal and verified upon it's height and width");
	}
	driver.manage().window().minimize();
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
}
}