package com.example.testelkafakestore.domain;

public abstract class BasePage {

    private final DriverManager driverManager;
    private final BrowserActions browserActions;

    protected String uri; // how to enforce to be this class in sublasses

    protected BasePage(DriverManager driverManager, BrowserActions browserActions) {
        this.driverManager = driverManager;
        this.browserActions = browserActions;
    }

    protected abstract void navigateToPageUrl();
}