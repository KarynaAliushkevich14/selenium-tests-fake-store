package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.enums.CategoryPageEnum;
import com.example.testelkafakestore.domain.BasePage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoriesPage extends BasePage {

    // fields
    private final DriverManager driverManager;
    private final BrowserActions browserActions;
    private final AllCategoriesPage allCategoriesPage;
    private final JeansCategoryPage jeansCategoryPage;
    private final ShirtsCategoryPage shirtsCategoryPage;
    private final ScarfsCategoryPage scarfsCategoryPage;
    private final TrendsCategoryPage trendsCategoryPage;

    public final String categoriesPageUri = "product-category/most-wanted/";

    // constructor
    @Autowired
    public CategoriesPage(DriverManager driverManager, BrowserActions browserActions, WebDriver localWebDriver,
                          AllCategoriesPage allCategoriesPage, JeansCategoryPage jeansCategoryPage, ShirtsCategoryPage shirtsCategoryPage,
                          ScarfsCategoryPage scarfsCategoryPage, TrendsCategoryPage trendsCategoryPage) {
        super(driverManager, browserActions);
        this.driverManager = driverManager;
        this.browserActions = browserActions;

        this.allCategoriesPage = allCategoriesPage;
        this.jeansCategoryPage = jeansCategoryPage;
        this.shirtsCategoryPage = shirtsCategoryPage;
        this.scarfsCategoryPage = scarfsCategoryPage;
        this.trendsCategoryPage = trendsCategoryPage;
    }


    // methods
    public BasePage goToUrl(String uri) {
        browserActions.goToUrl(uri);
        return this;
    }

    public BasePage redirectToCategory (CategoryPageEnum page, String baseUrl) {
        switch (page) {
            case ALL_CATEGORIES_PAGE:
                goToUrl(allCategoriesPage.uri) ;
                return allCategoriesPage;
            case JEANS_CATEGORIES_PAGE:
                goToUrl(jeansCategoryPage.uri);
                return jeansCategoryPage;
            case SHIRT_CATEGORIES_PAGE:
                goToUrl(shirtsCategoryPage.uri);
                return shirtsCategoryPage;
            case SCARF_CATEGORIES_PAGE:
                goToUrl(scarfsCategoryPage.uri);
                return scarfsCategoryPage;
            case TRENDS_CATEGORIES_PAGE:
                goToUrl(trendsCategoryPage.uri);
                return trendsCategoryPage;
            default:
                return null; // change to exception
        }
    }
}
