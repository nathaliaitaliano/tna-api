package org.tna.chatBot;

public class ChatMessage {

  public String content;

  ChatMessage(){}

  ChatMessage(String content) {
    this.content = content;
  }

  public boolean isEmpty() {
    return content == null || content.isBlank();
  }

  public boolean isValid() {
    return content != null;
  }
}
