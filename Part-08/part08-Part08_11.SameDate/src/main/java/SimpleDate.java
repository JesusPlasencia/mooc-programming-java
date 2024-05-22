
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    @Override
    public boolean equals(Object obj) {
        
        // Both referenced the same object (same pointer)
        if (this == obj) {
            return true;
        }
        
        // Obj is not an instanceOf SimpleDate
        if (!(obj instanceof SimpleDate)) {
            return false;
        }
        
        // Convert to Object to SimpleDate
        SimpleDate dateConverted = (SimpleDate) obj;
        
        // Check attributes
        if (this.day == dateConverted.getDay() &&
            this.month == dateConverted.getMonth() &&
            this.year == dateConverted.getYear()) {
            return true;
        }
        
        return false; 
    }
    
}
