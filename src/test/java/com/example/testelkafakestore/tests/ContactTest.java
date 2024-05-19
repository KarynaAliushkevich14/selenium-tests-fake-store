package com.example.testelkafakestore.tests;
import com.example.testelkafakestore.domain.BaseTest;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.pages.AboutUsPage;
import com.example.testelkafakestore.pages.AllCategoriesPage;
import com.example.testelkafakestore.pages.ShopMainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;


public class ContactTest extends BaseTest {
    private final DriverManager driverManager;
    private final ShopMainPage shopMainPage;
    private final AboutUsPage aboutUsPage;
    private final AllCategoriesPage allCategoriesPage;

    @Autowired
    public ContactTest(DriverManager driverManager, ShopMainPage shopMainPage, AboutUsPage aboutUsPage, AllCategoriesPage allCategoriesPage) {
        super(driverManager);
        this.driverManager = driverManager;
        this.shopMainPage = shopMainPage;
        this.aboutUsPage = aboutUsPage;
        this.allCategoriesPage = allCategoriesPage;
    }

    @Test
    public void contactUs_success() {
        // act
        shopMainPage
                .goToAboutUsPage()
                .fillContactForm();

        // assert
        Assert.assertEquals(aboutUsPage.getGiveUsCallNumberExpected, aboutUsPage.getGiveUsCallNumberActual());
        Assert.assertEquals(aboutUsPage.getOurLocationExpected, aboutUsPage.getGetOurLocationActual());
    }
}
