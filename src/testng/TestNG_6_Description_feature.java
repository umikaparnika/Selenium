package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_6_Description_feature {
	WebDriver driver;

	@Test(description="Verifing Search Funcationality")
	public void TestCase1() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Priya");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
	}
	
	@Test(description="Verifing Gmail Funcationality")
	public void TestCase2() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']")).click();
	}
	
	@Test(description="Verifing About Funcationality")
	public void TestCase3() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
	}
	
	@Test(description="Verifing Image Funcationality")
	public void TestCase4() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@aria-label='Search for Images (opens a new tab)']")).click();
	}
	
	@Test(description="Verifing Business Funcationality")
	public void TestCase5_Business() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[normalize-space()='Business']")).click();
	}
	
	@Test(description="Verifing Advertising Funcationality")
	public void TestCase6() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[normalize-space()='Advertising']")).click();
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
