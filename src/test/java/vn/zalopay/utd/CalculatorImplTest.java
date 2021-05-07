package vn.zalopay.utd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class CalculatorImplTest {

  @Test
  void divide() {
    CalculatorImpl calc = new CalculatorImpl();
    try {
      assertEquals(1.0, calc.divide(5, 5));
    } catch (DivideByZeroException e) {
      fail("unexpected exception");
    }
  }

  @Test
  void divideAndThrow() {
    CalculatorImpl calc = new CalculatorImpl();
    try {
      float result = calc.divide(4, 0);
      fail();
    } catch (Exception e) {
      assertNotNull(e);
    }
  }
}