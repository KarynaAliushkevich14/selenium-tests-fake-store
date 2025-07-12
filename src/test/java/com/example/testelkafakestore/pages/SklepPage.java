package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BasePage;
import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.Driver;
import com.example.testelkafakestore.enums.CategoryProductEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Lazy
public class SklepPage extends BasePage {

    private final String uri = "/shop";
    private final String productCategories = ".//li[contains(@class, 'product-category product')]";
    private final BrowserActions browserActions;

    @FindBy(how = How.XPATH, using = ".//h1[text()='Sklep']")
    private WebElement pageTitle;

    @FindBy(how = How.XPATH, using = ".//span[@class='price']")
    private List<WebElement> windsurfingProducts;


    // constructor
    @Autowired
    public SklepPage(BrowserActions browserActions) {
        super(browserActions);
        this.browserActions = browserActions;

    }

    @Override
    public void init() {
        PageFactory.initElements(Driver.webDriverInstance, this);
    }

    public SklepPage goToCurrentPage() {
        navigateToPageUrl(uri);
        return this;
    }

    public List<WebElement> selectWindsurfingUnderAmount (BigDecimal amount) {
        goToProductCategory(CategoryProductEnum.WINDSURFING.getDescription());

        List<WebElement> filteredProducts = windsurfingProducts.stream()
                .filter(item -> {
                    try {
                        String cleanedText = item.getText()
                                .replaceAll("[^\\d,]", "")
                                .replace(",", ".")
                                .trim();
                        BigDecimal productValue = new BigDecimal(cleanedText);
                        return productValue.compareTo(amount) < 0;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .toList();

        return filteredProducts;
    }

    private void goToProductCategory(String categoryName) {
        String productCategoryXPath = String.format("%s/a[contains(@aria-label, '%s')]", productCategories, categoryName);

        WebElement productCategoryElement = Driver.webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(productCategoryXPath)));
        productCategoryElement.click();
    }
}

