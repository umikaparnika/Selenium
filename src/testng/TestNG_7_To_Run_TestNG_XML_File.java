package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_7_To_Run_TestNG_XML_File {
	WebDriver driver;

	@Test
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test
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
