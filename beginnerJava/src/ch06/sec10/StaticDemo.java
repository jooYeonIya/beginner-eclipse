package ch06.sec10;

public class StaticDemo {
  public static void main(String[] args) {
    double result1 = 10 * Calculator.pi;
    int result = Calculator.plus(10, 20);
    System.out.println(Calculator.info);
  }
}

class Calculator {
  static double pi = 3.14;
  static String info;

  // 정적 블록
  static {
    info = "파이값은" + pi;
  }

  static int plus(int x, int y) {
    return x + y;
  }
}
