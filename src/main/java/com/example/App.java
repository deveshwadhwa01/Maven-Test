package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {

    @Test
    public void testGoogleSearch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Jenkins\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
