package beginnerJava.src.ch07;

public class SmartPhoneDemo2 {
}

// 부모 클래스
class Phone2 {
    public String model;
    public String color;

    // 부모 클래스에 매개변수가 있는 생성자가 있을 경우
    public Phone2(String model, String color) {
        this.model = model;
        this.color = color;
    }
}

// Phone를 상속 받은 자식 클래스
class SmartPhone2 extends Phone2 {
    public boolean wifi;

    public SmartPhone2(String model, String color) {
       // 부모 클래스에 매개변수가 있는 생성자가 있을 경우에는 반드시 호출해줘야 한다.
        super(model, color);
    }
}