package com.example.testelkafakestore.domain;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BasePage {

    private final BrowserActions browserActions;

    protected String uri;

    @Autowired
    protected BasePage(BrowserActions browserActions) {
        this.browserActions = browserActions;
    }

    public abstract void init();

    protected void navigateToPageUrl(String uri) {
        browserActions.goToUrl(uri);
    }
}