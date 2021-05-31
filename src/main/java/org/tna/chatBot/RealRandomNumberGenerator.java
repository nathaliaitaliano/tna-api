package org.tna.chatBot;

public class RealRandomNumberGenerator implements RandomNumberGenerator {
  public int generate(int upperLimit) {
    return (int) (Math.random() * upperLimit + 1);
  }
}