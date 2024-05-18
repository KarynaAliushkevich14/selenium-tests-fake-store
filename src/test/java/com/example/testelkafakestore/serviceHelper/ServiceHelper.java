package com.example.testelkafakestore.serviceHelper;

public class ServiceHelper {

    public static Double parsePrice(String textPrice) {
        String priceWithDigitals = textPrice.replaceAll("[^0-9,.]", "").replace(",", ".");
        return Double.parseDouble(priceWithDigitals);
    }
}
