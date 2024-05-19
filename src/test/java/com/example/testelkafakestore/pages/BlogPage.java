package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlogPage extends BasePage {
    private final DriverManager driverManager;
    private final BrowserActions browserActions;
    private final PageElements pageElements;

    public final String uri = "/product-category/most-wanted/";

    @Autowired
    protected BlogPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);

        this.driverManager = driverManager;
        this.browserActions = browserActions;
        this.pageElements = new PageElements();

        Init();
    }

    protected void Init() {
        PageFactory.initElements(driverManager.localWebDriver, pageElements);
    }

    protected class PageElements{

        @FindBy(how = How.CSS, using = "#primary.content-area form[role='search'] input[type='search'][class='search-field']")
        private WebElement searchField;

        @FindBy(how = How.XPATH, using = "//div[@id='primary']//input[@type='submit']")
        private WebElement searchButton;

        @FindBy(how = How.XPATH, using = "//div[@id='recent-posts-2']//li")
        private List<WebElement> recentPosts;

        @FindBy(how = How.XPATH, using = "//div[@id='recent-comments-2']//li")
        private List<WebElement> recentComments;

        @FindBy(how = How.XPATH, using = "//div[@id='archives-2']//li")
        private List<WebElement> archives;
    }
}
