package getcssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.Color;

public class LoginButtonBackgroundColor {
public static void main(String[] args) {
	System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
	WebDriver driver = new OperaDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String loginButtonBackGroundColor = driver.findElement(By.name("login")).getCssValue("background-color");
	System.out.println("loginButtonBackGroundColor in RGBA = " + loginButtonBackGroundColor);
	//color is the selenium class
	//color class contains the static method called fromString(String rgbValue)
	//pass the captured rgb value as an input to fromString()
	//fromString() will color type object
	//background-color is the property name
	//color type obj contains asHex() - String will be returned contains hexadecimal value of the color
	String hexDecimalColor = Color.fromString(loginButtonBackGroundColor).asHex();
	System.out.println("loginButtonBackGroundColor in Hexa Decimal = " + hexDecimalColor);
	driver.quit();
}
}