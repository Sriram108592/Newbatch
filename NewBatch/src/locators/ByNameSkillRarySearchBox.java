package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNameSkillRarySearchBox {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/");
	WebElement searchBox = driver.findElement(By.name("q"));
	Thread.sleep(5000);
	searchBox.sendKeys("Selenium");
	Thread.sleep(5000);
	driver.quit();
}
}