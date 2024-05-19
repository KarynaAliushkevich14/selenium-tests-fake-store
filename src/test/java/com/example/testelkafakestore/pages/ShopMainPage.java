package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
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
    private final BlogPage blogPage;

    private final String uri = "";

    @Autowired
    public ShopMainPage(DriverManager driverManager, BrowserActions browserActions, MostWantedPage mostWantedPage,
                        CategoriesPage categoriesPage, AboutUsPage aboutUsPage, BlogPage blogPage) {
        super(driverManager, browserActions);
        this.driverManager = driverManager;
        this.browserActions = browserActions;

        this.mostWantedPage = mostWantedPage;
        this.categoriesPage = categoriesPage;
        this.aboutUsPage = aboutUsPage;
        this.blogPage = blogPage;
    }

    public ShopMainPage goToCurrentPage() {
        navigateToPageUrl(uri);
        return this;
    }

    public MostWantedPage goToMostWantedPage() {
        navigateToPageUrl(mostWantedPage.uri);
        return mostWantedPage;
    }

    public CategoriesPage goToCategoriesPage() {
        navigateToPageUrl(categoriesPage.uri);
        return categoriesPage;
    }

    public AboutUsPage goToAboutUsPage() {
        navigateToPageUrl(aboutUsPage.uri);
        return aboutUsPage;
    }

    public BlogPage goToBlogPage() {
        navigateToPageUrl(blogPage.uri);
        return blogPage;
    }
}
