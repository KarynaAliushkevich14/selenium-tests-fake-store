package com.example.testelkafakestore.domain;

import com.example.testelkafakestore.enums.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class BrowserActions {

    private final WebDriver webDriver;
    private final WebDriverWait webDriverWait;
    private final String baseUrl;


    public BrowserActions(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        this.baseUrl = Constants.BASE_URL;
    }

    // methods
    public BrowserActions goToUrl(String uri) {
        webDriver.navigate().refresh();
        String url = baseUrl + uri;
        webDriver.navigate().to(url);
        return this;
    }
}
