package getcssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Colors {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	String Button = loginButton.getCssValue("background-color");
	System.out.println(Button);
	String Button1 = loginButton.getCssValue("font-weight");
	System.out.println(Button1);
}
}