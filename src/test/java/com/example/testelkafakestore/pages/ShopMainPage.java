package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopMainPage extends BasePage {

    private final BrowserActions browserActions;

    private final MostWantedPage mostWantedPage;
    private final CategoriesPage categoriesPage;
    private final AboutUsPage aboutUsPage;
    private final BlogPage blogPage;
    private final ShoppingCartPage shoppingCartPage;

    private final String uri = "";

    @Autowired
    public ShopMainPage(BrowserActions browserActions, MostWantedPage mostWantedPage,
                        CategoriesPage categoriesPage, AboutUsPage aboutUsPage, BlogPage blogPage, ShoppingCartPage shoppingCartPage) {
        super(browserActions);
        this.browserActions = browserActions;

        this.mostWantedPage = mostWantedPage;
        this.categoriesPage = categoriesPage;
        this.aboutUsPage = aboutUsPage;
        this.blogPage = blogPage;
        this.shoppingCartPage = shoppingCartPage;
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

    public ShoppingCartPage goToShoppingCartPage() {
        navigateToPageUrl(shoppingCartPage.uri);
        return shoppingCartPage;
    }
}
