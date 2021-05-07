package org.tna.chatBot;

public class DiceRoller {
  public static int roll() {
    return (int)(Math.random() * 6 + 1);
  }
}
