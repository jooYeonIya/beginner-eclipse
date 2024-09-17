package beginnerJava.src.ch09;

public class ADemo {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.useB2();
    }
}

class A2 {
    String field = "A2";

    class B2 {
        String field = "B2";

        void print() {
            // 내부 클래스의 필드 사용할 때
            System.out.println(this.field);

            // 바깥 클래스의 필드 사용할 때
            System.out.println(A2.this.field);
        }
    }

    void useB2() {
        B2 b2 = new B2();
        b2.print();
    }
}
