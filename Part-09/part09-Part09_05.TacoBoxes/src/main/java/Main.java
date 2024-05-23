
public class Main {

    public static void main(String[] args) {
        // Test your code here!
//        TripleTacoBox triple = new TripleTacoBox();
//        System.out.println("Remaining: " + triple.tacosRemaining());
//        // eating
//        triple.eat();
//        triple.eat();
//        
//        System.out.println("Remaining: " + triple.tacosRemaining());
        
        CustomTacoBox custom = new CustomTacoBox(9);
        // eating
        System.out.println("Remaining: " + custom.tacosRemaining());
        for (int i = 0; i < 4; i++) {
            custom.eat();
        }
        
        System.out.println("Remaining: " + custom.tacosRemaining());
        
    }
}
