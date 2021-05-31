package org.tna.chatBot;

import static java.lang.Integer.parseInt;

public class DiceRoller {
  public static int roll(String dice) {
    int sides = parseInt(dice.substring(1));
    return new RandomNumberGenerator().generate(sides);
  }
}