
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> licenses;

    public VehicleRegistry() {
        this.licenses = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (licenses.containsKey(licensePlate)) {
            return false;
        }
        licenses.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        for (LicensePlate license : licenses.keySet()) {
            if (license.equals(licensePlate)) {
                return licenses.get(license);
            }
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!this.licenses.containsKey(licensePlate)) {
            return false;
        }
        this.licenses.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate license : licenses.keySet()) {
            System.out.println(license);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : licenses.values()) {
            if (owners.contains(owner)) {
                continue;
            }
            owners.add(owner);
        }
        
        for (String ow : owners) {
            System.out.println(ow);
        }
    }
}
