package isdisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Note 01: It will return false if the web element is present in the webpage, 
//but not displayed in the web page.
public class IsDispalayedOnSandboxForm {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
	if (driver.findElement(By.id("confbtn")).isDisplayed()) {
		System.out.println("isDisplayed() will true");
		System.out.println("Fail: Please accept Terms of Service check box is not their in the DOM or it not displayed or both");
	}else {
		System.out.println("isDisplayed() will return False");
		System.out.println("Pass: Please accept Terms of Service check box is their in the DOM, but it is not displayed to the enduser");
	}
	driver.quit();
}
}