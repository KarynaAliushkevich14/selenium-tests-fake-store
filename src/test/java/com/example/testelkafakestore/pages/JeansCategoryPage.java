package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.stereotype.Component;

@Component
public class JeansCategoryPage extends BasePage {
    private final DriverManager driverManager;
    private final BrowserActions browserActions;

    public final String uri = "product-category/jeans/";

    protected JeansCategoryPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);

        this.driverManager = driverManager;
        this.browserActions = browserActions;
    }

    @Override
    protected void navigateToPageUrl() {
        browserActions.goToUrl(uri);
    }
    public void methodFromJeansPage () {
        System.out.println("Method From Jeans Page");
    }
}
