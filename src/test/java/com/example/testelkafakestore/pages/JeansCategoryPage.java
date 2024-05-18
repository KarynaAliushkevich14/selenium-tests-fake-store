package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import com.example.testelkafakestore.serviceHelper.ServiceHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JeansCategoryPage extends BasePage {
    private final DriverManager driverManager;
    private final BrowserActions browserActions;
    private final PageElements pageElements;

    public final String uri = "product-category/jeans/";

    @Autowired
    protected JeansCategoryPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);

        this.driverManager = driverManager;
        this.browserActions = browserActions;
        this.pageElements = new PageElements();

        Init(pageElements);
    }

    public void Init(PageElements elements) {
        PageFactory.initElements(driverManager.localWebDriver, elements);
    }

    public JeansCategoryPage addProductWithPositivePriceToCart() {
        for (WebElement item : pageElements.listOfItemsOnPage) {
            WebElement priceElement = item.findElement(By.xpath(".//span[contains(@class, 'Price-amount')]")); // search for the 'price' element inside of current element
            Double price = ServiceHelper.parsePrice(priceElement.getText());

        }
        return this;
    }

    // Page Object Pattern
    protected class PageElements {

        @FindBy(how = How.XPATH, using = "//li[contains (@class, 'product_cat-jeans')]")
        private List<WebElement> listOfItemsOnPage;

        @FindBy(how = How.XPATH, using = "//a[contains (@class, 'add_to_cart_button')]")
        private List<WebElement> listOfAddToCartButtons;
    }
}
