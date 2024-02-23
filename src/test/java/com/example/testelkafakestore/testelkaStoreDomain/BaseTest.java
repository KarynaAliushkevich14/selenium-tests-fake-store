package com.example.testelkafakestore.testelkaStoreDomain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;


@SpringBootTest
public abstract class BaseTest {

    @Autowired
    private WebDriver localDriver;

    @BeforeEach
    public void setUp() {
        localDriver.manage().window().maximize();
        System.out.println("Выполнился setUp");
    }

    @AfterEach
    public void tearDown() {
    }
}
