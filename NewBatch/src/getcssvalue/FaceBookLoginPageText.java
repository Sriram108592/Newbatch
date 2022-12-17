package getcssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class FaceBookLoginPageText {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//verify the thickness of the text
	 WebElement mainLogoText = driver.findElement(By.xpath("//h2[contains(.,'Facebook helps you connect')]"));
	 String thicknessOfText = mainLogoText.getCssValue("font-weight");
	System.out.println("thicknessOfText = " + thicknessOfText );
	//color Of the text
	 String mainLogoTextColor = mainLogoText.getCssValue("color");
	 String hexaColorCodeofLogotext = Color.fromString(mainLogoTextColor).asHex();
	 Color hh = Color.fromString(mainLogoTextColor);
	 System.out.println(hh+"---------");
	 System.out.println("hexaColorCodeofLogotext = " + hexaColorCodeofLogotext );
	driver.quit();
}
}