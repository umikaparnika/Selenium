package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_5_TimeOut_Feature {
	WebDriver driver;

	@Test
	public void method1() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Priya");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
	}
	
	@Test(timeOut=4000)
	public void method2() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
	}
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}
