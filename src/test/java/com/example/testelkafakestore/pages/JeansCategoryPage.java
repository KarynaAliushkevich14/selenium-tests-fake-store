package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.stereotype.Component;

@Component
public class JeansCategoryPage extends BasePage {

    public final String uri = "product-category/jeans/";

    protected JeansCategoryPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);
    }

    public void methodFromJeansPage () {
        System.out.println("Method From Jeans Page");
    }
}
