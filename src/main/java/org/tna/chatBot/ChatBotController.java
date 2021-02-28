package org.tna.chatBot;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/message")
public class ChatBotController {

  @POST
  public Response process(ChatMessage message) {
    if (message.isEmpty()) {
      return Response.status(Response.Status.BAD_REQUEST).build();
    }
    String answer = "You said: ".concat(message.content);
    return Response.ok(new ChatResponse(answer)).build();
  }
}
