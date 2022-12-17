package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickOnYoutubeGooglePage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	//click on element of 9 dots - graphics - <a> - <svg> - //*[@class='gb_Te']
	driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	//Transfer the driver control - frame(int index)
	//DOM only frame - frame(int index) - is the better solution 
	driver.switchTo().frame(1);
	// clicked on the frame element - Youtube
	driver.findElement(By.xpath("//a[@href='https://www.youtube.com/?gl=IN']")).click();
	driver.quit();
}
}