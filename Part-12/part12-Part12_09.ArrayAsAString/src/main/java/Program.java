
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;

        int[][] matrixTwo = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };
        System.out.println(arrayAsString(matrixTwo));

//        System.out.println("row, column, value");
//        for (int row = 0; row < twoDimensionalArray.length; row++) {
//            for (int column = 0; column < twoDimensionalArray[row].length; column++) {
//                int value = twoDimensionalArray[row][column];
//                System.out.println("" + row + ", " + column + ", " + value);
//            }
//        }
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < array.length; row++) {
            StringBuilder line = new StringBuilder();
            for (int column = 0; column < array[row].length; column++) {
                line.append(array[row][column]);
            }
            result.append(line.toString() + "\n");
        }

        return result.toString().trim();
    }

}
