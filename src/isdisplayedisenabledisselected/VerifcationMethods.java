package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifcationMethods {
	WebDriver driver;

	@Test(enabled=false)
	public void isDisplayedMethod() {
		driver.get("https://www.redmine.org/");
		
		boolean sign= driver.findElement(By.xpath("//a[@class='login']")).isDisplayed();
		
		if(sign==true)
		{
			System.out.println("Sign in link is present in the homepage");
			driver.findElement(By.xpath("//a[@class='login']")).click();			
		}
		else
		{
			System.out.println("Sign in link is Not present in the homepage");
		
		}
	}
	
	
	@Test
	public void isEnabledMethod() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		
		boolean login = driver.findElement(By.xpath("//input[@id='username']")).isEnabled();
		
		if(login==true)
		{		
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("haripriya");
			System.out.println("Login text box is enabled to enter user details");

		}		
		else
		{
			System.out.println("Login text box is Not enabled to enter user details");
	
		}		
		
	}
	
	@Test
	public void isSelectedMethod() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='autologin']")).click();
		Thread.sleep(3000);

		boolean checkbox = driver.findElement(By.xpath("//input[@id='autologin']")).isSelected();
		
		if(checkbox==true)
		{
			System.out.println("Stay logged in Check box is Selected");
		}
		
		else
		{
			System.out.println("Stay logged in Check box is NOT Selected");

		}
				
	}
	
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
