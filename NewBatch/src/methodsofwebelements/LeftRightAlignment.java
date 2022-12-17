package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftRightAlignment {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//Left Alignment --GetSize()
	 Rectangle usernameRect = driver.findElement(By.id("email")).getRect();
	 int usernameStartX = usernameRect.getX();
	System.out.println("usernameStartX = " + usernameStartX );
	 Rectangle passwordRect = driver.findElement(By.id("passContainer")).getRect();
	 int passwordStartX = passwordRect.getX();
	System.out.println("passwordStartX = " + passwordStartX );
	if (usernameStartX==passwordStartX) {
		System.out.println("Pass: The Left Alignment of Username and Passowrd textfield is verified and found correct");
	}else {
		System.out.println("Fail: The Left Alignment of Username and Password textfield is verified and found incorrect");
	}
	//Right Alignment of Username and Password textField
	int userNameendX = usernameStartX+usernameRect.getWidth();
	System.out.println("userNameendX = " + userNameendX );
	int passwordEndX = passwordStartX + passwordRect.getWidth();
	System.out.println("passwordEndX = " + passwordEndX );
	if (userNameendX==passwordEndX) {
		System.out.println("Pass: The Right Alignment of the Username and Password textfield is verified and found Correct");
	}else {
		System.out.println("Fail: The Right Alignment of the Username and Password text field is verified and found incorrect");
	}
	driver.quit();
}
}