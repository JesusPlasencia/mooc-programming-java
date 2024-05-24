
public class Main {
    public static void main(String[] args) {
        // test your classes here
//        Truck truck = new Truck(100);
//        
//        Box bookBox = new Box(95);
//
//        bookBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
//        bookBox.add(new Book("Robert Martin", "Clean Code", 1));
//        bookBox.add(new Book("Kent Beck", "Test Driven Development", 0.7));
//
//        Box cdBox = new Box(4);
//        cdBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
//        cdBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
//        cdBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
//        
//        truck.add(bookBox);
//        truck.add(cdBox);
//
//        System.out.println(truck);
        Factory myFactory = new Factory();
        System.out.println(myFactory.produceNew());
    }
}
