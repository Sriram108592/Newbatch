package gettext.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledWrongUsage {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//step 02: Pass the Main URL and the Application
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		driver.findElement(By.xpath("//td[text()=' Oracle Solaris (x86 systems, 64-bit)']/..//td//a[text()=' ZIP']")).click();
		Thread.sleep(5000);
		boolean buttonStatus = driver.findElement(By.xpath("//a[text()='Download SOLARIS.X64_195000_db_home.zip']")).isEnabled();
		if(buttonStatus)
		{
			System.out.println("Pass : The button is Disabled");
		}
		else 
		{
			System.out.println("Fail : The button is Enabled");
		}
		driver.quit();
	}
}
