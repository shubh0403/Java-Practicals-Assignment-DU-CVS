
/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 7:-  Java Program to Search an Element in an Array
    
*/
import java.util.Scanner;

public class program_7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Predefined integer 1D-array containing 10 elements
        int arr[] = { 4, 15, 78, 65, 5, 7, 100, 1, 9, 15 };
        System.out.println("Enter element to be checked in a predefined array");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Element exists in array at position " + (i + 1));
                System.exit(0);
            }
        }
        System.out.println("Element do not exist in array");
        sc.close();
    }
}
