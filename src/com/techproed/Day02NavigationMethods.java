package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        WebDriver webDriver = new ChromeDriver();

        //Ekrani kapla yapar.
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com");
        //get komutu ile ayni islevi yapiyor
        webDriver.navigate().to("http://amazon.com");

        //navigate().back(); bir onceki sayfaya geri gidiyor
        webDriver.navigate().back();

        //navigate().forward(); geri geldigimiz sayfadan tekrar ileri gitmemizi sagliyor.
        webDriver.navigate().forward();
        //refresh(), sayfayi yeniliyor.
        webDriver.navigate().refresh();

    }


    }



