package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.enums.StorePageEnum;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopMainPage extends BasePage {

    private final DriverManager driverManager;
    private final BrowserActions browserActions;
    private final MostWantedPage mostWantedPage;
    private final CategoriesPage categoriesPage;
    private final AboutUsPage aboutUsPage;
    private final ContactPage contactPage;
    private final BlogPage blogPage;

    private final String uri = "";

    @Autowired
    public ShopMainPage(DriverManager driverManager, BrowserActions browserActions, MostWantedPage mostWantedPage,
                        CategoriesPage categoriesPage, AboutUsPage aboutUsPage, ContactPage contactPage, BlogPage blogPage) {
        super(driverManager, browserActions);
        this.driverManager = driverManager;
        this.browserActions = browserActions;

        this.mostWantedPage = mostWantedPage;
        this.categoriesPage = categoriesPage;
        this.aboutUsPage = aboutUsPage;
        this.contactPage = contactPage;
        this.blogPage = blogPage;
    }

    // methods
    public BasePage goToUrl(String uri) {
        browserActions.goToUrl(uri);
        return this;
    }

    public BasePage redirectToChosenPage (StorePageEnum page) {
        switch (page) {
            case Most_Wanted_Page:
                goToUrl(mostWantedPage.uri);
                return mostWantedPage;
            case CategoriesPage:
                goToUrl( categoriesPage.categoriesPageUri);
                return categoriesPage;
            case AboutUsPage:
                goToUrl(aboutUsPage.uri);
                return aboutUsPage;
            case ContactPage:
                goToUrl(contactPage.uri);
                return contactPage;
            case BlogPage:
                goToUrl(blogPage.uri);
                return blogPage;
            default:
                return null; // change to exception
        }
    }
}
