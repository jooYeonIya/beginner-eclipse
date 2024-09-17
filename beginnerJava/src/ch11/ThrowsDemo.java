package beginnerJava.src.ch11;

public class ThrowsDemo {
    public static void main(String[] args) {

        // 호출한 곳에서 예외 처리
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 호출한 곳으로 예외를 떠넘김
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java");
    }
}
