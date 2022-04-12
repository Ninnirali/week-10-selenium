package browsertesting_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.sql.SQLOutput;
import java.time.Duration;

public class FirefoxBrowser_OrangeHrmLive {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // Set up Firefox Browser
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Launch the URL
        driver.get(baseUrl);
        // Maximize window
        driver.manage().window().maximize();
        // we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Title : " + title);
        // print the current url
        System.out.println("Current url = "+ driver.getCurrentUrl());
        // print the page source
        System.out.println("Page Source = "+ driver.getPageSource());
        // find the email field element
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        // Enter the email to emailField
        emailField.sendKeys("Admin");
        // find the password field element
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        // Enter the password to passwordField
        passwordField.sendKeys("admin123");
        // click on the login button
        driver.findElement(By.id("btnLogin")).click();
        // Close the browser
        driver.close();


    }
}
