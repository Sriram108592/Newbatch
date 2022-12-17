package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//Get all the options present In the drop down - getOptions()
//Select Class of Selenium
public class FaceBookMonthDropDown {
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
	//Type Of the DropDown
	if (select.isMultiple()) {
		System.out.println("isMultiple is returning True");
		System.out.println("Fail: The Month DropDown is of Multiselect Type");
	}else {
		System.out.println("isMultiple is returning False");
		System.out.println("Pass: The Month dropdopwn is of single select type");
	}
	
	//Get all the options in the drop down
	List<WebElement> monthAllOptions = select.getOptions();
	System.out.println("Total No of Options In the month dropdown = " + monthAllOptions.size());
	for (WebElement option : monthAllOptions) {
		System.out.println("Month =" + option.getText());
	}
	//Count of options in the year dropdown
	System.out.println("Year DropDown options count " + new Select(driver.findElement(By.id("year"))).getOptions().size());
	driver.quit();
	
}
}