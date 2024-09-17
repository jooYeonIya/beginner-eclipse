package beginnerJava.src.ch08;

public class InterfaceCImplDemo {
    public static void main(String[] args) {
        InterfaceCImpl i = new InterfaceCImpl();

        // 부모 인터페이스 변수에 대입되면 부모 인터페이스의 것들만 호출 가능
        InterfaceA ia = i;
        ia.methodA();
        // ia.methodB();

        InterfaceB ib = i;
        // ib.methodA();
        ib.methodB();

        // 자식 인터페이스 변수에 대입되면 부모 및 자식 인터페이스의 모든 것들 호출 가능
        InterfaceC ic = i;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}

// 부모 인터페이스이 모든 추상 메서드를 재정의해야 한다
class InterfaceCImpl implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("메소드A");
    }

    @Override
    public void methodB() {
        System.out.println("메소드B");
    }

    @Override
    public void methodC() {
        System.out.println("메소드C");
    }
}

interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

// 다른 인터페ㅣ스 상속 가능
// 다중 상속 가능
interface InterfaceC extends InterfaceA, InterfaceB {
    void methodC();
}

