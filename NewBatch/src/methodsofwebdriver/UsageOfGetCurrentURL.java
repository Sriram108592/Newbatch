package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentURL {
public static void main(String[] args) {
	//Step 01 Launch the empty Chrome Browser
	//Set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Instantiate the browser specific class
	ChromeDriver driver = new ChromeDriver();
	//step 02: Pass the Main URL and the Application
	driver.get("https://demo.actitime.com/");
	String expectedCurrentUrl="https://demo.actitime.com/login.do";
	System.out.println("expectedCurrentUrl= "+expectedCurrentUrl);
	//Get the Current URL of the Webpage
	String actualCurrentUrl=driver.getCurrentUrl();
	System.out.println("actualCurrentUrl= "+actualCurrentUrl);
	if(expectedCurrentUrl.contains(actualCurrentUrl)) {
		System.out.println("Pass: The Current URL of the Login Page is Correct");
	}
	else
	{
		System.out.println("Fail: The Current URL of the Login Page is Incorrect");
	}
	driver.close();
}
}
