/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 4:-  Java Program to Find GCD or HCF of 2 numbers
    
*/

import java.util.Scanner;

public class program_4 {
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The GCD of " + num1 + " and " + num2 + " : " + gcd(num1, num2));
        sc.close();
    }
}
