import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in); //userInput Generator
        UserInput.calculatorIntro(); //Introduction
        int cmd = UserInput.checkUserCommand(1, 2); //user picks whether to make matrix or scalar
        while (cmd != -1) {
            switch (cmd) {

                case 1:
                    System.out.println("What type of Matrix would you like?");
                    MatrixOperations.MatrixFormatter.insertHorizontalLine(49);
                    System.out.println();
                    System.out.println("1 : Integer Matrix\n2 : Double Matrix\n\nEnter -1 to Quit");
                    cmd = UserInput.checkUserCommand(1, 2); //user picks type
                    if (cmd == 1) { //Integer type
                        int[][] userMatrix = UserInput.userInputIntMatrix();
                        MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                        cmd = UserInput.operationIntMatrix(userMatrix);
                    } else if (cmd == 2) { //double type
                        double[][] userMatrix = UserInput.userInputDoubleMatrix();
                        MatrixOperations.MatrixMethod.readMatrix(userMatrix);
                        cmd = UserInput.operationDoubleMatrix(userMatrix);
                    }
                    break;

                case 2:
                    System.out.println("What type of Scalar would you like?");
                    MatrixOperations.MatrixFormatter.insertHorizontalLine(49);
                    System.out.println();
                    System.out.println("1 : Integer Scalar\n2 : Double Scalar\n\n Enter -1 to Quit");
                    cmd = UserInput.checkUserCommand(1, 2); //user picks type
                    if (cmd == 1) { //Integer type
                        System.out.println("Enter an integer scalar");
                        int userScalar = userInput.nextInt();
                        System.out.println(userScalar);
                        cmd = UserInput.operationIntScalar(userScalar);
                    } else if (cmd == 2) { //Double type
                        System.out.println("Enter a double scalar");
                        double userScalar = userInput.nextDouble();
                        System.out.println(userScalar);
                        cmd = UserInput.operationDoubleScalar(userScalar);
                    }
                    break;
            }
        }
    }
    } //end of main









