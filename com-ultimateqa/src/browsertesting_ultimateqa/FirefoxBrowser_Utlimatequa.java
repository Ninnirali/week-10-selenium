package browsertesting_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser_Utlimatequa {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl); // launch the browser
        driver.manage().window().maximize(); // maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicitly wait time
        System.out.println("Title = " + driver.getTitle()); // print title
        System.out.println("Current url = " + driver.getCurrentUrl()); // print current url
        System.out.println("The Page Source = " + driver.getPageSource()); // print page source
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com"); // enter email into email field
        driver.findElement(By.name("user[password]")).sendKeys("password123"); // enter password to the password field
        //driver.close(); // close the browser
    }
}
