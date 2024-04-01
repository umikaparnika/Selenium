package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsTutorial {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	void hydlogin() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("Umika");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.className("form-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("HariPriya");
	}
	
	@Disabled
	@Test
	void hydlogin1() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
	driver.findElement(By.cssSelector("#edit-name")).sendKeys("HariPriya");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#edit-pass")).sendKeys("123");
	Thread.sleep(2000);
	//driver.findElement(By.cssSelector(".form-submit")).click();
	driver.findElement(By.cssSelector("input.form-submit")).click();
		
	} 
	
	@Disabled
	@Test
	void hydlogin2() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
	driver.findElement(By.linkText("Photos")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("News")).click();
		
	} 
	
	@Disabled
	@Test
	void hydlogin3() throws InterruptedException {
		driver.get("https://www.ndtv.com/");
		Thread.sleep(3000);
	
		List<WebElement> links= driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		System.out.println("Total number of links on NDTV: "+links.size());
		
	} 
	
	@Test
	void xpath() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("Priya");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[3]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-375-3\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-455-3\"]/a")).click();
		
		
	} 

}
