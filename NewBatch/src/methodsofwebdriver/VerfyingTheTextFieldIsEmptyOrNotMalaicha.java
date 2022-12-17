package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfyingTheTextFieldIsEmptyOrNotMalaicha {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	String usernameTextFieldValue = driver.findElement(By.name("username")).getAttribute("value");
	System.out.println("usernameTextFieldValue = " + usernameTextFieldValue);
	if (usernameTextFieldValue.isEmpty()) {
		System.out.println("True");
		System.out.println("Pass: The Username Textfield is Empty");
	}else {
		System.out.println("False");
		System.out.println("Fail: The Uusername Textfield is not Empty");
	}
	driver.quit();
	
}
}