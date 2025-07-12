package com.example.testelkafakestore.tests;

import com.example.testelkafakestore.domain.BaseTest;
import com.example.testelkafakestore.enums.CategoryProductEnum;
import com.example.testelkafakestore.pages.SklepPage;
import com.example.testelkafakestore.pages.SomeTestPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;

@ActiveProfiles("fakestore")
public class FakeStoreTests extends BaseTest {

    // fields
    private final SklepPage sklepPage;
    private final SomeTestPage someTestPage;

    // constructor
    @Autowired
    public FakeStoreTests(SklepPage sklepPage, SomeTestPage someTestPage) {
        this.sklepPage = sklepPage;
        this.someTestPage = someTestPage;
    }

    // tests
    @Test
    public void testSklepPageTitle() {
        // act
        sklepPage
                .goToCurrentPage()
                .selectWindsurfingUnderAmount(new BigDecimal(3400.00));
    }

    @Test
    public void testSklepPageTitle2() {
        // act
        someTestPage
                .goToCurrentPage()
                .selectWindsurfingUnderAmount(new BigDecimal(3400.00));
    }
}
