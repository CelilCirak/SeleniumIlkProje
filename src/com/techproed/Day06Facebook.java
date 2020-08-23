package com.techproed;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://facebook.com");

        // 1. adim: email kutusuna "techproed@gmail.com" gonderecegiz.
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        sifreKutusu.sendKeys("Test1234!");

        //login butonu
        sifreKutusu.submit();
        //Ikisi de olur.
        //WebElement loginButonu = driver.findElement(By.xpath(""//button""));
        //loginButonu.click();


        //Burada Java ya 3 saniye bekle diyoruz.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String url = driver.getCurrentUrl();

        if (url.contains("facebook.com/login/")) {
            System.out.println("Giris Basarisiz!");

        } else {
            System.out.println("Giris Basarili !");
        }
       try {
           Thread.sleep(5000);
       }catch (InterruptedException e){
           e.printStackTrace();

        }

        driver.quit();
    }
}