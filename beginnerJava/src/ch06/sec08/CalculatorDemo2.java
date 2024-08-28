package ch06.sec08;

public class CalculatorDemo2 {
  public static void main(String[] args) {
    Calculator2 calculator2 = new Calculator2();

    double v = calculator2.areaRectangle(100);
    System.out.println(v);

    double v1 = calculator2.areaRetangle(10, 20);
    System.out.println(v1);
  }
}

class Calculator2 {
  // 같은 이름이지만 매개값이 다르다
  double areaRectangle(double width) {
    return width * width;
  }

  double areaRetangle(double width, double height) {
    return width * height;
  }
}
