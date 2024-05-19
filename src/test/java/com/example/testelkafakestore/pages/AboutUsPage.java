package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.domain.BrowserActions;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.domain.BasePage;
import com.example.testelkafakestore.serviceHelper.WebElementExtension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AboutUsPage extends BasePage {
    private final DriverManager driverManager;
    private final BrowserActions browserActions;
    private final PageElements pageElements;

    public final String uri = "test-contact-blablabla/";
    public final String getGiveUsCallNumberExpected = "696 678 987";
    public final String getOurLocationExpected = "Legnicka 12";

    @Autowired
    protected AboutUsPage(DriverManager driverManager, BrowserActions browserActions) {
        super(driverManager, browserActions);

        this.driverManager = driverManager;
        this.browserActions = browserActions;
        this.pageElements = new PageElements();

        Init();
    }

    protected void Init () {
        PageFactory.initElements(driverManager.localWebDriver, pageElements);
    }

    public AboutUsPage fullFillContactForm() {
        waitUntilAllWebElementsToBeClickable();

        pageElements.yourName.sendKeys("Sam");
        pageElements.yourEmail.sendKeys("samtest@mailtest.com");
        pageElements.subject.sendKeys("Acknowledgements");
        pageElements.yourMessage.sendKeys("Words cannot express my gratitude to my professor and chair of my committee for her invaluable patience and feedback.");
        pageElements.sendButton.click();
        return this;
    }

    public String getGiveUsCallNumberActual() {
        return pageElements.giveUsCallNumber.getText();
    }
    public String getGetOurLocationActual() {
        return pageElements.ourLocation.getText();
    }

    private void waitUntilAllWebElementsToBeClickable() {
        WebElementExtension.waitForElementToBeClickable(driverManager, pageElements.yourName);
        WebElementExtension.waitForElementToBeClickable(driverManager, pageElements.yourEmail);
        WebElementExtension.waitForElementToBeClickable(driverManager, pageElements.subject);
        WebElementExtension.waitForElementToBeClickable(driverManager, pageElements.yourMessage);
        WebElementExtension.waitForElementToBeClickable(driverManager, pageElements.sendButton);
    }

    protected class PageElements {

        @FindBy(how = How.NAME, using = "your-name") // css selector: [name='your-name']
        private WebElement yourName;

        @FindBy(how = How.NAME, using = "your-email")
        private WebElement yourEmail;

        @FindBy(how = How.NAME, using = "your-subject")
        private WebElement subject;

        @FindBy(how = How.NAME, using = "your-message")
        private WebElement yourMessage;

        @FindBy(how = How.CSS, using = "[type='submit'][value='Send']")
        private WebElement sendButton;


        @FindBy(how = How.XPATH, using = "//div[@class='text'][contains(text(), 'GIVE US A CALL')]/span")
        private WebElement giveUsCallNumber;

        @FindBy(how = How.XPATH, using = "//div[@class='text'][contains(text(), 'OUR LOCATION')]/span")
        private WebElement ourLocation;
    }
}
