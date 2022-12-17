package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckForMaleRadioButtonSelection {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
	//Check for male radio button selection before click - Not Selected  (+ve testing)
	if (maleRadioButton.isSelected()) {
		System.out.println("Fail: The Male Radio Button is selected by default");
	}else {
		System.out.println("Pass: The male radio button is not selected by default");
	}
	maleRadioButton.click();
	//After Click
	if (maleRadioButton.isSelected()) {
		System.out.println("Pass: The Male Radio Button is Selected After click");
	}else {
		System.out.println("Fail: The Male Radio Button Is not selected after click");
	}
	
	driver.quit();
}
}