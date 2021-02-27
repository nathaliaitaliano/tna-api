package org.tna.chatBot;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class ChatBotControllerTest {

    @Test
    public void shouldAcceptPostsOfNewMessages() {
        given()
          .when().post("/message")
          .then().statusCode(204);
    }

}