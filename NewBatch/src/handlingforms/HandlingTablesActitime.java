package handlingforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTablesActitime {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	//Handling the Table 
	//Limiting the findelement search criteria which is confined to the identified table
	WebElement footerTable = driver.findElement(By.xpath("//table[@class='footer']"));
	//findElement() Search criteria has optimised if the element is present inside the table
	//The total execution time will come down in automation environment.
	String tagText = footerTable.findElement(By.xpath("//tr/td[not(@id='copyRight')]/nobr")).getText();
	System.out.println("tagText = " + tagText );
	driver.quit();
}
}