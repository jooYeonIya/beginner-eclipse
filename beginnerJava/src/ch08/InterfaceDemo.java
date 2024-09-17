package beginnerJava.src.ch08;

public class InterfaceDemo {
    public static void main(String[] args) {
        RemoteControl remote;
        remote = new TV();
        remote.turnOn(); // tv를 켭니다 출력

        remote = new Audio();
        remote.turnOn(); // 오디로를 켭니다 출력
    }
}

interface RemoteControl {
    public void turnOn();
}

class TV implements RemoteControl {
    @Override
    public void turnOn(){
        System.out.println("tv를 켭니다");
    }
}

class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("오디로를 켭니다");
    }
}