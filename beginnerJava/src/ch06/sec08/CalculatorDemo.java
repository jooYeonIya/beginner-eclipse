package ch06.sec08;

class CaluclatorDemo {
  public static void main(String[] args) {
    Calculator caluclator = new Calculator();
    // 메소드 호출
    caluclator.powerOn();

    int plus = caluclator.plus(3, 6);
    System.out.println(plus);
  }
}

class Calculator {
  // 매개값이 없고 반환값이 없는 메서드
  void powerOn() {
    System.out.println("실행");
  }

  // 매개값이 있고 반환값이 있는 메서드
  int plus(int x, int y) {
    return x + y;
  }
}
