package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutScriptActitime {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Step 01: Launch The Browser
	WebDriver driver = new ChromeDriver();
	//Step 02: Maximize the Browser Window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Step 03: Pass the main URL of the application
	driver.get("https://demo.actitime.com/");
	//Step 04: Enter the User name
	WebElement usernameTextField = driver.findElement(By.id("username"));
	usernameTextField.clear();
	usernameTextField.sendKeys("admin");
	//Step 05: Enter the password
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	passwordTextField.clear();
	passwordTextField.sendKeys("manager");
	//Step 06: Click on Login Button
	driver.findElement(By.linkText("Login")).click();
	//verification of the Home Page
	
	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	WebElement logoutButton = driver.findElement(By.linkText("Logout"));
	if (driver.getTitle().equals("actiTIME - Enter Time-Track")) {
		if (driver.getCurrentUrl().equals("https://demo.actitime.com/user/submit_tt.do")) {
			if (logoutButton.isDisplayed()) {
				System.out.println("Pass: The Home Page Is displayed upon verification of title, URL and Logout Option");
			}
		}
	}else {
		System.out.println("Fail: The Home Page Is not displayed upon verification of title, URL and Logout Option");
	}
	//Step 07: Click on Logout Option
	logoutButton.click();
	if (driver.getTitle().equals("actiTIME - Login")) {
		if (driver.getCurrentUrl().equals("https://demo.actitime.com/login.do")) {
		System.out.println("Pass: The Login page is displayed after logging Out and verified upon Title and URL");	
		}
	}else {
		System.out.println("Fail: The Login page is not displayed after logging Out and verified upon Title and URL");
	}
	//Terminate the session
	driver.quit();	
	}
}