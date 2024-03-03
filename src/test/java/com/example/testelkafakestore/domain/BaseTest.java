package com.example.testelkafakestore.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;


@SpringBootTest
public abstract class BaseTest {

    private final WebDriver localWebDriver;

    @Autowired
    public BaseTest (WebDriver localWebdriver) {
        this.localWebDriver = localWebdriver;
    }

    @BeforeEach
    public void setUp() {
        localWebDriver.manage().window().maximize();
        System.out.println("Выполнился setUp");
    }

    @AfterEach
    public void tearDown() {
    }
}
