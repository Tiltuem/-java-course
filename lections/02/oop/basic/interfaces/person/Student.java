package seals2.oop.basic.interfaces.person;

public class Student extends AbstractPerson {

    public Student() {
        super(10, "Ilya");
    }

    public Student(int age, String name) {
        super(age, name);
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут " + name + ". Я учусь в школе");
    }

    public void sorryForBeingLate() {
        System.out.println("Извините я опоздал");
    }
}
