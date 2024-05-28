
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    @Override
    public int compareTo(Human human) {
        // Return positive int if this object is greater than the incoming one
        // Return 0 if both objects are equal
        // Return negative int if this object is lower than the incoming one
        // Theory: this goes in ascending order
        // return this.wage - human.getWage();
        return human.getWage() - this.wage;
    }
}
