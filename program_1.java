/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 1:- Java Program to Swap Two Numbers 
    
*/

import java.util.Scanner;

public class program_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swapping : \n" + "First number : " + a + "\tSecond number : " + b);

        // Swapping the numbers using a temporary variable :--
        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping : \n" + "First number : " + a + "\tSecond number : " + b);
        sc.close();
    }
}
