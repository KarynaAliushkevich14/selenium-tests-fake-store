package com.example.testelkafakestore.tests;

import com.example.testelkafakestore.domain.BaseTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class APITest extends BaseTest {

    @Tag("Regression")
    @Test
    public void addNewPost_POST_METHOD() {

        String jsonBody = """
                {
                    "userId": 125,
                    "id": 101,
                    "title": "Today's post: Travel to Europe",
                    "body": "dolore placeat quibusdam ea quo vitae\\nmagni quis enim qui quis quo nemo aut"
                }
                """;

        given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201);
    }

    @Test
    public void getAllPosts_GET_METHOD() {

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/posts")
                .then()
                .statusCode(200);
    }
}
