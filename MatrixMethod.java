package MatrixOperations;

import java.util.Scanner;
import java.util.ArrayList;

public class MatrixMethod {

    //Method to add integer matrices
    public static int[][] addMatrices(int[][] matr1, int[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            int[][] sumMatrix = new int[matr1.length][findMatrixColumnLength(matr1)];
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    sumMatrix[row][col] = matr1[row][col] + matr2[row][col];
                }
            }
            readMatrix(sumMatrix);
            return sumMatrix;
        } else {
            System.out.println("Cannot add matrices, rows and columns do not match");
            return null; //Test this out
        }
    }

    //Method to add double matrices
    public static double[][] addMatrices(double[][] matr1, double[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            double[][] sumMatrix = new double[matr1.length][findMatrixColumnLength(matr1)];
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    sumMatrix[row][col] = (double) (matr1[row][col] + matr2[row][col]);
                }
            }
            readMatrix(sumMatrix);
            return sumMatrix;
        } else {
            System.out.println("Cannot add matrices, rows and columns do not match");
            return null; //Test this out
        }
    }

    //Method to return a double matrix after adding a double matrix and integer matrix together
    public static double[][] addMatrices(double[][] matr1, int[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            double[][] sumMatrix = new double[matr1.length][findMatrixColumnLength(matr1)];
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    sumMatrix[row][col] = (double) (matr1[row][col] + matr2[row][col]);
                }
            }
            readMatrix(sumMatrix);
            return sumMatrix;
        } else {
            System.out.println("Cannot add matrices, rows and columns do not match");
            return null; //Test this out
        }
    }

    //Method to subtract integer matrices (very similar to methods above)
    public static int[][] subtractMatrices(int[][] matr1, int[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            int[][] difMatrix = new int[matr1.length][findMatrixColumnLength(matr1)];
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    difMatrix[row][col] = matr1[row][col] - matr2[row][col];
                }
            }
            readMatrix(difMatrix);
            return difMatrix;
        } else {
            System.out.println("Cannot subtract matrices, rows and columns do not match");
            return null; //Test this out
        }
    }

    //Method to subtract double matrices
    public static double[][] subtractMatrices(double[][] matr1, double[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            double[][] difMatrix = new double[matr1.length][findMatrixColumnLength(matr1)];
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    difMatrix[row][col] = (double) (matr1[row][col] - matr2[row][col]);
                }
            }
            readMatrix(difMatrix);
            return difMatrix;
        } else {
            System.out.println("Cannot subtract matrices, rows and columns do not match");
            return null; //Test this out
        }
    }

    //Method to return a double matrix after subtracting an integer matrix with a double matrix
    public static double[][] subtractMatrices(int[][] matr1, double[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            double[][] difMatrix = new double[matr1.length][findMatrixColumnLength(matr1)];
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    difMatrix[row][col] = (double) (matr1[row][col] - matr2[row][col]);
                }
            }
            readMatrix(difMatrix);
            return difMatrix;
        } else {
            System.out.println("Cannot subtract matrices, rows and columns do not match");
            return null; //Test this out
        }
    }

    //Method to return a double matrix after subtracting a double matrix with an integer matrix
    public static double[][] subtractMatrices(double[][] matr1, int[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            double[][] difMatrix = new double[matr1.length][findMatrixColumnLength(matr1)];
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    difMatrix[row][col] = (double) (matr1[row][col] - matr2[row][col]);
                }
            }
            readMatrix(difMatrix);
            return difMatrix;
        } else {
            System.out.println("Cannot subtract matrices, rows and columns do not match");
            return null; //Test this out
        }
    }

    //Method to apply Scalar Multiplication, scalar and matrix are integer types
    public static int[][] scalarMultiplyMatrix(int num, int[][] matrix) {
        int[][] scalarProduct = new int[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarProduct[row][col] = matrix[row][col] * num;
            }
        }
        readMatrix(scalarProduct);
        return scalarProduct;
    }

    //Method to apply Scalar Multiplication, scalar and matrix are double types
    public static double[][] scalarMultiplyMatrix(double num, double[][] matrix) {
        double[][] scalarProduct = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarProduct[row][col] = (double) (matrix[row][col] * num);
            }
        }
        readMatrix(scalarProduct);
        return scalarProduct;
    }

    //Method to apply Scalar Multiplication, scalar is double, matrix is a integer type; returning a double
    public static double[][] scalarMultiplyMatrix(double num, int[][] matrix) {
        double[][] scalarProduct = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarProduct[row][col] = (double) (matrix[row][col] * num);
            }
        }
        readMatrix(scalarProduct);
        return scalarProduct;
    }

    //Method to apply Scalar Multiplication, scalar is integer, matrix is a double type; returning a double
    public static double[][] scalarMultiplyMatrix(int num, double[][] matrix) {
        double[][] scalarProduct = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarProduct[row][col] = (double) (matrix[row][col] * num);
            }
        }
        readMatrix(scalarProduct);
        return scalarProduct;
    }

    //Method to add a whole number to an integer matrix
    public static int[][] scalarAddMatrix(int num, int[][] matrix) {
        int[][] scalarSum = new int[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarSum[row][col] = num + matrix[row][col];
            }
        }
        readMatrix(scalarSum);
        return scalarSum;
    }

    //Method to add a double number to a double matrix
    public static double[][] scalarAddMatrix(double num, double[][] matrix) {
        double[][] scalarSum = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarSum[row][col] = (double) (num + matrix[row][col]);
            }
        }
        readMatrix(scalarSum);
        return scalarSum;
    }

    //Method to add a double number to a integer matrix
    public static double[][] scalarAddMatrix(double num, int[][] matrix) {
        double[][] scalarSum = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarSum[row][col] = (double) (num + matrix[row][col]);
            }
        }
        readMatrix(scalarSum);
        return scalarSum;
    }


    //Method to add a integer number to a double matrix
    public static double[][] scalarAddMatrix( int num, double[][] matrix) {
        double[][] scalarSum = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarSum[row][col] = (double) (num + matrix[row][col]);
            }
        }
        readMatrix(scalarSum);
        return scalarSum;
    }

    //Method to subtract an integer matrix to an integer number
    public static int[][] matrixSubtractScalar(int[][] matrix, int num) {
        int[][] matrixDif = new int[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                matrixDif[row][col] = matrix[row][col] - num;
            }
        }
        readMatrix(matrixDif);
        return matrixDif;
    }

    //Method to subtract a double matrix to a double number
    public static double[][] matrixSubtractScalar(double[][] matrix, double num) {
        double[][] matrixDif = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                matrixDif[row][col] = (double) (matrix[row][col] - num);
            }
        }
        readMatrix(matrixDif);
        return matrixDif;
    }

    //Method to subtract a double number to a integer matrix
    public static double[][] matrixSubtractScalar(int[][] matrix, double num) {
        double[][] matrixDif = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                matrixDif[row][col] = (double) (matrix[row][col] - num);
            }
        }
        readMatrix(matrixDif);
        return matrixDif;
    }

    //Method to subtract a integer number to a double matrix
    public static double[][] matrixSubtractScalar(double[][] matrix, int num) {
        double[][] matrixDif = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                matrixDif[row][col] = (double) (matrix[row][col] - num);
            }
        }
        readMatrix(matrixDif);
        return matrixDif;
    }

    //Method to subtract an integer number to a integer matrix
    public static int[][] scalarSubtractMatrix(int num, int[][] matrix) {
        int[][] scalarDif = new int[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarDif[row][col] = num - matrix[row][col];
            }
        }
        readMatrix(scalarDif);
        return scalarDif;
    }

    //Method to subtract a double number to a double matrix
    public static double[][] scalarSubtractMatrix(double num, double[][] matrix) {
        double[][] scalarDif = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarDif[row][col] = (double) (num - matrix[row][col]);
            }
        }
        readMatrix(scalarDif);
        return scalarDif;
    }

    //Method to subtract a double number to a integer matrix
    public static double[][] scalarSubtractMatrix(double num, int[][] matrix) {
        double[][] scalarDif = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarDif[row][col] = (double) (num - matrix[row][col]);
            }
        }
        readMatrix(scalarDif);
        return scalarDif;
    }

    //Method to subtract a integer number to a double matrix
    public static double[][] scalarSubtractMatrix(int num, double[][] matrix) {
        double[][] scalarDif = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                scalarDif[row][col] = (double) (num - matrix[row][col]);
            }
        }
        readMatrix(scalarDif);
        return scalarDif;
    }

    //Method to round a double matrix
    public static int[][] roundMatrix(double[][] matrix) {
        int[][] newMatrix = new int[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                newMatrix[row][col] = (int) Math.round(matrix[row][col]);
            }
        }
        readMatrix(newMatrix);
        return newMatrix;
    }

    //Method to round an integer matrix (In case user decides to apply this)
    public static int[][] roundMatrix(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                newMatrix[row][col] = (int) Math.round(matrix[row][col]);
            }
        }
        readMatrix(newMatrix);
        return newMatrix;
    }

    //Method to multiply integer matrices
    public static int[][] multiplyMatrices(int[][] matr1, int[][] matr2) {
        if (findMatrixColumnLength(matr1) == matr2.length) {

            ArrayList<ArrayList<Integer>> matr1Rows = new ArrayList<ArrayList<Integer>>();
            ArrayList<ArrayList<Integer>> matr2Columns = new ArrayList<ArrayList<Integer>>();

            int[][] matrixProduct = new int[matr1.length][findMatrixColumnLength(matr2)];

            for (int row = 0; row < matr1.length; row++) {
                matr1Rows.add(helperRowMatrix(matr1, row));
            }
            for (int col = 0; col < findMatrixColumnLength(matr2); col++) {
                matr2Columns.add(helperColMatrix(matr2, col));
            }

            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr2); col++) {
                    matrixProduct[row][col] = rowColumnMultiplyInt(matr1Rows.get(row), matr2Columns.get(col));
                }
            }

            readMatrix(matrixProduct);
            return matrixProduct;
        } else {
            System.out.println("Cannot multiply matrices, the column of the first matrix does not match the row of the second matrix");
            return null;
        }
    }

    //Method to multiply double matrices
    public static double[][] multiplyMatrices(double[][] matr1, double[][] matr2) {
        if (findMatrixColumnLength(matr1) == matr2.length) {

            ArrayList<ArrayList<Double>> matr1Rows = new ArrayList<ArrayList<Double>>();
            ArrayList<ArrayList<Double>> matr2Columns = new ArrayList<ArrayList<Double>>();

            double[][] matrixProduct = new double[matr1.length][findMatrixColumnLength(matr2)];

            for (int row = 0; row < matr1.length; row++) {
                matr1Rows.add(helperRowMatrix(matr1, row));
            }
            for (int col = 0; col < findMatrixColumnLength(matr2); col++) {
                matr2Columns.add(helperColMatrix(matr2, col));
            }

            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr2); col++) {
                    matrixProduct[row][col] = (double) rowColumnMultiplyDouble(matr1Rows.get(row), matr2Columns.get(col));
                }
            }

            readMatrix(matrixProduct);
            return matrixProduct;
        } else {
            System.out.println("Cannot multiply matrices, the column of the first matrix does not match the row of the second matrix");
            return null;
        }
    }

    //Method to get a certain row from a double matrix
    public static ArrayList<Double> helperRowMatrix(double[][] matr1, int num) {
        ArrayList<Double> matr1RowElements = new ArrayList<Double>();
        for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
            matr1RowElements.add(matr1[num][col]);
        }
        return matr1RowElements;
    }

    //Method to get a certain column from an integer matrix
    public static ArrayList<Double> helperColMatrix(double[][]matr2, int num) {
        ArrayList<Double> matr2ColumnElements = new ArrayList<Double>();
        for (int row = 0; row < matr2.length; row++) {
            matr2ColumnElements.add(matr2[row][num]);
        }
        return matr2ColumnElements;
    }

    //Method to multiply a double Matrix row with a column of another double matrix
    public static double rowColumnMultiplyDouble(ArrayList<Double> row, ArrayList<Double> col) {
        if (row.size() == col.size()) {
            double result = 0;
            for (int index = 0; index < row.size(); index++) {
                result += row.get(index) * col.get(index);
            }
            return result;
        } else {
            System.out.println("Cannot perform row and column multiplication");
            return -1;
        }
    }

    //Method to multiply an integer Matrix row with a column of another integer matrix
    public static int rowColumnMultiplyInt(ArrayList<Integer> row, ArrayList<Integer> col) {
        if (row.size() == col.size()) {
            int result = 0;
            for (int index = 0; index < row.size(); index++) {
                result += row.get(index) * col.get(index);
            }
            return result;
        } else {
            System.out.println("Cannot perform row and column multiplication");
            return -1;
        }
    }

    //Method to get a certain row from an integer matrix
    public static ArrayList<Integer> helperRowMatrix(int[][] matr1, int num) {
        ArrayList<Integer> matr1RowElements = new ArrayList<Integer>();
        for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
            matr1RowElements.add(matr1[num][col]);
            }
        return matr1RowElements;
    }


    //Method to get a certain column from an integer matrix
    public static ArrayList<Integer> helperColMatrix(int[][]matr2, int num) {
        ArrayList<Integer> matr2ColumnElements = new ArrayList<Integer>();
        for (int row = 0; row < matr2.length; row++) {
            matr2ColumnElements.add(matr2[row][num]);
        }
        return matr2ColumnElements;
    }

    //Method to multiply a double matrix with an integer matrix
    public static double[][] multiplyMatrices(double[][] matr1, int[][] matr2) {
        if (findMatrixColumnLength(matr1) == matr2.length) {

            ArrayList<ArrayList<Double>> matr1Rows = new ArrayList<ArrayList<Double>>();
            ArrayList<ArrayList<Integer>> matr2Columns = new ArrayList<ArrayList<Integer>>();

            double[][] matrixProduct = new double[matr1.length][findMatrixColumnLength(matr2)];

            for (int row = 0; row < matr1.length; row++) {
                matr1Rows.add(helperRowMatrix(matr1, row));
            }
            for (int col = 0; col < findMatrixColumnLength(matr2); col++) {
                matr2Columns.add(helperColMatrix(matr2, col));
            }

            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr2); col++) {
                    matrixProduct[row][col] = (double) rowColumnMultiplyDoubleInt(matr1Rows.get(row), matr2Columns.get(col));
                }
            }

            readMatrix(matrixProduct);
            return matrixProduct;
        } else {
            System.out.println("Cannot multiply matrices, the column of the first matrix does not match the row of the second matrix");
            return null;
        }
    }

    //Method to multiply an integer Matrix row with a column of another integer matrix
    public static double rowColumnMultiplyDoubleInt(ArrayList<Double> row, ArrayList<Integer> col) {
        if (row.size() == col.size()) {
            double result = 0;
            for (int index = 0; index < row.size(); index++) {
                result += row.get(index) * col.get(index);
            }
            return result;
        } else {
            System.out.println("Cannot perform row and column multiplication");
            return -1;
        }
    }

    //Method to find the inverse of a matrix****
    //Method to find inverse of a 2X2 integer matrix
    public static double[][] inverseOf2X2(int[][] matrix) throws ArithmeticException {
        if (matrix.length == 2 && findMatrixColumnLength(matrix) == 2) {
            try {
                double determinant = (double) 1 / ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
                int[][] matrixMultiply = {{matrix[1][1], -matrix[0][1]}, {-matrix[1][0], matrix[0][0]} };
                double[][] newMatrix = scalarMultiplyMatrix(determinant, matrixMultiply);
                return newMatrix;
            } catch (ArithmeticException e) {
                throw new ArithmeticException("Division by Zero");
            }
        } else {
            System.out.println("Not a 2X2 Matrix");
            return null;
        }
    }

    public static double[][] inverseOf2X2(double[][] matrix) throws ArithmeticException {
        if (matrix.length == 2 && findMatrixColumnLength(matrix) == 2) {
            try {
                double determinant = (double) 1 / ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
                double[][] matrixMultiply = {{matrix[1][1], -matrix[0][1]}, {-matrix[1][0], matrix[0][0]} };
                double[][] newMatrix = scalarMultiplyMatrix(determinant, matrixMultiply);
                return newMatrix;
            } catch (ArithmeticException e) {
                throw new ArithmeticException("Division by Zero");
            }
        } else {
            System.out.println("Not a 2X2 Matrix");
            return null;
        }
    }



    //Method to divide matrices****

    //Method to find the inner product of two integer matrices
    public static int innerProduct(int[][] matr1, int[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            int iProduct = 0;
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    iProduct += matr1[row][col] * matr2[row][col];
                }
            }
            System.out.println(iProduct);
            return iProduct;
        } else {
            System.out.println("Cannot find the inner product. Rows and Columns must match");
            return -1;
        }
    }

    //Method to find the inner product of two double matrices
    public static double innerProduct(double[][] matr1, double[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            double iProduct = 0;
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    iProduct += matr1[row][col] * matr2[row][col];
                }
            }
            System.out.println(iProduct);
            return iProduct;
        } else {
            System.out.println("Cannot find the inner product. Rows and Columns must match");
            return -1;
        }
    }

    //Method to find the inner product of two double matrices
    public static double innerProduct(double[][] matr1, int[][] matr2) {
        if (matr1.length == matr2.length && findMatrixColumnLength(matr1) == findMatrixColumnLength(matr2)) {
            double iProduct = 0;
            for (int row = 0; row < matr1.length; row++) {
                for (int col = 0; col < findMatrixColumnLength(matr1); col++) {
                    iProduct += (double) (matr1[row][col] * matr2[row][col]);
                }
            }
            System.out.println(iProduct);
            return iProduct;
        } else {
            System.out.println("Cannot find the inner product. Rows and Columns must match");
            return -1;
        }
    }

    //Integer Matrix Integer Powers using Recursion
    public static int[][] matrixPower(int[][] matrix, int num) {

        if (num == 0) {
            return identityIntegerMatrix(matrix.length, findMatrixColumnLength(matrix));
        } else if (num == 1) {
            return matrix;
        } else if (num == 2) {
            return multiplyMatrices(matrix, matrix);
        } else {
            return multiplyMatrices(matrixPower(matrix, num -1), matrix);
        }
    }

    //Double Matrix Double Powers using Recursion
    public static double[][] matrixPower(double[][] matrix, double num) {

        if (num == 0) {
            return identityDoubleMatrix(matrix.length, findMatrixColumnLength(matrix));
        } else if (num == 1) {
            return matrix;
        } else if (num == 2) {
            return multiplyMatrices(matrix, matrix);
        } else {
            return multiplyMatrices(matrixPower(matrix, num -1), matrix);
        }
    }

    //Double Matrix Integer Powers using Recursion
    public static double[][] matrixPower(double[][] matrix, int num) {

        if (num == 0) {
            return identityDoubleMatrix(matrix.length, findMatrixColumnLength(matrix));
        } else if (num == 1) {
            return matrix;
        } else if (num == 2) {
            return multiplyMatrices(matrix, matrix);
        } else {
            return multiplyMatrices(matrixPower(matrix, num -1), matrix);
        }
    }

    //Double Matrix Integer Powers using Recursion
    public static double[][] matrixPower(int[][] matrix, double num) {

        if (num == 0) {
            return identityDoubleMatrix(matrix.length, findMatrixColumnLength(matrix));
        } else if (num == 1) {
            return intToDouble(matrix);
        } else if (num == 2) {
            return intToDouble(multiplyMatrices(matrix, matrix));
        } else {
            return multiplyMatrices(matrixPower(matrix, num -1), matrix);
        }
    }

    //Method to make an integer matrix a double matrix
    public static double[][] intToDouble(int[][] matrix) {
        double[][] newMatrix = new double[matrix.length][findMatrixColumnLength(matrix)];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < findMatrixColumnLength(matrix); col++) {
                newMatrix[row][col] = (double) matrix[row][col];
            }
        }
        return newMatrix;
    }

    //Method to return an integer identity matrix using rows and cols
    public static int[][] identityIntegerMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        int Diagonal = 0;
        while (Diagonal != row && Diagonal != col) {
            matrix[Diagonal][Diagonal] = 1;
            Diagonal++;
        }
        readMatrix(matrix);
        return matrix;
    }

    //Method to return a double identity matrix using rows and cols
    public static double[][] identityDoubleMatrix(int row, int col) {
        double[][] matrix = new double[row][col];
        int Diagonal = 0;
        while (Diagonal != row && Diagonal != col) {
            matrix[Diagonal][Diagonal] = 1;
            Diagonal++;
        }
        readMatrix(matrix);
        return matrix;
    }



    //Method to read Matrix of integer type
    public static void readMatrix(int[][] matr) {
        for (int row = 0; row < matr.length; row++) {
            System.out.print("|");
            for (int col = 0; col < matr[row].length; col++) {
                int space = MatrixOperations.MatrixFormatter.largestSpaceLength(matr, col);
                if (col != (matr[row].length - 1)) {
                    System.out.print(matr[row][col] + " ");
                } else {
                    System.out.print(matr[row][col]);
                }
                MatrixOperations.MatrixFormatter.inputSpace(space - MatrixOperations.MatrixFormatter.numSpaceLength(matr[row][col]));
            }
            System.out.print("|\n");
        }
        System.out.println();
    }

    //Method to read Matrix of double type
    public static void readMatrix(double[][] matr) {
        for (int row = 0; row < matr.length; row++) {
            System.out.print("|");
            for (int col = 0; col < matr[row].length; col++) {
                int space = MatrixOperations.MatrixFormatter.largestSpaceLength(matr, col);
                if (col != (matr[row].length - 1)) {
                    System.out.print(matr[row][col] + " ");
                } else {
                    System.out.print(matr[row][col]);
                }
                MatrixOperations.MatrixFormatter.inputSpace(space - MatrixOperations.MatrixFormatter.numSpaceLength(matr[row][col]));
            }
            System.out.print("|\n");
        }
        System.out.println();
    }

    //Method to find column length of a matrix of integer type
    public static int findMatrixColumnLength(int[][] matr) {
        boolean equal = true;
        for (int row = 1; row < matr.length; row++) {
            if (matr[row].length == matr[0].length) {
                continue;
            } else {
                equal = false;
            }
        }
        return matr[0].length;
    }

    //Method to find column length of a matrix of double type
    public static int findMatrixColumnLength(double[][] matr) {
        boolean equal = true;
        for (int row = 1; row < matr.length; row++) {
            if (matr[row].length == matr[0].length) {
                continue;
            } else {
                equal = false;
            }
        }
        return matr[0].length;
    }

    //Method to transpose matrix of integer type
    public static int[][] transposeMatrix(int[][] matr) {
        int[][] newMatr = new int[findMatrixColumnLength(matr)][matr.length];
        for (int row = 0; row < matr.length; row++) {
            for (int col = 0; col < matr[row].length; col++) {
                newMatr[row][col] = matr[col][row];
            }
        }
        readMatrix(newMatr);
        return newMatr;
    }

    //Method to transpose matrix of double type
    public static double[][] transposeMatrix(double[][] matr) {
        double[][] newMatr = new double[findMatrixColumnLength(matr)][matr.length];
        for (int row = 0; row < matr.length; row++) {
            for (int col = 0; col < matr[row].length; col++) {
                newMatr[row][col] = matr[col][row];
            }
        }
        readMatrix(newMatr);
        return newMatr;
    }
}
