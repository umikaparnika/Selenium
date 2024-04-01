package pagescrolldownup;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownandUp {
	WebDriver driver;

	@Test
	public void scrolldown() throws InterruptedException {
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 3000)");

		Thread.sleep(3000);

	//	driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a")).click();
	}
	
	
	@Test
	public void scrollup() throws InterruptedException {
		
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(3000, 0)");

		}
	
	@Test (priority=6)
    public void IndentifyLoacatorElement() throws Exception {
		driver.get("https://www.selenium.dev/downloads/");
   
    {
        WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a"));
        Coordinates coordinate = ((Locatable)element).getCoordinates(); 
        coordinate.onPage(); 
        coordinate.inViewPort();
        driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a")).click();
         }    
      }


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
