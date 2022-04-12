package browsertesting_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_Ultimatequa {

    static String browser = "chrome";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else{
            System.out.println(" Wrong Browser name");
        }
        driver.get(baseUrl); // open url
        driver.manage().window().maximize(); // maximise the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicitly wait time

        System.out.println("Title = " + driver.getTitle()); // print title of the page
        System.out.println("Current url = " + driver.getCurrentUrl()); // print current url of the page
        System.out.println("Page Source = " + driver.getPageSource()); // print the page source
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com"); // insert email to the emailField
        driver.findElement(By.name("user[password]")).sendKeys("password123"); // insert password to the passwordField
        driver.close(); // close the browser
    }
}
