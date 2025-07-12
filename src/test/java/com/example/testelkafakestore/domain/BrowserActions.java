package com.example.testelkafakestore.domain;

import org.openqa.selenium.JavascriptExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BrowserActions {

    @Value("${test.base-url}")
    private String baseUrl;

    @Autowired
    public BrowserActions() {
    }

    public BrowserActions goToUrl(String uri) {
        Driver.webDriverInstance.navigate().refresh();
        String url = baseUrl + uri;
        Driver.webDriverInstance.navigate().to(url);
        return this;
    }

    public BrowserActions refreshPage() {
        ((JavascriptExecutor) Driver.webDriverInstance).executeScript("location.reload()");
        /** could be also:
         * webDriver.navigate().refresh();
         * webDriver.get(webDriver.getCurrentUrl());
         * */
        return this;
    }
}
