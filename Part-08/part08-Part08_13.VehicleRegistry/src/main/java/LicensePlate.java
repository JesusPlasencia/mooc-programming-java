
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getLiNumber() {
        return liNumber;
    }
    
    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (!(obj instanceof LicensePlate)) {
            return false;
        }
        
        LicensePlate plate = (LicensePlate) obj;
        
        if (this.country.equals(plate.getCountry()) && this.liNumber.equals(plate.getLiNumber())) {
            return true;
        }
        
        return false; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int hashCode() {
        return this.country.hashCode() + this.liNumber.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
