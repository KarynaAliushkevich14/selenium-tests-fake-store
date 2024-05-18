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

    @Override
    public void navigateToPageUrl() {
        browserActions.goToUrl(uri);
    }

    public MostWantedPage goToMostWantedPage() {
        browserActions
                .goToUrl(mostWantedPage.uri);
        return mostWantedPage;
    }
    public CategoriesPage goToCategoriesPage() {
        browserActions
                .goToUrl(categoriesPage.uri);
        return categoriesPage;
    }
    public AboutUsPage goToAboutUsPage() {
        browserActions
                .goToUrl(aboutUsPage.uri);
        return aboutUsPage;
    }
    public ContactPage goToContactPage() {
        browserActions
                .goToUrl(contactPage.uri);
        return contactPage;
    }
    public BlogPage goToBlogPage() {
        browserActions
                .goToUrl(blogPage.uri);
        return blogPage;
    }
}
