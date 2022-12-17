package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInJobsClick {
	public static void main(String[] args) throws Throwable{
		//Set the driver executable file
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Post Condition
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Pass the Main URL of the application
		driver.get("https://www.linkedin.com/");
		//Click On Jobs
		//driver.findElement(By.xpath("//a[contains(@href,'https://www.linkedin.com/jobs/')]")).click();
		//Click On Join Now
		driver.findElement(By.linkText("Join now")).click();
		Thread.sleep(5000);
		//Post Condition
		//Terminate the session
		driver.quit();
	}

}
