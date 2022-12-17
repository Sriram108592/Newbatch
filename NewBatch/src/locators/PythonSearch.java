package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PythonSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.python.org/");
		Thread.sleep(5000);
		//Find the Search bar and Search Selenium
		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.sendKeys("Selenium");
		Thread.sleep(5000);
		driver.quit();
	}

}
