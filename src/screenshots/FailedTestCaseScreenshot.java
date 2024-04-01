package screenshots;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FailedTestCaseScreenshot {
	WebDriver driver;
	
public void FailedtakeScreenshot() throws Exception {	
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\UMIKA\\Documents\\Lib\\Screenshots\\FailedScreenshot1.png"));
	}


	@Test
	public void BugScreenshot() throws Exception {
		driver.get("https://www.google.com/");
		try 
		{
			driver.findElement(By.name("q")).sendKeys("Tirupati");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//div[@id='hd-tls']")).click();
		}

		catch (Exception e) 
		{
			System.out.println("======Error dure to ===="+e);
	       FailedtakeScreenshot();
						
		}

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
