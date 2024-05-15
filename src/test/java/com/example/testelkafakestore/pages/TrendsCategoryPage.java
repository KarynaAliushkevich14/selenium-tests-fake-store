package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.stereotype.Component;

@Component
public class TrendsCategoryPage extends BasePage {

    public final String uri = "product-category/trends/";

    protected TrendsCategoryPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);
    }
}
