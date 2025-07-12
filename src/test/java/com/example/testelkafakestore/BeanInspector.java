package com.example.testelkafakestore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanInspector {

    public static void main(String[] args) {
        // Load the Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.example.testelkafakestore");
        context.refresh();

        // Retrieve all bean names
        String[] beanNames = context.getBeanDefinitionNames();

        // Print each bean name
        System.out.println("Beans in the context:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        // Close the context
        context.close();
    }
}