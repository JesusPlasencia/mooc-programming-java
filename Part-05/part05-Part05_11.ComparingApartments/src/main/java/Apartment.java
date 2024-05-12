
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getSquares () {
        return this.squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }
    
    public int getPriceApt () {
        return this.squares * this.pricePerSquare;
    }
    
    public boolean largerThan (Apartment compared) {
        if (getSquares() > compared.getSquares()) return true;
        return false;
    }
    
    public int priceDifference (Apartment compared) {
        int priceCurrentApt = this.getPriceApt();
        int priceComparedApt = compared.getPriceApt();
        return Math.abs(priceCurrentApt - priceComparedApt);
    }
    
    public boolean moreExpensiveThan (Apartment compared) {
        int priceCurrentApt = this.getPriceApt();
        int priceComparedApt = compared.getPriceApt();
        if (priceCurrentApt > priceComparedApt) return true;
        return false;
    }
    
}
