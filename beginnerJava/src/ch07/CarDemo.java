package beginnerJava.src.ch07;

public class CarDemo {
    public static void main(String[] args) {
        Car hankookCar = new Car();
        hankookCar.tire = new HankookTire();

        Car kumhoCar = new Car();
        kumhoCar.tire = new HankookTire();

        // run() 함수를 시키는 것은 한국도 금호도 동일하다.
        // 하지만 대입되는 객체가 다르기 때문에 실행 결과가 다르게 나온다.
        hankookCar.run(); // 한국타이어가 회전 출력
        kumhoCar.run(); // 금호타이어가 회전 출력
    }
}

class Car {
    Tire tire;

    public void run(){
        tire.roll();
    }
}

class Tire {
    public void roll(){
        System.out.println("타이어가 회전");
    }
}

class HankookTire extends Tire {
    @Override
    public void roll() {
        System.out.println("한국 타이어가 회전");
    }
}

class KumhoTire extends Tire {
    @Override
    public void roll() {
        System.out.println("금호 타이어가 회전");
    }
}