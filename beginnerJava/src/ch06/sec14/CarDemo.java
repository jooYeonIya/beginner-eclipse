package beginnerJava.src.ch06.sec14;

class Car {
    private int speed;
    private boolean stop;

    // get으로 시작하는 것이 관례
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // boolean 일 때는 is로 시작하는 것이 관례
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(100);
        System.out.println(myCar.getSpeed()); // 100 출력

        myCar.setStop(true);
        System.out.println(myCar.isStop()); // true 출력
    }
}
