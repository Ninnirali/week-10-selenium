package browsertesting_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_OrangeHrmLive {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // Setup Chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Launch the URL
        driver.get(baseUrl);
        // Maximize Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // print the title of the page
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        // Print the current url
        System.out.println("Current URL = " + driver.getCurrentUrl());
        // Print the page source
        System.out.println(driver.getPageSource());
        // Find the email field element
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        // Enter email to email field element
        emailField.sendKeys("Admin");
        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        // Enter the password to password field
        passwordField.sendKeys("admin123");
        // Click on the Login button
        driver.findElement(By.id("btnLogin")).click();
        // Close the browser
        driver.close();

    }
}
