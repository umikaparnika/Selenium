package dropdownselect;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownFeatures {
	WebDriver driver;
  @Test
  public void dropdownselection() throws Exception {
	  Thread.sleep(4000);
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@id='field-5vlVJGcSKva7av0']")).sendKeys("517501");
	  Thread.sleep(4000);
	  
	  Select c = new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")));
	  c.selectByVisibleText("India");
	  
	//  new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(14);
	//  new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("PK");
	  
	//  new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("Russia");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
