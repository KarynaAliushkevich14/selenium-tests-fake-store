package com.example.testelkafakestore.serviceHelper;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class WebElementExtension {

    public static boolean isElementVisible (WebDriverWait webDriverWait, WebElement webElement) {
        try {
            WebElement element = webDriverWait.until(ExpectedConditions.visibilityOf(webElement)); // wait until element is present on a page
            return element.isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {
            e.getMessage();
            return false;
        }
    }

    public static boolean isElementClickable (WebDriverWait webDriverWait, WebElement webElement) {
        try {
            WebElement element = webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement)); // wait until element is clickable on a page
            return element.isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {
            e.getMessage();
            return false;
        }
    }

    public static WebElement waitForElementToBeClickable (WebDriverWait webDriverWait, WebElement webElement) {
        WebElement element = webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement)); // wait until element is clickable on a page
        return element;
    }
}
