package com.example.testelkafakestore.domain;

import com.example.testelkafakestore.enums.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class BrowserActions {

    private final String baseUrl;

    @Autowired
    public BrowserActions() {
        this.baseUrl = Constants.BASE_URL;
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
