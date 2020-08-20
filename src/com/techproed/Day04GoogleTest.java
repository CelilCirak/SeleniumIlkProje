package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/");

        //Google.com' da "city bike" ariyoruz.
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();

        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());

        // Shopping'e girmek icin.
        WebElement avLinki = driver.findElement(By.partialLinkText("Shopping"));
        avLinki.click();

    }
}
