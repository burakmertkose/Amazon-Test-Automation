package pageObjectModel;

import Utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public abstract class AbstractClass {
    WebDriver driver = Driver.getDriver();
    WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
    public void elementClick(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }

    public void elementJavaScriptClick(WebElement element){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

}
