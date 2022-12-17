package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPositions {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//According to the OOAD Principle
		WebDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Pass the main Url of the application
		driver.get("http://leafground.com/pages/Window.html");
		//Identify the button and click on it
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		//Get all the window ID's in the session
		Set<String> allWindowIds = driver.getWindowHandles();
		//Iteratively take one Window ID a time
		for (String wid : allWindowIds) {
			//Capturing the window title iteratively
			String actualWindowTitle = driver.switchTo().window(wid).getTitle();
			//Printing the window title which are captured
			System.out.println("actualWindowTitle ="+actualWindowTitle);
			//Transferring the driver control to a specific window upon the validation of it's title
			if (actualWindowTitle.equals("TestLeaf - Interact with Buttons")) {
				//Create the point type object to set the position
				Point targetPosition = new Point(200, 400);
				//Set the user defined position
				driver.manage().window().setPosition(targetPosition);
				//Create the Dimension type object to set the size of the target 
				Dimension targetSize = new Dimension(300, 500);
				//Set the size of the target window
				driver.manage().window().setSize(targetSize);
				
			}
		}
		//Terminate the Session
		driver.quit();
		
	}

}
