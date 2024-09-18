package com.example.testelkafakestore.domain;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;


@SpringBootTest
public abstract class BaseTest {

    private final DriverManager driverManager;

    @Autowired
    public BaseTest(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @BeforeEach
    public void setUp() {
        WebDriver webDriver = driverManager.localWebDriver;
        if (webDriver == null) {
            throw new IllegalStateException("WebDriver is not initialized.");
        }


        driverManager.localWebDriver.manage().window().maximize();
        System.out.println("SetUp successfully executed");
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        // Timeout


        /** Java
         * 1. Application context: registration of Beans and placement in container
         * 2. BaseTest: SetUp, TearDown
         * 3. Test extend BaseTest
         * */

        /** C#
         * 1. Container creation. Static class "AutomationTestsContainerFactory"
         * 2. Registration of Beans: driver, paymentProvider, language, applicationBaseAddress, settingService. Static class "GenericRegistrationInstanceInContainer"
         * 3. BaseTest: SetUp (container creation, beans registration(driver, payment provider and so on), registration of page interfaces ("MainStepMenu"."ILoginStep")).
         *    Abstract class "ClientPortalTestBase".
         * 4. Logging to user based on Selected browser: here we have override method Init(). Abstract class "LoggedInOnInitClientPortalTestBase"
         * 5. AutomationTestWrapper, so that everytime this TestWrapper in used in test, browser start work -> logged into chose user. Class "MixedTestScenario" : "IntegrationTestScenario"
         * 6. Test : "MixedTestScenario"
         * */
    }

    @AfterEach
    public void tearDown() {
        driverManager.localWebDriver.quit();
    }
}
