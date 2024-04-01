package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	WebDriver driver;
  @Test
  public void googlesearch() throws Exception {
	  
	  Logger log= Logger.getLogger("Search");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver = new ChromeDriver();
	  log.info("Chrome Browser Launched");
	  
	  driver.manage().window().maximize();
	  log.info("Browser window maximized");
	  
	  driver.get("https://www.google.com");
	  log.info("Google application navigated");
	  
	  driver.findElement(By.name("q")).sendKeys("Tirupati");
	  log.info("Enter text in Tirupati in goole search");
	  
	  Thread.sleep(2000);
	  log.info("Wait for 2 Seconds");
	  
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  log.info("Enter button pressed in keyboard");
  }
}
