package com.example.testelkafakestore.domain;


public abstract class BasePage {

    private final DriverManager driverManager;
    private final BrowserActions browserActions;

    protected String uri;


    protected BasePage(DriverManager driverManager, BrowserActions browserActions) {
        this.driverManager = driverManager;
        this.browserActions = browserActions;
    }

    protected void navigateToPageUrl(String uri) {
        browserActions.goToUrl(uri);
    }
}