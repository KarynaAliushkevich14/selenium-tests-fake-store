package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class AccountPage extends BasePage {

    private final BrowserActions browserActions;
    private final String uri = "my-account/";

    @Autowired
    protected AccountPage(BrowserActions browserActions) {
        super(browserActions);

        this.browserActions = browserActions;
    }
}
