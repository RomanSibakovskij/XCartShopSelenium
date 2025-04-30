package com.xcart.demo.utilities;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*; //this particular webpage doesn't work correctly on Chrome
import org.openqa.selenium.firefox.*;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setUp(){

        FirefoxOptions options = new FirefoxOptions();
        //ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen"); //for browser run
        //options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1920,1080"); //this is necessary for CI run, disable once run in IDE and re-enable commented out options
        //driver = new ChromeDriver(options);
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize(); //-> enable this with browser run
        driver.get("https://demo.x-cart.com/demo/home.php");
        //options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080"); // Necessary for CI run, uncomment when needed
    }

    @AfterEach
    public void close() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}


