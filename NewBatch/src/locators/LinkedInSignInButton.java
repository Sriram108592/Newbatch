package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInSignInButton {
	public static void main(String[] args) throws Throwable {
		//Step 01:Open the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Step 02: Pass the Main URL of LinkedIn
		driver.get("https://www.linkedin.com/");
		//Step 03: Get the Title of the login page
		String LinkedInTitle = driver.getTitle();
		System.out.println("Actual LinkedIn Title is: "+LinkedInTitle);
		Thread.sleep(5000);
		//Step 04: Enter the Username-Your Profile Username
		WebElement usernameTextField = driver.findElement(By.id("session_key"));
		usernameTextField.sendKeys("kulalrashmi307@gmail.com");
		Thread.sleep(5000);
		//Step 05: Enter the Password-Your Profile Password
		WebElement passwordTextField = driver.findElement(By.id("session_password"));
		passwordTextField.sendKeys("Rashmi@1997");
		Thread.sleep(5000);
		//Step 06: Click On SignIn Button
		driver.findElement(By.xpath("//button[@class=\"sign-in-form__submit-button\"]")).click();
		Thread.sleep(5000);
		String actualLinkedInTitle = driver.getTitle();
		System.out.println("Actual LinkedIn Title is: "+actualLinkedInTitle);
		String expectedLinkedInTitle = "(21) Feed | LinkedIn";
		System.out.println("Expected LinkedIn Title is: "+expectedLinkedInTitle);
		if (expectedLinkedInTitle.equals(actualLinkedInTitle)) {
			System.out.println("Pass: LinkedIn Webpage is Correct");
		}
		else {
			System.out.println("Fail: LinkedIn Webpage is Incorrect");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
