package org.tna.chatBot;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RealRandomNumberGenerator implements RandomNumberGenerator {
  public int generate(int upperLimit) {
    return (int) (Math.random() * upperLimit + 1);
  }
}