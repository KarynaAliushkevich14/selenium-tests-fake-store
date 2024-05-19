package com.example.testelkafakestore.serviceHelper;

import com.example.testelkafakestore.domain.DriverManager;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.NoSuchElementException;

public class WebElementExtension {

    public static boolean isElementVisible (DriverManager driver, WebElement webElement) {
        try {
            WebElement element = driver.webDriverWait.until(ExpectedConditions.visibilityOf(webElement)); // wait until element is present on a page
            return element.isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {
            e.getMessage();
            return false;
        }
    }

    public static boolean isElementClickable (DriverManager driver, WebElement webElement) {
        try {
            WebElement element = driver.webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement)); // wait until element is clickable on a page
            return element.isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {
            e.getMessage();
            return false;
        }
    }

    public static WebElement waitForElementToBeClickable (DriverManager driver, WebElement webElement) {
        try {
            WebElement element = driver.webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement)); // wait until element is clickable on a page
            return element;
        } catch (NoSuchElementException | TimeoutException e) {
            e.getMessage();
        }
        return null;
    }
}
