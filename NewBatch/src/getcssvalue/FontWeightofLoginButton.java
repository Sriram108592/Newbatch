package getcssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
//verifying the boldness or thickness of the text
public class FontWeightofLoginButton {
public static void main(String[] args) {
	System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
	WebDriver driver = new OperaDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//getCssValue() pass property name as the input In the form Of String
	//The return type is also String
	// boldness text will be specified By font-weight property name
	String loginButtonTextThickness = driver.findElement(By.name("login")).getCssValue("font-weight");
	System.out.println("loginButtonTextThickness in RGBA = " + loginButtonTextThickness);
	
	driver.quit();
}
}