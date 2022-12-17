package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyActitimeChekcBoxToolTipText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eu.actitime.com/rami/login.do");


		//String expectedToolTipText = "Do not select if this computer is shared";
		String actualToolTipText = driver.findElement(By.id("keepLoggedInLabel")).getAttribute("title");
		System.out.println("actualToolTipText = "+actualToolTipText);
//		if (expectedToolTipText.equals(actualToolTipText))
//		{
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");			
//		}
	}
}
