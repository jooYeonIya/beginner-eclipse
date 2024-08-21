package ch02.sec09;

public class StringConcatDemo {

	public static void main(String[] args) {
		// 숫자 연산
		int x = 10;
		int y = 20;
		int result = x + y;
		System.out.println(result); // 30
		
		// 결합 연산
		String result2 = 10 + 20 + "10"; // 3010
		System.out.println(result2);
		
		String result3 = "10" + x + y; // 101020
		System.out.println(result3);
	}

}
