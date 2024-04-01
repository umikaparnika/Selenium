package verifytabtitleappurlapptext;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TabTitleAppURLAppText {
	WebDriver driver;

	@Test
	public void verifyTabTitle() {
		driver.get("https://www.google.com");
		
		String exp = "Google";
		System.out.println("Expcted Tab title is :"+exp);
		
		String acttabtitle = driver.getTitle();
		System.out.println("Actual Tab title is :"+acttabtitle);
		
		Assert.assertEquals(acttabtitle, exp);
	}
	
	@Test
	public void verifyApplicationURL() {
		driver.get("https://www.google.com");
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		String expurl = "https://www.google.com/";
		
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(acturl, expurl);
	}
	
	@Test
	public void verifyApplicationtext() {
		driver.get("https://www.google.com");
		
		String expgmail = "Gmail";
		
		String actgmail = driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']")).getText();
		
		Assert.assertEquals(actgmail, expgmail);
		
		String exeimage = "images";
		String actimage = driver.findElement(By.xpath("//a[@aria-label='Search for Images (opens a new tab)']")).getText();
		Assert.assertEquals(actimage, exeimage);
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
