package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.Driver;
import com.example.testelkafakestore.domain.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
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
public class AllCategoriesPage extends BasePage {
    private final BrowserActions browserActions;
    private final PageElements pageElements;

    public final String uri = "shop/";

    @Autowired
    protected AllCategoriesPage(BrowserActions browserActions) {
        super(browserActions);

        this.browserActions = browserActions;
        this.pageElements = new PageElements();

    }

    public AllCategoriesPage sortItemsByPopularity () {
        try {
            for (WebElement option : pageElements.sortOptions) {
                WebElement ul = option.findElement(By.xpath("//option/ancestor::select[contains(@class, 'orderby')]")); // find specific ancestor
                ul.click();
                String value = option.getAttribute("value");
                if (option.getAttribute("value").equals("rating")) {
                    option.click();
                    break;
                }
            }
        } catch (NoSuchElementException | TimeoutException ex) {
            ex.printStackTrace();
        }
        return this;
    }

    @Override
    public void init() {
        PageFactory.initElements(Driver.webDriverInstance, pageElements);
    }

    protected class PageElements{
        @FindBy(how = How.CSS, using = ".product-category.product") // in html: <li class="product-category product first">
        private List<WebElement> listOfAllCategories;

        @FindBy(how = How.CSS, using = "select[name='orderby'] > option") // css selector: select[name='orderby']
        private List<WebElement> sortOptions;

        @FindBy(how = How.XPATH, using = "//ul[@class='tyche-pager']/li")
        private List<WebElement> pages;

        @FindBy(how = How.CLASS_NAME, using = "type-product")
        private List<WebElement> otherItems;
    }
}
