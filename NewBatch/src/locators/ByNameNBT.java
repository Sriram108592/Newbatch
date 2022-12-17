package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNameNBT {
public static void main(String[] args) throws Throwable {
	//Set The driver excecutable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Instantiate the browser specific class
	WebDriver driver = new ChromeDriver();
	// Max the browser
	driver.manage().window().maximize();
	//Pass the main URL of the application
	driver.get("https://www.nbtindia.gov.in/");
	//find the search box and enter - India
	WebElement searchHere = driver.findElement(By.name("search"));
	Thread.sleep(5000);
	searchHere.sendKeys("India");
	Thread.sleep(5000);
	driver.quit();
}
}