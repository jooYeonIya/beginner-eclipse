package ch02.sec01;

public class VarDemo {

	public static void main(String[] args) {
		// 변수 선언 -> 아직 메모리에 할당되어 있지 않
		int age;
		
		// 따라서 값을 읽을 수 없기 때문에 아래 코드는 에러 발
		// int result = age + 10;
		
		// 초기화: 대입 연산자(=)를 사용하여 값 대입, 초기
		age = 10;
		
		// 변수 선언과 동시에 초기화를 할 수도 있음
		int hour = 3;
		
		// 변수는 또 다른 변수에 대입되어 메모리 간에 값 복사 가능
		int time = hour;

	}

}
