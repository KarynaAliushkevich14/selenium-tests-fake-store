package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.interfaces.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MostWantedPage implements BasePage {

    // fields
    private final WebDriver localDriver;
    private final WebDriverWait webDriverWait;
    public final String url = "/product-category/most-wanted/";

    // constructor
    @Autowired
    public MostWantedPage (WebDriver localDriver, WebDriverWait webDriverWait) {
        this.localDriver = localDriver;
        this.webDriverWait = webDriverWait;

    }

    public void someMethodInMostWantedPage () {
        System.out.println("MostWantedPage");
    }
}
