package handlingforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginForm {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//Handling the forms - to optimize the search criteria
	//parent element - forms, divisions, tables.
	WebElement facebookLoginForm = driver.findElement(By.cssSelector("form[data-testid='royal_login_form']"));
	facebookLoginForm.findElement(By.id("email")).sendKeys("chandan.r@testyantra.com");
	facebookLoginForm.findElement(By.id("pass")).sendKeys("1234567890");
	WebElement loginButton = facebookLoginForm.findElement(By.name("login"));
	if (loginButton.getAttribute("type").equals("submit")) {
		if (loginButton.getTagName().equals("button")) {
			loginButton.submit();
		}
	}
	//driver.quit();
	
}
}