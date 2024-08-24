package ch04.sec03;

public class SwitchBreakDemo {

	public static void main(String[] args) {
		char grade = 'b';
		
		switch (grade) {
		case 'a':
		case 'b':
			System.out.println("우수 회원");
		case 'c':
			System.out.println("일 회원");
		default:
			System.out.println("손님");
		}
	}

}
