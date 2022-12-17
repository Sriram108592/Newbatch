package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
// Transfered the driver control to the frame which contains our target element
// frame(WebElement frameElement)
public class DriverControlTransferOfTheFrame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("http://www.leafground.com/pages/frame.html");
	// Transfer the driver to the frame - 
	// identify the frame as a web element 
	// Input parameter to frame(WeBElement frameElement) 
	// Return Type is WebDriver
	WebElement frameElement_01 = driver.findElement(By.xpath("//iframe[@src='default.html']"));
	driver.switchTo().frame(frameElement_01);
	// The target element is within the frame 
	driver.findElement(By.cssSelector("button[id='Click']")).click();
	Thread.sleep(5000);
	driver.quit();

}
}