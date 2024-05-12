
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public SimpleDate getBirthday() {
        return birthday;
    }
    
    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object obj) {
        
        if(this == obj) return true;
        
        if (!(obj instanceof Person)) return false;
        
        Person comparedPerson = (Person) obj;
        
        if (
                this.name.equals(comparedPerson.getName()) &&
                this.weight == comparedPerson.getWeight() &&
                this.height == comparedPerson.getHeight() &&
                this.birthday.equals(comparedPerson.getBirthday())
                ) {
            return true;
        }
        
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    
}
