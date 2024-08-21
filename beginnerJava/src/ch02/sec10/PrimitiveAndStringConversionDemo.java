package ch02.sec10;

public class PrimitiveAndStringConversionDemo {

	public static void main(String[] args) {
		// 문자열을 기본 타입으로 변경
		int var1 = Integer.parseInt("10");
		double var2 = Double.parseDouble("5");
		
		double result = var1 / var2;
		System.out.println(result); // 2.0
		
		// 기본 타입을 문자열로 변경
		String str1 = String.valueOf(100);

	}

}
