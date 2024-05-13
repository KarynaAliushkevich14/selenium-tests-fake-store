package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.enums.CategoryPageEnum;
import com.example.testelkafakestore.interfaces.BasePage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoriesPage implements BasePage {

    // fields
    private final WebDriver localWebDriver;
    private final AllCategoriesPage allCategoriesPage;
    private final JeansCategoryPage jeansCategoryPage;
    private final ShirtsCategoryPage shirtsCategoryPage;
    private final ScarfsCategoryPage scarfsCategoryPage;
    private final TrendsCategoryPage trendsCategoryPage;
    public final String categoriesPageUrl = "/product-category/most-wanted/";

    // constructor
    @Autowired
    public CategoriesPage(WebDriver localWebDriver, AllCategoriesPage allCategoriesPage, JeansCategoryPage jeansCategoryPage, ShirtsCategoryPage shirtsCategoryPage,
                          ScarfsCategoryPage scarfsCategoryPage, TrendsCategoryPage trendsCategoryPage) {
        this.localWebDriver = localWebDriver;
        this.allCategoriesPage = allCategoriesPage;
        this.jeansCategoryPage = jeansCategoryPage;
        this.shirtsCategoryPage = shirtsCategoryPage;
        this.scarfsCategoryPage = scarfsCategoryPage;
        this.trendsCategoryPage = trendsCategoryPage;
    }

    // methods
    public void navigateTo (String baseUrl) {
        localWebDriver.get(baseUrl);
    }

    public BasePage redirectToCategory (CategoryPageEnum page, String baseUrl) {
        switch (page) {
            case ALL_CATEGORIES_PAGE:
                navigateTo(baseUrl + allCategoriesPage.url);
                return allCategoriesPage;
            default: return null; // change to exception
        }
    }
}
