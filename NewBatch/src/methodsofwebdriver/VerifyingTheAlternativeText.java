package methodsofwebdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Verifying the aletrnative  text of the flipkart logo
public class VerifyingTheAlternativeText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	String expectedAlternativeText = "Flipkart";
	System.out.println("expectedAlternativeText = " + expectedAlternativeText);
	String actualAlternativeText = driver.findElement(By.cssSelector("img[title='Flipkart']")).getAttribute("alt");
	System.out.println("actualAlternativeText = " + actualAlternativeText );
	if (expectedAlternativeText.equals(actualAlternativeText)) {
		System.out.println("Pass: The Alternative text of the Flipkart logo is correct");
	}else {
		System.out.println("Fail: The Alternative text of the flipkart logo is incorrect");
	}
	driver.quit();
	
}
}