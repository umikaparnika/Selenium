package newtab;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FramesHandle {
	WebDriver driver;
  @Test
  public void newtabfunctionality() throws Exception {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  
	  WebElement frm = driver.findElement(By.id("iframeResult"));
	  driver.switchTo().frame(frm);
	  
	  Thread.sleep(2000);	  
	  
	  driver.findElement(By.xpath("/html/body/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  driver.switchTo().defaultContent();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  Thread.sleep(2000);
	  
	  ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[5]")).click();
	  driver.switchTo().window(tabs.get(0));
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
