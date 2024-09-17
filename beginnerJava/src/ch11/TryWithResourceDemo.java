package beginnerJava.src.ch11;

public class TryWithResourceDemo {
    public static void main(String[] args) {
        try (MyResource res = new MyResource()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("닫기");
    }
}
