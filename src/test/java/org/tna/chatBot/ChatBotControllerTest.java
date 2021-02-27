package org.tna.chatBot;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class ChatBotControllerTest {

  @Test
  public void shouldAcceptPostsOfNewMessages() {
    given()
      .when()
        .contentType(ContentType.JSON)
        .body("{\"content\": \"hello\"}")
        .post("/message")
      .then().statusCode(200);
  }

  @Test
  public void shouldRejectPostsWithEmptyMessages() {
    given()
      .when()
        .contentType(ContentType.JSON)
        .body("{}")
        .post("/message")
      .then().statusCode(400);
  }
}