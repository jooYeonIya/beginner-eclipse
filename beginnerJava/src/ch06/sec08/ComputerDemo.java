package ch06.sec08;

public class ComputerDemo {
  public static void main(String[] args) {
    Computer computer = new Computer();
    int sum = computer.sum(1, 2, 3, 4, 5);
    System.out.println(sum);
  }
}

class Computer {
  // 가변길이 매개변수를 갖는 메소드 선언
  int sum(int...values) {
    int sum = 0;

    // 가변길이 매개변수는 배열 처럼 사용
    for (int value : values) {
      sum += value;
    }

    return sum;
  }
}