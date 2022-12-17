package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToStringUrl {
	public static void main(String[] args) throws InterruptedException {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specified class
		//According to the OOAD Principle
		WebDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Pass the main Url of the application
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(5000);
		//Pass the Sub Url of the defence Page
		driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
		Thread.sleep(5000);
		//Pass the SubUrl of the Civil Page
		driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
		Thread.sleep(5000);
		//Pass the Suburl of the Space page
		driver.navigate().to("https://www.dassault-aviation.com/en/space/");
		Thread.sleep(5000);
		//Pass the Suburl of the Passion Page
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		Thread.sleep(5000);
		//Post Condition
		//Terminate the session
		driver.quit();
		
	}
}
