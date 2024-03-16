package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.interfaces.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShopMainPage implements BasePage {

    private final WebDriver localWEbDriver;
    private final WebDriverWait webDriverWait;
    private final MostWantedPage mostWantedPage;
    private final CategoriesPage categoriesPage;
    private final AboutUsPage aboutUsPage;
    private final ContactPage contactPage;
    private final BlogPage blogPage;

    @Autowired
    public ShopMainPage(WebDriver localWEbDriver, WebDriverWait webDriverWait, MostWantedPage mostWantedPage,
                        CategoriesPage categoriesPage, AboutUsPage aboutUsPage, ContactPage contactPage, BlogPage blogPage) {
        this.webDriverWait = webDriverWait;
        this.localWEbDriver = localWEbDriver;
        this.mostWantedPage = mostWantedPage;
        this.categoriesPage = categoriesPage;
        this.aboutUsPage = aboutUsPage;
        this.contactPage = contactPage;
        this.blogPage = blogPage;
    }

    // methods
    public void navigateTo (String baseUrl) {
        localWEbDriver.get(baseUrl);
    }
    public MostWantedPage redirectToMostWantedPage() {
        return mostWantedPage;
    }
    public CategoriesPage redirectToCategoriesPage() {
        return categoriesPage;
    }

    /**
     * TODO
     * 1 way of finding elements on webpage. Initialization of elements during finding on webpage
     * 2 way of finding elements on webpage. Initialization of elements via constructor
     * switch case in case of Categories
     */

}
