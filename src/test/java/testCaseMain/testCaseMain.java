package testCaseMain;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.*;


public class testCaseMain {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebElement element;

    public static void main(String[] args){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        element = driver.findElement(name("q"));
        element.sendKeys("diesel watches for men");
        element.sendKeys(Keys.RETURN);
        // This  will scroll page 400 pixel vertical
        ((JavascriptExecutor)driver).executeScript("scroll(0,3450)");
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/a/h3"))));
        element = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[10]/div/div/div[1]/div[1]/div/a/h3"));
        element.click();


        //driver.close();



    }

}
