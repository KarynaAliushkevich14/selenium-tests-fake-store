package com.example.testelkafakestore.serviceHelper;

public class ServiceHelper {

    public static Double parseStringToDouble(String textPrice) {
        String priceWithDigitals = textPrice.replaceAll("[^0-9,.]", "").replace(",", ".");
        return Double.parseDouble(priceWithDigitals);
    }

    public static Integer parseStringToInteger(String textPrice) {
        String priceWithDigitals = textPrice.replaceAll("[^0-9,.]", "").replace(",", ".");
        return Integer.valueOf(priceWithDigitals);
    }
}
