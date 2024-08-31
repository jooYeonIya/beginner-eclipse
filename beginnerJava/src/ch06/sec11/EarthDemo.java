package ch06.sec11;

public class EarthDemo {
	public static void main(String[] args) {
		// 상수값 사용
		System.out.println(Earth.EARTH_RADIUS);
	}
}

class Earth {
	// 상수 선언 및 초기화 
	static final double EARTH_RADIUS = 6400;
	
	// 상수 선언
	static final double EARTH_SAURFACE_AREA;
	
	// 정적 블록에서 상수 초기화
	static {
		EARTH_SAURFACE_AREA = 4 * EARTH_RADIUS;
	}
}
