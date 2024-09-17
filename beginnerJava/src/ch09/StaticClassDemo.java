package beginnerJava.src.ch09;

public class StaticClassDemo {
    public static void main(String[] args) {
        // 바깥 클래스 객체 없이 바로 접근해서 생성 가능
        InsideClass2.OusideClass2 ousideClass2 = new InsideClass2.OusideClass2();
        InsideClass2.OusideClass2.field = 2;
    }
}

class InsideClass2 {
    // 정적 멤버 클래스
    static class OusideClass2 {
        static int field = 1; // 필드
        OusideClass2() {} // 생성자
        void method1() {} // 메소드
        // Java 17부터는 정적 필드, 정적 멧드 사용 가능
    }

    // 인스턴스 필드값으로 생성
    OusideClass2 ousideClass = new OusideClass2();

    // 정적 필드값으로 생성
    static OusideClass2 outsideClass2 = new OusideClass2();

    // 생성자 안에서 생성
    InsideClass2(){
        OusideClass2 ousideClass = new OusideClass2();
    }

    // 메소드 안에서 생성
    void method() {
        OusideClass2 ousideClass = new OusideClass2();
    }

    // 정적 메소드 안에서 생성
    static void method2() {
        OusideClass2 ousideClass = new OusideClass2();
    }
}
