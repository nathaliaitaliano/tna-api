package org.tna.chatBot;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import static java.lang.Integer.parseInt;

@ApplicationScoped
public class DiceRoller {

  @Inject
  private RandomNumberGenerator randomNumberGenerator;

  public DiceRoller(RandomNumberGenerator randomNumberGenerator) {
    this.randomNumberGenerator = randomNumberGenerator;
  }

  public int roll(String dice) {
    int sides = parseInt(dice.substring(1));
    return this.randomNumberGenerator.generate(sides);
  }
}