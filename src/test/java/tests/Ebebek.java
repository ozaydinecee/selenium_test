package tests;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ebebek {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","/drivers/chromeDriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.e-bebek.com/");

        WebElement nameElement = driver.findElement(By.id("txtSearchBox"));
        nameElement.click();
        nameElement.sendKeys("kaşık maması");
        Thread.sleep(1000);
        nameElement.sendKeys(Keys.ENTER);
        nameElement.findElement(By.xpath("//button[contains(text(),'Sepete Ekle')][1]"));

        //List<WebElement> addToCartButtonList = driver.findElements(By.xpath("//button[contains(text(),'Sepete Ekle')]last()"));iii
        //addToCartButtonList.get(2).click();

    }
}
