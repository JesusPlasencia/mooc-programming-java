
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        this.advance(1);
    }
    
    public void advance (int howManyDays) {
        
        int addDays = howManyDays % 30;
        int addMonths = (int) Math.floor(howManyDays / 30);
        int addYears = (int) Math.floor(addMonths / 12);
        addMonths = addMonths % 12;
        
        this.day = this.day + addDays;
        this.month = this.month + addMonths;
        this.year = this.year + addYears;
        
        if (this.day >= 31) {
            this.day = this.day - 30;
            this.month ++;
        }
        
        if (this.month >= 13) {
            this.month = this.month - 12;
            this.year = this.year + 1;
        }
    }
    
    public SimpleDate afterNumberOfDays (int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}
