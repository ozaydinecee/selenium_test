package tests;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DeTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  @After
  public void tearDown() {

    //driver.quit();
  }

  @Test
  public void de() {
    driver.get("https://www.e-bebek.com/");


    driver.findElement(By.id("txtSearchBox")).click();
    driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması");
    driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Sepete Ekle')][last()]")));
    //JavascriptExecutor jse = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", firstResult);
    js.executeScript("arguments[0].click();", firstResult);
    //js.executeScript("document.getElementsByClassName('btnShowCart').click()");
    //btnShowCart(driver,js);
    ///driver.findElement(By.id("btnShowCart")).click();

  }
  public static void btnShowCart(WebDriver driver,JavascriptExecutor js) {
    WebElement btnShowCart = driver.findElement(By.xpath(""));
    js.executeScript("arguments[0].click();", btnShowCart);
  }
}