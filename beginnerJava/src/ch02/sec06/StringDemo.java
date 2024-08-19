package ch02.sec06;

public class StringDemo {

	public static void main(String[] args) {
		// "문자열"
		String name = "홍길동";
		System.out.println(name); // 홍길동
		
		// 이스케이프 문자
		String str = "번호\n이름\n직업";
		System.out.println(str);
		/*	번호
			이름
			직업
		 **/
		
		// Java13부터 사용 가능 - 이스케이스 문자를 사용하지 않아도 문자열 그대로 저장
		String str2 = """
				나는 자바를 배웁니다.
				아마도요!
				""";
		System.out.println(str2);
		/*
		 	나는 자바를 배웁니다.
			아마도요!	
		 **/
		
		// Java14부터 사용 가능 - 줄바꿈을 하지 않고 이어서 작
		String str3 = """
				나는 자바를 \
				배웁니다
				""";
		System.out.println(str3); // 나는 자바를 배웁니다.

	}

}
