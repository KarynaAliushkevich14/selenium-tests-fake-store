package com.example.testelkafakestore.domain;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public abstract class BaseTest {

    protected Driver driverInstance;

    @BeforeEach
    public void setUp() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerBean(Driver.class);
        context.refresh();

        driverInstance = context.getBean(Driver.class);
        driverInstance.Initialize();


        Driver.webDriverInstance.manage().window().maximize();
        System.out.println("SetUp successfully executed");

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }

    @AfterEach
    public void tearDown() {
        Driver.webDriverInstance.quit();
    }
}
