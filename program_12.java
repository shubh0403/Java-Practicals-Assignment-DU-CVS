
/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 12:- Java Program to Compute the Sum of Diagonals of a Matrix
   
*/
import java.util.Scanner;

public class program_12 {
    public static int[][] createMatrix(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element at (" + i + "," + j + ") : ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void sumDiagonals(int[][] arr) {
        int principalDiagonal = 0, secondaryDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    principalDiagonal += arr[i][j];
                }
                if ((i + j) == (arr[0].length - 1)) {
                    secondaryDiagonal += arr[i][j];
                }
            }
        }
        System.out.println("Sum of elements of Principal diagonal : " + principalDiagonal);
        System.out.println("Sum of elements of Secondary diagonal : " + secondaryDiagonal);
    }

    public static void printMatrix(int M[][]) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();

        int Matrix[][] = new int[rows][columns];
        Matrix = createMatrix(Matrix);
        System.out.println("Original matrix : ");
        printMatrix(Matrix);

        sumDiagonals(Matrix);
    }
}
