package gettext.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SandboxFormSubmitButton {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//step 02: Pass the Main URL and the Application
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		//check for the Enability of the submit button
		//Submit the  button should be in the disabled form
		//Boolean - False
		//submit button will be checked for disability
		boolean submitButton = driver.findElement(By.name("submit")).isEnabled();
		if (submitButton) {
			System.out.println("True");
			System.out.println("Fail: the submit button is enabled");
		}
		else {
			System.out.println("False");
			System.out.println("Pass: the submit button is disabled");
		}		
		driver.quit();
	}
}
