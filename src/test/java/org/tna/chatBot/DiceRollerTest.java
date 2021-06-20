package org.tna.chatBot;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

@QuarkusTest
public class DiceRollerTest {

  @Test
  public void shouldAnswerAD6Roll() {
    int rollResult = new DiceRoller(new RealRandomNumberGenerator()).roll("d6");
    assertThat(rollResult, is(both(greaterThanOrEqualTo(1)).and(lessThanOrEqualTo(6))));
  }

  @Test
  public void shouldAnswer20Roll() {
    int rollResult = new DiceRoller(new RealRandomNumberGenerator()).roll("d20");
    assertThat(rollResult, is(both(greaterThanOrEqualTo(1)).and(lessThanOrEqualTo(20))));
  }

  @Test
  public void shouldBe20IfRandomNumberWas20() {
    int rollResult = new DiceRoller(new FakeNumberGenerator(20)).roll("d20");
    assertThat(rollResult, is(20));
  }
}