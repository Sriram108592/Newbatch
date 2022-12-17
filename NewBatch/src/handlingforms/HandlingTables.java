package handlingforms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.com/contact.html");
	WebElement table = driver.findElement(By.xpath("//div[@id='accordion']"));
	 WebElement dataTitleAttr = table.findElement(By.xpath("//table//tr[6]/td[text()='Buddhist train']"));
	//System.out.println("trianName = " + dataTitleAttr );
	String attVal = dataTitleAttr.getAttribute("data-title");
	System.out.println("attVal = " + attVal);
	String tagText = dataTitleAttr.getText();
	System.out.println(tagText);
	String tag = dataTitleAttr.getTagName();
	System.out.println(tag);
//getText() - is not working 
	//I could not able to get the text of the tag <td> 
	//By Using JavaScript We can try

	List<WebElement> tdTag = driver.findElements(By.xpath("//table//tr[6]/td"));
	for (WebElement tagtext : tdTag) {
	 System.out.println(tagtext.getText());
}
	//driver.quit();
}
}