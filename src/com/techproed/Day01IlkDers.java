package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01IlkDers {

    public static void main(String[] args) {
        //Java projemize, chromedriver'i tanitiik.
        System.setProperty("webdriver.chrome.driver","/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        //selenium ilk kodumuz.
        WebDriver webDriver = new ChromeDriver();
        //driverimiza google.com'a gitmesini soyledik.
        webDriver.get("http://google.com");

       webDriver.close();

        webDriver.quit();

    }

}
