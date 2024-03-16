package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.interfaces.BasePage;
import org.springframework.stereotype.Component;

@Component
public class JeansCategoryPage implements BasePage {
    @Override
    public void navigateTo(String baseUrl) {
    }

    public void methodFromJeansPage () {
        System.out.println("Method From Jeans Page");
    }
}
