package beginnerJava.src.ch07;

public class DriverDemo {
    public static void main(String[] args) {
        Driver busDriver = new Driver();
        Bus bus = new Bus();

        Driver taxiDriver = new Driver();
        Taxi taxi = new Taxi();

        // 똑같은 Vehicle 타입을 매개변수로 삼고 있지만
        // bus 객체냐 taxi 객체냐에 따라 그 실행 결과가 달라지는 것
        busDriver.drive(bus); // 버스가 달립니다 출력
        taxiDriver.drive(taxi); //  택시가 달립니다 출력

    }
}

class Driver {
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}

class Vehicle {
    public void run(){
        System.out.println("달립니다");
    }
}

class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
}

class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}