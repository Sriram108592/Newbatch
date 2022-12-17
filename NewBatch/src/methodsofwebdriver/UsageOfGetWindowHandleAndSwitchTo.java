package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandleAndSwitchTo {
	public static void main(String[] args) {
		//Set the driver executable file
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser class
		//According to the OOAD Principle
		WebDriver driver = new ChromeDriver();
		//Pass the main URL of the application
		driver.get("http://leafground.com/pages/Window.html");
		//Click on the Button for Child Window..?
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		//Get the Parent Window ID by getWindowHandle()
		String parentWindowId = driver.getWindowHandle();
		//Get all the window Id's in the current Session
		Set<String> allWindowIds = driver.getWindowHandles();
		//driver.close();
		//Print all the captured window Id's
		System.out.println("allWindowIds= "+allWindowIds);
		//Get window Id Iteratively one at a time from Set<String>
		for (String wid : allWindowIds) {
			//Print all the window Id iteratively
			System.out.println("wid ="+wid);
			//transfer the driver control from the current window to the wid under this iteration
			String windowTitle = driver.switchTo().window(wid).getTitle();
			
			System.out.println("windowTitle ="+windowTitle);
			if (windowTitle.equals("TestLeaf - Interact with Windows")) {
				driver.close();
			}
			
		}
		
	}

}
