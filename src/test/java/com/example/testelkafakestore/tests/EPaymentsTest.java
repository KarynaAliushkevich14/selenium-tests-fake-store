package com.example.testelkafakestore.tests;

import com.example.testelkafakestore.domain.BaseTest;
import com.example.testelkafakestore.pages.ShopMainPage;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class EPaymentsTest extends BaseTest {

    private final ShopMainPage shopMainPage;
    private static final Logger logger = LoggerFactory.getLogger(EPaymentsTest.class);

    @Autowired //Autowired is necessarily, cause program won't inject driverManager, shopMainPage
    public EPaymentsTest(ShopMainPage shopMainPage) {
        this.shopMainPage = shopMainPage;
    }

    @Test
    public void selectProductsAndPayForIt_success() {
        // arrange
        // often in arrange part we pull out some database entities

        // act & assert
        // add product from JeansCategory
        var jeansCategoryPage = shopMainPage
                .goToCurrentPage();
//                .goToCategoriesPage()
//                .goToJeansCategoryPage();
//
//                jeansCategoryPage.addProductWithPositivePriceToCart();
//
//        // add product from MostWantedPage
//        var mostWantedPage = shopMainPage.goToMostWantedPage();
//        Assert.assertEquals(mostWantedPage.getNumberOfTotalProductsExpected, mostWantedPage.getNumberOfTotalProductsActual());
//        Assert.assertEquals(mostWantedPage.getNumberOfTotalProductsExpected, mostWantedPage.getShowingAllResultField());
//
//
//        shopMainPage
//                .goToMostWantedPage()
//                .addProductWithPositivePriceToCart();
//
//        // pay for products
//        var shoppingCartPage=  shopMainPage.goToShoppingCartPage();
//        Double summaryPriceFromProductCategories = jeansCategoryPage.priceOfChosenProduct + mostWantedPage.priceOfChosenProduct;
//        Double summaryPriceFromShoppingCart = shoppingCartPage.summaryPriceOfAllProductsInCart();
//
//        Assert.assertEquals(summaryPriceFromShoppingCart, summaryPriceFromProductCategories);

        // assert
        // often in assert part we check status of database entities
    }

    @Test
    public void selectProductsAndPayForIt_successt() {
        // arrange
        // often in arrange part we pull out some database entities

        // act & assert
        // add product from JeansCategory
        var jeansCategoryPage = shopMainPage
                .goToCurrentPage()
                .goToCategoriesPage();
    }

}
