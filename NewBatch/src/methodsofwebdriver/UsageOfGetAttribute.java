package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class UsageOfGetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.findElement(By.cssSelector("button[class=\'_2KpZ6l _2doB4z\']")).click();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String expectedToolTipText = "flipkart";
		String actualToolTipText = driver.findElement(By.cssSelector("img[alt=\'Flipkart\']")).getAttribute("title");
		System.out.println("actualToolTipText = "+actualToolTipText);
		if (expectedToolTipText.equals(actualToolTipText))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");			
		}
	}
}


