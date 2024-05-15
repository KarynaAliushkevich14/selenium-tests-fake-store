package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.stereotype.Component;

@Component
public class MostWantedPage extends BasePage {

    // fields
    public final String uri = "/product-category/most-wanted/";

    protected MostWantedPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);
    }

    public void someMethodInMostWantedPage () {
        System.out.println("MostWantedPage");
    }
}
