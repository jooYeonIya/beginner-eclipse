package beginnerJava.src.ch11;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("start");
        printLength("java");
        printLength(null);
        System.out.println("end");
    }

    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println(result);

        // try블록에서 예외가 발생하면 실행되는 블록
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("언제나 실행");
        }
    }
}
