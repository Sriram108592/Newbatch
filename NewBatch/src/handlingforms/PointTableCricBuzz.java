package handlingforms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointTableCricBuzz {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
	WebElement pointsTable = driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']"));
	List<WebElement> rcbData = pointsTable.findElements(By.xpath("//a[text()='Royal Challengers Bangalore']/ancestor::tr/td[not(@ng-init=\"direction_59='up'\")]"));
	for (WebElement point : rcbData) {
		System.out.println(point.getText());
	}
	driver.quit();
}
}