package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.Driver;
import com.example.testelkafakestore.domain.BasePage;
import com.example.testelkafakestore.serviceHelper.ServiceHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@Lazy
public class JeansCategoryPage extends BasePage {
    private final BrowserActions browserActions;
    private final PageElements pageElements;

    public Double priceOfChosenProduct = 0.00;
    public final String uri = "product-category/jeans/";

    @Autowired
    protected JeansCategoryPage( BrowserActions browserActions) {
        super(browserActions);

        this.browserActions = browserActions;
        this.pageElements = new PageElements();

    }

    @Override
    public void init() {
        PageFactory.initElements(Driver.webDriverInstance, pageElements);
    }

    public JeansCategoryPage addProductWithPositivePriceToCart() {
        for (WebElement item : pageElements.listOfItemsOnPage) {
            try {
                WebElement priceElement = item.findElement(By.xpath(".//span[contains(@class, 'Price-amount')]")); // search for the 'price' element inside of current element
                Double price = ServiceHelper.parseStringToDouble(priceElement.getText());

                if (price > 0) {
                    WebElement addToCartElement = item.findElement(By.xpath(".//a[contains(@class, 'add_to_cart_button')]"));
                    priceOfChosenProduct = price;
                    addToCartElement.click();
                    browserActions.refreshPage();
                    break;
                }
            } catch (NoSuchElementException noSuchElementException) {
                noSuchElementException.getMessage();
            }
        }
        return this;
    }

    // Page Factory
    protected class PageElements {

        @FindBy(how = How.XPATH, using = "//li[contains (@class, 'product_cat-jeans')]")
        private List<WebElement> listOfItemsOnPage;

        @FindBy(how = How.XPATH, using = "//a[contains (@class, 'add_to_cart_button')]")
        private List<WebElement> listOfAddToCartButtons;
    }
}
