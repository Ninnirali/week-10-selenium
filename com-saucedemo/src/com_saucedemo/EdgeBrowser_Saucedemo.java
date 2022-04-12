package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser_Saucedemo {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver" , "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get(baseUrl); // launch the browser
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
