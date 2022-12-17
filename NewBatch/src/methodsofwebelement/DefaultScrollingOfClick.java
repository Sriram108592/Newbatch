package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultScrollingOfClick {
		public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the driver specific class
		WebDriver driver =new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		//Click on Messenger
		//Element not in the viewport AREA
		//Click has the default scrolling ability
		driver.findElement(By.linkText("Messenger")).click();
		Thread.sleep(5000);
		//Terminate the session
		driver.quit();
}
}
