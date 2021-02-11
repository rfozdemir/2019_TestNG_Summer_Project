package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserFactory;

import java.util.function.Function;

public class website {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://tinder.com/");
        WebElement element1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/button[1]"));
        element1.click();
        try {
            Thread.sleep(4000);
        }
        catch (InterruptedException e){

        }
        WebElement element2=driver.findElement(By.xpath("//span[contains(text(),'Log in with phone number')]"));
        element2.click();
        WebElement element3=driver.findElement(By.name("phone_number"));
        //Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element3)).click();
        element3.sendKeys("6192156825");
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();



    }
}
