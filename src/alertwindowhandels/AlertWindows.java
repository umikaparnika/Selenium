package alertwindowhandels;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertWindows {
	WebDriver driver;

	@Test
	public void alertOKbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 2000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void alertCanelbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().dismiss();
	}
	
	
	@Test
	public void alertboxsendtextOkbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Priya");
		alt.accept();
		
		
		
	//	driver.switchTo().alert().sendKeys("Hari Priya");
	//	driver.switchTo().alert().accept();
		
		
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
