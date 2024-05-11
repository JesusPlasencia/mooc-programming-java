
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter();
        System.out.println(counter.value());
        counter.increase();
        counter.increase();
        counter.increase();
        counter.increase(10);
        
        counter.decrease();
        counter.decrease();
        counter.decrease();
        counter.decrease();
        counter.decrease(6);
        
        System.out.println(counter.value());
    }
}
