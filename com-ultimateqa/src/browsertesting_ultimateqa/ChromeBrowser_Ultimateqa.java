package browsertesting_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_Ultimateqa {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl); // Launching the url
        driver.manage().window().maximize(); // maximizing the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicitly wait time

        System.out.println("Title =" + driver.getTitle()); // print title
        System.out.println("Current Url = " + driver.getCurrentUrl()); // print current url
        System.out.println("The Page Source = " + driver.getPageSource()); // print page source

        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com"); // Enter email to email field
        driver.findElement(By.id("user[password]")).sendKeys("password123"); // Enter password to password field
        //driver.close(); // close the browser
    }
}
