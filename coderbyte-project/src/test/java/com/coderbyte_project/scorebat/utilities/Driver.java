package com.coderbyte_project.scorebat.utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	private Driver() {
    }
	
	private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
        if (driverPool.get() == null) {

            synchronized (Driver.class) {

            String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser") : ConfigurationReader.getProperty("browser");

                switch (browser) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                }
            }
        }
        return driverPool.get();
    }
	
	@After
	public static void closeDriver() {
        if(driverPool.get() != null) {
            driverPool.get().quit();
        }
    }

}
