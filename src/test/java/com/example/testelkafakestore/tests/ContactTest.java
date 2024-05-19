package com.example.testelkafakestore.tests;
import com.example.testelkafakestore.domain.BaseTest;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.pages.AboutUsPage;
import com.example.testelkafakestore.pages.ShopMainPage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class ContactTest extends BaseTest {
    private final DriverManager driverManager;
    private final ShopMainPage shopMainPage;
    private final AboutUsPage aboutUsPage;

    @Autowired
    public ContactTest(DriverManager driverManager, ShopMainPage shopMainPage, AboutUsPage aboutUsPage) {
        super(driverManager);
        this.driverManager = driverManager;
        this.shopMainPage = shopMainPage;
        this.aboutUsPage = aboutUsPage;
    }

    @Test
    public void contactUs_success() {
        // arrange

        // act
        shopMainPage
                .goToAboutUsPage()
                .fullFillContactForm();

        // assert
        Assert.assertEquals(aboutUsPage.getGiveUsCallNumberExpected, aboutUsPage.getGiveUsCallNumberActual());
        Assert.assertEquals(aboutUsPage.getOurLocationExpected, aboutUsPage.getGetOurLocationActual());
    }
}
