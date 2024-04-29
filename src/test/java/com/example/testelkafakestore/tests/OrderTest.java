package com.example.testelkafakestore.tests;

import com.example.testelkafakestore.domain.BaseTest;
import com.example.testelkafakestore.enums.StorePage;
import com.example.testelkafakestore.pages.ShopMainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderTest extends BaseTest {

    private final ShopMainPage shopMainPage;
    private final static String BASE_URL = "https://skleptest.pl/";

    @Autowired // обязательно поставь Autowired потому что программа не встшыкнет localWebDriver, MainPage
    public OrderTest (WebDriver localWebDriver, ShopMainPage shopMainPage) {
        super(localWebDriver);
        this.shopMainPage = shopMainPage;
    }

    @Test
    public void orderTest() {
        shopMainPage.navigateTo(BASE_URL);
        shopMainPage
                .redirectToChosenPage(StorePage.MostWantedPage, BASE_URL);
    }
}
