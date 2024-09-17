package beginnerJava.src.ch07;

public class InstanceofDemo {
    public static void personInfo(Person person) {
        System.out.println("이름은 " + person.name);

        if (person instanceof Student) {
            System.out.println("이 사람은 학생입니다");
        }
    }

    public static void main(String[] args) {
        Person person = new Person("김자바");
        personInfo(person); // 이름은 김자바 까지만 출력

        Student student = new Student("이학생", "1234567890");
        personInfo(student);
        //이름은 이학생
        //이 사람은 학생입니다  2 줄 출력
    }
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {

    public String number;

    public Student(String name, String number) {
        super(name);
        this.number = number;
    }
}
