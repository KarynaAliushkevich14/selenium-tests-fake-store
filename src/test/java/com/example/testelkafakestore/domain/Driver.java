package com.example.testelkafakestore.domain;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    public static WebDriver webDriverInstance;
    public static WebDriverWait webDriverWait;
    public static Actions action;
    public static JavascriptExecutor javascriptExecutor;

    public void Initialize () {
        webDriverInstance = new ChromeDriver();
        webDriverWait = new WebDriverWait(webDriverInstance, Duration.ofSeconds(10));
        action = new Actions(webDriverInstance);
        javascriptExecutor = (JavascriptExecutor) webDriverInstance;
    }
}
