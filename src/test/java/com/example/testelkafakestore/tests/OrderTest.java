package com.example.testelkafakestore.tests;

import com.example.testelkafakestore.domain.BaseTest;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.enums.Constants;
import com.example.testelkafakestore.enums.StorePageEnum;
import com.example.testelkafakestore.pages.ShopMainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderTest extends BaseTest {
    private final DriverManager driverManager;
    private final ShopMainPage shopMainPage;

    @Autowired // обязательно поставь Autowired потому что программа не встшыкнет driverManager, MainPage
    public OrderTest(DriverManager driverManager, ShopMainPage shopMainPage) {
        super(driverManager);
        this.driverManager = driverManager;
        this.shopMainPage = shopMainPage;
    }

    @Test
    public void orderTest() {
        shopMainPage.navigateTo(Constants.BASE_URL);
        shopMainPage
                .redirectToChosenPage(StorePageEnum.CategoriesPage, Constants.BASE_URL);
        //driverManager.localWebDriver.
    }
}
