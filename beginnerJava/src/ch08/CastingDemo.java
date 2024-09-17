package beginnerJava.src.ch08;

public class CastingDemo {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        bus.run();
        // bus.stop(); 사용 불가능

        Bus bus2 = (Bus) bus;
        bus2.run();
        bus2.stop();
    }
}

interface Vehicle {
    void run();
}

class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달린다");
    }

    public void stop() {
        System.out.println("버스가 멈춘다");
    }
}