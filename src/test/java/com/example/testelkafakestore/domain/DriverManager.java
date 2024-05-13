package com.example.testelkafakestore.domain;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DriverManager {

    // May be we could add [ThreadStatic]
    public WebDriver localWebDriver;
    public WebDriverWait webDriverWait;
    public Actions action;
    public JavascriptExecutor javascriptExecutor;

    @Autowired
    public DriverManager(WebDriver localWebDriver, WebDriverWait webDriverWait, Actions action, JavascriptExecutor javascriptExecutor) {
        this.localWebDriver = localWebDriver;
        this.webDriverWait = webDriverWait;
        this.action = action;
        this.javascriptExecutor = javascriptExecutor;
    }
}
