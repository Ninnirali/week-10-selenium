package browsertesting_orangehrmlive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_OrangeHrmLive {
    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.close();
    }
}
