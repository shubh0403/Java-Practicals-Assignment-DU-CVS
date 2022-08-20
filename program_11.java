
/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 11:- Java Program to Find the Transpose
   
*/
import java.util.Scanner;

public class program_11 {
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

    // Transpose a matrix
    public static int[][] transpose(int arr[][]) {
        int[][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }

    // To print a Matrix
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

        System.out.println("Transposed matrix : ");
        printMatrix(transpose(Matrix));
        sc.close();

    }
}
