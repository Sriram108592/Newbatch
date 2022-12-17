package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NationalDigitalLibrarySearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ndl.iitkgp.ac.in/");
		Thread.sleep(5000);
		//Find the search box and search indian literature
		WebElement searchTextField = driver.findElement(By.id("search-key"));
		searchTextField.sendKeys("Indian Literature");
		Thread.sleep(5000);
		driver.quit();
	}

}
