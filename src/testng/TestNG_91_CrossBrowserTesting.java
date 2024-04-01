package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNG_91_CrossBrowserTesting {
	WebDriver driver;
	@Parameters({ "browser" })
    @BeforeTest
    public void openBrowser(String browser) {

        try {

            if (browser.equalsIgnoreCase("Mozilla")) {
                driver = new FirefoxDriver();
                driver.manage().window().maximize();

            } 

            else if (browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } 
            else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
                driver.manage().window().maximize();

            }

            /*else if (browser.equalsIgnoreCase("opera")) {
                System.setProperty("webdriver.opera.driver","D:\\lib\\operadriver.exe");  //--->IE for Windows path
                driver=new OperaDriver();
             }

        else if (browser.equalsIgnoreCase("safari")) {
            System.setProperty("webdriver.safari.driver", "D:\\lib\\SafariDriver.exe"); //To stop uninstall each time
             driver = new SafariDriver();
             driver.get("http://www.google.com");
            }*/

        } 
        catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void seleniumlearn() throws Exception {
        
        driver.get("https://www.seleniumlearn.com");      
    }
    
    @Test
    public void selenium() throws Exception {
        driver.get("https://www.selenium.dev");      
    }
    
    
    @Test
    public void google() throws Exception {
        driver.get("https://www.google.com"); 
        driver.findElement(By.name("q")).sendKeys("Tirupati");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    
    @Test
    public void facebook() throws Exception {
        driver.get("https://www.facebook.com");      
    }
    
    

    @AfterTest
    public void closeBrowser() {
       driver.quit();
    }
}
