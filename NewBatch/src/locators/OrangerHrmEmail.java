package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangerHrmEmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(5000);
		//Find the email button and pass the email id
		WebElement emailTextField = driver.findElement(By.id("myText"));
		emailTextField.sendKeys("rashmi@gmail.com");
		Thread.sleep(5000);
		//Find the Get Free trail button and click on it
		WebElement getFreeTrailTextfield = driver.findElement(By.id("linkadd"));
		getFreeTrailTextfield.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
