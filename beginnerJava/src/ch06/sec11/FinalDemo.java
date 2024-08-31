package ch06.sec11;

public class FinalDemo {
	public static void main(String[] args) {
		Korean korean = new Korean("123456789");
		
		// 상수는 값 변경할 수 없
		// korean.nation = "미국";
		// korean.ssn = "987456";
	}
}


class Korean {
	// 필드 선언 시 초기값 대입
	final String nation = "한국";
	final String ssn;
	
	//생성자에서 초기값 대입
	public Korean(String ssn) {
		this.ssn = ssn;
	}
}