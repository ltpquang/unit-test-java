package vn.zalopay.utd;

public class ZeroChecker {

  protected boolean isAllZero(int a, int b, int c) {
    if (a == 0 && b == 0 && c == 0) {
      return true;
    }
    return false;
  }
}
