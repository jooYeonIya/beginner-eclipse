package beginnerJava.src.ch07;

public class SealedDemo {
}

// Person2는 Employee와 Manager에만 상속할 수 있음 = 다른 클래스에는 상속 불가
sealed class Person2 permits Employee, Manager {

}

// student클래스는 상속을 받을 수 없음
// class Student extends Person2 {}


// 더 이상 상속 할 수없음
final class Employee extends Person2{

}

// 봉인을 해제하고 상속할 수 있음
non-sealed class Manager extends Person2 {

}

class Director extends Manager {

}
