package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	
	 static WebDriver driver;

	public static void main(String[] args) throws Exception {
	//	driver = new EdgeDriver();
	//	driver = new FirefoxDriver();
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
	//	driver.close();
	//	driver.manage().window().minimize();
	}

}
