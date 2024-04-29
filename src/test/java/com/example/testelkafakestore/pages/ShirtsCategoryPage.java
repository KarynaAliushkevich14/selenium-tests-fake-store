package com.example.testelkafakestore.pages;

import com.example.testelkafakestore.interfaces.BasePage;
import org.springframework.stereotype.Component;

@Component
public class ShirtsCategoryPage implements BasePage {

    public void MethodFromShirtCategoryPage () {
        System.out.println("Method from shirt category page");
    }
}
