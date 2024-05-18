package com.example.testelkafakestore.tests;

import com.example.testelkafakestore.domain.BaseTest;
import com.example.testelkafakestore.domain.DriverManager;
import com.example.testelkafakestore.pages.ShopMainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EPaymentsTest extends BaseTest {
    private final DriverManager driverManager;
    private final ShopMainPage shopMainPage;

    @Autowired //Autowired is necessarily, cause program won't inject driverManager, shopMainPage
    public EPaymentsTest(DriverManager driverManager, ShopMainPage shopMainPage) {
        super(driverManager);
        this.driverManager = driverManager;

        this.shopMainPage = shopMainPage;
    }

    @Test
    public void selectProductAndPayForIt_success() {
        shopMainPage
                .goToCurrentPage()
                .goToCategoriesPage()
                .goToJeansCategoryPage()
                .addProductWithPositivePriceToCart();

    }
}
