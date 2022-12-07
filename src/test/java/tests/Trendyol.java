package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.browser.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Trendyol {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","/drivers/chromeDriver");
        WebDriver driver=new ChromeDriver();


        Thread.sleep(1000);
        driver.get("https://www.trendyol.com/butik/liste/1/kadin");
        WebElement nameElement = driver.findElement(By.xpath("//div//input[@class='vQI670rJ']"));
        nameElement.click();
        nameElement.sendKeys("kaşık maması");
        nameElement.sendKeys(Keys.ENTER);


        List<WebElement> addToCartButtonList = driver.findElements(By.xpath("//div[@class='add-to-bs-tx')]"));
        addToCartButtonList.get(addToCartButtonList.size()-1).click();




    }



}




