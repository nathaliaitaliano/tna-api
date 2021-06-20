package org.tna.chatBot;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//send responses
@Path("/message")
public class ChatBotController {

  @Inject
  private DiceRoller diceRoller;

  public ChatBotController(DiceRoller diceRoller){
    this.diceRoller = diceRoller;
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response process(ChatMessage message) {
    if (!message.isValid()) {
      return Response.status(Response.Status.BAD_REQUEST).build();
    }
    if(message.isBlank()) {
      return Response.ok(ChatResponse.SAD_MESSAGE).build();
    }
    if(message.content.equals("d6") || message.content.equals("d20")) {
      return Response.ok(new ChatResponse(String.valueOf(this.diceRoller.roll(message.content)))).build();
    }
    return Response.ok(new ChatResponse("You said: ".concat(message.content))).build();
  }
}