package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbscuredElementClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(6000);
		//Handle the obscured element before performing action on the target element
		//Region selection(Country specific)
		//ElementClickInterceptedException
		driver.findElement(By.xpath("//div/span[contains(.,\"Don't Change\")]")).click();
		Thread.sleep(5000);
		//Target Element and Click
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(5000);
		//Terminate the session
		driver.quit();
	}

}
