package org.tna.chatBot;

public class RandomNumberGenerator {
  int generate(int upperLimit) {
    return (int) (Math.random() * upperLimit + 1);
  }
}