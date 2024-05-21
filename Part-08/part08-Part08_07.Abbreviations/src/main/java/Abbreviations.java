
import java.util.HashMap;

public class Abbreviations {
    
    private HashMap<String, String> abbs;
    
    public Abbreviations() {
        this.abbs = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        if (hasAbbreviation(abbreviation)) {
            System.out.println("Abbreviation is already in the book!");
        } else {
            this.abbs.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation (String abbreviation) {
        String key = sanitizeData(abbreviation);
        return this.abbs.containsKey(key);
    }
    
    public String findExplanationFor(String abbreviation) {
        String key = sanitizeData(abbreviation);
        return this.abbs.get(key);
    }
    
    private static String sanitizeData (String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
