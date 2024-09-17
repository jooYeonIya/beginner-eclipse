package beginnerJava.src.ch07;

public class AbstractDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe();
        dog.sound();

        Cat cat = new Cat();
        cat.breathe();
        cat.sound();
    }
}

// 추상 클래스
abstract class Animal {
    String name;

    public void breathe(){
        System.out.println("숨을 쉽니다");
    }

    // 추상 메소드로 animal의 공통 메소드
    abstract void sound();
}

class Dog extends Animal {
    // 실제로 각각의 객체에서 어떻게 사용할지는 오버라이딩을 통해 정해진다
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("냥냐");
    }
}