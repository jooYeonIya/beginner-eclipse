package beginnerJava.src.ch06.sec15;

public class SingletoneDemo {
    public static void main(String[] args) {
        Singletone s1 = Singletone.getSingletone();
        Singletone s2 = Singletone.getSingletone();

        // 같은 객체를 참조하기 때문에 같은 객체입니다 가 출력
        if (s1 == s2) System.out.println("같은 객체입니다");
        else System.out.println("다른 객체입니다.");
    }
}

class Singletone {
    private static Singletone singletone = new Singletone();

    public Singletone() {}

    public static Singletone getSingletone(){
        return singletone;
    }
}
