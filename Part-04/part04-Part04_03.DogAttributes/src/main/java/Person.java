/**
 *
 * @author JESUS
 */
public class Person {
    // Instance variables
    // Private variables means encapsulation
    private String name;
    private int age;
    private int weight;
    private int height;
    
    public Person (String initialName) {
        this.name = initialName;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

    public void growOlder () {
        this.age = this.age + 1;
    }

    public void setHeight (int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
