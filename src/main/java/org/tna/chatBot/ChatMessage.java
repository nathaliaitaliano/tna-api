package org.tna.chatBot;

public class ChatMessage {

  public String content;

  ChatMessage(){}

  ChatMessage(String content) {
    this.content = content;
  }

  public boolean isBlank() {
    return this.isValid() && content.isBlank();
  }

  public boolean isValid() {
    return content != null;
  }
}