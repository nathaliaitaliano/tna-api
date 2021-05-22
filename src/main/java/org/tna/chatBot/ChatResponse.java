package org.tna.chatBot;

public class ChatResponse {

  public String answer;

  ChatResponse(){}

  ChatResponse(String answer) {
    this.answer = answer;
  }

  public final static ChatResponse SAD_MESSAGE = new ChatResponse(":(");
}