package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02TitleUrlTest {

    // Youtube.com'a gidelim.
    // Title, video kelimesini iceriyormu?
    // driveri kapatalim.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/cc/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle(); // Video kelimesini kontrol edelim.

        if (youtubeTitle.contains("video")) {
            System.out.println("video kelimesi geciyor: ");
        } else {
            System.out.println("video kelimesi yok: ");
        }
        driver.quit();
}
}
