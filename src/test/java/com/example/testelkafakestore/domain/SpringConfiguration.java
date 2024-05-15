package com.example.testelkafakestore.domain;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.time.Duration;

@Configuration
@PropertySource({"classpath:application.properties"})
@ComponentScan(basePackages = "com")
// tu znajdują się Beany, które zostaną umieszczone w SpringContext (kontenerze)
public class SpringConfiguration {

    @Autowired
    Environment environment;

    @Bean
    public WebDriver localWebDriver (){
        System.out.println("Browser type: ");
        if (environment.getProperty("browser").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","src\\test\\java\\com\\example\\testelkafakestore\\driversExe\\chromedriver-win64\\chromedriver.exe");
            return new ChromeDriver();
        } if (environment.getProperty("browser").equalsIgnoreCase("firefox")) {
           System.setProperty("webdriver.chrome.driver","src/test/resources/driversExe/geckodriver-v0.34.0-win-aarch64/geckodriver.exe");
           return new FirefoxDriver();
        }
        return null;
    }

    @Bean
    public WebDriverWait webDriverWait(WebDriver webDriver) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    @Bean
    public Actions action (WebDriver webDriver) {
        return new Actions(webDriver);
    }

    @Bean
    public JavascriptExecutor javascriptExecutor (WebDriver webDriver) {
        return (JavascriptExecutor) webDriver;
    }

}

