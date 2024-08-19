package ch02.sec07;

public class PromotionDemo {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // int 타입으로 자동 타입 변환 됨
		
		long longValue = 5000000L;
		float floatValue = longValue; // floa 타입으로 자동 타입 변환 됨
		System.out.println(floatValue); // 5000000.0
		
		char charValue = 'A';
		int intValue2 = charValue;
		System.out.println(intValue2); // 65
		
	}

}
