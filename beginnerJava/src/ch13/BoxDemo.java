package beginnerJava.src.ch13;

public class BoxDemo {
    public static void main(String[] args) {
        // 실제로 사용할 때 어떤 타입으로 사용할지 지정
        Box<String> boxString = new Box<>();
        boxString.content = "문자열";

        Box<Integer> boxInt = new Box<>();
        boxInt.content = 100;
    }
}

// 클래스 선언시에는 어떤 타입을 사용할지 정하지 않는다
class Box<T> {
    public T content;
}
