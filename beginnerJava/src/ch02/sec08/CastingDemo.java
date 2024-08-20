package ch02.sec08;

public class CastingDemo {

	public static void main(String[] args) {
		int intValue = 18;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);
		
		long longValue = 300;
		int intValue2 = (int) longValue;
		
		int intValue3 = 65;
		char charValue = (char) intValue3;
		System.out.println(charValue); // 'A' 출력
		
		double doubleValue = 3.14;
		int intValue4 = (int) doubleValue;
		System.out.println(intValue4); // 소수점 이하 부분은 버려지고 정수만 남는다 -> 3 출력

	}

}
