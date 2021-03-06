package com.techproed;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day04LocatorTagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //getText ile asagida "home'daki" gizli kodu goruyoruz.
        WebElement homeLinki = driver.findElement(By.tagName("a"));//home
        System.out.println(homeLinki.getText());
    }
}
