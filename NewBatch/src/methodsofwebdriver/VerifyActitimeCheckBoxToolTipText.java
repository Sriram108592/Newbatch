package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Verfying the Tool tip text
public class VerifyActitimeCheckBoxToolTipText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	String expectedCheckBoxToolTipText = "Do not select if this computer is shared";
	System.out.println("expectedCheckBoxToolTipText = " + expectedCheckBoxToolTipText );
	String actualCheckBoxToolTipText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
	System.out.println("actualCheckBoxToolTipText = " + actualCheckBoxToolTipText );
	if (expectedCheckBoxToolTipText.equals(actualCheckBoxToolTipText)) {
		System.out.println("Pass: The ActiTime Check box tool tip text is correct");
	}else {
		System.out.println("Fail: The Actitime Check box tool tip text is Incorrect");
	}
	driver.quit();
}
}