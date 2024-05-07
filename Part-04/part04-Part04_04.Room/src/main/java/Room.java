/**
 *
 * @author JESUS
 */
public class Room {

    private String code;
    private int seats;
    
    public Room (String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }
    
    // Methods are written beneath the constructor
    
    // Static Modifier indicates that the method in question does not belong to an object and
    // thus cannot be used to access any variables that belongs to objects
}
