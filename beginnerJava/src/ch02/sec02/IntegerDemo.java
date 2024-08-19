package ch02.sec02;

public class IntegerDemo {

	public static void main(String[] args) {

		int var1 = 0b1011;	// 2진수
		int var2 = 0206;	// 8진수
		int var3 = 365;		// 10진수
		int var4 = 0xB3;	// 1진수
		
		// 정수 리터럴을 어떤 진수로대입해도 기본인 10진수 값으로 출력
		System.out.println(var1); // 11
		System.out.println(var2); // 134
		System.out.println(var3); // 365
		System.out.println(var4); // 179
		
	}

}
