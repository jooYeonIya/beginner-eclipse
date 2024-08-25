package ch06.sec06;

public class FieldDemo {
	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();
		
		System.out.println(car.modelString); // 초기값 null
		System.out.println(car.speed); // 초기값 0
		System.out.println(car.start); // 초기값 false
		
		// 외부에서 필드 사용
		car.modelString = "현대";
	}
}

class Car {
	// 필드 선언
	String modelString;
	int speed;
	boolean start;
	
	// 내부 메서드에서 필드 사용
	void upSpeed() {
		speed = 100;
	}
}
