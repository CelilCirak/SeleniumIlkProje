package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02IfElse {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cc/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String amazonTitle = driver.getTitle(); // Car kelimesini kontrol edelim.

        if (amazonTitle.contains("Books")) {
            System.out.println("Car kelimesi geciyor: ");
        } else {
            System.out.println("Car kelimesi yok: ");
        }
        driver.quit();
    }
}