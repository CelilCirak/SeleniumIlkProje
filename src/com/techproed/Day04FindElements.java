package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Day04FindElements {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // a tagName'e sahip tum webelementleri bulalim ve yazdiralim.
        //if-else, for-foreach, methodlar, nesne olusturma, arrays konulari onemli.
        List<WebElement> listem = driver.findElements(By.tagName("a"));

        for (WebElement w : listem) {
            System.out.println(w.getText());


        }
    }
}