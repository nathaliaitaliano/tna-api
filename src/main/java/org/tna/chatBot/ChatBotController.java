package org.tna.chatBot;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/message")
public class ChatBotController {

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response process(ChatMessage message) {
    if (!message.isValid()) {
      return Response.status(Response.Status.BAD_REQUEST).build();
    }
    ChatResponse response = message.isBlank() ? ChatResponse.SAD_MESSAGE : message.content.equals("d6") ? new ChatResponse(String.valueOf(DiceRoller.roll(6))) : message.content.equals("d20") ? new ChatResponse(String.valueOf(DiceRoller.roll(20))) : new ChatResponse("You said: ".concat(message.content));
    return Response.ok(response).build();
  }
}