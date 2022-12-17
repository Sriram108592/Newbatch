package isdisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledWrongUsage {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//td[text()=' Oracle Solaris (x86 systems, 64-bit)']/..//td//a[contains(@class,'license-link icn-download-locked')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Please check the agreement acceptance box']/..//input[@name='licenseAccept']")).click();
	Thread.sleep(5000);
	boolean downloadButton = driver.findElement(By.xpath("//a[text()='Download SOLARIS.X64_195000_db_home.zip']")).isEnabled();
	Thread.sleep(5000);
	if (downloadButton){
		System.out.println("Expecting Boolean True");
		System.out.println("Actual Returning Object of IsEnabled() = " + downloadButton);
		System.out.println("Fail: The Download button Is enabled");
	}else {
		System.out.println("Expecting Boolean False");
		System.out.println("Actual Returning Object of IsEnabled() = " + downloadButton);
		System.out.println("Pass: The Download button is disabled");
	}
	Thread.sleep(5000);
}
}