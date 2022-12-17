package methodsofwebdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndPosition {
	public static void main(String[] args) throws InterruptedException {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Instantiate the browser specific class
		//According to the OOAD Principle
		WebDriver driver = new ChromeDriver();
		
		//Pre Condition
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Pass the main URL of the application
		driver.get("http://leafground.com/pages/Window.html");
		
		//Find the open multiple window button and perform click action on it
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		//Dimension sizeOfParentWindow = driver.manage().window().getSize();
		//System.out.println("Parent window Height =" + sizeOfParentWindow.getHeight());
		//System.out.println("Parent window Width =" + sizeOfParentWindow.getWidth());
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("No of windows = "+ windowIds.size());
		
		for (String wid : windowIds) {
			String windowTitle = driver.switchTo().window(wid).getTitle();
			System.out.println("windowTitle ="+windowTitle);
			
			if (windowTitle.equals("TestLeaf-Interact with HyperLinks")) {
				Dimension sizeOfHyperLinkChildwindow = driver.switchTo().window(wid).manage().window().getSize();
				int hyperlinkWindowHeight = sizeOfHyperLinkChildwindow.getHeight();
				int hyperlinkWindowWidth = sizeOfHyperLinkChildwindow.getWidth();
				System.out.println("hyperlinkWindowHeight ="+hyperlinkWindowHeight);
				System.out.println("hyperlinkWindowWidth ="+hyperlinkWindowWidth);
				Point hyperlinkWindowPosition = driver.manage().window().getPosition();
				int hyperlinkStartX = hyperlinkWindowPosition.getX();
				int hyperlinkStartY = hyperlinkWindowPosition.getY();
				System.out.println("hyperlinkStartX ="+hyperlinkStartX);
				System.out.println("hyperlinkStartY ="+hyperlinkStartY);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.close();	
			}
			//Terminate the session
			//driver.quit();
			
		}
	}

}
