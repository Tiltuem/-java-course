package seals2.oop.inheritance;

public class Student extends Person {

    public Student() {
        super(10, "Ilya");
    }

    public Student(int age, String name) {
        super(age, name);
    }

    public void sorryForBeingLate() {
        System.out.println("Извините я опоздал");
    }
}
