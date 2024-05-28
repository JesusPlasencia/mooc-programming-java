

public class Checker {

    public boolean isDayOfWeek (String string) {
        return string.matches("(mon|tue|wed|thu|fri|sat|sun)");
    }
    
    public boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u)+");
    }
    
    public boolean timeOfDay(String string) {
        // [0-1]  : (0|1)
        // [0-9] : (0|1|2|3|4|5|6|7|8|9)
        // or
        // 2[0-3]: (20|21|22|23)
        return string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }
    
}
