package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Username is empty or not -ve testing -(Emptiness)
public class VerfyingTheTextFieldIsEmptyOrNotVtiger {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	String usernameTextFieldValue = driver.findElement(By.id("username")).getAttribute("value");
	System.out.println("usernameTextFieldValue = " + usernameTextFieldValue);
	if (usernameTextFieldValue.isEmpty()) {
		System.out.println("True");
		System.out.println("Fail: The Username Textfield is Empty");
	}else {
		System.out.println("False");
		System.out.println("True: The Username Textfield is not Empty");
	}
	driver.quit();
	
}
}