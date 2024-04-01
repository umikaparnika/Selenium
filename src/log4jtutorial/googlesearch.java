package log4jtutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class googlesearch {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	  System.out.println("Google Application naviagated");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  System.out.println("Chrome Browser Launched");
	  driver.manage().window().maximize();
	  System.out.println("Browser window Maximized");
  }

}
