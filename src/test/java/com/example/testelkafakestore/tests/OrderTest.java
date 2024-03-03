package com.example.testelkafakestore.tests;

import com.example.testelkafakestore.domain.BaseTest;
import com.example.testelkafakestore.pages.BasePage;
import com.example.testelkafakestore.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderTest extends BaseTest {

    private final BasePage basePage;

    @Autowired // обязательно поставь Autowired потому что программа не встшыкнет localWebDriver, MainPage
    public OrderTest (WebDriver localWebDriver, MainPage mainPage) {
        super(localWebDriver);
        this.basePage = mainPage;
    }

    @Test
    public void orderTest() {
        basePage.navigateTo("https://fakestore.testelka.pl/");
        System.out.println("Выполнился orderTest");
    }
}
