package org.tna.chatBot;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

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

  @Test
  public void shouldAnswerMessageWithEcho() {
    given()
            .when()
            .contentType(ContentType.JSON)
            .body("{\"content\": \"hello\"}")
            .post("/message")
            .then()
            .statusCode(200).and()
            .body("answer", is("You said: hello")).and()
            .contentType(ContentType.JSON);
  }

  @Test
  public void shouldAnswerBlankMessagesWithSadFace() {
    given()
            .when()
            .contentType(ContentType.JSON)
            .body("{\"content\": \"\"}")
            .post("/message")
            .then()
            .statusCode(200).and()
            .body("answer", is(":(")).and()
            .contentType(ContentType.JSON);
  }
}