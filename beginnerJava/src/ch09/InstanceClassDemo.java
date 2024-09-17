package beginnerJava.src.ch09;

public class InstanceClassDemo {
    public static void main(String[] args) {
        InsideClass insideClass = new InsideClass();

        // 바깥 클래스 객체 생성 후 내부 클래스 객체 생성
        InsideClass.OusideClass ousideClass = insideClass.new OusideClass();
    }
}

class InsideClass {
    // 내부 클래스
    class OusideClass {
        int field = 1; // 필드
        OusideClass() {} // 생성자
        void method1() {} // 메소드
        // Java 17부터는 정적 필드, 정적 멧드 사용 가능
    }

    // 인스턴스 필드값으로 생성
    OusideClass ousideClass = new OusideClass();

    // 생성자 안에서 생성
    InsideClass(){
        OusideClass ousideClass = new OusideClass();
    }

    // 메소드 안에서 생성
    void method(){
        OusideClass ousideClass = new OusideClass();
    }
}
