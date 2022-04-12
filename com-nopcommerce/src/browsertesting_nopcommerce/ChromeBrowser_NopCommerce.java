package browsertesting_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_NopCommerce {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl); // open url
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicitly wait time

        System.out.println("Title = " + driver.getTitle()); // print the title of the page
        System.out.println("Current Url = " + driver.getCurrentUrl()); // print the current url
        System.out.println("Page Source =" + driver.getPageSource()); // print the page source

        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");// enter email to emailField
        driver.findElement(By.name("Password")).sendKeys("password123"); // enter password to passwordField
        //driver.close();// close the browser

    }
}
