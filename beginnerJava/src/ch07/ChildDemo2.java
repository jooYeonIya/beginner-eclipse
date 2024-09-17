package beginnerJava.src.ch07;

public class ChildDemo2 {
    public static void main(String[] args) {
        // 부모 타입으로 자동 타입 변환
        Parent3 parent3 = new Child3();

        parent3.method1();
        parent3.method2();

        // 자식 타입 메소드 사용 불가능
//        parent3.method3();

        // 자식 타입으로 강제 타입 변환
        Child3 child3 = (Child3) parent3;

        // 자식 타입 메소드 사용 가능
        child3.method3();

    }
}

class Parent3 {
    public void method1(){
        System.out.println("부모 메소드 1");
    }

    public void method2(){
        System.out.println("부모 메소드 2");
    }
}

class Child3 extends Parent3 {
    @Override
    public void method2() {
        System.out.println("자식 메소드 2로 오버라이딩");
    }

    public void method3(){
        System.out.println("자식 메소드 3");
    }
}
