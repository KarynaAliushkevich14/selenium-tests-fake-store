package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartPage extends BasePage {
    private final DriverManager driverManager;
    private final BrowserActions browserActions;

    protected ShoppingCartPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);

        this.driverManager = driverManager;
        this.browserActions = browserActions;
    }
    @Override
    protected void navigateToPageUrl() {
        browserActions.goToUrl(uri);
    }
}
