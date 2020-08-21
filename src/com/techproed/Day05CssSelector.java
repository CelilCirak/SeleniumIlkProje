package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        //css Selector kullanirken, class value kullanirken .value
        //id value kullanirken #value yazariz.
        WebElement emailKutusu = driver.findElement(By.cssSelector(".form-control"));//veya #sessioi_email
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        sifreKutusu.sendKeys("Test1234!");

        sifreKutusu.submit();
    }
}
