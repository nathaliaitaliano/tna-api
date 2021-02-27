package org.tna.chatBot;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class ChatMessageTest {

  @Test
  public void shouldBeEmptyIfContentIsNull() {
    ChatMessage emptyMessage = new ChatMessage();
    assertThat(emptyMessage.isEmpty(), equalTo(true));
  }

  @Test
  public void shouldBeEmptyIfContentIsAnEmptyString() {
    ChatMessage emptyMessage = new ChatMessage("");
    assertThat(emptyMessage.isEmpty(), equalTo(true));
  }

  @Test
  public void shouldNotBeEmptyIfContentIsPresent() {
    ChatMessage emptyMessage = new ChatMessage("hello");
    assertThat(emptyMessage.isEmpty(), equalTo(false));
  }
}