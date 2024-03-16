package com.example.testelkafakestore.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoriesPage {

    // fields
    private final AllCategoriesPage allCategoriesPage;
    private final JeansCategoryPage jeansCategoryPage;
    private final ShirtsCategoryPage shirtsCategoryPage;
    private final ScarfsCategoryPage scarfsCategoryPage;
    private final TrendsCategoryPage trendsCategoryPage;

    // constructor
    @Autowired
    public CategoriesPage (AllCategoriesPage allCategoriesPage, JeansCategoryPage jeansCategoryPage, ShirtsCategoryPage shirtsCategoryPage,
                           ScarfsCategoryPage scarfsCategoryPage, TrendsCategoryPage trendsCategoryPage) {
        this.allCategoriesPage = allCategoriesPage;
        this.jeansCategoryPage = jeansCategoryPage;
        this.shirtsCategoryPage = shirtsCategoryPage;
        this.scarfsCategoryPage = scarfsCategoryPage;
        this.trendsCategoryPage = trendsCategoryPage;
    }

    // methods
    public AllCategoriesPage redirectToAllCategoriesPage(){
        return allCategoriesPage;
    }
    public JeansCategoryPage redirectToJeansCategoryPage(){
        return jeansCategoryPage;
    }
    public ShirtsCategoryPage redirectToShirtCategoryPage(){
        return shirtsCategoryPage;
    }
    public ScarfsCategoryPage redirectToScarfCategoryPage(){
        return scarfsCategoryPage;
    }
    public TrendsCategoryPage redirectToTrendsCategoryPage(){
        return trendsCategoryPage;
    }
}
