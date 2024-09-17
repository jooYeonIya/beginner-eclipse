package beginnerJava.src.ch07;

public class ChildDemo {
    public static void main(String[] args) {
        // 자식 객체 생성
        Child2 child2 = new Child2();

        // 부모 타입으로 자동 타입 변환
        Parent2 parent2 = child2;

        parent2.method1(); //부모 메소드 1 출력
        parent2.method2(); //자식 메소드 2로 오버라이딩 출력

        // 호출 불가능
//        parent2.method3();

    }
}

class Parent2 {
    public void method1(){
        System.out.println("부모 메소드 1");
    }

    public void method2(){
        System.out.println("부모 메소드 2");
    }
}

class Child2 extends Parent2 {
    @Override
    public void method2() {
        System.out.println("자식 메소드 2로 오버라이딩");
    }

    public void method3(){
        System.out.println("자식 메소드 3");
    }
}
