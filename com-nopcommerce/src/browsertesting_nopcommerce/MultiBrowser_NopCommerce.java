package browsertesting_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_NopCommerce {
    static String browser = "chrome";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println(" Wrong browser name");
        }

        driver.get(baseUrl); // open url
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicitly wait time

        System.out.println("Title = " + driver.getTitle()); // print the title of the page
        System.out.println("Current Url = " + driver.getCurrentUrl()); // print the current url
        System.out.println("Page Source ="+ driver.getPageSource()); // print the page source

        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");// enter email to emailField
        driver.findElement(By.name("Password")).sendKeys("password123"); // enter password to passwordField
        //driver.close();// close the browser
    }
}
