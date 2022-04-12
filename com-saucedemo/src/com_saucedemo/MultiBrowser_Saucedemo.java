package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_Saucedemo {

    static String browser = "chrome";
    static String baseUrl = "https://www.saucedemo.com/";
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
        }else{
            System.out.println(" Wrong browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Title =" + driver.getTitle());
        System.out.println("The Current Url =" + driver.getCurrentUrl());
        System.out.println("The Page Source =" + driver.getPageSource());
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user"); // enter email to the emailField
        driver.findElement(By.name("password")).sendKeys("secret_sauce"); // enter password to the password field
        driver.findElement(By.id("login-button")).click(); // click on login button
        //driver.close(); // close the browser
        
    }
}
