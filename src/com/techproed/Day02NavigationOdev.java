package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02NavigationOdev {
    // -ilk once Google.com'a gidiniz
    // 2- oradan YouTube.com' a gidiniz.
    // 3- google.com'a geri donunuz (back methodu ile)
    // 4- youtube.com'a geri gidiniz. (forward methodu ile)
    // 5- youtube.com'u yenileyiniz. (refresh methodu ile)
    // 6- driveri kapatin (quit ile)

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();
    }

}
