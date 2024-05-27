import java.util.ArrayList;

public class Party {
    
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jesus", "Plasencia", 1969));
        people.add(new Person("John", "Lennon", 1940));
        people.add(new Person("John", "Mayer", 1980));
        people.add(new Person("Alisson", "Swift", 1989));
        people.add(new Person("Paul", "McCartney", 1944));
        
//        long count = people.stream().filter(person -> person.getBirthYear() < 1970).count();
//        System.out.println("Number of persons born before the year 1970: " + count);
        
        long count = people.stream().filter(person -> person.getFirstName().startsWith("A")).count();
        System.out.println("How many persons' first names start with the letter \"A\": " + count);
        
        people.stream().map(person -> person.getFirstName()).distinct().sorted().forEach(p -> System.out.println(p));
    }
    
}
