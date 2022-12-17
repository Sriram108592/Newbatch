package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressInformationBureauSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pib.gov.in/indexd.aspx");
		Thread.sleep(5000);
		//Find the Search bar and Search Petrol
		WebElement searchTextField = driver.findElement(By.id("txtgoogleseach"));
		searchTextField.sendKeys("Petrol");
		Thread.sleep(5000);
		driver.quit();
	}

}
