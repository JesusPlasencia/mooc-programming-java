
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description

        VehicleRegistry vr = new VehicleRegistry();
        vr.add(new LicensePlate("FI", "AAA-111"), "Arto");
        vr.add(new LicensePlate("FI", "XX-999"), "Arto");

        
        System.out.println(vr.get(new LicensePlate("FI", "XX-999")));
//        HashMap<LicensePlate, String> owners = new HashMap<>();
//        owners.put(li1, "Arto");
//        owners.put(li3, "Jürgen");
//
//        System.out.println("owners:");
//        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
//        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }
}
