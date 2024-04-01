package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_8_To_Run_Groups_TCs {
	WebDriver driver;

	@Test(groups="social")
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	
	@Test(groups="food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	
	@Test(groups="social")
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(groups="search")
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test(groups="tech")
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	
	@Test(groups="tech")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	
	@Test(groups="social")
	public void gmail() {
		driver.get("https://www.gmail.com");
	}

	@BeforeTest(groups="social")
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
