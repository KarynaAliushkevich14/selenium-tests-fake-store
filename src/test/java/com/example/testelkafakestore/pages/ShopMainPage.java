package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.enums.StorePageEnum;
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
    private final CategoriesPage categoriesPage;
    private final AboutUsPage aboutUsPage;
    private final ContactPage contactPage;
    private final BlogPage blogPage;

    /**
     * Main Page in store with dependencies to
     */
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

    public BasePage redirectToChosenPage (StorePageEnum page, String baseUrl) {
        switch (page) {
            case Most_Wanted_Page:
                navigateTo(baseUrl + mostWantedPage.url);
                return mostWantedPage;
            case CategoriesPage:
                navigateTo(baseUrl + categoriesPage.categoriesPageUrl);
                return categoriesPage;
            case AboutUsPage:
                navigateTo(baseUrl + aboutUsPage.url);
                return aboutUsPage;
            case ContactPage:
                navigateTo(baseUrl + contactPage.url);
                return contactPage;
            case BlogPage:
                navigateTo(baseUrl + blogPage.url);
                return blogPage;
            default:
                return null; // change to exception
        }
    }
}
