package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageGetTitle {
	private static final Object ActualDrdoTitle = null;

	public static void main(String[] args) {
		//Step 01 Launch the empty Chrome Browser
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//step 02: Pass the Main URL and the Application
		driver.get("https://www.drdo.gov.in/");
		String expectedDrdoTitle="Defence Research and Development Organisation";
		//set the title of the webpage
		String drdoTitle=driver.getTitle();
		System.out.println("drdoTitle ="+ActualDrdoTitle);
		//Validate the title of the webpage
		if(expectedDrdoTitle.equals(ActualDrdoTitle)) {
			System.out.println("Pass : The DRDO webpage title is correct");
		}
		else
		{
			System.out.println("Fail: The DRDO Webpage title is incorrect");
		}
		driver.close();
	}
}
