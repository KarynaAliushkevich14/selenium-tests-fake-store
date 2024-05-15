package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.stereotype.Component;

@Component
public class ShirtsCategoryPage extends BasePage {

    public final String uri = "product-category/shirts/";

    protected ShirtsCategoryPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);
    }

    public void MethodFromShirtCategoryPage () {
        System.out.println("Method from shirt category page");
    }
}
