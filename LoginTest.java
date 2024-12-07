package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class LoginTest {
    @Test
    public void testLogin() {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path\\to\\chromedriver");

        // Initialize WebDriver (Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("http://example.com/login");

        // Locate the elements on the page by their HTML ID
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login"));

        // Perform the login action
        username.sendKeys("admin");
        password.sendKeys("password");
        loginButton.click();

        // Validate the page title after login
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        assert expectedTitle.equals(actualTitle);

        // Close the browser
        driver.quit();
    }
}
