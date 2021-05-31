package org.tna.chatBot;

public class RandomNumberGenerator {
  static int generate(int upperLimit) {
    return (int) (Math.random() * upperLimit + 1);
  }
}