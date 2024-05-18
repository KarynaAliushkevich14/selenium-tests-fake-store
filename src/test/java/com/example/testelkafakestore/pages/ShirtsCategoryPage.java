package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShirtsCategoryPage extends BasePage {
    private final DriverManager driverManager;
    private final BrowserActions browserActions;

    public final String uri = "product-category/shirts/";

    @Autowired
    protected ShirtsCategoryPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);

        this.driverManager = driverManager;
        this.browserActions = browserActions;
    }

    public void MethodFromShirtCategoryPage () {
        System.out.println("Method from shirt category page");
    }
}
