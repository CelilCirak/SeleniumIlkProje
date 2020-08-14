package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/cc/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        String sayfaTitle = driver.getTitle();//Sitenin title'ini aliyoruz.
        String sayfaUrl = driver.getCurrentUrl();//Sitenin Url'ini aliyoruz.

        System.out.println(sayfaTitle);//Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
        System.out.println(sayfaUrl); // https://www.amazon.com/

        driver.quit();


    }
}
