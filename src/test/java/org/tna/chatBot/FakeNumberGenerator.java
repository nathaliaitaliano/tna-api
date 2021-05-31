package org.tna.chatBot;

public class FakeNumberGenerator implements RandomNumberGenerator {
  private final int number;

  public FakeNumberGenerator(int number) {
    this.number = number;
  }
  @Override
  public int generate(int upperLimit) {
    return this.number;
  }
}