package com.example.testelkafakestore.enums;

public enum CategoryProductEnum {
    WINDSURFING("Windsurfing"),
    WSPINACZKA("Wspinaczka"),
    YOGAIPILATES("Yoga i pilates"),
    ZEGLARSTWO("Żeglarstwo");

    private final String description;

    CategoryProductEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
