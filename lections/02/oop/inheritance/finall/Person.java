package seals2.oop.inheritance.finall;

public /*final*/ class Person {
    protected int age;
    protected String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут " + name);
    };

    public void becomeOlder(String name) {
        this.age++;
    }

    public void setName(String name) {
        this.name = name;
    }
}
