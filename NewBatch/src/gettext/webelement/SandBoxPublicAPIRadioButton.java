package gettext.webelement;

import org.openqa.selenium.chrome.ChromeDriver;

public class SandBoxPublicAPIRadioButton {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//step 02: Pass the Main URL and the Application
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		
		
	}
}
