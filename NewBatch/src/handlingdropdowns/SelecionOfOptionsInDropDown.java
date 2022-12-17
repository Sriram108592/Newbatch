package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelecionOfOptionsInDropDown {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/signup");
	//Identify the dropDown as webelement associated with <Select>
	WebElement monthDropDown = driver.findElement(By.id("month"));
	//Select class parameterized constructor 
	Select select = new Select(monthDropDown);
	//Option Selection in the drop Down by visible text 
		select.selectByVisibleText("Sep");//sep
		Thread.sleep(2000);
		select.selectByValue("12"); //Dec
		Thread.sleep(2000);
		select.selectByIndex(7);//Aug
		Thread.sleep(5000);
		driver.quit();
}
}