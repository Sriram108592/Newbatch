package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MothersDayDoodleClick {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the driver specific class
		WebDriver driver=new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.google.com/doodles");
		//Click on mothers day
		//NoSuchElementException
		//Target element is not their in the view port area
		driver.findElement(By.linkText("Mother's Day 2022 (May 01)")).click();
		Thread.sleep(5000);
		//Terminate the session
		driver.quit();
	}

}
