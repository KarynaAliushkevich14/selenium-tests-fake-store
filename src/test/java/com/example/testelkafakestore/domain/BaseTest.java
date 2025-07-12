package com.example.testelkafakestore.domain;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;

import java.util.List;


@SpringBootTest
public abstract class BaseTest {

    protected Driver driverInstance;

    @Autowired
    private List<BasePage> allPages;


    @BeforeEach
    public void setUp() {
        // Create a new Driver instance
        driverInstance = new Driver();
        driverInstance.Initialize();

        Driver.webDriverInstance.manage().window().maximize();
        System.out.println("SetUp successfully executed");

        // inicjowanie eleentów na stronie
        allPages.forEach(BasePage::init);

        // Set up RestAssured base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }

    @AfterEach
    public void tearDown() {
        if (Driver.webDriverInstance != null) {
            Driver.webDriverInstance.quit();
        }
        System.out.println("TearDown successfully executed");
    }
}
