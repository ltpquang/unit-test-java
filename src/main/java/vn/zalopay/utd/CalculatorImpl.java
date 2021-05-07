package vn.zalopay.utd;

public class CalculatorImpl {

  protected float divide(int dividend, int divisor)
      throws DivideByZeroException {
    if (divisor == 0) {
      throw new DivideByZeroException();
    }
    return ((float) dividend) / divisor;
  }
}
