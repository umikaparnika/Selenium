package newtab;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTab {
	WebDriver driver;

	@Test
	public void newtab() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.facebook.com");
		
		
		
		driver.close();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
