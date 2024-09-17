package beginnerJava.src.ch09;

import org.w3c.dom.ls.LSOutput;

public class LocalClassDemo {

}

class A {
    A() {
        class B {
            int field = 0;
            B() {}
            void bMethod() { }
        }

        B b = new B();
        b.bMethod();
    }

    void method() {
        int var = 1;

        class C {
           // var = 2; 변경 불가
        }
    }
}
