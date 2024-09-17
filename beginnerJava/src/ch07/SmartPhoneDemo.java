package beginnerJava.src.ch07;

public class SmartPhoneDemo {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("아이폰", "은색");

        System.out.println(smartPhone.color); // 은색 출력

        // 부모 메서드 호출
        smartPhone.bell();

        // 자식 메서드 호출
        smartPhone.internet();
    }
}

// 부모 클래스
class Phone {
    public String model;
    public String color;

    public void bell(){
        System.out.println("벨이 울립니다");
    }
}

// Phone를 상속 받은 자식 클래스
class SmartPhone extends Phone {
    public boolean wifi;

    // 부모 클래스에서 상속받은 필드로 생성자 선언
    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void internet(){
        System.out.println("인터넷 연결합니다");
    }
}
