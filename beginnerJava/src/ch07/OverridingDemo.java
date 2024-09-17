package beginnerJava.src.ch07;

public class OverridingDemo {
    public static void main(String[] args) {
        Child child = new Child();

        child.method1();
        child.method2();
    }
}

class Parent {
    public void method1(){
        System.out.println("부모 메소드 1");
    }

    public void method2(){
        System.out.println("부모 메소드 2");
    }
}

class Child extends Parent {
    @Override
    public void method2() {
        System.out.println("자식 메소드 2로 오버라이딩");
    }
}
