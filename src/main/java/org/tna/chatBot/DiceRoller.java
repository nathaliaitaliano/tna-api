package org.tna.chatBot;

public class DiceRoller {
  public static int roll(int sides ) {
    return (int)(Math.random() * sides + 1);
  }
}
