package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
// Scenario To understand what if we don't consider the frame and the element within the frame
public class Frame_01 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("http://www.leafground.com/pages/frame.html");
	//NoSuchElementException
	// The target element which we wish to click is their with In the frame of the Webpage. 
	driver.findElement(By.id("Click")).click();
	driver.quit();
}
}