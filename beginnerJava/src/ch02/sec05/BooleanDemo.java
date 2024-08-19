package ch02.sec05;

public class BooleanDemo {

	public static void main(String[] args) {
		boolean stop = true;
		
		// 조건문의 실행 흐름 제어
		if (stop) {
			System.out.println("중");
		} else {
			System.out.println("시");
		}
		
		
		int x = 10;
		
		// 연산식의 참거짓 판별
		boolean result = (x == 20); 
		System.out.println(result); // false

	}

}
