package browsertesting_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MSEdgeBrowser_OrangeHrmLive {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        // Launch the URL
        driver.get(baseUrl);
        // Maximise window
        driver.manage().window().maximize();
        // we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Title : "+ title);
        // print the current url
        System.out.println("Current Url = " + driver.getCurrentUrl());
        // print the page source
        System.out.println("The Page Source : "+ driver.getPageSource());
        // Find the usernameField element
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        // Enter username to the usernameField
        usernameField.sendKeys("Admin");
        // Find the passwordField
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        // Enter password to the passwordField
        passwordField.sendKeys("admin123");
        // find the login button and click on it
        driver.findElement(By.name("Submit")).click();
        //close the browser
        driver.close();








    }

}
