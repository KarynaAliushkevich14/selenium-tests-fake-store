package com.example.testelkafakestore.domain;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource({"classpath:application-fakestore.properties"})
@ComponentScan(basePackages = "java")

public class SpringConfiguration {

}

