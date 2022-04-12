package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_Saucedemo {

    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl); // Open URL
        driver.manage().window().maximize();// Maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// implicitly wait time
        System.out.println("Title =" + driver.getTitle()); // Print the title of the page
        System.out.println("Current url = " + driver.getCurrentUrl()); // Print the current url
        System.out.println("The Page Source = " + driver.getPageSource()); // Print the page source
        driver.findElement(By.id("user-name")).sendKeys("standard_user"); // Enter the email to email field
        driver.findElement(By.name("password")).sendKeys("secret_sauce"); // Enter the password to password field
        driver.findElement(By.id("login-button")).click(); // click on login button
        driver.close(); // close the browser





    }
}
