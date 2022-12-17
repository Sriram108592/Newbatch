package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassSearchVaccinationCenterCowin {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cowin.gov.in/");
	Thread.sleep(5000);
	//InvalidSelectorException
	//Class attribute contains spaces 
	//This would not be the search criteria for className static method Of By Class.
	driver.findElement(By.className("searchBtn pin-search-btn district-search accessibility-plugin-ac")).click();
	Thread.sleep(5000);
	driver.quit();
}
}