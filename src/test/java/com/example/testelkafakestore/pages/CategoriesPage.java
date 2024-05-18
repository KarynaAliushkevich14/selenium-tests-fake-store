package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
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

    public final String uri = "product-category/most-wanted/";

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

    @Override
    protected void navigateToPageUrl() {
        browserActions.goToUrl(uri);
    }

    public AllCategoriesPage goToAllCategoriesPage() {
        browserActions
                .goToUrl(allCategoriesPage.uri);
        return allCategoriesPage;
    }
    public JeansCategoryPage goToJeansCategoryPage() {
        browserActions
                .goToUrl(jeansCategoryPage.uri);
        return jeansCategoryPage;
    }
    public ShirtsCategoryPage goToShirtsCategoryPage() {
        browserActions
                .goToUrl(shirtsCategoryPage.uri);
        return shirtsCategoryPage;
    }
    public ScarfsCategoryPage goToScarfsCategoryPage() {
        browserActions
                .goToUrl(scarfsCategoryPage.uri);
        return scarfsCategoryPage;
    }
    public TrendsCategoryPage goToTrendsCategoryPage() {
        browserActions
                .goToUrl(trendsCategoryPage.uri);
        return trendsCategoryPage;
    }
}
