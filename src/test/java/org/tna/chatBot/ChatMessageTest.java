package org.tna.chatBot;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class ChatMessageTest {

  @Test
  public void shouldBeEmptyIfContentIsNull() {
    ChatMessage nullContentMessage = new ChatMessage();
    assertThat(nullContentMessage.isEmpty(), equalTo(true));
  }

  @Test
  public void shouldBeEmptyIfContentIsAnEmptyString() {
    ChatMessage blankMessage = new ChatMessage("");
    assertThat(blankMessage.isEmpty(), equalTo(true));
  }

  @Test
  public void shouldNotBeEmptyIfContentIsPresent() {
    ChatMessage message = new ChatMessage("hello");
    assertThat(message.isEmpty(), equalTo(false));
  }

  @Test
  public void shouldBeValidIfContentIsPresent() {
    ChatMessage message = new ChatMessage("hello");
    assertThat(message.isValid(), equalTo(true));
  }

  @Test
  public void shouldBeValidIfContentIfBlank() {
    ChatMessage blankMessage = new ChatMessage("");
    assertThat(blankMessage.isValid(), equalTo(true));
  }

  @Test
  public void shouldBeInvalidIfContentIsNull() {
    ChatMessage nullContentMessage = new ChatMessage(null);
    assertThat(nullContentMessage.isValid(), equalTo(false));
  }
}
