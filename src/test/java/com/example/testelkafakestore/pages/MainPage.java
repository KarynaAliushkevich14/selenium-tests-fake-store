package com.example.testelkafakestore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class MainPage implements BasePage {

    private final WebDriver localWEbDriver;
    private final WebDriverWait webDriverWait;
    public MainPage(WebDriver localWEbDriver, WebDriverWait webDriverWait) {
        this.webDriverWait = webDriverWait;
        this.localWEbDriver = localWEbDriver;
    }

    public void navigateTo (String url) {
        localWEbDriver.get(url);
    }
}
