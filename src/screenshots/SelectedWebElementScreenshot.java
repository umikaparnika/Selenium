package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedWebElementScreenshot {
	WebDriver driver;
  @Test
  public void google() throws IOException, InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
		
		WebElement mail = driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']"));

		File f = mail.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\UMIKA\\Documents\\Lib\\Screenshots\\Gmail.png")); 
		
		
		/*	WebElement sea = driver.findElement(By.name("q"));
		sea.sendKeys("Selenium"); */

  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

}
