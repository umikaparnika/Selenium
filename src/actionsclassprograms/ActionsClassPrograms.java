package actionsclassprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionsClassPrograms {
	WebDriver driver;

	@Test
	public void rightclick() throws Exception {
		driver.get("https://www.seleniumlearn.com/");
		Thread.sleep(4000);		
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-337-1\"]/a"))).build().perform();		
	}
	
	@Test
	public void doubleclick() throws Exception {
		driver.get("http://www.seleniumlearn.com/double-click");
		Thread.sleep(4000);	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500)");
		Thread.sleep(3000);	
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Techlearn.in']"))).doubleClick().build().perform();	
	}
	
	@Test
	public void mousehover() throws Exception {
		driver.get("https://www.seleniumlearn.com/");
		Thread.sleep(4000);		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@class='sf-depth-1 menuparent sf-with-ul']"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Selenium Quiz']"))).click().build().perform();
	}
	
	@Test
	public void draganddrop() throws Exception {
		driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
		Thread.sleep(4000);		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(source, target).build().perform();
		
	}
	
	@Test
	public void keyboardfunctions() throws Exception {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		
				
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
