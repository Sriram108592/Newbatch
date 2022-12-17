package handlingdropdowns;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckForTheFunctionalityOfAllTheOptions {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/signup");
	//Identify the dropDown as webelement associated with <Select>
	WebElement monthDropDown = driver.findElement(By.id("month"));
	//Select class parameterized constructor 
	Select select = new Select(monthDropDown);
	// Store all the visible text
	 List<String> allMonthOptionsText = new ArrayList<String>();
	 List<WebElement> allMonthOptions = select.getOptions();
	for (WebElement option : allMonthOptions) {
		allMonthOptionsText.add(option.getText());
		for (String textfromArray : allMonthOptionsText) {
			select.selectByVisibleText(textfromArray);
			if (option.isSelected()) {
				System.out.println(textfromArray + " Option is Selected");
			}
		}
		
	}
	//System.out.println(allMonthOptionsText);
	driver.quit();
}
}