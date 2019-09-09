import java.util.Scanner;
import java.util.HashMap;

public class UserInput {
    static Scanner userInput = new Scanner(System.in);

    //Method to check user input for integer
    public static int checkUserIntInput() {
        boolean correctUserInput = userInput.hasNextInt();
        while (!correctUserInput) {
            System.out.println("Please enter a valid whole number.");
            userInput.next();
            correctUserInput = userInput.hasNextInt();
        }
        return userInput.nextInt();
    }

    //Method to check user input for double
    public static double checkUserDoubleInput() {
        boolean correctUserInput = userInput.hasNextDouble();
        while (!correctUserInput) {
            System.out.println("Please enter a valid decimal number.");
            userInput.next();
            correctUserInput = userInput.hasNextDouble();
        }
        return userInput.nextDouble();
    }

    //Method to have user create integer matrix
    public static int[][] userInputIntMatrix() {
        System.out.println("Enter the number of rows for the matrix");
        int matrixRow = checkUserIntInput();
        while (matrixRow < 0) {
            System.out.println("Please enter a non-negative number");
            matrixRow = checkUserIntInput();
        }
        System.out.println("Enter the number of columns for the matrix");
        int matrixCol = checkUserIntInput();
        while (matrixCol < 0) {
            System.out.println("PLease enter a non-negative number");
            matrixCol = checkUserIntInput();
        }
        int matrix[][] = new int[matrixRow][matrixCol];
        for (int row = 0; row < matrix.length; row++) { //Check user's Input here
            System.out.println("Enter the " + MatrixOperations.MatrixMethod.findMatrixColumnLength(matrix) + " number(s) for Row " + (row + 1)); //Suggestion (extra): Method to change an int to a string HERE
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = checkUserIntInput();
            }
        }
        return matrix;
    }

    //Method to have user create a double matrix
    public static double[][] userInputDoubleMatrix() {
        System.out.println("Enter the number of rows for the matrix");
        int matrixRow = checkUserIntInput();
        while (matrixRow < 0) {
            System.out.println("PLease enter a non-negative number");
            matrixRow = checkUserIntInput();
        }
        System.out.println("Enter the number of columns for the matrix");
        int matrixCol = checkUserIntInput();
        while (matrixCol < 0) {
            System.out.println("PLease enter a non-negative number");
            matrixCol = checkUserIntInput();
        }
        double matrix[][] = new double[matrixRow][matrixCol];
        for (int row = 0; row < matrix.length; row++) { //Check user's Input here
            System.out.println("Enter the " + MatrixOperations.MatrixMethod.findMatrixColumnLength(matrix) + " number(s) for Row " + (row + 1)); //Suggestion (extra): Method to change an int to a string HERE
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = checkUserDoubleInput();
            }
        }
        return matrix;
    }

    public static int checkUserCommand(int range1, int range2) {
        int cmd = UserInput.checkUserIntInput();
        while (cmd != -1) {
            while (cmd < range1 || cmd > range2) {
                System.out.println("Please enter a valid command");
                cmd = UserInput.checkUserIntInput();
            }
            return cmd;
        }
        return -1;
    }


    public static void calculatorIntro() {
        System.out.println("Hello! Welcome to the Linear Algebra Calculator!\nWhat would you like to do?");
        MatrixOperations.MatrixFormatter.insertHorizontalLine(49);
        System.out.println();
        System.out.println("1 : Enter a Matrix\n2 : Enter a Scalar\n\nEnter -1 to quit");
    }

    static HashMap<Integer, String> operations = new HashMap<>() {{
        put(1, "Add to a Matrix");
        put(2, "Add to a Scalar");
        put(3, "Subtract from a Matrix");
        put(4, "Subtract from a Scalar");
        put(5, "Multiply to a Matrix");
        put(6, "Multiply to a Scalar");
        put(7, "Round");
        put(8, "Find the Power a number");
        //put(#, "Transpose");
        //put(#, "Find Inner Product");
        //put(#, "Find Inverse");
        //put(#, "Find Inner Product");


    }};

    //Operations for an Integer Matrix
    public static int operationIntMatrix(int[][] matrix) {
        operations.put(9, "Transpose");
        operations.put(10, "Find Inner Product");

        Scanner userInput = new Scanner(System.in);
        System.out.println("What would you like to do with this Matrix?");
        for (int key : operations.keySet()) {
            System.out.print(key + ": ");
            System.out.println(operations.get(key));
        }
        int opNum = checkUserCommand(1, 10);
        int choice;
        switch (opNum) {
            case 1:
                System.out.println("What type of Matrix do you want your current Matrix to add to?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("+\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    int[][] sumMatrix = MatrixOperations.MatrixMethod.addMatrices(matrix, userMatrix);
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("+\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.addMatrices(userMatrix, matrix);
                    return -1;
                }
            case 2:
                System.out.println("What type of Scalar do you want your current Matrix to add to?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("+\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    int[][] sumMatrix = MatrixOperations.MatrixMethod.scalarAddMatrix(userScalar, matrix);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("+\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.scalarAddMatrix(userScalar, matrix);
                    return -1;
                }
            case 3:
                System.out.println("What type of Matrix do you want your current Matrix to subtract from?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix(); //creating int matrix
                    MatrixOperations.MatrixMethod.readMatrix(matrix); //reading original matrix
                    System.out.println("-\n"); //
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix); //read created matrix
                    System.out.println("||\n");
                    int[][] difMatrix = MatrixOperations.MatrixMethod.subtractMatrices(matrix, userMatrix); //sum
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("-\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.subtractMatrices(matrix, userMatrix);
                    return -1;
                }
            case 4:
                System.out.println("What type of Scalar do you want your current Matrix to subtract from?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("-\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    int[][] difMatrix = MatrixOperations.MatrixMethod.matrixSubtractScalar( matrix, userScalar);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("-\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.matrixSubtractScalar( matrix, userScalar);
                    return -1;
                }
            case 5:
                System.out.println("What type of Matrix do you want your current Matrix to multiply to?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("*\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    int[][] productMatrix = MatrixOperations.MatrixMethod.multiplyMatrices(matrix, userMatrix);
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("*\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] productMatrix = MatrixOperations.MatrixMethod.multiplyMatrices(userMatrix, matrix);
                    return -1;
                }
            case 6:
                System.out.println("What type of Scalar do you want your current Matrix to multiply to?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("*\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    int[][] productMatrix = MatrixOperations.MatrixMethod.scalarMultiplyMatrix(userScalar, matrix);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("*\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    double[][] productMatrix = MatrixOperations.MatrixMethod.scalarMultiplyMatrix(userScalar, matrix);
                    return -1;
                }
            case 7:
                MatrixOperations.MatrixMethod.readMatrix(matrix);
                System.out.println("Rounds to\n");
                MatrixOperations.MatrixMethod.roundMatrix(matrix);
                return -1;

            case 8:
                System.out.println("What type of number do you want your current Matrix to the power of?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int userScalar = userInput.nextInt();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("To the power of" + userScalar);
                    System.out.println("||\n");
                    int[][] powerMatrix = MatrixOperations.MatrixMethod.matrixPower(matrix, userScalar);
                    return -1;
                } else if (choice == 2) {
                    double userScalar = userInput.nextDouble();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("To the power of" + userScalar);
                    System.out.println("||\n");
                    double[][] powerMatrix = MatrixOperations.MatrixMethod.matrixPower(matrix, userScalar);
                    return -1;
                }
            case 9:
                MatrixOperations.MatrixMethod.readMatrix(matrix);
                System.out.println("Transposed is\n");
                MatrixOperations.MatrixMethod.transposeMatrix(matrix);
                return -1;
            case 10:
                System.out.println("What type of Matrix do you want to use the find the inner product with your current Matrix?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    System.out.println("The inner proudct of\n");
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("and\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    int innerProductMatrix = MatrixOperations.MatrixMethod.innerProduct(matrix, userMatrix);
                    return -1;

                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    System.out.println("The inner proudct of\n");
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("and\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double innerProductMatrix = MatrixOperations.MatrixMethod.innerProduct(userMatrix, matrix);
                    return -1;
                }
        }
        return -1;
    }

    public static int operationDoubleMatrix(double[][] matrix) {

        operations.put(9, "Transpose");
        operations.put(10, "Find Inner Product");

        Scanner userInput = new Scanner(System.in);
        System.out.println("What would you like to do with this Matrix?");
        for (int key : operations.keySet()) {
            System.out.print(key + ": ");
            System.out.println(operations.get(key));
        }
        int opNum = checkUserCommand(1, 10);
        int choice;
        switch (opNum) {
            case 1:
                System.out.println("What type of Matrix do you want your current Matrix to add to?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("+\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.addMatrices(matrix, userMatrix);
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("+\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.addMatrices(userMatrix, matrix);
                    return -1;
                }
            case 2:
                System.out.println("What type of Scalar do you want your current Matrix to add to?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("+\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.scalarAddMatrix(userScalar, matrix);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("+\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.scalarAddMatrix(userScalar, matrix);
                    return -1;
                }
            case 3:
                System.out.println("What type of Matrix do you want your current Matrix to subtract from?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix(); //creating int matrix
                    MatrixOperations.MatrixMethod.readMatrix(matrix); //reading original matrix
                    System.out.println("-\n"); //
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix); //read created matrix
                    System.out.println("||\n");
                    double[][] difMatrix = MatrixOperations.MatrixMethod.subtractMatrices(matrix, userMatrix); //dif
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("-\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] difMatrix = MatrixOperations.MatrixMethod.subtractMatrices(matrix, userMatrix);
                    return -1;
                }
                //here
            case 4:
                System.out.println("What type of Scalar do you want your current Matrix to subtract from?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("-\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    double[][] difMatrix = MatrixOperations.MatrixMethod.matrixSubtractScalar(matrix, userScalar);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("-\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    double[][] difMatrix = MatrixOperations.MatrixMethod.matrixSubtractScalar(matrix, userScalar);
                    return -1;
                }
            case 5:
                System.out.println("What type of Matrix do you want your current Matrix to multiply to?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("*\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] productMatrix = MatrixOperations.MatrixMethod.multiplyMatrices(matrix, userMatrix);
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("*\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] productMatrix = MatrixOperations.MatrixMethod.multiplyMatrices(userMatrix, matrix);
                    return -1;
                }
            case 6:
                System.out.println("What type of Scalar do you want your current Matrix to multiply to?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("*\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    double[][] productMatrix = MatrixOperations.MatrixMethod.scalarMultiplyMatrix(userScalar, matrix);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("*\n");
                    System.out.println(userScalar);
                    System.out.println("||\n");
                    double[][] productMatrix = MatrixOperations.MatrixMethod.scalarMultiplyMatrix(userScalar, matrix);
                    return -1;
                }
            case 7:
                MatrixOperations.MatrixMethod.readMatrix(matrix);
                System.out.println("Rounds to\n");
                MatrixOperations.MatrixMethod.roundMatrix(matrix);
                return -1;

            case 8:
                System.out.println("What type of number do you want your current Matrix to the power of?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("To the power of " + userScalar);
                    System.out.println("||\n");
                    double[][] powerMatrix = MatrixOperations.MatrixMethod.matrixPower(matrix, userScalar);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("To the power of " + userScalar);
                    System.out.println("||\n");
                    double[][] powerMatrix = MatrixOperations.MatrixMethod.matrixPower(matrix, userScalar);
                    return -1;
                }
            case 9:
                MatrixOperations.MatrixMethod.readMatrix(matrix);
                System.out.println("Transposed is\n");
                MatrixOperations.MatrixMethod.transposeMatrix(matrix);
                return -1;

            case 10:
                System.out.println("What type of Matrix do you want to use the find the inner product with your current Matrix?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    System.out.println("The inner proudct of\n");
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("and\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double innerProductMatrix = MatrixOperations.MatrixMethod.innerProduct(matrix, userMatrix);
                    return -1;

                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    System.out.println("The inner proudct of\n");
                    MatrixOperations.MatrixMethod.readMatrix(matrix);
                    System.out.println("and\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double innerProductMatrix = MatrixOperations.MatrixMethod.innerProduct(userMatrix, matrix);
                    return -1;
                }
        }
        return -1;
    }


    public static int operationIntScalar(int scalar) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("What would you like to do with this Scalar?");
        for (int key : operations.keySet()) {
            System.out.print(key + ": ");
            System.out.println(operations.get(key));
        }
        int opNum = checkUserCommand(1, 8);
        int choice;
        switch (opNum) {
            case 1:
                System.out.println("What type of Matrix do you want your scalar to add to?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    System.out.println(scalar);
                    System.out.println("+\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    int[][] sumMatrix = MatrixOperations.MatrixMethod.scalarAddMatrix(scalar, userMatrix);
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    System.out.println(scalar);
                    System.out.println("+\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.scalarAddMatrix(scalar, userMatrix);
                    return -1;
                }
            case 2:
                System.out.println("What type of Scalar do you want your current Scalar to add to?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    System.out.println(scalar);
                    System.out.println("\n+\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar + userScalar);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    System.out.println(scalar);
                    System.out.println("\n+\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar + userScalar);
                    return -1;
                }
            case 3:
                System.out.println("What type of Matrix do you want your current Scalar to subtract from?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix(); //creating int matrix
                    System.out.println(scalar); //reading original scalar
                    System.out.println("-\n"); //
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix); //read created matrix
                    System.out.println("||\n");
                    int[][] difMatrix = MatrixOperations.MatrixMethod.scalarSubtractMatrix(scalar, userMatrix); //sum
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    System.out.println(scalar); //reading original scalar
                    System.out.println("-\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.scalarSubtractMatrix(scalar, userMatrix);
                    return -1;
                }
            case 4:
                System.out.println("What type of Scalar do you want your current Scalar to subtract from?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    System.out.println(scalar); //reading original scalar
                    System.out.println("\n-\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar - userScalar);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    System.out.println(scalar); //reading original scalar
                    System.out.println("\n-\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar - userScalar);
                    return -1;
                }
            case 5:
                System.out.println("What type of Matrix do you want your Scalar to multiply to?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    System.out.println(scalar);
                    System.out.println("*\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    int[][] productMatrix = MatrixOperations.MatrixMethod.scalarMultiplyMatrix(scalar, userMatrix);
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    System.out.println(scalar);
                    System.out.println("*\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] productMatrix = MatrixOperations.MatrixMethod.scalarMultiplyMatrix(scalar, userMatrix);
                    return -1;
                }
            case 6:
                System.out.println("What type of Scalar do you want your current scalar to multiply to?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    System.out.println(scalar);
                    System.out.println("\n*\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar * userScalar);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    System.out.println(scalar);
                    System.out.println("\n*\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar * userScalar);
                    return -1;
                }
            case 7:
                System.out.println(scalar);
                System.out.println("Rounds to\n");
                System.out.println((int) Math.round(scalar));
                return -1;

            case 8:
                System.out.println("What type of number do you want your scalar to the power of?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    System.out.println(scalar);
                    System.out.println("To the power of " + userScalar);
                    System.out.println("is\n");
                    System.out.println(Math.pow(scalar, userScalar));
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    System.out.println(scalar);
                    System.out.println("To the power of " + userScalar);
                    System.out.println("is\n");
                    System.out.println(Math.pow(scalar, userScalar));
                    return -1;
                }

        }
        return 0;
    }

    public static int operationDoubleScalar(double scalar) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("What would you like to do with this Scalar?");
        for (int key : operations.keySet()) {
            System.out.print(key + ": ");
            System.out.println(operations.get(key));
        }
        int opNum = checkUserCommand(1, 8);
        int choice;
        switch (opNum) {
            case 1:
                System.out.println("What type of Matrix do you want your scalar to add to?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    System.out.println(scalar);
                    System.out.println("+\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.scalarAddMatrix(scalar, userMatrix);
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    System.out.println(scalar);
                    System.out.println("+\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.scalarAddMatrix(scalar, userMatrix);
                    return -1;
                }

            case 2:
                System.out.println("What type of Scalar do you want your current Scalar to add to?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    System.out.println(scalar);
                    System.out.println("\n+\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar + userScalar);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    System.out.println(scalar);
                    System.out.println("\n+\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar + userScalar);
                    return -1;
                }
            case 3:
                System.out.println("What type of Matrix do you want your scalar to subtract from?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix(); //creating int matrix
                    System.out.println(scalar); //reading original scalar
                    System.out.println("-\n"); //
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix); //read created matrix
                    System.out.println("||\n");
                    double[][] difMatrix = MatrixOperations.MatrixMethod.scalarSubtractMatrix(scalar, userMatrix); //sum
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    System.out.println(scalar); //reading original scalar
                    System.out.println("-\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] sumMatrix = MatrixOperations.MatrixMethod.scalarSubtractMatrix(scalar, userMatrix);
                    return -1;
                }
            case 4:
                System.out.println("What type of Scalar do you want your current Scalar to subtract from?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    System.out.println(scalar); //reading original scalar
                    System.out.println("\n-\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar - userScalar);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    System.out.println(scalar); //reading original scalar
                    System.out.println("\n-\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar - userScalar);
                    return -1;
                }
            case 5:
                System.out.println("What type of Matrix do you want your Scalar to multiply to?");
                System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    int[][] userMatrix = UserInput.userInputIntMatrix();
                    System.out.println(scalar);
                    System.out.println("*\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] productMatrix = MatrixOperations.MatrixMethod.scalarMultiplyMatrix(scalar, userMatrix);
                    return -1;
                } else if (choice == 2) {
                    double[][] userMatrix = UserInput.userInputDoubleMatrix();
                    System.out.println(scalar);
                    System.out.println("*\n");
                    MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                    System.out.println("||\n");
                    double[][] productMatrix = MatrixOperations.MatrixMethod.scalarMultiplyMatrix(scalar, userMatrix);
                    return -1;
                }
            case 6:
                System.out.println("What type of Scalar do you want your scalar Matrix to multiply to?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    System.out.println(scalar);
                    System.out.println("\n*\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar * userScalar);
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    System.out.println(scalar);
                    System.out.println("\n*\n");
                    System.out.println(userScalar);
                    System.out.println("\n||\n");
                    System.out.println(scalar * userScalar);
                    return -1;
                }
            case 7:
                System.out.println(scalar);
                System.out.println("Rounds to\n");
                System.out.println((int) Math.round(scalar));
                return -1;

            case 8:
                System.out.println("What type of number do you want your scalar to the power of?");
                System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\nEnter -1 to Quit");
                choice = UserInput.checkUserCommand(1, 2);
                if (choice == 1) {
                    System.out.println("Enter an integer scalar");
                    int userScalar = userInput.nextInt();
                    System.out.println(scalar);
                    System.out.println("To the power of " + userScalar);
                    System.out.println("is\n");
                    System.out.println(Math.pow(scalar, userScalar));
                    return -1;
                } else if (choice == 2) {
                    System.out.println("Enter a double scalar");
                    double userScalar = userInput.nextDouble();
                    System.out.println(scalar);
                    System.out.println("To the power of " + userScalar);
                    System.out.println("is\n");
                    System.out.println(Math.pow(scalar, userScalar));
                    return -1;
                }
        }
        return -1;
    }
}