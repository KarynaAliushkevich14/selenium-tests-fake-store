package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.Driver;
import com.example.testelkafakestore.domain.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Lazy
public class CategoriesPage extends BasePage {

    private final BrowserActions browserActions;
    private final AllCategoriesPage allCategoriesPage;
    private final JeansCategoryPage jeansCategoryPage;
    private final ShirtsCategoryPage shirtsCategoryPage;
    private final ScarfsCategoryPage scarfsCategoryPage;
    private final TrendsCategoryPage trendsCategoryPage;
    private final PageElements pageElements;

    public final String uri = "";

    @Autowired
    public CategoriesPage(BrowserActions browserActions,
                          AllCategoriesPage allCategoriesPage, JeansCategoryPage jeansCategoryPage, ShirtsCategoryPage shirtsCategoryPage,
                          ScarfsCategoryPage scarfsCategoryPage, TrendsCategoryPage trendsCategoryPage) {
        super(browserActions);
        this.browserActions = browserActions;

        this.allCategoriesPage = allCategoriesPage;
        this.jeansCategoryPage = jeansCategoryPage;
        this.shirtsCategoryPage = shirtsCategoryPage;
        this.scarfsCategoryPage = scarfsCategoryPage;
        this.trendsCategoryPage = trendsCategoryPage;
        this.pageElements = new PageElements();

    }

    @Override
    public void init() {
        PageFactory.initElements(Driver.webDriverInstance, pageElements);
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

    protected class PageElements{
        @FindBy(how = How.XPATH, using = "//div[@id='tyche_products-1']//div[contains(@class, 'owl-item')]")
        private List<WebElement> listOfAllBlackTops;

        @FindBy(how = How.XPATH, using = "//div[@id='tyche_products-2']//div[contains(@class, 'owl-item')]")
        private List<WebElement> listOfHighHeelShoes;

        @FindBy(how = How.XPATH, using = "//div[@id='tyche_products-6']//div[contains(@class, 'owl-item')]")
        private List<WebElement> listOfFeatured;

        @FindBy(how = How.XPATH, using = "//div[@id='tyche_products-7']//div[contains(@class, 'owl-item')]")
        private List<WebElement> listOfTrends;
    }
}
