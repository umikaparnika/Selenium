package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormateScreenshot {
	WebDriver driver;
	
	public void getscreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\UMIKA\\Documents\\Lib\\Screenshots\\Google" + time + ".png"));

	}

	@Test
	public void timeformatescreenshot() throws IOException, Exception {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		getscreenshot();
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		Thread.sleep(2000);
		getscreenshot();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		getscreenshot();
	}
	
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
