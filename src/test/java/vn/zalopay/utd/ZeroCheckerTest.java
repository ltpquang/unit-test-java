package vn.zalopay.utd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZeroCheckerTest {

  @Test
  void isAllZero() {
    ZeroChecker checker = new ZeroChecker();
    assertFalse(checker.isAllZero(1, 0, 1));
    assertFalse(checker.isAllZero(0, 1, 0));
    assertTrue(checker.isAllZero(0, 0, 0));
    assertFalse(checker.isAllZero(0, 0, 1));
  }
}