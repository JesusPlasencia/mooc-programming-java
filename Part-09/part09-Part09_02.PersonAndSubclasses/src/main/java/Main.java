
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Kenny", "Boulevard Abbey Road 18");

        System.out.println("Kenny's Credits: " + student.credits());
        
        Person person = student;
        Object object = student;

        System.out.print(student + ", ");
        System.out.print(person + ", ");
        System.out.println(object);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}

class Persona {
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years) ";
    }
}

class Studnt extends Persona {

    private int credits;

    public Studnt(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + credits + " credits";
    }

}