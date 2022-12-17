package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmitMethod {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	driver.findElement(By.cssSelector("button[class='button buttonBlue']")).submit();
	//Thread.sleep(5000);
	driver.quit();
}
}