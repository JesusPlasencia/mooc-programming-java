
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            
            Files.lines(Paths.get("literacy.csv"))
                 .map(row -> row.split(","))
                 .sorted(LiteracyComparison::sortedByPercentage)
                 .forEach(LiteracyComparison::printLine);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static int sortedByPercentage (String[] prev, String[] curr) {
        double diff = Double.parseDouble(prev[5]) - Double.parseDouble(curr[5]);
        if (diff > 0) {
            return 1;
        } else if (diff == 0) {
            return 0;
        }
        return -1;
    }
    
    private static void printLine(String[] array) {
        String gender = array[2].split(" ")[1];
        String country = array[3];
        int year = Integer.valueOf(array[4]);
        double percentage = Double.valueOf(array[5]);
        System.out.println(country + " (" + year + ")" + ", " + gender + ", " + percentage);
    }
    
}
