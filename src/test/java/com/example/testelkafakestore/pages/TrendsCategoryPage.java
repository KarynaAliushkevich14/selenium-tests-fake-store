package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import com.example.testelkafakestore.serviceHelper.ServiceHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrendsCategoryPage extends BasePage {
    private final DriverManager driverManager;
    private final BrowserActions browserActions;
    private final PageElements pageElements;

    public final Integer getNumberOfTotalProductsExpected = 4;
    public final String uri = "product-category/trends/";

    @Autowired
    protected TrendsCategoryPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);

        this.driverManager = driverManager;
        this.browserActions = browserActions;
        this.pageElements = new PageElements();

        Init();
    }

    public Integer getNumberOfTotalProductsActual() {
        return pageElements.listOfAllProducts.size();
    }
    public Integer getShowingAllResultField() {
        return ServiceHelper.parseStringToInteger(pageElements.showingAllResultsField.getText());
    }

    protected void Init() {
        PageFactory.initElements(driverManager.localWebDriver, pageElements);
    }

    protected class PageElements{

        @FindBy(how = How.XPATH, using = "//li[contains(@class, 'type-product')]")
        List<WebElement> listOfAllProducts;

        @FindBy(how = How.CSS, using = "select[name='orderby'] > option") // css selector: select[name='orderby']
        private List<WebElement> sortOptions;

        @FindBy(how = How.CLASS_NAME, using = "woocommerce-result-count")
        private WebElement showingAllResultsField;
    }
}
