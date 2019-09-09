package MatrixOperations;

public class MatrixFormatter {

    //Gets number of spaces of a number minus one (ex. 100 will return 2 spaces) with integer matrix
    public static int numSpaceLength(int num) {
        int space = 0; //Can be a 1 to account for 1-spaced integers (ex. 1)
        while (num >= 10) {
            ++space;
            num /= 10;
        }
        return space;
    }

    //Gets number of spaces of a number minus one (ex. 100 will return 2 spaces) with double matrix
    public static int numSpaceLength(double num) {
        int space = 0; //Can be a 1 to account for 1-spaced integers (ex. 1)
        while (num >= 10) {
            ++space;
            num /= 10;
        }
        return space;
    }

    //Gets the largest space length with matrix of integer type
    public static int largestSpaceLength(int[][] matrix, int column) {
        int greatestSpaceLength = 0;
        for (int row = 0; row < matrix.length; row++) {
            int spaceLength = numSpaceLength(matrix[row][column]);
            if (spaceLength > greatestSpaceLength) {
                greatestSpaceLength = spaceLength;
            }
        }
        return greatestSpaceLength;
    }

    //Gets the largest space length with matrix of double type
    public static int largestSpaceLength(double[][] matrix, int column) {
        int greatestSpaceLength = 0;
        for (int row = 0; row < matrix.length; row++) {
            int spaceLength = numSpaceLength(matrix[row][column]);
            if (spaceLength > greatestSpaceLength) {
                greatestSpaceLength = spaceLength;
            }
        }
        return greatestSpaceLength;
    }

    //inputs space based on integer argument
    public static void inputSpace(int num) {
        while (num != 0) {
            System.out.print(" ");
            --num;
        }
    }

    public static void insertHorizontalLine(int num) {
        while (num != 0) {
            System.out.print("-");
            --num;
        }
    }
}
