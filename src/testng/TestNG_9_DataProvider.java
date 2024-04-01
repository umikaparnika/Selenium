package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestNG_9_DataProvider {
	WebDriver driver;
	
	
	@DataProvider(name = "datainput")
	public String[][] login() {
		return new String[][] 
		{ 
			{ "Priya", "Hello@123" }, 
			{ "testuser", "Test@1234" }, 
			{ "demouser", "Demo@1234" },
			{ "haripriya", "Test@1234" }
			};
	}

	@Test(dataProvider = "datainput")
	public void login(String username, String password) throws Exception {
		driver.get("http://www.hyderabadreport.com/user");
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		try {
			driver.findElement(By.xpath("//input[@id='log-out']")).click();
			System.out.println("PASS");
		     } 
		catch (Exception e) 
		{
			System.out.println("FAIL");
			System.out.println("===========Error Due to============="+e);
		}
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
