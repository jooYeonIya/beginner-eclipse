package ch04.sec02;

public class IfDemo {

	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("90보다 큽니다");
			System.out.println("A");
		}
		
		if (score < 90)
			System.out.println("90보다 작습다"); // {}가 없을 경우 조건문은 1행만 인식하기 때문에 실행 안 함 
			System.out.println("B"); // 인식되지 않아 실행 됨
		
	}

}
