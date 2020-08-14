package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02DriverOdev {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        //ilk once google.com a git.
        //sayfanin Title'ni ekrana yazdiralim.
        //sonra yuotube a gidelim.
        //sayfa ve url ' yi ekrana yazdiralim.
        //google.com' a gelip url' yi yazdiralim.
        //driverimizi kapatalim.

        driver.manage().window().maximize();
        driver.get("http://google.com");
        String sayfaTitle = driver.getTitle();
        System.out.println(sayfaTitle);
        driver.navigate().to("http://youtube.com");
        String sayfTitle = driver.getTitle();
        String sayfUrl = driver.getCurrentUrl();
        System.out.println(sayfaTitle);
        System.out.println(sayfUrl);
        driver.navigate().back();
        String sayfaUrl = driver.getCurrentUrl();
        System.out.println(sayfaUrl);
        driver.quit();

    }
    }
