package isdisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDispalyedOnMaleradioButton {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.facebook.com/signup");
	if (driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']")).isDisplayed()) {
		System.out.println("isDisplayed() will return true");
		System.out.println("Pass: The Male radio button is dispalyed to the end user");
	}else {
		System.out.println("isDisplayed() will return False");
		System.out.println("Fail: The Male RadioButton is not displayed to the end user");
	}
	driver.quit();
}
}