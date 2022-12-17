package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://demo.actitime.com/");
		//Find the login button and click
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		//Terminate the session
		driver.quit();
		
	}

}
