package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageGetMethod {
	public static void main(String[] args) {
		//Step 01 Launch the empty Chrome Browser
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//step 02: Pass the Main URL and the Application
		driver.get("https://www.facebook.com/");
	}

}
