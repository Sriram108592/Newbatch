package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	public static void main(String[] args) throws Throwable{
		//Step 01: Launch the Chromedriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Step 02: Pass the Main URL of the Amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		//Step 03: Get the Amazon title and Verify
		String actualAmazonTitle = driver.getTitle();
		
		//System.out.println("Amazon Page Title is: "+actualAmazonTitle);
		String expectedAmazonTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("expectedAmazonTitle: "+expectedAmazonTitle);
		System.out.println("actualAmazonTitle: "+actualAmazonTitle);
		if(expectedAmazonTitle.equals(actualAmazonTitle))
		{
			System.out.println("Pass: The Amazon Webpage is Correct");
		}
		else
		{
			System.out.println("Fail: The Amazon Webpage is Incorrect");
		}
		
		//Step 04: Pass Flipkart Url
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		//Step 05: Get the Flipkart title and Current Url and Verify
		String actualFlipkartUrl = driver.getCurrentUrl();
		System.out.println("Flipkart Page Title is: "+actualFlipkartUrl);
		String expectedFlipkartUrl = "https://www.flipkart.com/";
		System.out.println("expectedFlipkartUrl: "+expectedFlipkartUrl);
		System.out.println("actualFlipkartUrl: "+actualFlipkartUrl);
		if(expectedFlipkartUrl.equals(actualFlipkartUrl))
		{
			System.out.println("Pass: The Flipkart Url is verfied and found correct");
		}
		else
		{
			System.out.println("Fail: The Flipkart Urk is verified and found incorrect");
		}
		
		//Step 06: Launch the Firefox Browser
		Thread.sleep(5000);
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		Thread.sleep(5000);
		
		//Step 07: Pass the DRDO URL and get the title
		firefoxDriver.get("https://www.drdo.gov.in/");
		System.out.println("The DRDO Webpage Title is: "+firefoxDriver.getTitle());
		Thread.sleep(5000);
		
		//Step 08: Pass the Mygov URL and Print the title and Current URL
		firefoxDriver.get("https://www.mygov.in/");
		Thread.sleep(5000);
		System.out.println("The Title Of the MyGov Webpage is: "+firefoxDriver.getTitle());
		System.out.println("The Current URL of the MyGov Webpage is:"+firefoxDriver.getCurrentUrl());
		
		//Step 09: Pass MakeInIndia URL and print the Title
		Thread.sleep(5000);
		firefoxDriver.get("https://www.makeinindia.com/");
		System.out.println("The title of the Makeindia Webpage is: "+firefoxDriver.getTitle());
		
		//Step 10: Pass the SkillIndia URL and Print the Title and Verify the URL
		Thread.sleep(5000);
		firefoxDriver.get("https://www.skillindia.gov.in/");
		System.out.println("The Title of the SkillIndia Webpage is: "+firefoxDriver.getTitle());
		String expectedSkillIndiaUrl = "https://www.skillindia.gov.in/";
		String actualSkillIndiaUrl = firefoxDriver.getCurrentUrl();
		System.out.println("expectedSkillIndiaUrl: "+expectedSkillIndiaUrl);
		System.out.println("actualSkillIndiaUrl: "+actualSkillIndiaUrl);
		if (expectedSkillIndiaUrl.equals(actualSkillIndiaUrl))
		{
			System.out.println("Pass: The SkillIndia Webpage URL is verified and found Correct");
		}
		else {
			System.out.println("Fail: The SkillIndia Webpage URL is verified abd found Incorrect");
		}
		Thread.sleep(5000);
		
		//Step 11: driver.quit();
		driver.quit();
	}
}
