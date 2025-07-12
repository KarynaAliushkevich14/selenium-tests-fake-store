package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.Driver;
import com.example.testelkafakestore.domain.BasePage;
import com.example.testelkafakestore.serviceHelper.ServiceHelper;
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
public class ScarfsCategoryPage extends BasePage {
    private final BrowserActions browserActions;
    private final PageElements pageElements;

    public final Integer getNumberOfTotalProductsExpected = 3;
    public final String uri = "product-category/scarfs/";

    @Autowired
    protected ScarfsCategoryPage(BrowserActions browserActions) {
        super(browserActions);

        this.browserActions = browserActions;
        this.pageElements = new PageElements();

    }

    public Integer getNumberOfTotalProductsActual() {
        return pageElements.listOfAllProducts.size();
    }
    public Integer getShowingAllResultField() {
        return ServiceHelper.parseStringToInteger(pageElements.showingAllResultsField.getText());
    }

    @Override
    public void init() {
        PageFactory.initElements(Driver.webDriverInstance, pageElements);
    }

    protected class PageElements{

        @FindBy(how = How.XPATH, using = "//li[contains(@class, 'product_cat-scarfs')]")
        List<WebElement> listOfAllProducts;

        @FindBy(how = How.CSS, using = "select[name='orderby'] > option") // css selector: select[name='orderby']
        private List<WebElement> sortOptions;

        @FindBy(how = How.CLASS_NAME, using = "woocommerce-result-count")
        private WebElement showingAllResultsField;
    }
}
