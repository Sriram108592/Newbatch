package methodsofwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToSubUrl {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		//According to the OOAD Principle
		WebDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//pass the main Url of the application
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		//Create the object from Url class of Java
		//Select the constructor which is of type URL(String spec)
		//Name the object as main URL of the application to build the URL further
		URL dassaultMainUrl = new URL("https://www.dassault-aviation.com/en/");
		//Constructor Overloading
		//URL(URL context, String spec)
		URL dassaultSubUrlDefense = new URL(dassaultMainUrl, "defense/");
		//Navigation Object contains two methods with same name but different arguments
		//to(String url)
		//to(URL url)
		//Method Overloading
		//Pass the suburl reference variable as input to to(URL url)
		driver.navigate().to(dassaultSubUrlDefense);
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		String actualDefenceUrl = driver.getCurrentUrl();
		URL dassaultSubUrlCivil = new URL(dassaultMainUrl, "civil/");
		driver.navigate().to(dassaultSubUrlCivil);
		Thread.sleep(5000);
		URL dassaultSubUrlSpace = new URL(dassaultMainUrl, "space/");
		driver.navigate().to(dassaultSubUrlSpace);
		Thread.sleep(5000);
		URL dassaultSubUrlPassion = new URL(dassaultMainUrl, "passion/");
		driver.navigate().to(dassaultSubUrlPassion);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		
		//Terminate the Session
		driver.quit();
	}

}
