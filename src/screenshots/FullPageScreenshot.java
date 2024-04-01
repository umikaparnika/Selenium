package screenshots;

import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class FullPageScreenshot {
	WebDriver driver;

	@Test
	public void fullpage() throws Exception  {
		driver.get("https://seleniumlearn.com/selenium-tutorial");
		Thread.sleep(4000);

		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\UMIKA\\Documents\\Lib\\Screenshots\\FullPageScreenshot123.png"));

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
