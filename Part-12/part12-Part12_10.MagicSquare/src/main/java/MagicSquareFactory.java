
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int number = 1;
        int row = 0;
        int col = (int) Math.ceil(1.0 * size / 2) - 1; // size: 3 -> 1

        while (number <= size * size) {
            square.placeValue(col, row, number);
            number++;

            // Calculate the new position
            int newRow = (row - 1 + size) % size;   // keep on boundaries
            int newCol = (col + 1) % size;          // keep on boundaries

            // If the new position is already filled, move down one row
            if (square.readValue(newCol, newRow) != 0) {
                row = (row + 1) % size;
            } else {
                row = newRow;
                col = newCol;
            }
        }
        
        return square;
    }
    
}
