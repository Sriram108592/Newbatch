package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
	}
}
