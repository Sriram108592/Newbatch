package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloLoginAndLogout {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://trello.com/en");
	driver.findElement(By.linkText("Log in")).click();
	WebElement loginForm = driver.findElement(By.id("login-form"));
	WebElement usernameTextField = loginForm.findElement(By.id("user"));
	usernameTextField.clear();
	usernameTextField.sendKeys("peoplefortiptur@gmail.com");
	loginForm.findElement(By.id("login")).submit();
	WebElement passwordLoginForm = driver.findElement(By.id("form-login"));
	WebElement passwordTextField = passwordLoginForm.findElement(By.id("password"));
	passwordTextField.clear();
	passwordTextField.sendKeys("9886947924");
	passwordLoginForm.findElement(By.id("login-submit")).submit();
	driver.findElement(By.xpath("//h3[.='YOUR WORKSPACES']/..//a[contains(@href,'james')]")).click();
	WebElement pftMenuBar = driver.findElement(By.cssSelector("button[title='pft pft (pftpft1)']"));
	pftMenuBar.click();
	WebElement logoutoption = driver.findElement(By.xpath("//button[.='Log out']"));
	if (driver.findElement(By.xpath("//h1[.='James']")).isDisplayed()) {
		wait.until(ExpectedConditions.titleContains("James"));
		wait.until(ExpectedConditions.urlContains("james"));
				if (logoutoption.isDisplayed()) {
					System.out.println("Pass: The James Board has got Displayed");
				}
	}
	logoutoption.click();
	driver.findElement(By.id("logout-submit")).submit();
	
	if (driver.findElement(By.linkText("Log in")).isDisplayed()) {
		wait.until(ExpectedConditions.urlContains("home"));
		wait.until(ExpectedConditions.titleIs("Trello"));
				System.out.println("Pass: Logged out Sucessfully and home page Is displayed upon the verfication");
			}else {
				System.out.println("Fail: Logging out is not sucessfull or home page is not displayed");
			}
		driver.quit();
	
}
}