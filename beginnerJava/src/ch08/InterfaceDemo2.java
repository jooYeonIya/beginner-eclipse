package beginnerJava.src.ch08;

public class InterfaceDemo2 {
    public static void main(String[] args) {
        RemoteControl2 remote;
        remote = new TV2();
        remote.setMut(); // 무음 처리 합니다 출력

        remote = new Audio2();
        remote.setMut(); // 오디오를 무음 처리 합니다 출력
    }
}

interface RemoteControl2 {
    default void setMut(){
        System.out.println("무음 처리 합니다");
    }
}

class TV2 implements RemoteControl2 {

}

class Audio2 implements RemoteControl2 {
    @Override
    public void setMut() {
        System.out.println("오디오를 무음 처리 합니다");
    }
}