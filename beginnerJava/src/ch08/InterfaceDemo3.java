package beginnerJava.src.ch08;

public class InterfaceDemo3 {
    public static void main(String[] args) {
        // 어떤 인터페이스 변수에 대입되느냐에 따라 변수를 통해 호출할 수 있는 추상 메소드가 결정
        RemoteControl3 remote = new TV3();
        remote.turnOn();

        Searchable search = new TV3();
        search.search();
    }
}

interface RemoteControl3 {
    void turnOn();
}

interface Searchable {
    void search();
}

class TV3 implements RemoteControl3, Searchable {
    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다");
    }

    @Override
    public void search() {
        System.out.println("티비를 검색합니다");
    }
}
