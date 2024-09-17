package beginnerJava.src.ch09;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();
        car.run2();
        car.run3();

        car.run4(new Tire(){
            @Override
            void roll() {
                System.out.println("익명 자식 객체 매개값으로 타이어가 굴러갑니다.");
            }
        });
    }
}

class Car {
    Tire tire1 = new Tire();

    void run1() {
        tire1.roll();
    }

    // 필드값으로 사용
    Tire tire2 = new Tire() {
        @Override
        void roll() {
            System.out.println("익명 자식 객체 필드값 타이어가 굴러갑니다");
        }
    };

    void run2() {
        tire2.roll();
    }

    // 로컬 변수값으로 사용
    void run3() {
        Tire tire = new Tire() {
            @Override
            void roll() {
                System.out.println("익명 자식 객체 로컬 변수 값 타이어가 굴러갑니다");
            }
        };

        tire.roll();
    }

    // 매개변수값으로 사용
    void run4(Tire tire) {
        tire.roll();
    }
}

class Tire {
    void roll(){
        System.out.println("타이어가 굴러갑니다");
    }
}
