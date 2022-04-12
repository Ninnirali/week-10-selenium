package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowse_Saucedemo {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl); // Open url
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicitly wait time
        System.out.println("Title = " + driver.getTitle()); // print the title
        System.out.println("Current Url = " + driver.getCurrentUrl()); // print the current url
        System.out.println("The Page Source =" + driver.getPageSource()); // print the page source
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user"); // enter email to the emailField
        driver.findElement(By.name("password")).sendKeys("secret_sauce"); // enter password to the password field
        driver.findElement(By.id("login-button")).click(); // click on login button
        //driver.close(); // close the browser





    }





}
