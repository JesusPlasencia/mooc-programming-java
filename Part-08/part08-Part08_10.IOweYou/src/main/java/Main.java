
public class Main {

    public static void main(String[] args) {
        // Test your program here
//        RegisterSightingCounter register = new RegisterSightingCounter();
//        register.addSighting("XREF-2480");
//        register.addSighting("XREF-2480");
//        register.addSighting("XREF-2480");
//        
//        System.out.println("Sighting Counter of XREF-2480: " + register.timesSighted("XREF-2480"));
//        System.out.println("Sighting Counter of XREF-2481: " + register.timesSighted("XREF-2481"));

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
