package seals2.oop.polymorphism;

public class Student extends Person {

    public Student() {
        super(10, "Ilya");
    }

    public Student(int age, String name) {
        super(age, name);
    }

    @Override
    public void sayHello() {
        System.out.println("Привет, меня зовут " + name + ". Я учусь в школе");
    }

    public void sorryForBeingLate() {
        System.out.println("Извините я опоздал");
    }
}
