import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cc/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        //Buraya sayfanin beklemesi icin zaman ekliyoruz. yoksa menuye hizli girildigi icin olmuyor.
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //ilk webelementimizi buluyoruz.

        //webelementimizi bulduk ve sign butonuna tikladik.
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

        //email kutusunu bulalim
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement Password = driver.findElement(By.id("session_password"));
        //Passwordu gonderiyoruz.
        Password.sendKeys("Test1234!");
        //sign in butonunu buluyoruz
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String Title = driver.getTitle();
        if (Title.equals("Address Book")) {
        System.out.println("Giris Basarili");

        }else {
            System.out.println("Giris Basarisiz");


        }

    }

}
