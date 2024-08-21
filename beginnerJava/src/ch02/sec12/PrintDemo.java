package ch02.sec12;

public class PrintDemo {
	public static void main(String[] args) {		
		System.out.println("개행");
		
		System.out.print("개행");
		System.out.print("하지");
		System.out.print("않음 \n");
		
		System.out.printf("이름: %s, 나이: %d, 실수: %.2f", "김자반", 100, 3.1412598);
	}

}
