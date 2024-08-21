package ch02.sec09;

public class OperationPromotionDemo {

	public static void main(String[] args) {
	
		// 컴파일 단계에서 연산 -> 데이터 타입은 그대로 byte
		byte result1 = 10 + 20;
		System.out.println(result1); // 30
		
		// 변수로 연산할 때는 byte가 아니라 int로 자동 타입 변환되어 연산
		byte x = 10;
		byte y = 20;		
		int result2 = x + y;
		System.out.println(result2); //30
		
		// long이 있을 때는 long타입으로 변환한 후 연산
		byte v1 = 10;
		int v2 = 20;
		long v3 = 30L;
		long result3 = v1 + v2 + v3;
		System.out.println(result3); // 60
		
		// 실수와 정수 연산할 때는 double로 변환한 후 연산
		int v4 = 8;
		float v5 = 4.0f;
		double result4 = v4 / v5;
		System.out.println(result4); //2.0
		
		// 정수 연산의 결과는 정수
		int v6 = 1;
		int v7 = 2;
		double result5 = v6 / v7; 
		System.out.println(result5); // 0.0 (1/2=0.5에서 정수 0만이 남고 여기서 double타입이 되어 0.0이 출력됨)
		
		// double이 있으면 doubl로 변환한 후 연산
		double result6 = (double) v6 / v7;
		double result7 =  v6 / (double) v7;
		double result8 =  (double) v6 / (double) v7;
		System.out.println(result6); // 0.5
		System.out.println(result7); // 0.5
		System.out.println(result8); // 0.5
		
		
		double result9 =  (double) (v6 / v7);
		System.out.println(result9); // 0.0 (괄호 안의 정수 부분이 먼저 연산되어 0만이 남고 여기서 double타이 되어 0.0 출력됨)
		
	}

}
