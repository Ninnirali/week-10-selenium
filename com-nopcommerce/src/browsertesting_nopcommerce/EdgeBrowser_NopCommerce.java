package browsertesting_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser_NopCommerce {
    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get(baseUrl); // open the url
        driver.manage().window().maximize();// maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicitly wait duration

        System.out.println("Title = " + driver.getTitle()); // print the title
        System.out.println("Current url = " + driver.getCurrentUrl()); // print current url
        System.out.println("Page Source = "+ driver.getPageSource()); // print the page source

        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com"); // enter email to the email field
        driver.findElement(By.name("Password")).sendKeys("password"); // enter password to the password field
        //driver.close(); // close the browser
    }
}
