package org.tna.chatBot;

import static java.lang.Integer.parseInt;

public class DiceRoller {
  public static int roll(String dice, RandomNumberGenerator randomNumberGenerator) {
    int sides = parseInt(dice.substring(1));
    return randomNumberGenerator.generate(sides);
  }
}