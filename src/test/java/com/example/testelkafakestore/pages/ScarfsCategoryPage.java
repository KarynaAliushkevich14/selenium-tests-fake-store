package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.stereotype.Component;

@Component
public class ScarfsCategoryPage extends BasePage {

    public final String uri = "product-category/scarfs/";

    protected ScarfsCategoryPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);
    }
}
