
/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 10:- Java Program to Add Two Matrices
    
*/
import java.util.Scanner;

public class program_10 {
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

    // To add two matrix
    public static int[][] add(int a[][], int b[][]) {
        int i, j;
        int c[][] = new int[a.length][a[0].length];
        // For two matrix to be added their equality is a must
        for (i = 0; i < a.length; i++)
            for (j = 0; j < a[i].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
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
        System.out.print("Enter number of rows in Matrix 1 : ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns in Matrix 1 : ");
        int column1 = sc.nextInt();

        System.out.print("Enter number of rows in Matrix 2 : ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns in Matrix 2 : ");
        int column2 = sc.nextInt();

        if (rows1 == rows2 && column1 == column2) {
            int Matrix1[][] = new int[rows1][column1];
            int Matrix2[][] = new int[rows1][column1];
            System.out.println("Enter elements in matrix 1");
            Matrix1 = createMatrix(Matrix1);
            System.out.println("Enter elements in matrix 2");
            Matrix2 = createMatrix(Matrix2);

            System.out.println("Matrix 1 : ");
            printMatrix(Matrix1);
            System.out.println("Matrix 2 : ");
            printMatrix(Matrix2);
            System.out.println("Sum of Matrix 1 and Matrix 2 : ");
            printMatrix(add(Matrix1, Matrix2));
        } else {
            System.out.println("Matrix must be equal if they are to be added");
        }
        sc.close();
    }
}
