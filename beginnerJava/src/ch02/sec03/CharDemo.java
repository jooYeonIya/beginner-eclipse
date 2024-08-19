package ch02.sec03;

public class CharDemo {

	public static void main(String[] args) {
		char c1 = 'A';
		
		// 유니코드 숫자를 직접 대입할 수도 있음
		char c2 = 65;
		
		System.out.println(c1); // A
		System.out.println(c2); // A
		
		// 에러
		// char c3 = '';
		
		// 공백 유니코드를 대입해야한다
		char c3 = ' ';
		
	}
}
