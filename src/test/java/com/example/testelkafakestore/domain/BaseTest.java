package com.example.testelkafakestore.domain;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public abstract class BaseTest {

    protected Driver driverInstance;

    @BeforeEach
    public void setUp() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerBean(Driver.class);
        context.refresh();

        driverInstance = context.getBean(Driver.class);
        driverInstance.Initialize();


        Driver.webDriverInstance.manage().window().maximize();
        System.out.println("SetUp successfully executed");

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";

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
        Driver.webDriverInstance.quit();
    }
}
