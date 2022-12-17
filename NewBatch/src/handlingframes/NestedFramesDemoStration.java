package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//How to handle the nested frame element - frame()
//How to transfer the control from nested to its parent frame - parentFrame() - WebDriver
//How to transfer the control from nested frame to the main Web page - defaultContent() - WebDriver 
public class NestedFramesDemoStration {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("http://www.leafground.com/pages/frame.html");
	//Identify the Second main frame as the WebElement - frameElement
	WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='page.html']"));
	//Transfer the control to the frameElement
	//Transfer the control from frameElement to the nested Frame
	//Identify the nested frame target element and perform click action
	driver.switchTo().frame(frameElement).switchTo().frame("frame2").findElement(By.id("Click1")).click();
	Thread.sleep(4000);
	//Check for the driver control In the nested frame
	String nestedFrameTagText = driver.findElement(By.id("Click1")).getText();
	System.out.println("nestedFrameTagText = " + nestedFrameTagText );
	// Transfer the driver control back from the current nested frame to its main frame 
	//i.e 2nd Main Frame - parentFrame()
	WebElement mainFrameElement = driver.switchTo().parentFrame().findElement(By.id("frame2"));
	// Check the driver control on the Second main frame
	String widthOfNestedFrame = mainFrameElement.getAttribute("width");
	System.out.println("widthOfNestedFrame = " + widthOfNestedFrame );
	String heightOfNestedFrame = mainFrameElement.getAttribute("height");
	System.out.println("heightOfNestedFrame " + heightOfNestedFrame);
	//transfer the control to main content of the Webpage - defaultContent()
	String title = driver.switchTo().defaultContent().getTitle();
	System.out.println(title);
	driver.quit();
	
}
}