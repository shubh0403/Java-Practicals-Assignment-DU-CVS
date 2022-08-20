
/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 9:- Java Program to Sort an Array
    
*/
import java.util.Scanner;

public class program_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array : ");
        int len = sc.nextInt();

        int arr[] = new int[len];

        // Taking inputs in array : -
        System.out.println("\nEnter " + len + " elements");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sorting the array : -
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array :-

        System.out.print("\nAfter sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
