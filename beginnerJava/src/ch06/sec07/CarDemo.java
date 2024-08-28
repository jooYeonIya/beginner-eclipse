package ch06.sec07;

public class CarDemo {
  public static void main(String[] args) {
    // Car car = new Car(); 매개값이 있을 경우 기본 생성자는 사용할 수 없음

    // 생성자를 호출해 객체 만들기
    Car car = new Car("모델");
  }
}

class Car {
  String model;
  int speed;

  // 객체마다 동일한 값은 초기화 해주는 것이 좋다
  String company = "자동차 회사";

  // 객체마다 다른 값이 필요할 경우는 생성자를 통해 기본값을 대입
  // 매개값이 있는 생성자
  public Car(String model, int speed) {
    this.model = model;
    this.speed = speed;
  }

  // 생성자 오버로딩, 필요한 매개값만 사용할 수 있음
  public Car(String model) {
    // this는 현재 객체를 말함
    this.model = model;
  }
}
