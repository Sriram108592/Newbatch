package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookUNPWDLocation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement usernameTextField = driver.findElement(By.id("email"));
	Point usernameTextFieldLocation = usernameTextField.getLocation();
	int usernameStartX = usernameTextFieldLocation.getX();
	System.out.println("Starting Point of Username textfield along X-Axis = " + usernameStartX );
	int usernameStartY = usernameTextFieldLocation.getY();
	System.out.println("Starting Point of Username textfield along Y-Axis = " + usernameStartY); 
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	Point passowrdTextFieldLocation = passwordTextField.getLocation();
	int passwordStartX = passowrdTextFieldLocation.getX();
	System.out.println("Starting Point of Password textfield along X-Axis = " + passwordStartX);
	int passwordStartY = passowrdTextFieldLocation.getY();
	System.out.println("Starting Point of Password textfield along Y-Axis = " + passwordStartY);
	driver.quit();
}
}