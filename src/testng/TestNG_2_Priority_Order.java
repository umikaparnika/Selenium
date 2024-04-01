package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_2_Priority_Order {
	WebDriver driver;

	@Test(priority=1)
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	
	@Test(priority=4)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(priority=2)
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test(priority=0)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(priority=3)
	public void gmail() {
		driver.get("https://www.gmail.com");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
