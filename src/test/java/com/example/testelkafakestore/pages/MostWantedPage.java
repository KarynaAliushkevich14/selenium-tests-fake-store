package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MostWantedPage extends BasePage {

    private final DriverManager driverManager;
    private final BrowserActions browserActions;

    public final String uri = "/product-category/most-wanted/";

    @Autowired
    protected MostWantedPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);

        this.driverManager = driverManager;
        this.browserActions = browserActions;
    }

    public void someMethodInMostWantedPage () {
        System.out.println("MostWantedPage");
    }
}
