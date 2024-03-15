package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.interfaces.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopMainPage implements BasePage {

    private final WebDriver localWEbDriver;
    private final WebDriverWait webDriverWait;
    private final MostWantedPage mostWantedPage;

    @Autowired
    public ShopMainPage(WebDriver localWEbDriver, WebDriverWait webDriverWait, MostWantedPage mostWantedPage) {
        this.webDriverWait = webDriverWait;
        this.localWEbDriver = localWEbDriver;
        this.mostWantedPage = mostWantedPage;
    }

    // methods
    public void navigateTo (String baseUrl) {
        localWEbDriver.get(baseUrl);
    }
    public MostWantedPage redirectToMostWantedPage() {
        return mostWantedPage;
    }

    /**
     * TODO
     * 1 way of finding elements on webpage. Initialization of elements during finding on webpage
     * 2 way of finding elements on webpage. Initialization of elements via constructor
     * switch case in case of Categories
     */

}
