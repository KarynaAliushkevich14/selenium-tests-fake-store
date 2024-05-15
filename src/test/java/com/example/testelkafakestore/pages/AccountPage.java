package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.stereotype.Component;

@Component
public class AccountPage extends BasePage {

    protected AccountPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);
    }

}
