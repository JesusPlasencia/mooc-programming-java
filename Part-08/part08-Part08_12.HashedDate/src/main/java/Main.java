
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate d1 = new SimpleDate(1, 2, 2000);
        SimpleDate d2 = new SimpleDate(1, 2, 2001);
        SimpleDate d3 = new SimpleDate(2, 1, 2001);
        System.out.println("HashMap of Date 1) " + d2.hashCode());
        System.out.println("HashMap of Date 2) " + d3.hashCode());
    }
}
